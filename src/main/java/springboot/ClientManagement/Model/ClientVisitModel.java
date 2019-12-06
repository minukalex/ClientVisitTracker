package springboot.ClientManagement.Model;

import java.util.List;

/**
 * Created by a-7890 on 03/12/19.
 */
public class ClientVisitModel {

    public String clientVisitFromDate;
    public String clientVisitToDate;
    public String iRequestId;
    public String meetingRoom;
    public String isWifiRequired;
    public List<ClientDetails> clientDetails;
    public List<MealsDetails> mealsDetails;
    public List<MeetingSchedule> meetingSchedule;
    public String contactNumber;
    public String admin;
    public String manager;
    public String pmo;

    public String getClientVisitFromDate() {
        return clientVisitFromDate;
    }

    public void setClientVisitFromDate(String clientVisitFromDate) {
        this.clientVisitFromDate = clientVisitFromDate;
    }

    public String getClientVisitToDate() {
        return clientVisitToDate;
    }

    public void setClientVisitToDate(String clientVisitToDate) {
        this.clientVisitToDate = clientVisitToDate;
    }

    public String getiRequestId() {
        return iRequestId;
    }

    public void setiRequestId(String iRequestId) {
        this.iRequestId = iRequestId;
    }

    public String getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(String meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    public String getIsWifiRequired() {
        return isWifiRequired;
    }

    public void setIsWifiRequired(String isWifiRequired) {
        this.isWifiRequired = isWifiRequired;
    }

    public List<ClientDetails> getClientDetails() {
        return clientDetails;
    }

    public void setClientDetails(List<ClientDetails> clientDetails) {
        this.clientDetails = clientDetails;
    }

    public List<MealsDetails> getMealsDetails() {
        return mealsDetails;
    }

    public void setMealsDetails(List<MealsDetails> mealsDetails) {
        this.mealsDetails = mealsDetails;
    }

    public List<MeetingSchedule> getMeetingSchedule() {
        return meetingSchedule;
    }

    public void setMeetingSchedule(List<MeetingSchedule> meetingSchedule) {
        this.meetingSchedule = meetingSchedule;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getPmo() {
        return pmo;
    }

    public void setPmo(String pmo) {
        this.pmo = pmo;
    }

}



