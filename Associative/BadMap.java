package Associative;

public class BadMap<K, V> implements MyMapInterface<K, V> {

    @Override
    public void put(K key, V value) {
        
    }

    @Override
    public K firstKey() {
        return null;
    }

    @Override
    public K lastKey() {
        return null;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V getOrDefault(K key, V defaultValue) {
        return null;
    }

    @Override
    public boolean remove(K key) {
        return false;
    }

    @Override
    public int size() {
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public V putIfAbsent(K key, V value) {
        return null;
    }

    @Override
    public void clear() {
    
    }
    
}
