package salesReport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileReader {
    String name;
    String country;
    String amount;
    String tax;
    String shipping;
    //Customers[] objectArray;


//    public static ArrayList<Customers> loadFile(Customers[] objectArray) throws FileNotFoundException {
//        String line = "";
//        File file = new File("sales.txt");
//        ArrayList<Customers> customer = new ArrayList<Customers>();
//        Scanner inputFile = new Scanner("sales.txt");
//
//        int i = 0;
//        while(inputFile.hasNext()){
//            line = inputFile.nextLine();
//            String[] arrOfStr = line.split("\\,");
//            customer.add(new Customers(arrOfStr[0],arrOfStr[1],arrOfStr[2],arrOfStr[3]));
//            i++;
//        }
//        return customer;
//    }

    public static void saveFile(ArrayList<Customers> customers) throws FileNotFoundException {
        File file = new File("src/main/sales.txt");
        PrintWriter outputFile = new PrintWriter(file);
        for (int i = 0; i < customers.size(); i++){
            outputFile.println(customers.get(i).getName() + "," + customers.get(i).getCountry() + "," + customers.get(i).getAmount() + "," + customers.get(i).getTax());
        }
        outputFile.close();
    }

}
