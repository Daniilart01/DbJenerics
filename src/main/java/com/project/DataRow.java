package com.project;

public class DataRow<K, V> {

    private K key;
    private V value;

    public void setDataRow(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public DataRow() {}

    public DataRow(K key, V value) {
        this.key = key;
        this.value = value;
    }

}
