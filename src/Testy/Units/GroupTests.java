package Testy.Units;
import Database.DataMaker;
import Grupy.Grupa;
import Grupy.Plan;
import Przedmioty.Przedmiot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.security.auth.Subject;

import static org.junit.Assert.assertEquals;

public class GroupTests {

    Grupa group;
    Przedmiot subject;
    DataMaker dataMaker;
    Plan plan;
    @BeforeEach
    void setUp()
    {
        dataMaker = new DataMaker();
        subject = new Przedmiot();
        group = new Grupa();
        group.setPrzedmiot("IO");
        group.setDay(Grupa.Days.Wtorek);
        group.setType(Grupa.Types.Laboratorium);

    }



    @Test
    public void getTypeTest() {
        assertEquals(group.getType(), Grupa.Types.Laboratorium);
    }

    @Test
    public void getDay(){
        assertEquals(group.getDay(), Grupa.Days.Wtorek);
    }

    @Test
    public void getGroupInfo(){
        group.showGroupInfo();
    }
}
