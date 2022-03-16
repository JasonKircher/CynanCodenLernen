import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        while (true) {
            String input = scanner.nextLine();
            int x;
            try {
                 x = Integer.parseInt(input);

            } catch (NumberFormatException e) {
                System.out.println("I said a number! HUANSOHN!");
                continue;
            }
            boolean biz = x % 5 == 0;
            boolean baz = x % 3 == 0;
            String output = "";

            if(biz) {
                output += "biz";
            }
            if(baz) {
                output += "baz";
            }
            System.out.println(output);

        }
    }

}
