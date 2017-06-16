package sharerrand.api.models;

public class Address {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean setNumber(String number) {
        boolean valid = isValid(number);
        if (valid)
            this.address = number;
        return valid;
    }

    public boolean isValid(String number) {
        //TODO: CALL EXTERNAL WEB SERVICE TO VALIDATE https://streetlayer.com/
        return true;
    }
}
