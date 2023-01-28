package com.lizardwizard.daclient;

import java.io.File; // Imports the fileio library
public class fileChecker {
    public static void versionComparer(){
    File versionFile = new File("version.txt");
        if(versionFile.exists()){
            System.out.println("File found!");
        }
        else{
            //mkdir
        }
    }
}
