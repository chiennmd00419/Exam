/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Passenger;

/**
 *
 * @author chien
 */
public class Passenger {

    private int ReservationID;
    private String PassengerName;
    private String Address;
    private String Phone;
    private String DateOfDepartureAndReturn;

    public Passenger() {

    }

    public Passenger(int ReservationID, String PassengerName, String Address, String Phone, String DateOfDepartureAndReturn) {
        this.ReservationID = ReservationID;
        this.PassengerName = PassengerName;
        this.Address = Address;
        this.Phone = Phone;
        this.DateOfDepartureAndReturn = DateOfDepartureAndReturn;
    }

    public int getReservationID() {
        return ReservationID;
    }

    public void setReservationID(int ReservationID) {
        this.ReservationID = ReservationID;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerName(String PassengerName) {
        this.PassengerName = PassengerName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getDateOfDepartureAndReturn() {
        return DateOfDepartureAndReturn;
    }

    public void setDateOfDepartureAndReturn(String DateOfDepartureAndReturn) {
        this.DateOfDepartureAndReturn = DateOfDepartureAndReturn;
    }

}
