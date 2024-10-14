package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors


public class Exercise32 {

    public static void main(String[] args) {

        printToFile(generateUserInputToSave());

    }

    public static String generateStringToSave(String string) {

        printToFile(string);

            return string;

    }

    private static String generateUserInputToSave(){
        StringBuilder sb = new StringBuilder();
        System.out.println("Escribe debajo el texto que quieras. Pulsa \"ENTER\" 2 veces seguidas para finalizar:");
        String string;
        while(!(string = Utils.string()).isEmpty()){
            sb.append(string).append(System.lineSeparator());
            generateStringToSave(string);
        }
        return sb.toString();
    }

    public static void printToFile(String string) {
        String archivo = "src/main/resources/data.txt";

        FileWriter f = null;
        try {

            f = new FileWriter(archivo);
            f.write(string);
            f.close();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }


}
