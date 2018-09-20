package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TraineeTestSuit {

    @Test
    public void shouldTestUpdate() {
        // Given
        Trainee ewaBrylant = new Trainee("Ewa Brylant");
        Trainee jadwigaKlos = new Trainee("Jadwiga Kłos");
        Trainee magdalenaZar = new Trainee("Magdalena Żar");
        Trainee justynaZasluszna = new Trainee("Jsutyna Zasłuszna");
        Trainee beataBlond = new Trainee("Beata Blond");

        Treiner cezarySpioch = new Treiner("Cezary Śpioch");
        Treiner romanObluda = new Treiner("Roman Obłuda");

        ewaBrylant.registerObserver(romanObluda);
        jadwigaKlos.registerObserver(romanObluda);
        magdalenaZar.registerObserver(cezarySpioch);
        justynaZasluszna.registerObserver(cezarySpioch);
        beataBlond.registerObserver(cezarySpioch);
        // When
        ewaBrylant.addTask("Zadanie 12.3");
        ewaBrylant.addTask("Zadanie 7.7");
        jadwigaKlos.addTask("Zadanie 2.4");
        magdalenaZar.addTask("Zadanie 3.5");
        magdalenaZar.addTask("Zadanie 16.1");
        justynaZasluszna.addTask("Zadanie 11.3");
        beataBlond.addTask("Zadanie 20.4");
        // Then
        assertEquals(3, romanObluda.getUpdateCount());
        assertEquals(4, cezarySpioch.getUpdateCount());
    }
}
