public class Path {

private String pathToBenzin = /pi/home/Documents/Websites/Benzin;
public String getPath = /pi/home/documents/Websites/Diesel;

public String getPath(String fuel){

    String datePath = getPathWithDate();
    //gets the suffix of Path with the actual Day with Date
    String fuelPathWithDate;
    if (fuel == "Diesel"){
        fuelPathWithDate = "/pi/home/Documents/Websites/Diesel" + datePath;
        //combines the Day with Date with the Path to the fuel folder
        return fuelPathWithDate;

    }else if (fuel == "Benzin"){
        fuelPathWithDate = "/pi/home/Documents/Websites/Benzin" + datePath;
        return fuelPathWithDate;
    
    }
}



public static String getPathWithDate(){

    Date d = new Date();
    String DateString = d.toString();

    
    //Tue Oct 06 17:43:18 CEST 2020

    String pathWithDate="/" + DateString.substring( 5, 11); // Date of Day added to path to Fuel(Benzin/Diesel)

    return 


    }  

}