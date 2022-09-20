import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.Scanner;

public class CredentialService {
    public static void main(String[] args) {
        showCredentials();
    }

   public static @NotNull String generateEmailAddress() {
        Scanner obj = new Scanner(System.in);
        String mail = null;
        System.out.println("Please enter your First Name: ");
        String firstName = obj.nextLine();
        System.out.println("Please enter your Last Name: ");
        String lastName = obj.nextLine();
        Employee emp = new Employee(firstName, lastName);
        emp.fullName();

    System.out.println("Please enter the department from the following\n" +
               "1. Technical\n" +
               "2. Admin\n" +
               "3. Human Resource\n" +
               "4. Legal");
    String department = obj.nextLine();
    System.out.println("Please enter your Company Name: ");
    String company = obj.nextLine();

    mail = emp.fullName()+"@"+department+company+".com";
    return mail;
   }

   public static char[] generatePassword(int length) {
        String capitalCaseAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseAlphabets = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseAlphabets + lowerCaseAlphabets + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseAlphabets.charAt(random.nextInt(lowerCaseAlphabets.length()));
        password[1] = capitalCaseAlphabets.charAt(random.nextInt(capitalCaseAlphabets.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for(int i=4; i<length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
   }

    public static void showCredentials() {
        String Email = generateEmailAddress();
        char[] Password = generatePassword(8);
        System.out.println("Dear your generated credentials are as follows \n" +
                "Email: " +Email+
                "\nPassword: " +Password);
    }

}
