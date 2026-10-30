
import java.io.*;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws Exception {

        Scanner file = new Scanner(new File("poem2"));

        while (file.hasNextLine()) {
            String name = file.nextLine();

            if (!file.hasNextLine()) {
                break;
            }

            String poet = file.nextLine();

            Poem p = new Poem();
            p.setName(name);
            p.setPoet(poet);

            System.out.println(p);
        }

        file.close();
    }
}
