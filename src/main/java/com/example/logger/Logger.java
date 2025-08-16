package com.example.logger;

// we will create a singleton pattern -> to create this logger application -> as only one instance of a class should be created
public class Logger {

    private static Logger instance; // this variable will store the object of the class -> static
    // because -> static method can only use static variable directly -> without creating the object of it

    private Logger() {
        // this is called only once -> as only one object of this class will be created
        System.out.println("object is created ");
    }

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("[LOG]:" + message);
    }
}
