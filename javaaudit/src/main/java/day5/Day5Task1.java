package day5;

public class Day5Task1 {
    public static void main(String[] args) {
        DemoList array = new DemoList();
        System.out.printf("初始数组：");
        array.printArray();
        System.out.println("");
        array.addElement("a");
        array.addElement("b");
        System.out.printf("增加两个元素后的数组：");
        array.printArray();
        System.out.println("");
        array.addElement("c");
        System.out.printf("增加三个元素后的数组：");
        array.printArray();
        System.out.println("");
        array.addElement("d");
        System.out.printf("增加四个元素后的数组：");
        array.printArray();
        System.out.println("");
        array.updateElementByIndex(1, "z");
        System.out.printf("修改一个元素后的数组：");
        array.printArray();
        System.out.println("");
        array.deleteElementByIndex(1);
        System.out.printf("删除一个元素后的数组：");
        array.printArray();
        System.out.println("");
        array.deleteElementByIndex(0);
        System.out.printf("再一个元素后的数组：");
        array.printArray();
        System.out.println("");
        System.out.println("index 为 1 的元素为：" + array.getElementByIndex(1).toString());
        System.out.println("元素 c 的 index 为：" + Integer.toString(array.getIndexByElement("c")));
    }
}
