package lowleveldesign.parkinglot.model.ticket.strategy;

public class DailyCostingStrategy implements CostStrategy {

    @Override
    public double calculateCost(long entryTime) {
        return 100D;
    }

}
