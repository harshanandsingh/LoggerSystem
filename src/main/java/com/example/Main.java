package com.example;
import com.example.logger.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log entry");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log entry");

        System.out.println(logger1 == logger2); // true -> both are same instance
    }
}