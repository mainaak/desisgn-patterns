package lowleveldesign.parkinglot.model.ticket.strategy;

public class HourlyCostingStrategy implements CostStrategy {

    @Override
    public double calculateCost(long entryTime) {
        return 10D;
    }

}
