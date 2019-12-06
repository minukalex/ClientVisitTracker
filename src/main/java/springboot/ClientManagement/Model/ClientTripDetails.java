package springboot.ClientManagement.Model;

import java.util.List;

/**
 * Created by a-7890 on 04/12/19.
 */
public class ClientTripDetails {

    private ArrivalDetails arrivalDetails;
    private DepartureDetails departureDetails;
    private HotelDetails hotelDetails;
    private String isCabNeededBtwAirportAndHotel;
    private String isCabNeededBtwHotelAndOffice;

    public String getIsCabNeededBtwAirportAndHotel() {
        return isCabNeededBtwAirportAndHotel;
    }

    public void setIsCabNeededBtwAirportAndHotel(String isCabNeededBtwAirportAndHotel) {
        this.isCabNeededBtwAirportAndHotel = isCabNeededBtwAirportAndHotel;
    }

    public String getIsCabNeededBtwHotelAndOffice() {
        return isCabNeededBtwHotelAndOffice;
    }

    public void setIsCabNeededBtwHotelAndOffice(String isCabNeededBtwHotelAndOffice) {
        this.isCabNeededBtwHotelAndOffice = isCabNeededBtwHotelAndOffice;
    }

    public ArrivalDetails getArrivalDetails() {
        return arrivalDetails;
    }

    public void setArrivalDetails(ArrivalDetails arrivalDetails) {
        this.arrivalDetails = arrivalDetails;
    }

    public DepartureDetails getDepartureDetails() {
        return departureDetails;
    }

    public void setDepartureDetails(DepartureDetails departureDetails) {
        this.departureDetails = departureDetails;
    }

    public HotelDetails getHotelDetails() {
        return hotelDetails;
    }

    public void setHotelDetails(HotelDetails hotelDetails) {
        this.hotelDetails = hotelDetails;
    }

}
