package Associative;

/**
 * An expanded key-value map interface implemented using an association list structure.
 * This provides a robust set of operations to fully master the mechanics of maps.
 *
 * @param <K> The type of keys maintained by this map
 * @param <V> The type of mapped values
 * NOTE: This does not contain the hashing function.
 */
public interface MyMapInterface<K, V> {

    /**
     * Associates the specified value with the specified key in this map.
     * <p>
     * <b>Crucial Rule:</b> Keys must be unique. You must first traverse your 
     * list to see if the key already exists.
     * <ul>
     * <li>If the key is found, overwrite its existing value with the new value.</li>
     * <li>If the key is NOT found, create a new node containing the key and value, 
     * and add it to your list.</li>
     * </ul>
     *
     * @param key   key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     */
    public void put(K key, V value);

    /**
     * Returns the first key in the map.
     *
     * @return the first key in the map
     */
    public K firstKey();

    /**
     * Returns the last key in the map.
     *
     * @return the last key in the map
     */
    public K lastKey();

    /**
     * Returns the value to which the specified key is mapped.
     * <p>
     * Logic: Traverse the list from the beginning, checking each node's key 
     * using {@code key.equals(currentNode.key)}.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or {@code null} 
     * if this map contains no mapping for the key
     */
    public V get(K key);

    /**
     * Returns the value to which the specified key is mapped, or the given 
     * {@code defaultValue} if this map contains no mapping for the key.
     * <p>
     * Logic: This prevents annoying {@code null} return values. Search for the key. 
     * If you find it, return its value; if you reach the end of the list without 
     * finding it, return the {@code defaultValue}.
     *
     * @param key          the key whose associated value is to be returned
     * @param defaultValue the default mapping of the key
     * @return the value to which the specified key is mapped, or {@code defaultValue} 
     * if this map contains no mapping for the key
     */
    public V getOrDefault(K key, V defaultValue);

    /**
     * Removes the mapping for a key from this map if it is present.
     * <p>
     * Logic: Search for the node matching the key. If found, unhook it from 
     * the list by adjusting the surrounding pointers.
     *
     * @param key key whose mapping is to be removed from the map
     * @return {@code true} if a node was found and removed; {@code false} 
     * if the key did not exist in the map
     */
    public boolean remove(K key);

    /**
     * Returns the number of key-value mappings currently in this map.
     *
     * @return the number of key-value mappings in this map
     */
    public int size();

    /**
     * Returns true if this map contains no key-value mappings.
     *
     * @return {@code true} if this map contains no elements, {@code false} otherwise
     */
    public boolean isEmpty();

    /**
     * Returns {@code true} if this map contains a mapping for the specified key.
     * <p>
     * Logic: Similar to {@code get(key)}, but instead of returning the value, 
     * you return {@code true} the moment you find a matching key, or {@code false} 
     * if you hit the end of the list.
     *
     * @param key The key whose presence in this map is to be tested
     * @return {@code true} if this map contains a mapping for the specified key
     */
    public boolean containsKey(K key);

    /**
     * Returns {@code true} if this map maps one or more keys to the specified value.
     * <p>
     * Logic: Unlike looking up a key, looking up a value requires you to check 
     * <i>every single node</i> because values are not guaranteed to be unique. 
     * Traverse the entire list and check {@code value.equals(currentNode.value)}.
     *
     * @param value value whose presence in this map is to be tested
     * @return {@code true} if this map maps one or more keys to the specified value
     */
    public boolean containsValue(V value);

    /**
     * Associates the specified value with the specified key ONLY if the key 
     * is not already associated with a value (or is mapped to {@code null}).
     * <p>
     * Logic: Traverse the list. If you find the key already exists, do NOT 
     * change its value; just return the existing value. If the key does not exist, 
     * create the new node, add it to the list, and return {@code null}.
     *
     * @param key   key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with the specified key, or {@code null} 
     * if there was no mapping for the key.
     */
    public V putIfAbsent(K key, V value);

    /**
     * Removes all of the mappings from this map. 
     * The map will be empty after this call returns.
     */
    public void clear();
}
