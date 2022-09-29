import java.util.Objects;
import java.util.Scanner;

public class ChatBot {
    public void command(String command) {
        if (Objects.equals(command, "i")) {
            System.out.println("Some information about myself is that I was created with Java and I like chatting!");
            repeat();
        } else if (Objects.equals(command, "w")) {
            System.out.println("To see the weather, look outside your window and decide if it is good or not.");
            repeat();
        } else if (Objects.equals(command, "f")) {
            System.out.println("My favorite food are eggs");
            repeat();
        } else {
            System.out.println("That is not a valid command!");
            repeat();
        }
    }
    public void repeat(){
        System.out.println("Welcome to ChatBot!  What would you like to do?  Enter “i” for info, “w” for weather, or ”f” for my favorite food!");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        command(input);
    }
}
