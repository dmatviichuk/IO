public class Groups {
    static int group_idIT = 0;
    static int timeIT = 0;
    static int max_ilosc_studentowIT = 0;
    public int group_id;
    public int time;
    public int max_ilosc_studentow;
    public String name;
    public String date;
    public String prowadzacy_id;

    public Groups(String[] data){
        group_id = group_idIT++;
        time = timeIT++;
        max_ilosc_studentow = max_ilosc_studentowIT++;
        name = data[0];
        date = data[1];
        prowadzacy_id = data[2];
    }

    public int getGroup_id() {
        return group_id;
    }
    public int getGroup_idIT() {
        return group_idIT;
    }

    public void setGroup_id(int group_id) {
        group_id = group_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        time = time;
    }

    public String getProwadzacy_id() {
        return prowadzacy_id;
    }

    public void setProwadzacy_id(String prowadzacy_id) {
        prowadzacy_id = prowadzacy_id;
    }

    public int getMax_ilosc_studentow() {
        return max_ilosc_studentow;
    }
    public int getMax_ilosc_studentowIT() {
        return max_ilosc_studentowIT;
    }

    public void setMax_ilosc_studentow(int max_ilosc_studentow) {
        max_ilosc_studentow = max_ilosc_studentow;
    }
}
