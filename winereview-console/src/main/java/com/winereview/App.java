package com.winereview;

public class App 
{
    public static void main(String[] args)
    {
        if (args == null || args.length == 0) {
            throw new IllegalArgumentException("Path to the training data file is not found");
        }
        String path = args[0];
        System.out.println("Recieved path to the training data file: " + path);
    }
}
