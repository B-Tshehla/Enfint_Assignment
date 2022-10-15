package singleton;

public class Main {


    public static void main(String[] args) {
        String firstClass = "firstClass";
        String secondClass = "SecondClass";
        SingletonLogger firstSingleton = SingletonLogger.getSingletonLogger();
        SingletonLogger secondSingleton = SingletonLogger.getSingletonLogger();

        firstSingleton.getLogs(firstClass,firstSingleton);
        secondSingleton.getLogs(secondClass,secondSingleton);

    }



}
