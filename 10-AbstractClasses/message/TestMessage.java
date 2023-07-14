package message;

public class TestMessage {
    public static void main(String[] args) {
        User user = new User("Hector", "Salamanca", "kizimizi@gmail.com", "123-532-987");
        Message sms = new SMS(user.phoneNumber);
        Message email = new Email("Lectures", user.email);

        sms.setText("Hello from public, teams chat.");
        sms.send();
        sms.charNumber();

        sms.setText("The men is behind you.");
        sms.send();
        sms.charNumber();

        email.setText("We have been trying to reach you Walter.");
        email.send();

        email.setText("All of them Hector.");
        email.send();
    }
}
