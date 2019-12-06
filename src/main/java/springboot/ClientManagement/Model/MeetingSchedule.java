package springboot.ClientManagement.Model;

import java.util.List;

/**
 * Created by a-7890 on 04/12/19.
 */
public class MeetingSchedule {

    private String date;
    private List<Schedule> schedule;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

}
