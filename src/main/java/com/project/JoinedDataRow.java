package com.project;

public class JoinedDataRow<K, V1, V2> {

    private K key;
    private V1 value1;
    private V2 value2;

    public void setJoinedDataRow(K key,V1 value1,V2 value2) {
        this.key = key;
        this.value1 = value1;
        this.value2 = value2;
    }

    public JoinedDataRow(K key, V1 value1, V2 value2) {
        this.key = key;
        this.value1 = value1;
        this.value2 = value2;
    }

}
