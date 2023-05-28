package structural.facade.constituents;

public class Engine {

    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "isOn=" + isOn +
                '}';
    }
}
