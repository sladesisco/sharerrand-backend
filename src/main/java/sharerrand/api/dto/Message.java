package sharerrand.api.dto;

public class Message {
    public Message(String message) {
        this.message = message;
    }
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{" +
                "message : '" + message + '\'' +
                '}';
    }
}
