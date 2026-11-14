import java.util.Scanner;
public class Main {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your full name : ");
        String name = input.nextLine();
        System.out.println(" Enter your email : ");
        String email = input.nextLine();
        while (!email.contains("@gmail.com")){
            System.out.println(" u got a wrong email ,please try again\n Enter your email : ");
             email = input.nextLine();
        }
        System.out.println(" Enter yasour city : ");
        String city = input.nextLine();
        name = name.trim();
        char letter = name.charAt(0);
        int length = name.length();
        email = email.toLowerCase().trim();
        city = city.trim();
           System.out.printf("your name is : %5s\n",name);
           System.out.printf("your email is : %5s\n",email);
           System.out.printf("your city is : %2s\n",city);
           System.out.printf("your first letter is : %1c\n",letter);
        input.close();
    }
}
