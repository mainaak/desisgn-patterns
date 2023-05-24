package structural.adapter.implementations;

import structural.adapter.interfaces.Bmw;

public class BmwM5 implements Bmw {

    private boolean isMPowered;
    private boolean isMBody;

    public BmwM5(BmwBuilder builder) {
        this.isMPowered = builder.isMPowered;
        this.isMBody = builder.isMPackage;
    }

    @Override
    public boolean isMPowered() {
        return isMPowered;
    }

    @Override
    public boolean isMBody() {
        return isMBody;
    }

    @Override
    public String getBmw360Price() {
        double total = 0D;
        if (isMPowered()) total += 99.99D;
        if (isMBody()) total += 49.99D;
        return String.valueOf(total);
    }

    public static class BmwBuilder {
        private boolean isMPackage;
        private boolean isMPowered;

        public BmwBuilder mPowered(boolean isMPowered) {
            this.isMPowered = isMPowered;
            return this;
        }

        public BmwBuilder mPackage(boolean isMPackage) {
            this.isMPackage = isMPackage;
            return this;
        }

        public Bmw build() {
            return new BmwM5(this);
        }
    }
}
