package adapter;

public class Main {
    public static void main(String[] args) {
        USB usb = new USB();
        MemoryCard memoryCard = new MemoryCard();
        USBAdapter usbAdapter = new USBAdapter(memoryCard);

        System.out.print("Read USB:v ");
        usb.readUSB();

        System.out.print("Read memory card: ");
        usbAdapter.readUSB();


    }
}
