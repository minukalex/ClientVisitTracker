package springboot.ClientManagement.Model;

/**
 * Created by a-7890 on 04/12/19.
 */
public class MealsDetails {

    private String date;
    private String arrangeFrom;
    private String vegCount;
    private String nonVegCount;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getArrangeFrom() {
        return arrangeFrom;
    }

    public void setArrangeFrom(String arrangeFrom) {
        this.arrangeFrom = arrangeFrom;
    }

    public String getVegCount() {
        return vegCount;
    }

    public void setVegCount(String vegCount) {
        this.vegCount = vegCount;
    }

    public String getNonVegCount() {
        return nonVegCount;
    }

    public void setNonVegCount(String nonVegCount) {
        this.nonVegCount = nonVegCount;
    }
}
