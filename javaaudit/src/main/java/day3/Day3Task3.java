package day3;

public class Day3Task3 {
    public static void mOL(int cal){
        System.out.println(cal * cal);
    }
    public static void mOL(double cal){
        System.out.println(cal * cal);
    }
    public static void mOL(double cal1, int cal2){
        System.out.println(cal1 * cal1 + cal2 * cal2);
    }
    public static void max(int cal1, int cal2){
        if(cal1 > cal2){
            System.out.println(cal1);
            return;
        }
        System.out.println(cal2);
    }
    public static void max(double cal1, double cal2){
        if(cal1 > cal2){
            System.out.println(cal1);
            return;
        }
        System.out.println(cal2);
    }
    public static void max(double cal1, double cal2, double cal3){
        if(cal1 > cal2){
            if(cal1 > cal3){
                System.out.println(cal1);
                return;
            }
            System.out.println(cal3);
            return;
        }
        if(cal2 > cal3){
            System.out.println(cal2);
            return;
        }
        System.out.println(cal3);
    }
    public static void main(String[] args) {
        int a = 9;
        double b = 0.9;
        double c = 9.9;
        double d = 8.8;
        int e = 10;
        System.out.printf("调用单int参数mOL算法计算" + a + "的平方：");
        mOL(a);
        System.out.printf("调用单double参数mOL算法计算" + b + "的平方：");
        mOL(b);
        System.out.printf("调用int+double参数mOL算法计算" + a + "和" + b + "的平方：");
        mOL(b, a);
        System.out.printf("调用双int参数MAX算法比较" + a + "和" + e + "的大小：");
        max(a, e);
        System.out.printf("调用双double参数MAX算法比较" + b + "和" + c + "的大小：");
        max(b, c);
        System.out.printf("调用三double参数MAX算法比较" + b + "、" + c + "和" + d + "的大小：");
        max(b, c, d);
    }
}
