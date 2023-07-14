import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        //myQueueTest();
        //myLinkedListTest();
        //myArrayListTest();
        myStackTest();

    }
    public static void myStackTest(){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.remove(4);
        myStack.remove(3);
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        myStack.clear();
        System.out.println("myStack.size() = " + myStack.size());

    }
    public static void myQueueTest(){
        MyQueue myQueue = new MyQueue<>();
        myQueue.add("first");
        System.out.println(myQueue.peek());
        myQueue.poll();
        myQueue.add("second");
        System.out.println(myQueue.peek());
        System.out.println("myQueue.size() = " + myQueue.size());
        myQueue.poll();
        myQueue.add("third");

        myQueue.add("fourth");
        System.out.println(myQueue.peek());
        System.out.println("myQueue.size() = " + myQueue.size());
        myQueue.clear();
        myQueue.add("fifth");
        System.out.println(myQueue.peek());

        myQueue.add("sixth");

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