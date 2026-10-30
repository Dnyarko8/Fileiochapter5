
import java.io.*;

public class Exercise2 {
    public static void main(String[] args) throws Exception {

        Poem p1 = new Poem();
        p1.setName("The Road Not Taken");
        p1.setPoet("Robert Frost");

        Poem p2 = new Poem();
        p2.setName("We Real Cool");
        p2.setPoet("Gwendolyn Brooks");

        Poem p3 = new Poem();
        p3.setName("Hope");
        p3.setPoet("Emily Dickinson");

        PrintWriter writer = new PrintWriter("poems.txt");

        writer.println(p1.getName());
        writer.println(p1.getPoet());

        writer.println(p2.getName());
        writer.println(p2.getPoet());

        writer.println(p3.getName());
        writer.println(p3.getPoet());

        writer.close();

        System.out.println("Done!");
    }
}
