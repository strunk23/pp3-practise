package message;

public abstract class Message {
    protected String text;

    public Message() {
        this.text = "";
    }

    public void getText() {
        System.out.println(this.text);
    }
    public void setText(String text) {
        this.text = text;
    }
    public void charNumber() {
        System.out.println("Message length: " + this.text.length());
    }
    abstract void send();
}

class SMS extends Message {
    protected String phoneNumber;

    public SMS(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void getPhoneNumber() {
        System.out.println(phoneNumber);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    void send() {
        System.out.println("Sending: " + text + " to: " + phoneNumber);
    }
}

class Email extends Message {
    protected String subject;
    protected String recipientAddress;
    public Email(String subject, String recipientAddress) {
        this.subject = subject;
        this.recipientAddress = recipientAddress;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public void getSubject() {
        System.out.println(this.subject);
    }
    public void getRecipientAddress() {
        System.out.println(this.recipientAddress);
    }

    void send() {
        System.out.println("Sending message: " + text + " with subject: " + subject + " to: " + recipientAddress);
    }
}

class User {
    public String firstName;
    public String lastName;
    public String email;
    public String phoneNumber;

    public User(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
