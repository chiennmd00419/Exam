/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassengerController;

import Passenger.Passenger;

import java.util.PriorityQueue;

import java.util.Scanner;

/**
 *
 * @author chien
 */
public class ReservationController {

    static PriorityQueue<Passenger> ps = new PriorityQueue<>();

    static Passenger passenger = new Passenger();

    public void addPassenger() {
        try {
            Scanner sn = new Scanner(System.in);
            System.out.println("- Passenger Information :");
            System.out.println("+ Enter ID :  ");
            int id = sn.nextInt();
            sn.nextLine();
            System.out.println("+ Enter  Name : ");
            String name = sn.nextLine();
            System.out.println("+ Enter Adress : ");
            String adress = sn.nextLine();
            System.out.println("+ Enter Phone : ");
            String phone = sn.nextLine();
            System.out.println("+ Enter Date Of  Departue And Return");
            String date = sn.nextLine();

            Passenger re = new Passenger();
            re.setReservationID(id);
            re.setPassengerName(name);
            re.setAddress(adress);
            re.setPhone(phone);
            re.setDateOfDepartureAndReturn(date);
            ps.add(re);
            System.out.println(" Import Success");
        } catch (Exception e) {
            System.out.println(e);
            System.err.println("Please import number:");
        }

    }

    public void Modify() {
        Scanner sc = new Scanner(System.in);
        for (Passenger p : ps) {
            try {
                System.out.println("Enter ID :");

                int id = sc.nextInt();
                sc.nextLine();

                if (id == p.getReservationID()) {
                    ps.remove();
                    System.out.println("+Import new name");
                    String newname = sc.nextLine();
                    System.out.println("+Import new adress");
                    String newadress = sc.nextLine();
                    System.out.println("+Import new phone");
                    String newphone = sc.nextLine();
                    System.out.println("+ Import new date");
                    String newdate = sc.nextLine();
                    System.out.println("+Import New Passenger : "
                            + "\nNew Name is :" + newname
                            + "\nNew Adress is :" + newadress
                            + "\nNew Phone is :" + newphone
                            + "\nNew Date is :" + newdate
                    );
                    passenger.setPassengerName(newname);
                    passenger.setAddress(newadress);
                    passenger.setPhone(newphone);
                    passenger.setDateOfDepartureAndReturn(newdate);
                    ps.add(p);

                } else {

                }

            } catch (Exception e) {
                System.err.println(e);
                System.err.println("NOT ID :");
            }
        }

    }

    public void Display() {

        for (Passenger p : ps) {
            System.out.println(" ID " + p.getReservationID()
                    + "\n Name " + p.getPassengerName()
                    + "\n Adress " + p.getAddress()
                    + "\n Phone " + p.getPhone()
                    + "\n date " + p.getDateOfDepartureAndReturn());
        }
    }

}
