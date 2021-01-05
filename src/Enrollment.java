import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    public List<Student> studentList = new ArrayList<>();
    public List<Groups> groupsList = new ArrayList<>();
    public List<Enrollment> enrollmentList = new ArrayList<>();

    private Groups searchGroups(Groups groups) {
        if(groups != null)
            for(int i = 0; i < groupsList.size(); i++){
                if(groupsList.get(i).equals(groups))
                    return groupsList.get(i);
            }
        return null;
    }
}
