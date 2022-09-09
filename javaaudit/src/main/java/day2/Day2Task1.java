package day2;

/**
 * 使用switch语句改写下列if语句：
 * int a = 3;
 *   int x = 100;
 *   if(a==1)
 *         x+=5;
 *     else if(a==2)
 *         x+=10;
 *     else if(a==3)
 *         x+=16;
 *     else if(a==4)
 *         x+=34;
 *      else
 *         x += 100;
 */

public class Day2Task1 {
    public static void main(String[] args) {
            int x =100;
            int a= 3;
            switch (a){
                case 1:
                    x+=5;
                    System.out.println(x);
                    break;
                case 2:
                    x+=10;
                    System.out.println(x);
                    break;
                case 3:
                    x+=16;
                    System.out.println(x);
                    break;
                case 4:
                    x+=34;
                    System.out.println(x);
                default:
                    x+=100;
                    System.out.println(x);
                    break;
            }
    }
}
