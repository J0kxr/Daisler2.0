package Daisler; 

import java.io.IOException;
import java.net.*;
import java.nio.*;
import java.nio.file.*;


public class Strg{

    public static void main(String[] args) throws NullPointerException, MalformedURLException, IOException{ 

        App a = new App(); // Neuer Website Download
        //Path p = Path.of("/home/torbeng/Dokumente/Websites");


        try {
            a.SaveFile(new URL("https://www.benzinpreis-aktuell.de/benzinpreise-waldshuttiengen-heute") , "/home/torbeng/Dokumente/Websites"); //save text in file

        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("STRG-Fehler");

        }
        
    ///home/torbeng/Dokumente
    //String fs = System.getProperty("file.separator");
    //System.out.print(fs);
    }
}

