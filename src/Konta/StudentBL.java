package Konta;

import Grupy.Grupa;

public interface StudentBL {
	public void enroll(Grupa grupa);
	public void unenroll(Grupa grupa);
	public void checkMarks();
	public void generateSchedule();
	public void checkSchedule();
}
