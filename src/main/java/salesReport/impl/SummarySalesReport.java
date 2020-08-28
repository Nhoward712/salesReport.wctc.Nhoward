package salesReport.impl;

import salesReport.Customers;
import salesReport.iface.SalesReport;
import java.util.ArrayList;
import java.util.HashSet;

public class SummarySalesReport implements SalesReport {
    @Override
    public void generateReport(ArrayList<Customers> salesList) {
        int nTxt = 0;
        for(int i=0; i<salesList.size();i++){
            if(salesList.get(i).getCountry().length() > nTxt){
                nTxt = salesList.get(i).getCountry().length();
            }
        }
        nTxt = nTxt +5;
        System.out.printf("%"+nTxt+"s %15s %15s %15s  %n", "Country","Amount","Tax", "Shipping");
        System.out.printf("%"+nTxt+"s %15s %15s %15s  %n", "---------------","---------------","---------------","---------------");

        //create list of all countries
        ArrayList list = new ArrayList();
        for (Customers customers : salesList) {
            list.add(customers.getCountry());
        }

        //get distinct countries
        HashSet<String> countries = new HashSet(list);

        //Total all categories and print line
        for(String country : countries){
            double total = 0;
            double tax = 0;
            double ship = 0;
            for(int i=0; i<salesList.size();i++){
                if (salesList.get(i).getCountry().equals(country)) {
                    total += salesList.get(i).getAmount();
                    tax += salesList.get(i).getTax();
                    ship += salesList.get(i).getShipping();
                }
            }
            System.out.printf("%"+nTxt+"s %15.2f %15.2f %15.2f  %n", country, total, tax, ship);
        }



    }






}


