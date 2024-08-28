import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class File_Writer_Tutorial {
//    public static void main(String[] args) {
//        try (FileWriter fw = new FileWriter("file.txt", false)){
//            fw.write("line 1");
//            fw.append("\n");
//            fw.append("2");
//            fw.append("\n");
//            fw.write("line 3");
//            fw.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
