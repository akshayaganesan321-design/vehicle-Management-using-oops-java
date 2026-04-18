import java.io.*;
import java.util.*;
class vehicle {

    int seats;
    int tyres;
    String fuel;

    void vehicleDetails(){}

    void start(){
        System.out.println("Vehicle is starting.");
    }

    void stop(){
        System.out.println("Vehicle is stopping.");
    }
}

class car extends vehicle {

    car(int seats,int tyres,String fuel) {
        super.seats = seats;
        super.tyres = tyres;
        super.fuel = fuel;
    }

    void vehicleDetails(){
        System.out.println("Car Details");
        System.out.println("No.of seats: " + seats);
        System.out.println("No.of tyres: " + tyres);
        System.out.println("Fuel type: " + fuel);
    }

    void start(){
        System.out.println("Car is starting.");
    }

    void stop(){
        System.out.println("Car is stopping.");
    }
}

class bike extends vehicle {

    bike(int seats,int tyres,String fuel){
        super.seats = seats;
        super.tyres = tyres;
        super.fuel = fuel;
    }

    void vehicleDetails(){
        System.out.println("Bike Details");
        System.out.println("No.of seats: " + seats);
        System.out.println("No.of tyres: " + tyres);
        System.out.println("Fuel type: " + fuel);
    }

    void start(){
        System.out.println("Bike is starting.");
    }

    void stop(){
        System.out.println("Bike is stopping.");
    }
}

public class Main {

    public static void main(String[] args){

        vehicle v1 = new car(5,4,"CNG");
        v1.vehicleDetails();
        v1.start();
        v1.stop();

        System.out.println();

        vehicle v2 = new bike(2,2,"Petrol");
        v2.vehicleDetails();
        v2.start();
        v2.stop();
    }
}