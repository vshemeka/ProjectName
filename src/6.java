import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "example.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        System.out.println(sb.toString());
    }
}
