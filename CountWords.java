import java.io.*;
import java.util.*;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException{
        // count the number of words in a file
        File f1 = new File("input1.txt");
        Scanner sc1 = new Scanner(f1);

        int count = 0;
        while (sc1.hasNext()) {
            sc1.next();
            count++;
        }
        System.out.println("The number of words in the file is " + count);
    }
}
