package structural.facade.constituents;

public class Headlights {

    private boolean activated;

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "Headlights{" +
                "activated=" + activated +
                '}';
    }
}
