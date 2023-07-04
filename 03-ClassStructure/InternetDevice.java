public class InternetDevice {
    String name;
    boolean isConnected;
    static int connectedDevices = 0;

    public InternetDevice(String deviceName, boolean isDeviceConncted) {
        this.name = deviceName;
        this.isConnected = isDeviceConncted;
        if (isConnected) {
            connectedDevices += 1;
        }
    }
    void connect() {
        if (!isConnected) {
            isConnected = true;
            connectedDevices += 1;
        } else {
            System.out.println("Device already connected");
        }
    }
    void disconnect() {
        if (isConnected) {
            isConnected = false;
            connectedDevices -= 1;
        } else {
            System.out.println("Device already disconnected");
        }
    }
    void displayStatus() {
        System.out.println("Is the device connected?: " + isConnected);
    }
    static void displayConnected() {
        System.out.println(connectedDevices);
    }
}
