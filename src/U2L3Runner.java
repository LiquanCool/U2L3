import java.util.Scanner;

public class U2L3Runner {
    public static void main(String[] args) {

            {
                ChatBot bot1 = new ChatBot();
                System.out.println("Welcome to ChatBot!  What would you like to do?  Enter “i” for info, “w” for weather, or ”f” for my favorite food!");
                Scanner s = new Scanner(System.in);
                String input = s.nextLine();
                bot1.command(input);
            }
        }
}
