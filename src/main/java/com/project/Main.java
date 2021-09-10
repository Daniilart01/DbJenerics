package com.project;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<DataRow<Integer, String>> countryArrayList = new ArrayList<>();
        List<DataRow<Integer, String>> cityArrayList = new ArrayList<>();
        List<JoinedDataRow<Integer, String, String>> joinedDataRows;

        countryArrayList.add(new DataRow<>(0, "Ukraine"));
        countryArrayList.add(new DataRow<>(1, "Germany"));
        countryArrayList.add(new DataRow<>(2, "France"));

        cityArrayList.add(new DataRow<>(0, "Kiev"));
        cityArrayList.add(new DataRow<>(1, "Berlin"));
        cityArrayList.add(new DataRow<>(2, "Paris"));

        new InnerJoinOperation<Integer, String, String>().join(countryArrayList, cityArrayList);

        joinedDataRows = (List<JoinedDataRow<Integer, String, String>>) new InnerJoinOperation().join(countryArrayList, cityArrayList);

        for (JoinedDataRow<Integer, String, String> result: joinedDataRows) {
            System.out.println(result.getKey() + " " + result.getValue1()+" "+result.getValue2());
        }

    }

}
