package lowleveldesign.parkinglot.model.ticket.strategy;

public interface CostStrategy {

    double calculateCost(long entryTime);

}
