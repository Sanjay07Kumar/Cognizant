public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser =
                new MobileApp("Sanjay");

        Observer webUser =
                new WebApp("Kumar");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockPrice(1500.50);

        stockMarket.setStockPrice(1700.75);

        stockMarket.removeObserver(webUser);

        stockMarket.setStockPrice(1900.25);
    }
}