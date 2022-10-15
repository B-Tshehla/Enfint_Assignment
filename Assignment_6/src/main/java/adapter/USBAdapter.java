package adapter;

public class USBAdapter implements Computer {
    private final MemoryCard memoryCard;

    USBAdapter(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }

    @Override
    public void readUSB() {
        memoryCard.readMemoryCard();
    }
}
