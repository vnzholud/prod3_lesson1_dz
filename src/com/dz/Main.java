package com.dz;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public Object T = new Object();

    public static java.util.ArrayList<String> main(String[] args) {

        String[] arr = {"bvn vvv n", "ghfghfh","Petya","Vasya"};
        ArrayList<String> al = arrayTolist(arr);



	public static <T> ArrayList <T> arrayTolist(T[] arr){
	    return new ArrayList<>(Arrays.asList(arr));
	}

        public static <T> replace (T[] arr, int index1, int index2){

	    T obj = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = obj;


        }
    }
}
