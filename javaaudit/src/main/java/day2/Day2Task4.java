package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Day2Task4 {
    public static void main(String[] args) {
        int[] year = new int[1];
        System.out.println("请输入年份");
        Scanner scanner1 = new Scanner(System.in);
        year[0] = scanner1.nextInt();
        boolean result = false;
        if (year[0] % 4 == 0 && year[0] % 100 != 0 | year[0] % 400 == 0) {
            System.out.println(year[0] + "是闰年");
            result = true;
        } else {
            System.out.println(year[0] + "不是闰年");
            result = false;
        }
        //1,终端输入5个月份
        int[] userInputData = new int[5];
        for (int i = 0; i < userInputData.length; i++) {
            int mouthNum = i + 1;
            System.out.println("请输入" + mouthNum + "个月");
            Scanner scanner = new Scanner(System.in);
            userInputData[i] = scanner.nextInt();
            if (userInputData[i] > 12 || userInputData[i] < 1) {
                System.out.println("请重新输入");
                i = i - 1;
            }
        }
        System.out.println("用户以此输入的月份" + Arrays.toString(userInputData));
        //2,对数组中的月份进行冒泡排序
        for (int i = 0; i < userInputData.length - 1; i++) {
            for (int j = 0; j < userInputData.length - 1 - i; j++) {
                //经典问题：两个变量如何交换值，需要借助第三个变量
                if (userInputData[j] > userInputData[j + 1]) {
                    int temp = userInputData[j];
                    userInputData[j] = userInputData[j + 1];
                    userInputData[j + 1] = temp;
                }
            }
        }
        System.out.println(year[0] + "年排序后月份：" + Arrays.toString(userInputData));
        //4、分析计算5个月中的每天并存入二维数组中
        int[][] mouthDay = new int[userInputData.length][];
        for (int mouthNum = 0; mouthNum < userInputData.length; mouthNum++) {
            if (userInputData[mouthNum] == 1 || userInputData[mouthNum] == 3 || userInputData[mouthNum] == 5 ||
                    userInputData[mouthNum] == 7 || userInputData[mouthNum] == 8 || userInputData[mouthNum] == 10 || userInputData[mouthNum] == 12) {
                int days[] = new int[31];
                for (int i = 1; i <= days.length; i++) {
                    days[i - 1] = i;
                }
                mouthDay[mouthNum] = days;
            } else if (userInputData[mouthNum] == 2 && result == false) {
                int days[] = new int[28];
                for (int i = 1; i <= days.length; i++) {
                    days[i - 1] = i;
                }
                mouthDay[mouthNum] = days;
            } else if (userInputData[mouthNum] == 2 && result == true) {
                int days[] = new int[29];
                for (int i = 1; i <= days.length; i++) {
                    days[i - 1] = i;
                }
                mouthDay[mouthNum] = days;
            } else {
                int days[] = new int[30];
                for (int i = 1; i <= days.length; i++) {
                    days[i - 1] = i;
                }
                mouthDay[mouthNum] = days;
            }
        }
        //5、输出每个月的每一天
        for (int i = 0; i < mouthDay.length; i++) {
            for (int j = 0; j < mouthDay[i].length; j++) {
                System.out.print(userInputData[i] + "月" + mouthDay[i][j] + "日 ");
            }
            System.out.println();
        }
    }

}
