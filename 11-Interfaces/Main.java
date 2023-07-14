interface CanOnOf {
    public void on();
    public void off();
}

interface CanChangeChannel {
    public void channelUp();
    public void channelDown();
    public void setChannel();
}

class Television implements CanOnOf {
    boolean isOn = false;
    int channel = 1;
    int channelMin = 1;
    int channelMax = 99;
    String[] tvStation = new String[channelMax];
    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

    public void channelUp() {
        if (this.channel < this.channelMax & this.isOn) {
            this.channel += 1;
        } else {
            System.out.println("Cannot change channel");;
        }
    }

    public void channelDown() {
        if (this.channel > this.channelMin & this.isOn) {
            this.channel -= 1;
        } else {
            System.out.println("Cannot change channel");
        }
    }

    public void setChannel(int chanelNumber) {
        if (chanelNumber >= this.channelMin & chanelNumber <= this.channelMax) {
            this.channel = chanelNumber;
        } else {
            System.out.println("Cannot change channel");
        }
    }

    public void initTvStations() {
        this.tvStation[0] = "Test 1";
        this.tvStation[1] = "Test 2";
        this.tvStation[2] = "Test 3";
        this.tvStation[3] = "Test 4";
        this.tvStation[4] = "Test 5";
        this.tvStation[5] = "Test 6";
        this.tvStation[6] = "Test 7";
        this.tvStation[7] = "Test 8";
        this.tvStation[8] = "Test 9";
        this.tvStation[9] = "Test 10";
    }

    public void displayTvStations() {
        for (int i = 0; i < this.tvStation.length; i++) {
            if (this.tvStation[i] != null) {
                System.out.println(this.tvStation[i] + " " + i);
            }
        }
    }

    public void displayStatus() {
        if (this.isOn) {
            System.out.println("TV is on and the channel is: " + this.channel + " " + this.tvStation[this.channel]);
        } else {
            System.out.println("TV is off");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.initTvStations();
        tv.displayTvStations();
        tv.on();
        tv.displayStatus();
        tv.channelUp();
        tv.setChannel(7);
        tv.setChannel(142);
        tv.displayStatus();
        tv.channelDown();
        tv.displayStatus();
        tv.off();
        tv.displayStatus();
    }
}