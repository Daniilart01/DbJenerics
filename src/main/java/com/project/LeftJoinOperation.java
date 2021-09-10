package com.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LeftJoinOperation<K, V1, V2> implements JoinOperation<DataRow<K,V1>, DataRow<K,V2>, JoinedDataRow<K,V1,V2>>{
    @Override
    public Collection<JoinedDataRow<K, V1, V2>> join(Collection<DataRow<K, V1>> leftCollection, Collection<DataRow<K, V2>> rightCollection) {
        List<JoinedDataRow<K, V1, V2>> arrayList = new ArrayList<>();
        for (DataRow<K, V1> dataRow1 : leftCollection) {
            boolean isExist = false;
            for (DataRow<K, V2> dataRow2 : rightCollection) {
                if(dataRow1.getKey() == dataRow2.getKey()){
                    arrayList.add(new JoinedDataRow<K,V1,V2>(dataRow1.getKey(), dataRow1.getValue(), dataRow2.getValue()));
                    isExist = true;
                }
            }
            if(!isExist) {
                arrayList.add(new JoinedDataRow<>(dataRow1.getKey(), dataRow1.getValue(), null));
            }
        }
        return arrayList;

    }
}
