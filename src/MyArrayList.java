public class MyArrayList <Tet> {
    private Tet[] values;
    private int size;
    //private final int DEFAULT = 1;
    public MyArrayList(){           // Конструктор для додавання обєкту
        values = (Tet[]) new Object[1];  //приводимо обєкт до типу tet
        size = 0;
    }
    public void add(Tet obj){
        strech();
        values[size] = obj; //ми кладемо обєкт в ячейку масиву саіз
        size++;
    }
    private void strech() {
        int strechVal = values.length +1;                              // Обчислення нової довжини
        Tet[] strechVals = (Tet[]) new Object[strechVal];               // Створення нового масиву об'єктів типу E
        System.arraycopy(values, 0, strechVals, 0, size); // Копіювання вмісту з поточного масиву в новий масив
        values = strechVals;  // Заміна посилання на поточний масив новим масивом з більшою ємністю
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(values, index + 1, values, index, size - index - 1);
        values[--size] = null;
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            values[i] = null;
        }
        size = 0;
    }
    public int size() {
        return size;
    }
    public Tet get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return values[index];
    }


}

