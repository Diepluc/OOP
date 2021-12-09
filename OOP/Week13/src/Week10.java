import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Week10 {
    /**
     * list.
     */
    public List<String> getAllFunctions(String fileContent) {
        List<String> imp = new ArrayList<String>();
        List<String> func = new ArrayList<String>();
        List<String> lines = Arrays.asList(fileContent.split("\n"));

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i).trim();
            if (line.contains("import")) {
                String[] li = line.split(" ");
                int n = li.length - 1;
                String s1 = li[n].trim();
                s1 = s1.substring(0, s1.length());
                imp.add(s1);
            }

            if (line.length() < 16) {
                continue;
            }
            if (line.contains("randomIntGreaterThan")) {
                continue;
            }
            String subLine = line.trim().substring(0, 14);
            if (subLine.contains("static") && line.contains(") {")
                    || subLine.contains("public static")) {
                int lastPar = line.indexOf(")");
                int firstPar = line.indexOf('(');
                if (lastPar < (firstPar + 1) || lastPar < 15 || firstPar < 15) {
                    continue;
                }
                for (int j = firstPar; j > 0; j--) {
                    if (line.charAt(j) == ' ') {
                        String funcName = line.substring(j + 1, firstPar);

                        String valName = line.substring(firstPar + 1, lastPar);
                        String[] valLine = valName.split(",");
                        String realVal = "";
                        for (String s : valLine) {
                            s = s.trim();
                            for (int m = 0; m < s.length(); m++) {
                                if (s.charAt(m) == ' ') {
                                    break;
                                }
                                realVal += s.charAt(m);
                            }
                            for (int b = 0; b < imp.size(); b++) {
                                String s2 = imp.get(b);
                                String s3 = "." + realVal + ";";
                                if (s2.contains(s3)) {
                                    realVal = s2.trim();
                                    realVal = realVal.substring(0, realVal.length() - 1);
                                    break;
                                }
                            }
                            if (realVal.equals("Object")) {
                                realVal = "java.lang.Object";
                            }
                            realVal += ",";
                        }
                        realVal = realVal.substring(0, realVal.length() - 1);
                        funcName = funcName + "(" + realVal + ")";
                        funcName = funcName.trim();
                        func.add(funcName);
                        break;
                    }
                }
            }
        }
        return func;
    }
}