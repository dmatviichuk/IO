package Testy.Units;

import static org.junit.jupiter.api.Assertions.*;

import Database.DataMaker;
import Grupy.Grupa;
import Grupy.Plan;
import Przedmioty.Przedmiot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;



class PlanTest {

    @Mock
    DataMaker datamaker;

    int[] groupOneData;
    List <Przedmiot> all_subjects;
    List<Grupa> all_groups;
    Plan plan;
    Grupa grupa;

    @BeforeEach
    void setUp() {
        all_subjects = new ArrayList<>();
        all_groups = new ArrayList<>();
        plan = new Plan(1);
    }

    @Test
    void test(){


        String subjectOneName = "Inzynieria Oprogramowania";
        Przedmiot newSubj = new Przedmiot(subjectOneName);
        all_subjects.add(newSubj);

        int[] groupOneData = {915, 50000, 120};
        Grupa.Types groupOneType = Grupa.Types.Wyklad;
        Grupa.Days groupOneDay = Grupa.Days.Sroda;
        Przedmiot groupOneSubject = all_subjects.get(0);
        Grupa groupOne = new Grupa(groupOneData, groupOneType, groupOneDay, groupOneSubject);
        all_groups.add(groupOne);


        when(DataMaker.all_groups).thenReturn(all_groups);

        List<Grupa> testGrupa = DataMaker.all_groups;


        assertEquals(testGrupa.get(0), all_groups.get(0));
    }
}