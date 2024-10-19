package caesar.encryption.method;

import java.util.Scanner;

/**
 *
 * @author doguhan
 */
public class CaesarEncryptionMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner getData = new Scanner(System.in);

        System.out.println("Enter Number for Encryption");
        int number = getData.nextInt();

        System.out.println("Enter the Word");
        String word = getData.next();

        System.out.print("Encrypted Word : ");
        for (int i = 0; i <= word.length() - 1; i++) {

            char ch = (char) (word.charAt(i) + number);
            int ascii = ch;

            System.out.print((char) ascii);

        }

    }

}
