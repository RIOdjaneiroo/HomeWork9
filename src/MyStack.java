public class MyStack<T> {
    private MyLinkedList<T> stack;   // для обратної черги  (last-in-first-out) створюємо змінну типуЛінкедЛіст

    public MyStack() {                  //Конструктор
        stack = new MyLinkedList<>();
    }

    public void push(T value) {     //оскільки обєкт піддтримує додавання в кінець
        stack.add(value);           //перейменовуємо для використання
    }

    public void remove(int index) {  //так само метод взятий з MyLinckedList видалення за індексом
        stack.remove(index);
    }

    public void clear() {
        stack.clear();
    }

    public int size() {                           //довжина черги
        return stack.size();
    }

    public T peek() {
        return stack.get(stack.size() - 1);        //показує останній елемент черги
    }

    public T pop() {                              //метод
        T element = stack.get(stack.size() - 1); //показує останній елемент черги
        stack.remove(stack.size() - 1);     //видаляє останній елемент черги використовуючи метод видалення за індексом класу ЛінкедЛіст
        return element;                          // показує скопійований останній елемент що видалии
    }
}

