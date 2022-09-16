package day5;

public class DemoList {
    private final int origincount = 3;
    //当前数组长度上限
    private int size = 3;
    //当前数组内元素个数
    private int count = 0;
    private Object[] array = new Object[origincount];
    private Object object;
    public Object getElementByIndex(int index){
        if(index > count - 1 || index < 0){
            System.out.println("输入的索引值非法");
            return null;
        }
        return array[index];
    }
    public int getIndexByElement(Object obj){
        for(int i = 0; i < count; i ++){
            if(obj.equals(array[i])){
                return i;
            }
        }
        return -1;
    }
    public void updateElementByIndex(int index, Object obj){
        if(index > count || index < 0){
            System.out.println("输入的索引值非法");
            return;
        }
        array[index] = obj;
        System.out.println("修改 index 为 " + Integer.toString(index) + " 的元素为：" + obj.toString());
    }
    public void deleteElementByIndex(int index){
        if(index > count || index < 0){
            System.out.println("输入的索引值非法");
            return;
        }
        for(int i = index; i < count - 1; i ++){
            array[i] = array[i + 1];
        }
        count --;
        for(int i = count; i < array.length; i ++){
            array[i] = null;
        }
        System.out.println("删除 index 为 " + Integer.toString(index) + " 的元素");
        if(count <= size / 2){
            size = size / 2;
            Object[] tmp = new Object[size];
            for(int i = 0; i < size; i ++){
                tmp[i] = array[i];
            }
        }
    }
    public void addElement(Object obj){
        if(count >= size){ //扩容
            size = size * 2;
            Object[] tmp = new Object[size];
            for(int i = 0; i < count; i ++){
                tmp[i] = array[i];
            }
            array = tmp;
        }
        array[count] = obj;
        System.out.println("增加：" + obj.toString());
        count ++;
    }
    public void printArray(){
        System.out.printf("[ ");
        for(int i = 0; i < count; i ++){
            System.out.printf(array[i].toString());
            if(i != count - 1){
                System.out.printf(", ");
            }
        }
        if(count != size){
            if(count != 0){
                System.out.printf(", ");
            }
            for(int i = count; i < size; i ++){
                System.out.printf("null");
                if(i != size - 1){
                    System.out.printf(", ");
                }
            }
        }
        System.out.printf(" ]");
    }
}
