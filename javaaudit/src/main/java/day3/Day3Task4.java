package day3;

import java.util.HashMap;
import java.util.Scanner;

public class Day3Task4 {
    public static void main(String[] args) {
        System.out.println("请输入表达式");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashMap m = recognize(input);
        while(m == null){
            System.out.println("表达式输入有误，请重新输入表达式");
            scanner = new Scanner(System.in);
            input = scanner.nextLine();
            m = recognize(input);
        }
        double cal1 = Double.parseDouble(m.get("cal1").toString());
        double cal2 = Double.parseDouble(m.get("cal2").toString());
        char type = m.get("type").toString().charAt(0);
        Calculator cal = new Calculator(cal1, cal2, type);
        cal.cal();
    }
    public static HashMap recognize(String input){
        char types[] = {'+', '-', '*', '/'};
        int index = -1;
        String cal1_s;
        String cal2_s;
        double cal2;
        char type = '/';
        HashMap<String, String> m = new HashMap<String, String>();
        for(int i = 0; i < types.length; i ++){
            if(index != -1 && input.indexOf(types[i]) != -1){
                return null;
            }
            if(input.indexOf(types[i]) != -1){
                index = input.indexOf(types[i]);
                type = types[i];
            }
        }
        if(index == -1){
            return null;
        }
        cal1_s = input.substring(0, index);
        cal2_s = input.substring(index + 1, input.length());
        try {
            cal2 = Double.parseDouble(cal2_s);
        } catch (Exception e){
            return null;
        }
        if(type == '/' && cal2 == 0){
            return null;
        }
        m.put("cal1", cal1_s);
        m.put("cal2", cal2_s);
        m.put("type", String.valueOf(type));
        return m;
    }
}