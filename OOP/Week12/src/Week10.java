import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Week10 {
    /**
     * list.
     */
    public static List<String> getAllFunctions(String fileContent) {
        Path filePath = Paths.get(fileContent);
        Charset charset = StandardCharsets.UTF_8;
        List<String> func = new ArrayList<String>();
        try {
            List<String> lines = Files.readAllLines(filePath, charset);
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                if (line.length() < 15) {
                    continue;
                }
                String subLine = line.trim().substring(0, 13);
                if (subLine.equals("public static")) {
                    int lastPar = line.indexOf(")");
                    int firstPar = line.indexOf('(');

                    for (int j = firstPar; j > 0; j--) {
                        if (line.charAt(j) == ' ') {
                            String funcName = line.substring(j, lastPar + 1);
                            func.add(funcName);
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.format("I/O error: %s%n", e);
        }
        return func;
    }

    public static void main(String[] args) throws IOException {
        String n = "E:\\Download\\CJavaIntell\\OOP\\Week12\\src\\test";
        List<String> str = getAllFunctions(n);
        System.out.println(str);
    }
}
