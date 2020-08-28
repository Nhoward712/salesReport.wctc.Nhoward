package salesReport.impl;

import salesReport.Customers;
import salesReport.iface.ShippingPolicy;

import java.util.ArrayList;

public class FlatRateShipping implements ShippingPolicy {

    public double getShippingCost(double sale) {
        return 15;
    }

}
