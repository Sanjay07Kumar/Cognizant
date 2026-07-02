public class BuilderPatternTest {
    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel Core i9")
                .setRam(16)
                .setStorage(512)
                .build();

        Computer personalPC = new Computer.Builder()
                .setCpu("Intel Core i7")
                .setRam(8)
                .setStorage(256)
                .build();

        gamingPC.displayConfig();
        personalPC.displayConfig();
    }
}