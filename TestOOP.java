/***********************

Testprogramm fuer OOPProgrammingTask.java

expected output:

Program OOPProgrammingTask.java consisting of 68 Lines, 40 of which are code
Measure: 40.0
***********************/ 


public class TestOOP {

    public static void main (String[] args){
        OOPProgrammingTask T = new OOPProgrammingTask("OOPProgrammingTask.java");
        T.addLn("// user.name");
        T.addLn("// 01323136");
        T.addLn("//");
        T.addLn("// Implemetation einer Measurable-Klasse");
        T.addLn("// fuer Aufgabenprogramme der LV");
        T.addLn("// Objektorientierte Programmierung");
        T.addLn("");
        T.addLn("");
        T.addLn("public class OOPProgrammingTask implements Measurable {");
        T.addLn("");
        T.addLn("    // name and List  of lines of code");
        T.addLn("    private String name;");
        T.addLn("    private List<String> code;");
        T.addLn("");
        T.addLn("    // constructor for setting the name");
        T.addLn("    public Result (String name) {");
        T.addLn("        this.name = name;");
        T.addLn("        code = new List<String>;");
        T.addLn("    }");
        T.addLn("");
        T.addLn("    // adds a line of code");
        T.addLn("    public void addLn (String line) {");
        T.addLn("        code.add(line);");
        T.addLn("    }");
        T.addLn("");
        T.addLn("    // returns total number of lines");
        T.addLn("    public double getNumberOfLines () {");
        T.addLn("        return code.size();");
        T.addLn("    }");
        T.addLn("");
        T.addLn("    // returns whether given lines has code");
        T.addLn("    // i.e. check if empty or comment [not perfectly implemented!!!]");
        T.addLn("    public boolean isLineCode (int which) {");
        T.addLn("        String trimmedLine = code[which].trim();");
        T.addLn("        if (trimmedLine.length == 0) {");
        T.addLn("            return false;");
        T.addLn("        }");
        T.addLn("        String leadingPair = trimmedLine.substring(0,1);");
        T.addLn("        if(leadingPair.equals(\"//\") || leadingPair.equals(\"/*\")) {");
        T.addLn("            return false;");
        T.addLn("        }");
        T.addLn("        return true;");
        T.addLn("    }");
        T.addLn("");
        T.addLn("    // returns number of code lines");
        T.addLn("    public double getNumberOfCode () {");
        T.addLn("        int c = 0;");
        T.addLn("        for (int i = 0; i < code.size(); i++) {");
        T.addLn("            if (isLineCode(i)) {");
        T.addLn("                c++;");
        T.addLn("            }");
        T.addLn("        }");
        T.addLn("        return c;");
        T.addLn("    }");
        T.addLn("");
        T.addLn("    // returns a string representation of the name combined with the number of code lines");
        T.addLn("    // and the number of total lines");
        T.addLn("    public String toString () {");
        T.addLn("        return \"Program \" + name + \" consisting \" + getNumberOfLines() + \", \" + getNumberOfCode() + \" of which are code\";");
        T.addLn("    }");
        T.addLn("");
        T.addLn("    // implements getMeasure from Measureable");
        T.addLn("    // Measure given by lines of code");
        T.addLn("    public double getMeasure () {");
        T.addLn("        return getNumberOfCode();");
        T.addLn("    }");
        T.addLn("}");
        T.addLn("");
        System.out.println(T);
        System.out.println("Measure: " + T.getMeasure());
    }

}
