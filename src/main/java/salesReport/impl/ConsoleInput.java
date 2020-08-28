package salesReport.impl;
import org.springframework.stereotype.Component;
import salesReport.Customers;
import salesReport.iface.SalesInput;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {


    @Override
    public ArrayList<Customers> getSales() throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String country;
        double amount;
        double tax;
        String quit = "";
        ArrayList<Customers> customer = new ArrayList<>();

        System.out.println("Do you want to enter new data? (Y or N)");
        quit= keyboard.nextLine();
        while (quit.equals("Y")){
            System.out.println("Enter Name:");
            name = keyboard.nextLine();
            System.out.println("Country:");
            country = keyboard.nextLine();
            System.out.println("Sales:");
            amount = keyboard.nextDouble();
            System.out.println("Taxes:");
            tax = keyboard.nextDouble();
            customer.add(new Customers(name, country, amount, tax));

            System.out.println("Do you want to enter new data? (Y or N)");
            quit= keyboard.nextLine();

        }




        return null;
    }
}
