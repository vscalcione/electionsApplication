package it.intersistemi.elezioni.elezionirsu;

import java.security.SecureRandom;

public class PassowrdGenerator {

    private static SecureRandom random = new SecureRandom();
    private static final String alphaCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz";
    private static final String numeric = "0123456789";
    private static final String specialChars = "!@#$%^&*_=+-/";

    public static String generatePassword(String dictionary){
        String result = "";
        for (int i = 0; i < 16; i++){
            int index = random.nextInt(dictionary.length());
            result = result + dictionary.charAt(index);
        }
        return result;
    }

    public static void main(String[] args) {
        String passwordGenerated = generatePassword(alphaCaps + alpha + specialChars + numeric);
        System.out.println(passwordGenerated);
        System.out.println();
    }
}
