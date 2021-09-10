package com.project;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<DataRow<Integer, String>> countryArrayList = new ArrayList<>();
        List<DataRow<Integer, String>> cityArrayList = new ArrayList<>();
        List<InnerJoinOperation<Integer, String, String>> innerJoinArrayList = new ArrayList<>();

        countryArrayList.add(new DataRow<>(0, "Ukraine"));
        countryArrayList.add(new DataRow<>(1, "Germany"));
        countryArrayList.add(new DataRow<>(2, "France"));

        cityArrayList.add(new DataRow<>(0, "Kyiv"));
        cityArrayList.add(new DataRow<>(1, "Berlin"));
        cityArrayList.add(new DataRow<>(2, "Budapest"));

        InnerJoinOperation<Integer, String, String> innerJoinOperation = new InnerJoinOperation<>();

        innerJoinOperation.join(countryArrayList, cityArrayList);

        innerJoinArrayList.add(innerJoinOperation);

        System.out.println(innerJoinArrayList);

//        List<JoinedDataRow<Integer, String, String>> f2 = (List<JoinedDataRow<Integer, String, String>>) new InnerJoinOperation().join(countryArrayList, cityArrayList);

        for (DataRow<Integer, String> result: countryArrayList) {

            System.out.println(result.getKey() + " " + result.getValue());

        }

    }

}
