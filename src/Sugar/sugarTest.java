package Sugar;

import java.io.*;

public class sugarTest {

    private static String path = "C:\\Users\\Administrator\\Desktop\\temp\\test.txt";

    public static void main(String[] args) {
        File file = new File(path);
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
            String s;
            while((s = br.readLine()) != null){
                System.out.println("s的值是：---" + s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
