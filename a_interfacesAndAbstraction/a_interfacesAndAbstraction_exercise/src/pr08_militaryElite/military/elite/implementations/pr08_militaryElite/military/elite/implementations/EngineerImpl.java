package military.elite.implementations;

import military.elite.interfaces.Engineer;
import military.elite.interfaces.Private;
import military.elite.interfaces.Repair;

import java.util.ArrayList;
import java.util.Collection;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer,Private {
    private Collection<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corps, Collection<Repair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.setRepairs(repairs);
    }

    private void setRepairs(Collection<Repair> repairs) {
        if (repairs != null) {
            this.repairs = new ArrayList<>(repairs);
            return;
        }

        this.repairs = new ArrayList<>();
    }

    @Override
    public Collection<Repair> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(System.lineSeparator());
        sb.append("Repairs:").append(System.lineSeparator());
        this.getRepairs().forEach(m -> sb.append("  ").append(m).append(System.lineSeparator()));
        return sb.toString();
    }
}
