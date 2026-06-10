package Associative;

public class LinkedMap<K, V> implements MyMapInterface<K, V> {

    // Class tracking fields using your explicit EntryNode class
    private EntryNode<K, V> head;
    private EntryNode<K, V> tail;
    private int size;

    // Constructor initializing an empty map
    public LinkedMap() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void clear() {
        // Break the references to head and tail
        // Java's Garbage Collector will cleanly sweep away all the chained nodes
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void put(K key, V value) {
        EntryNode<K, V> currentEntry = head;
        while (currentEntry != null) {
            if (currentEntry.getKey().equals(key)) {
                currentEntry.setValue(value);
                return;
            }
            currentEntry = currentEntry.getNextNode();
        }

        EntryNode<K, V> newNode = new EntryNode<>(key, value);
        if (size == 0) {
            newNode = head = tail;
        } else {
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            tail = newNode;
        }
    }

    @Override
    public K firstKey() {
        return head.getKey();
    }

    @Override
    public K lastKey() {
        return tail.getKey();
    }

    @Override
    public V get(K key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public V getOrDefault(K key, V defaultValue) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrDefault'");
    }

    @Override
    public boolean remove(K key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean containsKey(K key) {
        EntryNode<K, V> current = this.head;
        while (current != null) {
            // Use .equals() for object comparison, and handle potential null keys safely
            if ((current.key == null && key == null) || (current.key != null && current.key.equals(key))) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsValue'");
    }

    @Override
    public V putIfAbsent(K key, V value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putIfAbsent'");
    }
}