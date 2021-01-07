package Grupy;

public interface GrupaBL {
	public void showGroupInfo();
	public boolean findId(int id);
	public void enroll(int student_id);
	public void unenroll(int student_id);
	public void enrollAdmin(int student_id);
	public void unenrollAdmin(int student_id);
}
