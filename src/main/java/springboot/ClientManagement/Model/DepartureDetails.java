package springboot.ClientManagement.Model;

/**
 * Created by a-7890 on 04/12/19.
 */
public class DepartureDetails {

    private String dateTime;
    private  String airport;
    private  String terminal;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

}
