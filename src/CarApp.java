import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by fhani on 7/17/2017.
 */
public class CarApp {
    public static void main(String[] args) {
       // String make = "";
        //Car car = new Car();
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many cars do you want? Please enter: ");
        int userInput = scnr.nextInt();
        scnr.nextLine();



        ArrayList<Car> carList = new ArrayList<>();

// option 1 using setters
        for (int i = 0; i < userInput; i++){

            System.out.println("Enter a make: ");
            String make = scnr.nextLine();
            carList.add(new Car());
            carList.get(i).setMake(make);

            System.out.println("Enter a model: ");
            String model = scnr.nextLine();
            carList.get(i).setModel(model);

            System.out.println("Enter a year: ");
            int year = scnr.nextInt();
            carList.get(i).setYear(year);

            System.out.println("Enter a price: ");
            double price = scnr.nextDouble();
            carList.get(i).setPrice(price);
            scnr.nextLine();

        }

        // option 2 using the overloaded constructor
        for (int i = 0; i < userInput; i++) {

            System.out.println("Enter a make: ");
            String make = scnr.nextLine();


            System.out.println("Enter a model: ");
            String model = scnr.nextLine();


            System.out.println("Enter a year: ");
            int year = scnr.nextInt();


            System.out.println("Enter a price: ");
            double price = scnr.nextDouble();

            scnr.nextLine();

            carList.add(new Car(make, model, year, price));
        }

        //System.out.println(carList.get(0).getMake());
        //System.out.println(carList.size());
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }

    }


}
