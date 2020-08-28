package salesReport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import salesReport.iface.SalesInput;
import salesReport.iface.SalesReport;
import salesReport.iface.ShippingPolicy;

import java.io.FileNotFoundException;
import java.util.ArrayList;

@Component
public class Reports {
    private SalesInput sale;
    private SalesReport report;
    private ShippingPolicy policy;

    @Autowired
        public Reports(SalesInput sale, SalesReport report, ShippingPolicy policy){
            System.out.println("\nHere is the report... \n");
            this.sale = sale;
            this.report = report;
            this.policy = policy;
        }

    public void runReport() throws FileNotFoundException {
        ArrayList<Customers> sales = sale.getSales();

        //add shipping to array
        for(int i=0; i<sales.size();i++){
            sales.get(i).setShipping(policy.getShippingCost(sales.get(i).getAmount()));
        }

        //run report
        report.generateReport(sales);


    }






}
