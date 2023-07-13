public class MyLinkedList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    public MyLinkedList() { // конструктор
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public void add(T val) {
        Node<T> newNode = new Node<>(lastNode, null, val);      // створюємо нову ноду
        if (lastNode != null) {                       // якщо посилання на останній елемент не ноль
            lastNode.setNextNode(newNode);            // встановлюємо посилання на нову створену ноду
        }
        lastNode = newNode;                      // в іншому випадку посилання на останню ноду буде невНода
        if (firstNode == null) {                 // якщо посилання на попередній елемент =0 то
            firstNode = newNode;                 // встановлюємо посилання на новуНоду
        }
        size++;                                  // збільшуємо розмір ЛінкедЛіста
    }

    public void remove(int index) {  //метод видалення за індексом
        IndOutOfBoundExn(index);             //перевіряємо чи індекс не виходить за межі колекції
        Node<T> nodeToRemove = getNode(index);   // оголошуємо ноду, що видаляється
        Node<T> previousNode = nodeToRemove.getPrevNode();// беремо посилання на попередню ноду
        Node<T> nextNode = nodeToRemove.getNextNode();    // беремо посилання на наступну ноду

        if (previousNode != null) {                      // якщо посилання на попередню нода не = нулю тобто елемент не перший
            previousNode.setNextNode(nextNode);          //встановлюємо ій посилання на наступну ноду визначену з ноди що видаляється
        } else {
            firstNode = nextNode;                        // якщо посилання на попередню ноду = нулю то встановлюємо першій ноді значення наступної
        }

        if (nextNode != null) {                          //якщо наступна нада не = 0 тобто елемент не оснанній
            nextNode.setPrevNode(previousNode);          //їй встановлюється посилання на попередню ноду, посилання що містить нода яка видаляється
        } else {                                         // якщо ж елемент останній тобто наступна нада = 0
            lastNode = previousNode;                     // останній ноді встановлюємо значення попередньої
        }

        size--;                                          // зменшуємо розмір колекції
    }

    public void clear() {                             // очищаємо колекцію
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public int size() {                                // визначаємо розмір
        return size;
    }

    public T get(int index) {                           // метод виведення по індексу
        IndOutOfBoundExn(index);                        // перевіряємо чи входить індекс в масив
        Node<T> node = getNode(index);                  // присвоюємо обєкту  індксне значення
        return node.getValue();                         // виводимо значення елементу за індексом
    }

    private void IndOutOfBoundExn(int index) {            // метод що викликає вийняток для індекса що не входить в колекцію
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private Node<T> getNode(int index) {                 // метод що шукає ноду за вказаним індексом
        IndOutOfBoundExn(index);                         // перевіряємо чи індекс в межах колекції
        Node<T> currentNode = firstNode;                 // створюємо змінну з типом нода і присвоюємоїй перший елемент
        for (int i = 0; i < index; i++) {                // рухаємося по масиву до вказаного індексу -1
            currentNode = currentNode.getNextNode();     // getNextNode() повертає посилання на наступний вузол після поточного вузла.
        }
        return currentNode;                              //повертає знайдений вузол за вказаним індексом
    }
}

