package salesReport.impl;

import salesReport.Customers;
import salesReport.iface.ShippingPolicy;

import java.util.ArrayList;

public class TenPercentShipping implements ShippingPolicy {
    @Override
    public double getShippingCost(double sale) {
        return sale * .1;
    }
}
