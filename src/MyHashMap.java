public class MyHashMap<K, V> {
    private NodeOne<K, V>[] buckets;      //обявляєм букетну колекцію з нод
    private int size;                     //це буде розмір колекції

    public MyHashMap() {
        buckets = new NodeOne[16]; // Початковий розмір бакетів
        size = 0;
    }
    private int getIndHeshBuket(K key) {           //головна функція розрахунку хеша ключа
        return key.hashCode() % buckets.length;   //визначаэмо залишок від ділення  хеша ключа на уількість букетів
    }

    public void put(K key, V value) {                          // посуті адд але в середину букету
        NodeOne<K, V> newNode = new NodeOne<>(key, value);     // створюємо нову ноду
        int bucketIndex = getIndHeshBuket(key);                 //визначаєм індекс бакета, до якого потрібно додати пару ключ-значення

        if (buckets[bucketIndex] == null) {                    // дивимся якщо індекс 0 , коробочка пуста
            buckets[bucketIndex] = newNode;                    // присвоюємо нову ноду букету з індексом
            size++;                                            // збільшуємо розмір колекції
        } else {                                               // якщо індекс не порожній
            NodeOne<K, V> teper = buckets[bucketIndex];       // створюємо посилання на індекс букета

            while (teper.getNext() != null) {                // цикл   поки не = 0 посилання на наступний елемент букета
                if (teper.getKey().equals(key)) {            // якщо цей ключ дорівнює ключу що передається параметром методу
                    teper.setValue(value);                   // сетимо значення
                    return;                                    // виходимо з циклу
                }
                teper = teper.getNext();                   // цей цикл посуті перебирає кородочки масиву
            }

            if (teper.getKey().equals(key)) {                  // якщо цей ключ дорівнює ключу що передається параметром методу
                teper.setValue(value);                         // сетимо значення
            } else {                                             // інакше
                teper.setNext(newNode);                        // сетимо значення посилання на наступну ноду
                size++;                                          // збільшуємо розмір букету
            }
        }
    }

    public void remove(K key) {                                // функція видалення
        int bucketIndex = getIndHeshBuket(key);                //визначаєм індекс бакета, для видалення
        NodeOne<K, V> teper = buckets[bucketIndex];         //  вузол зі зв'язаного списку (якщо такий існує) з бакета, визначеного за допомогою обчисленого bucketIndex.
        // Якщо на цьому індексі немає вузлів, то teper буде встановлено в null, що вказує на порожній бакет.
        NodeOne<K, V> prev = null;   // Ця змінна буде використовуватись для збереження посилання попереднього елемента на наступній для безпесного видалення

        while (teper != null) {                      // доки змінна не порожня
            if (teper.getKey().equals(key)) {        // перевіряємо чи ключ поточного вузла дорівнює заданому ключу
                if (prev == null) {                    // якщо попередній елемент не має посилання на наступній або він єдиний
                    buckets[bucketIndex] = teper.getNext(); // встановлюэмо посилання на наступний елемент якщо він є
                } else {                               //якщо посилання попереднього елемента заповнене
                    prev.setNext(teper.getNext());   // то встановлюємо посиланню посилання наступного букета якщо він є
                }
                size--;                               // зменшуємо розмір
                return;                               //виходимо з циклу
            }

            prev = teper;                           //посиланню попереднього елемента присвоюється теперішній
            teper = teper.getNext();              // переходим до наступного
        }
    }

    public void clear() {                            // очищаємо мапу
        buckets = new NodeOne[16];                   // присваюємо змінній пусту коробку
        size = 0;                                    // видаляємо розмір мапи
    }
    public int size() {
        return size;
    }               // виводимо розмір мапи
    public V get(K key) {                               // повертає значчення за ключем
        int bucketIndex = getIndHeshBuket(key);          // як завжди створюємо змінну що містить залишок діленого хеша ключа
        NodeOne<K, V> teper = buckets[bucketIndex];    // змінну яка буде містити значноди)

        while (teper != null) {                       // цикл  поки значнода не 0
            if (teper.getKey().equals(key)) {         //якщо ключ ноди що передається містить потрібне значення
                return teper.getValue();               //виводим значення елемента
            }
            teper = teper.getNext();                 // беремо для перевірки наступне значення
        }

        return null;                                    // виводим що нема таких
    }

}
