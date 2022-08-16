import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you?");
        String age = scanner.nextLine();
        Integer age2 = Integer.parseInt(age);
        if(age2 > 21)
            System.out.println("You are an adult.");
        else
            System.out.println("You are a child.");
    }
}
