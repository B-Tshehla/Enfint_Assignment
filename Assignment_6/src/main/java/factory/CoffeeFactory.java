package factory;

public class CoffeeFactory {
    public Coffee createACoffee(String coffeeType){
        coffeeType = coffeeType.toLowerCase();

        if (coffeeType.isEmpty()){
            return null;
        }

        return switch (coffeeType){
            case "espresso" -> new Espresso();
            case "americano" -> new Americano();
            default -> throw new IllegalArgumentException("Unknown coffee " + coffeeType);
        };
    }
}
