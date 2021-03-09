package com.dz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Main<T> {

    public static java.util.ArrayList<String> main(String[] args) {

        String[] arr = {"bvn vvv n", "ghfghfh", "Petya", "Vasya"};
        ArrayList<String> al = arrayTolist(arr);


        public static ArrayList <T> arrayTolist(T[]arr){
            return new ArrayList<>(Arrays.asList(arr));
        }

        public static <T> replace(T arr,int index1, int index2){
            T obj = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = obj;
        }
    }
}
