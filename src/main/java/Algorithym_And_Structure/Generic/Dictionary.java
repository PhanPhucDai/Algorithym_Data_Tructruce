package Algorithym_And_Structure.Generic;

public class Dictionary<K, V> {
    private K key;
    private V value;

    public Dictionary(K key, V value){
        this.key=key;
        this.value=value;
    }

    public Dictionary(){
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

    @Override
    public String toString() {
        return  "key=" + key +
                " : value=" + value;
    }
}
