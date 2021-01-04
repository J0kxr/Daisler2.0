package Daisler;

import java.util.Date;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fuelpath{

//private String pathToFuel; //"/home/torbeng/Dokumente/Websites"; 
private String actualDatePath;

//setactualDatePath(getDate()); 
/*
public Fuelpath(){
    return;
}
*/
private static String getDate(){
    Date d = new Date();
    String dateInString = d.toString();

    String dayMonth = dateInString.substring(4, 10);
    String dayMonthPath = "/" + dayMonth;  
    return dayMonthPath;
}



public String getFullPath(String fuelType)throws IOException{
    String DatePath = null;
    String newDatePath;
    
    newDatePath = getDate();//setNewDatePath(getDate());

    String fullNewPath;
    while(newDatePath.equals(DatePath)){
        
        if (fuelType == "Diesel"){
            System.out.println("/home/torbeng/Dokumente/Websites/Diesel" + newDatePath);
            return "/home/torbeng/Dokumente/Websites/Diesel" + newDatePath;       
        }else if (fuelType == "Benzin"){
            return "/home/torbeng/Dokumente/Websites/Benzin" + newDatePath;
    
        }else {
            System.out.println("Keine Datensammlung für " + fuelType + "!");    
        }
    }

    if (fuelType == "Diesel"){ 
        Path path = Paths.get("/home/torbeng/Dokumente/Websites/Diesel" + newDatePath);     
        Files.createDirectories(path);

        fullNewPath = "/home/torbeng/Dokumente/Websites/Diesel" + newDatePath;
        return fullNewPath; 

    }else if (fuelType == "Benzin"){
        Path path = Paths.get("/home/torbeng/Dokumente/Websites/Benzin" + newDatePath);
        Files.createDirectories(path);
        
        fullNewPath = "/home/torbeng/Dokumente/Websites/Benzin" + newDatePath;
        return fullNewPath;

    }else {
        System.out.println("Keine Datensammlung für " + fuelType + "!");    
        } 

        DatePath = newDatePath;

        return "/home/torbeng/Dokumente/Websites";
    }
    
}