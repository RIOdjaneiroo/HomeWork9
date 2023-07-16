public class NodeOne<K, V> {
    private K key;
    private V value;
    private NodeOne<K, V> next;          //посилання на наступній елемент

    public NodeOne(K key, V value) {  //конструктор класу
        this.key = key;
        this.value = value;
        this.next = null;              // по замовчуванню) при створенні
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public NodeOne<K, V> getNext() {
        return next;
    }

    public void setNext(NodeOne<K, V> next) {
        this.next = next;
    }
}
