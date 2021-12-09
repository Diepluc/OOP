
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Week20 {
    /**
     * list.
     */
    public static List<String> getAllFunctions(String fileContent) {
        List<String> func = new ArrayList<String>();
        List<String> lines = Arrays.asList(fileContent.split("\n"));
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.length() < 15) {
                continue;
            }
            String subLine = line.trim().substring(0, 13);
            if (subLine.equals("public static")) {
                int lastPar = line.lastIndexOf(")");
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
        return func;
    }
    public static void main(String[] args) throws IOException {
        String n = "E:\\Download\\CJavaIntell\\OOP\\Week12\\src\\test";
        Path filePath = Paths.get(n);
        Charset charset = StandardCharsets.UTF_8;
        List<String> lines = Files.readAllLines(filePath, charset);
        String s = "";
        for (int i = 0; i < lines.size(); i++) {
            s += lines.get(i).trim() + '\n';
        }
        List<String> str = getAllFunctions(s);
        System.out.println(str);
    }
} 