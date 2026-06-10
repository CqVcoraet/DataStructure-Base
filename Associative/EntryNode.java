package Associative;

public class EntryNode<K, V> {
    private K key;
    private V value;
    private EntryNode<K, V> previous;
    private EntryNode<K, V> next;

    public EntryNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.previous = null;
        this.next = null;
    }

    public EntryNode<K, V> getPreviousNode() {
        return previous;
    }

    public EntryNode<K, V> getNextNode() {
        return next;
    }

    public void setPreviousNode(EntryNode<K, V> node) {
        previous = node;
    }

    public void setNextNode(EntryNode<K, V> node) {
        next = node;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    
    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
