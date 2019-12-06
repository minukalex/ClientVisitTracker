package springboot.ClientManagement.Model;

import java.util.List;

/**
 * Created by a-7890 on 04/12/19.
 */
public class ClientDetails {


    private String name;
    private String role;
    private String teamName;
    private ClientTripDetails clientTripDetails;

    private String clientWorkPlace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ClientTripDetails getClientTripDetails() {
        return clientTripDetails;
    }

    public void setClientTripDetails(ClientTripDetails clientTripDetails) {
        this.clientTripDetails = clientTripDetails;
    }

    public String getClientWorkPlace() {
        return clientWorkPlace;
    }

    public void setClientWorkPlace(String clientWorkPlace) {
        this.clientWorkPlace = clientWorkPlace;
    }
}
