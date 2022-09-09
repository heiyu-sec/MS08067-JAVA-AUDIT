package day2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Day2Task3 {
    private int day;
    private int month;
    private int year;
    public static void printInfo(int flag,int i){
        switch (flag){
            case 28:
                for (int j=1;j<=28;j++){
                    switch (j){
                        case 28:
                            System.out.print(i+"月"+j+"日");
                            break;
                        default:
                            System.out.print(i+"月"+j+"日"+",");
                            break;
                    }
                }
                break;
            case 29:
                for(int j=1;j<=29;j++){
                    switch (j){
                        case 29:
                            System.out.print(i+"月"+j+"日");
                            break;
                        default:
                            System.out.print(i+"月"+j+"日"+",");
                            break;
                    }
                }
                break;

            case 30:
                for(int j=1;j<=30;j++){
                    switch (j){
                        case 30:
                            System.out.print(i+"月"+j+"日");
                            break;
                        default:
                            System.out.print(i+"月"+j+"日"+",");
                            break;
                    }
                }
                break;
        }

    }

    public static void main(String[] args) {
        System.out.print("Please input year:");
        Scanner sc = new Scanner((System.in));
        int year = sc.nextInt();
        boolean result = false;
        if(year%4==0){
            result=true;
        }
        for (int i=1;i<=12;i++){
            if(i == 1||i ==3|| i==5||i==7 ||i ==8||i ==10||i==12){
                printInfo(31,i);
                //System.out.println();
            }
            else if (i==2){
                if (result==false){
                    printInfo(28,i);
                    //System.out.println();
                }else {
                    printInfo(29,i);
                    //System.out.println();
                    }
                }else {
                    printInfo(30,i);
                    //System.out.println();
                }
            }
        }
    }

