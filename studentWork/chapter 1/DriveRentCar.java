import java.util.Scanner;

public class DriveRentCar {
    public static void main(String [] args) {

     Scanner console = new Scanner(System.in);
        System.out.println("what is your age");
     int age = console.nextInt();

    if(age >=16 && age <=25) {
    System.out.println("Can drive but can't rent a car");
    }
    else if(age >= 25) {
    System.out.println("Can drive and can rent a car");
    }
    else{
        System.out.println("can't drive and can't rent a car");
    }

    }
}
