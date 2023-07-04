public class Clock {
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Clock() {
        this.hour = 0;
        this.minute = 0;
    }

    void setClock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    void setAlarm(int alarmHour, int alarmMinute) {
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }

    void setClock() {
        this.hour = 0;
        this.minute = 0;
    }

    void runAlarm() {
        System.out.println("beep-beep-beep-beep !!" );
    }

    public String displayTime() {
        return hour + ":" + minute;
    }

    void addOneMinute() {
        if (minute <= 60 & minute >= 0) {
            minute += 1;
        } else {
            hour += 1;
            minute = 0;
        }
        if (alarmHour == this.hour & alarmMinute == this.minute) {
            runAlarm();
            // TODO
        }
    }
}
