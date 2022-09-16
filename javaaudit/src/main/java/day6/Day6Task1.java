package day6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day6Task1 {
    public static void main(String[] args) {
        String rootPath = "D:\\codefactory\\MS08067-JAVA-AUDIT\\javaaudit\\src\\main\\java\\day6";
        String fileName = "";
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyyMMdd");
        String nowDate = sdf.format(now);
        double randDouble = Math.random();
        randDouble = randDouble * 9000 + 1000;
        String randString = Integer.toString((int)(randDouble));
        fileName = nowDate + randString + ".txt";
        File f = new File(rootPath, fileName);
        try {
            f.createNewFile();
        } catch (Exception e){
            System.out.println(e);
        }
        OutputStream os = null;
        try{
            os = new FileOutputStream(f, true);
            byte[] data = nowDate.getBytes();
            os.write(data, 0, data.length);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            if(os != null){
                try {
                    os.close();
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
