import java.io.*;
import java.util.*;

public class FileIOExample {
    public static void main(String[] args) throws FileNotFoundException{
        File f1 = new File("input1.txt");
        File f2 = new File("input2.txt");
        File outFile = new File("output.txt");

        Scanner sc1 = new Scanner(f1);
        Scanner sc2 = new Scanner(f2);

        StringBuilder sb = new StringBuilder();
        while (sc1.hasNextLine() && sc2.hasNextLine()) {
            sb.append(sc1.nextLine());
            sb.append("\n");
            sb.append(sc2.nextLine());
            sb.append("\n");
        }

        while (sc1.hasNextLine() ) {
            sb.append(sc1.nextLine());
            sb.append("\n");
           
        }
        while (sc2.hasNextLine()) {
            sb.append(sc2.nextLine());
            sb.append("\n");
        }

        sc1.close();
        sc2.close();


        System.out.println(sb.toString());

        try (
            FileWriter writer = new FileWriter(outFile)) {
            writer.write(sb.toString());
            writer.flush();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
