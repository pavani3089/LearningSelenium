package JavaExamples;

import java.util.Random;

/**
 * Created by pavani on 10/19/17.
 */
public class GenerateRandomStrting {

    protected static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { // length of the random string.


            salt.append(SALTCHARS.charAt(rnd.nextInt(36)));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static void main(String[] args) {

        for (int i = 0; i <100 ; i++)
        System.out.println(getSaltString());

    }



}
