package Associative;

import java.util.HashMap;

public class GoodMap<K, V> implements MyMapInterface<K, V> {

    private HashMap<K, V> map;

    public GoodMap() {
        this.map = new HashMap<>();
    }

    @Override
    public void put(K key, V value) {
        map.put(key, value);
    }

    @Override
    public K firstKey() {
        if (map.isEmpty()) {
            return null;
        }
        return map.keySet().iterator().next();
    }

    @Override
    public K lastKey() {
        if (map.isEmpty()) {
            return null;
        }
        K lastKey = null;
        for (K key : map.keySet()) {
            lastKey = key;
        }
        return lastKey;
    }

    @Override
    public V get(K key) {
        return map.get(key);
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
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean containsKey(K key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsKey'");
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

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }
    
}
