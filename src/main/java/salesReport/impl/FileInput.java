package salesReport.impl;

import org.springframework.stereotype.Component;
import salesReport.Customers;
import salesReport.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInput implements SalesInput {
    String name;
    String country;
    String amount;
    String tax;
    String shipping;
    //Customers[] objectArray;


    public ArrayList<Customers> getSales() throws FileNotFoundException {
        String line = "";
        File file = new File("src/main/sales.txt");
        ArrayList<Customers> customer = new ArrayList<>();
        Scanner inputFile = new Scanner(file);

        int i=0;
        while(inputFile.hasNext()){
            line = inputFile.nextLine();
            String[] arrOfStr = line.split(",");
            customer.add(new Customers(arrOfStr[0],arrOfStr[1],Double.parseDouble(arrOfStr[2]),Double.parseDouble(arrOfStr[3])));
            i++;
        }
        //
        return customer;
    }
}
