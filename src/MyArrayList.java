public class MyArrayList <Tet> {
    private Tet[] values;
    private int size;        // розмір коробки (масиву)
    private final int DEFAULT = 10;
    public MyArrayList(){           // Конструктор для додавання обєкту
        values = (Tet[]) new Object[DEFAULT];  //приводимо обєкт до типу tet
        size = 0;
    }
    public void add(Tet obj){
        strech();
        values[size] = obj; //ми кладемо обєкт в ячейку масиву саіз
        size++;
    }
    private void strech() {
        int strechVal = values.length *2;                              // Обчислення нової довжини
        Tet[] strechVals = (Tet[]) new Object[strechVal];               // Створення нового масиву об'єктів типу E
        System.arraycopy(values, 0, strechVals, 0, size); // Копіювання вмісту з поточного масиву в новий масив
        values = strechVals;  // Заміна посилання на поточний масив новим масивом з більшою ємністю
    }
    public void remove(int index) {                        // метод для видалення
        indOutOfBoundExn(index);                           // перевіряємо чи вхожий індекс
        System.arraycopy(values, index + 1, values, index, size - index - 1); // виводимо в консоль
        values[--size] = null;
    }
    public void clear() {
        values = (Tet[]) new Object[DEFAULT]; // Створення нового масиву об'єктів типу E
        size = 0;
    }
    public int size() {
        return size;
    }
    public Tet get(int index) {
        indOutOfBoundExn(index);
        return values[index];
    }
    public void indOutOfBoundExn(int index){    // метод входження індекса в розмір
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}

