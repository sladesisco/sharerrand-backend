package sharerrand.api.models;

public class PhoneNumber {

    private String number;

    public PhoneNumber(String number) {
        this.setNumber(number);
    }

    public String getNumber() {
        return number;
    }

    public boolean setNumber(String number) {
        boolean valid = isValid(number);
        if (valid)
            this.number = number;
        return valid;
    }

    public boolean isValid(String number) {
        //TODO: WRITE VALIDATION FOR PHONE NUMBER
        return true;
    }
}
