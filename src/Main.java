import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        //System.out.printf("Hello and welcome!");
        myLinkedListTest();
        //myArrayListTest();

    }
    public static void myLinkedListTest(){
        MyLinkedList myLinkedList=new MyLinkedList<>();
        myLinkedList.add("wertar");
        myLinkedList.add("wont");
        myLinkedList.add("sleep");
        for (int i = 0; i< myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
        myLinkedList.remove(1);
        System.out.println("=================================================");
        for (int i = 0; i< myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
    }
    public static void myArrayListTest(){
        MyArrayList myArrayList = new MyArrayList<>();
        myArrayList.add("qaz");
        myArrayList.add("wsx");
        myArrayList.add("edc");
        myArrayList.add("rfv");
        for(int i = 0; i< myArrayList.size(); i++){
            System.out.println("s = " + myArrayList.get(i));
        }
        System.out.println("myArrayList.get( 1) = " + myArrayList.get(1));
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.remove(1);
        System.out.println("myArrayList.get(1) = " + myArrayList.get(1));
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.clear();
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.add("123");
        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        myArrayList.add(123);
        System.out.println("myArrayList.get(1) = " + myArrayList.get(1));

    }
}