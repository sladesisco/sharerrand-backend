package sharerrand.api.models;

public class Address {

    private String address;

    public String getAddress() {
        return address;
    }

    public boolean setAddress(String number) {
        boolean valid = isValid(number);
        if (valid)
            this.address = number;
        return valid;
    }

    public boolean isValid(String number) {
        //TODO: CALL EXTERNAL WEB SERVICE TO VALIDATE https://streetlayer.com/
        return true;
    }

    public Address(String address) {
        setAddress(address);
    }
}
