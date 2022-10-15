package singleton;

import java.util.logging.*;

import static java.util.logging.Level.*;

public class SingletonLogger {

    private static SingletonLogger instance;
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private  SingletonLogger(){}

    public static SingletonLogger getSingletonLogger() {

        if (instance == null){
            instance = new SingletonLogger();
        }
        return instance;
    }

    public void getLogs(String name , SingletonLogger instance ){

        LOGGER.log(INFO,"The name of the class is: "+name+ "\nThe instance of "+ name + " is: " + instance + "\n");
    }





}
