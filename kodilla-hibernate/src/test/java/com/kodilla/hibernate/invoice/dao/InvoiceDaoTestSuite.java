package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        Item item1 = new Item(new BigDecimal(12.5), 45, new BigDecimal(86.6));
        Item item2 = new Item(new BigDecimal(23.7), 30, new BigDecimal(41.3));
        Item item3 = new Item(new BigDecimal(9.7), 21, new BigDecimal(66.9));

        Invoice invoice1 = new Invoice("458965");
        Product productA = new Product("Produkt Pierwszy");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        productA.getItems().add(item1);
        productA.getItems().add(item2);
        productA.getItems().add(item3);
        item1.setProduct(productA);
        item2.setProduct(productA);
        item3.setProduct(productA);

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);
    }
}
