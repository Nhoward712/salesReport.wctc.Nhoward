package salesReport.iface;

import org.springframework.stereotype.Component;
import salesReport.Customers;
import salesReport.Reports;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface SalesInput {
    public  ArrayList<Customers> getSales() throws FileNotFoundException;
}
