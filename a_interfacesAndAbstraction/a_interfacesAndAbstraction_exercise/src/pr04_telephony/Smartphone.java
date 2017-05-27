package pr04_telephony;

public class Smartphone implements Callable, Browsable {
    private String parameter;

    public Smartphone(String parameter) {
        this.parameter = parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override

    public String call() {
        for (char digit : this.parameter.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return "Invalid number!";
            }
        }
        return "Calling... " + this.parameter;
    }

    @Override

    public String browse() {
        for (char letters : this.parameter.toCharArray()) {
            if (Character.isDigit(letters)) {
                return "Invalid URL!";
            }
        }
        return String.format("Browsing: %s!", this.parameter);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

