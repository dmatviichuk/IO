package Testy;

import Database.DataMaker;
import Grupy.Grupa;
import Grupy.Plan;
import Przedmioty.Przedmiot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PlanTests {
    Przedmiot subject;
    DataMaker dataMaker;
    Grupa groups;
    Plan plan;

    @BeforeEach
    void setUp() {
        plan = new Plan();
        dataMaker = new DataMaker();
        subject = new Przedmiot();
        groups = new Grupa();
        dataMaker.all_subjects.get(0);
        subject.setPrzedmiot_name("Inzynieria Oprogramowania");
    }

    @Test
    void checkPlanTests()
    {
        assertEquals(false, plan.showSchedule());
    }

}


