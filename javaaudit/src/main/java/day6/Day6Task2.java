package day6;

import java.util.Scanner;

public class Day6Task2 {
    public static void main(String[] args) {
        String str = "https://www.baidu.com:80/aaa/index.html?uname=river#osier";
        System.out.println("请输入需要解析的URL");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        String[] protocolSplit = new String[2];
        String protocol = "null";
        String last = "";
        try{
            protocolSplit = str.split("://");
            protocol = protocolSplit[0];
            last = protocolSplit[1];
        } catch (Exception e){
            protocol = "null";
            last = str;
        }
        String[] hostAndPort = new String[2];
        String host = "";
        String port = "null";
        String file = "null";
        String ref = "null";
        String relativePath = "null";
        String query = "null";
        try{
            hostAndPort = last.split("/");
            file = hostAndPort[1];
            try{
                host = hostAndPort[0].split(":")[0];
                port = hostAndPort[0].split(":")[1];
            } catch (Exception e){
                host = hostAndPort[0];
            }
        } catch (Exception e){
            host = last;
            printAll(protocol, host, port, file, query, ref, relativePath);
            return;
        }
        file = "";
        for(int i = 1; i < hostAndPort.length; i ++){
            file += "/" + hostAndPort[i];
        }
        String[] pathAndQuery = new String[2];
        try{
            pathAndQuery = file.split("\\?");
            relativePath = pathAndQuery[0];
            try{
                query = pathAndQuery[1].split("#")[0];
                ref = pathAndQuery[1].split("#")[1];
                printAll(protocol, host, port, file, query, ref, relativePath);
            } catch (Exception e){
                printAll(protocol, host, port, file, query, ref, relativePath);
            }
        } catch (Exception e){
            printAll(protocol, host, port, file, query, ref, relativePath);
        }
    }
    public static void printAll(String protocol, String host, String port, String file,String query, String ref, String relativePath){
        System.out.println("协议：" + protocol);
        System.out.println("域名：" + host);
        System.out.println("端口：" + port);
        System.out.println("资源：" + file);
        System.out.println("相对路径：" + relativePath);
        System.out.println("锚点：" + ref);
        System.out.println("参数：" + query);
    }
}
