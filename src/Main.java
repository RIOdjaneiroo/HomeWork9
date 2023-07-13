
public class Main {
    public static void main(String[] args) {
        //System.out.printf("Hello and welcome!");
        myArrayListEx();

    }
    public static void myArrayListEx(){
        MyArrayList myArrayList = new MyArrayList<>();
        myArrayList.add("qaz");
        myArrayList.add("wsx");
        myArrayList.add("edc");
        myArrayList.add("rfv");
        for(int i = 0; i< myArrayList.size(); i++){
            System.out.println("s = " + myArrayList.get(i));
        }
        System.out.println("myArrayList.get(1) = " + myArrayList.get(1));
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