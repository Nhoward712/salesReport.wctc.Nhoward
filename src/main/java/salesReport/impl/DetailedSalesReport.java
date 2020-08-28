package salesReport.impl;
import org.springframework.stereotype.Component;

import salesReport.Customers;
import salesReport.iface.SalesReport;

import java.util.ArrayList;

public class DetailedSalesReport implements SalesReport {
    @Override
    public void generateReport(ArrayList<Customers> salesList) {
        //sets length of column dynamically
        int nTxt = 0;
        for(int i=0; i<salesList.size();i++){
            if(salesList.get(i).getName().length() > nTxt){
                nTxt = salesList.get(i).getName().length();
            }
        }
        nTxt = nTxt +5;
        System.out.printf("%"+nTxt+"s %15s %15s %15s %15s %n", "Name","Country","Amount","Tax", "Shipping");
        System.out.printf("%"+nTxt+"s %15s %15s %15s %15s %n", "-------------------","---------------","---------------","---------------","---------------");

        for (int i=0; i < salesList.size(); i++){
            System.out.printf("%"+nTxt+"s %15s %15.2f %15s %15.2f %n", salesList.get(i).getName(),salesList.get(i).getCountry(),salesList.get(i).getAmount(),salesList.get(i).getTax(),salesList.get(i).getShipping());

        }
    }
}
