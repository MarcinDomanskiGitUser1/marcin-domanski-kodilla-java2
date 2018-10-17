package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;
import java.util.stream.Collectors;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://marcindomanskigituser1.github.io";
    private WebDriver webDriver;
    private Random generator;

    @Before
    public void initTests() {
        webDriver = WebDriverConfig.getDriver(WebDriverConfig.OPERA);
        webDriver.get(BASE_URL);
        generator = new Random();
    }
    @After
    public void cleanUpAfterTest() {
        webDriver.close();
    }

    private String crudAppCreateTaskTest() throws InterruptedException {
        final String CREATE_TASK_PATH = "//form[contains(@action, \"createTask\")]";
        final String XPATH_TASK_NAME = CREATE_TASK_PATH + "/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = CREATE_TASK_PATH + "/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = CREATE_TASK_PATH + "/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = webDriver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);
        WebElement content = webDriver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);
        WebElement addButton = webDriver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();

        Thread.sleep(5000);

        return taskName;
    }
    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        webDriver.navigate().refresh();

        while(!webDriver.findElement(By.xpath("//select[1]")).isDisplayed());

        webDriver.findElements(By.xpath("//form[@class = \"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class = \"datatable__field-value\"]"))
                    .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
        webDriver.switchTo().alert().accept();
    }
    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException{
        final String TRELLO_URL = "https://trello.com/login";

        WebDriver webDriverTrello = WebDriverConfig.getDriver(WebDriverConfig.OPERA);
        webDriverTrello.get(TRELLO_URL);

        webDriverTrello.findElement(By.id("user")).sendKeys("xxxxxxxxxxxxxxx");
        webDriverTrello.findElement(By.id("password")).sendKeys("xxxxxxxxxxxxx");
        webDriverTrello.findElement(By.id("login")).submit();

        Thread.sleep(5000);

        webDriverTrello.findElements(By.xpath("//a[contains(@class, \"board-tile\")]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title = \"Kodilla Application\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(5000);

        boolean result = webDriverTrello.findElements(By.xpath("//span[@class = \"list-card-title js-card-name\"]")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        webDriverTrello.close();

        return result;
    }
    private void deleteTaskFromCRUD(String taskName) throws InterruptedException{

        Thread.sleep(3000);

        while(!webDriver.findElement(By.xpath("//select[1]")).isDisplayed());

        webDriver.findElements(By.xpath("//form[@class = \"datatable__row\"]")).stream()
                .filter(form -> form.findElement(By.xpath(".//p[@class = \"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(findForm -> {
                    WebElement deleteButton = findForm.findElement(By.xpath(".//fieldset/button[text() = 'Delete']"));
                    deleteButton.click();
                });
    }
    @Test
    public void findNewTaskInTrello() throws InterruptedException {
        String taskNameFromCrudTest = crudAppCreateTaskTest();
        sendTestTaskToTrello(taskNameFromCrudTest);
        deleteTaskFromCRUD(taskNameFromCrudTest);
        Assert.assertTrue(checkTaskExistsInTrello(taskNameFromCrudTest));
    }
}
