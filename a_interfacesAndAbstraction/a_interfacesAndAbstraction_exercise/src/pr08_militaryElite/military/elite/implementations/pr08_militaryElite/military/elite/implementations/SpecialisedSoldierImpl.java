package military.elite.implementations;

import military.elite.interfaces.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private static final String AIRFORCES = "Airforces";
    private static final String MARINES = "Marines";
    private String corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append(String.format("Corps: %s",this.getCorps()));
        return sb.toString();
    }

    private void setCorps(String corps) {
        if (MARINES.equals(corps) || AIRFORCES.equals(corps)) {
            this.corps = corps;
        }
    }
}
