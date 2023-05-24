package structural.adapter.implementations;

import structural.adapter.interfaces.Bmw;
import structural.adapter.interfaces.Mercedes;

public class MercedesBmwAdapter implements Mercedes {

    private final Bmw bmw;
    public MercedesBmwAdapter(Bmw bmw) {
        this.bmw = bmw;
    }

    @Override
    public boolean isAmgPowered() {
        return bmw.isMPowered();
    }

    @Override
    public boolean isAmgKit() {
        return bmw.isMBody();
    }

    @Override
    public double getStarAgilityPrice() {
        String bmw360Price = bmw.getBmw360Price();
        return Double.parseDouble(bmw360Price);
    }
}
