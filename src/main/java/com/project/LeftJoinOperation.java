package com.project;

import java.util.Collection;

public class LeftJoinOperation<K, V1, V2> implements JoinOperation<DataRow<K,V1>, DataRow<K,V2>, JoinedDataRow<K,V1,V2>>{
    @Override
    public Collection<JoinedDataRow<K, V1, V2>> join(Collection<DataRow<K, V1>> leftCollection, Collection<DataRow<K, V2>> rightCollection) {
        return null;
    }
}
