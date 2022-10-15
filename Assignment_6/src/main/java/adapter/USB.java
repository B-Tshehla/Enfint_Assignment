package adapter;

public class USB implements Computer {
    @Override
    public void readUSB() {
        System.out.println("Reading from USB...");
    }


}
