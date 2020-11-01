package Daisler; 

import java.io.IOException;
import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.file.*;


public class Strg{

    public static void main(String[] args) throws NullPointerException, MalformedURLException, IOException, InterruptedException, NoSuchFileException{ 
        int a = 0;

        while(a == 0){
        Fuelpath f = new Fuelpath();
        //Path f = Path.of("/home/torbeng/Dokumente/Websites");

        App benzin = new App(); // Neuer Website Download
        App diesel = new App();//new Obejct for Diesel
           
        System.out.println("Benzinpfad:" + f.getFullPath("Benzin"));
        System.out.println("Dieselpfad:" + f.getFullPath("Diesel"));
        System.out.println(" | ");


        try {
            benzin.SaveFile(new URL("https://www.benzinpreis-aktuell.de/benzinpreise-waldshuttiengen-heute") , f.getFullPath("Benzin")); //f.getFullPath("Benzin")save text in file//Benzin
            diesel.SaveFile(new URL("https://www.benzinpreis-aktuell.de/dieselpreise-waldshuttiengen-heute"), f.getFullPath("Diesel"));

        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("STRG-Fehler");

        }
        //Thread.sleep(30* 60 * 1000);
        ++a;
    }
    ///home/torbeng/Dokumente
    //String fs = System.getProperty("file.separator");
    //System.out.print(fs);
    }
}

