package structural.adapter;

import structural.adapter.implementations.BmwM5;
import structural.adapter.implementations.MercedesBmwAdapter;
import structural.adapter.interfaces.Bmw;
import structural.adapter.interfaces.Mercedes;

public class Main {

    public static void main(String[] args) {
        Bmw bmw = new BmwM5.BmwBuilder().mPowered(false).mPackage(true).build();
        Mercedes adapter = new MercedesBmwAdapter(bmw);
        System.out.println(getMercedesOwnershipCost(adapter));
    }

    private static double getMercedesOwnershipCost(Mercedes mercedes) {
        return mercedes.getStarAgilityPrice();
    }
}
