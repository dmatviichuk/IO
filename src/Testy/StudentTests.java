package Testy;

import Database.DataMaker;
import Grupy.Grupa;
import Grupy.Plan;
import Konta.Student;
import Przedmioty.Przedmiot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StudentTests {
    Grupa group;
    Student student;
    Plan plan;
    @BeforeEach
    void setUp()
    {
        Przedmiot subject = new Przedmiot("IO");
        group = new Grupa();
        student = new Student();
        plan = new Plan();
        group.setPrzedmiot(subject.przedmiot_name);

    }

    @Test
    void enrollTest()
    {
        group.setMax_ilosc_studentow(30);
        group.zapisani_studenci.add(10);
        assertEquals(0, group.enroll(student.id));
    }



    @Test
    void enrollFullTest()
    {
        group.setMax_ilosc_studentow(10);
        group.setIlosc_studentow(10);
        assertEquals(2, group.enroll(student.id));
    }

    @Test
    void enrollTestThird()
    {
        group.setMax_ilosc_studentow(10);
        group.setIlosc_studentow(4);
        group.zapisani_studenci.add(0);
        assertEquals(1, group.enroll(student.id));
        //assertEquals(1, group.enroll(student.id));
    }



    @Test
    void unenrollTestFirst()
    {
        assertEquals(false,  group.unenroll(student.id));

    }

    @Test
    void unenrollTestSecond()
    {
        group.setMax_ilosc_studentow(10);
        group.setIlosc_studentow(4);
        group.zapisani_studenci.add(0);
        assertEquals(false,  group.unenroll(student.id));
    }

}
