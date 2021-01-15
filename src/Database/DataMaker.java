package Database;

import Grupy.*;
import Konta.*;
import Przedmioty.*;

import java.util.ArrayList;
import java.util.List;

public class DataMaker {
	public static List <Grupa> all_groups = new ArrayList<Grupa>();
	public static List <Student> all_students = new ArrayList<Student>();
	public static List <Przedmiot> all_subjects = new ArrayList<Przedmiot>();
	
	public static int pracownik_id_count = 0;
	public static int prowadzacy_id_count = 50000;
	public static int student_id_count = 0;
	public static int group_id_count = 0;
	public static int przedmiot_id_count = 0;
	
	public DataMaker(){
		studentMaker();
		subjectMaker();
		groupMaker();
	}
	
	public static void studentMaker() {
		String[] studentOneData = {"user1", "password123", "Jan", "Kowalski"};
		long studentOnePesel = 99111100001L;
		Student studentOne = new Student(studentOneData, studentOnePesel);
		all_students.add(studentOne);
		
		String[] studentTwoData = {"user21", "strongpassword", "Adam", "Nowak"};
		long studentTwoPesel = 95040702032L;
		Student studentTwo = new Student(studentTwoData, studentTwoPesel);
		all_students.add(studentTwo);
		
		String[] studentThreeData = {"user124", "54321password", "Janina", "Kowalczyk"};
		long studentThreePesel = 96200143213L;
		Student studentThree = new Student(studentThreeData, studentThreePesel);
		all_students.add(studentThree);
	}
		
	public static void subjectMaker() {
		String subjectOneName = "Inzynieria Oprogramowania";
		Przedmiot subjectOne = new Przedmiot(subjectOneName);
		all_subjects.add(subjectOne);
		
		String subjectTwoName = "Bazy Danych 2";
		Przedmiot subjectTwo = new Przedmiot(subjectTwoName);
		all_subjects.add(subjectTwo);
		
		String subjectThreeName = "Urzadzenia Peryferyjne";
		Przedmiot subjectThree = new Przedmiot(subjectThreeName);
		all_subjects.add(subjectThree);
		
		String subjectFourName = "Systemy Operacyjne 1";
		Przedmiot subjectFour = new Przedmiot(subjectFourName);
		all_subjects.add(subjectFour);
		
		String subjectFiveName = "Sztuczna Inteligencja";
		Przedmiot subjectFive = new Przedmiot(subjectFiveName);
		all_subjects.add(subjectFive);
	}
	
	public static void groupMaker() {
		int[] groupOneData = {915, 50000, 120};
		Grupa.Types groupOneType = Grupa.Types.Wyklad;
		Grupa.Days groupOneDay = Grupa.Days.Sroda;
		Przedmiot groupOneSubject = all_subjects.get(0);
		Grupa groupOne = new Grupa(groupOneData, groupOneType, groupOneDay, groupOneSubject);
		all_groups.add(groupOne);
		
		int[] groupTwoData = {900, 50001, 12};
		Grupa.Types groupTwoType = Grupa.Types.Laboratorium;
		Grupa.Days groupTwoDay = Grupa.Days.Piatek;
		Przedmiot groupTwoSubject = all_subjects.get(0);
		Grupa groupTwo = new Grupa(groupTwoData, groupTwoType, groupTwoDay, groupTwoSubject);
		all_groups.add(groupTwo);
		
		int[] groupThreeData = {1100, 50001, 12};
		Grupa.Types groupThreeType = Grupa.Types.Laboratorium;
		Grupa.Days groupThreeDay = Grupa.Days.Piatek;
		Przedmiot groupThreeSubject = all_subjects.get(0);
		Grupa groupThree = new Grupa(groupThreeData, groupThreeType, groupThreeDay, groupThreeSubject);
		all_groups.add(groupThree);
		
		int[] groupFourData = {1100, 50001, 10};
		Grupa.Types groupFourType = Grupa.Types.Projekt;
		Grupa.Days groupFourDay = Grupa.Days.Sroda;
		Przedmiot groupFourSubject = all_subjects.get(1);
		Grupa groupFour = new Grupa(groupFourData, groupFourType, groupFourDay, groupFourSubject);
		all_groups.add(groupFour);
		
		int[] groupFiveData = {1515, 50002, 120};
		Grupa.Types groupFiveType = Grupa.Types.Wyklad;
		Grupa.Days groupFiveDay = Grupa.Days.Sroda;
		Przedmiot groupFiveSubject = all_subjects.get(2);
		Grupa groupFive = new Grupa(groupFiveData, groupFiveType, groupFiveDay, groupFiveSubject);
		all_groups.add(groupFive);
		
		int[] groupSixData = {1715, 50002, 12};
		Grupa.Types groupSixType = Grupa.Types.Laboratorium;
		Grupa.Days groupSixDay = Grupa.Days.Piatek;
		Przedmiot groupSixSubject = all_subjects.get(2);
		Grupa groupSix = new Grupa(groupSixData, groupSixType, groupSixDay, groupSixSubject);
		all_groups.add(groupSix);
		
		int[] groupSevenData = {1315, 50003, 120};
		Grupa.Types groupSevenType = Grupa.Types.Wyklad;
		Grupa.Days groupSevenDay = Grupa.Days.Wtorek;
		Przedmiot groupSevenSubject = all_subjects.get(3);
		Grupa groupSeven = new Grupa(groupSevenData, groupSevenType, groupSevenDay, groupSevenSubject);
		all_groups.add(groupSeven);

		int[] groupEightData = {1115, 50004, 120};
		Grupa.Types groupEightType = Grupa.Types.Wyklad;
		Grupa.Days groupEightDay = Grupa.Days.Poniedzialek;
		Przedmiot groupEightSubject = all_subjects.get(4);
		Grupa groupEight = new Grupa(groupEightData, groupEightType, groupEightDay, groupEightSubject);
		all_groups.add(groupEight);
		
		int[] groupNineData = {1855, 50004, 25};
		Grupa.Types groupNineType = Grupa.Types.Cwiczenia;
		Grupa.Days groupNineDay = Grupa.Days.Poniedzialek;
		Przedmiot groupNineSubject = all_subjects.get(4);
		Grupa groupNine = new Grupa(groupNineData, groupNineType, groupNineDay, groupNineSubject);
		all_groups.add(groupNine);
		
		int[] groupTenData = {1315, 50005, 25};
		Grupa.Types groupTenType = Grupa.Types.Cwiczenia;
		Grupa.Days groupTenDay = Grupa.Days.Czwartek;
		Przedmiot groupTenSubject = all_subjects.get(4);
		Grupa groupTen = new Grupa(groupTenData, groupTenType, groupTenDay, groupTenSubject);
		all_groups.add(groupTen);
	}
}
