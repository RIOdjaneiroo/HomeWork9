public class MyQueue<T> {
    private MyLinkedList<T> queue;  //створюємо змінну типу класу MyLinkedList

    public MyQueue() {                  //конструктор для створення нових елементів черги
        queue = new MyLinkedList<>();
    }

    public void add(T value) {         // метод додавання в кінець черги запозичений з класу MyLinkedList
        queue.add(value);
    }

    public void clear() {         // метод очищення всієїчерги також запозичений з класу MyLinkedList
        queue.clear();
    }

    public int size() {            // метод розмір черги також запозичений з класу MyLinkedList
        return queue.size();
    }

    public T peek() {            // метод пік виводить перший елемент черги
        return queue.get(0);
    }

    public T poll() {                // метод пул виводить перший елемент черги і видаляє його з колекції
        T element = queue.get(0);   //тут ми створюємо змінну яку будемо виводити присвоюємо їй значення першого елемента черги
        queue.remove(0);      // видаляємо перший елемент
        return element;            // виводимо скопійовану змінну
    }
}