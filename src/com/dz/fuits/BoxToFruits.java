package com.dz.fuits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxToFruits<T extends fruit> {

    private List<T> container;


    public BoxToFruits() {this.container = new ArrayList<>();}

    public BoxToFruits(T...fruits) { this.container = new ArrayList<>(Arrays.asList(fruits));}


    public float geweiht()  {

        float w = 0.0f;

        for (T fruit: container) {

            w+= fruit.getWeiht();
         }
        return w;

    }

    public boolean summ(BoxToFruits<?> another) {
        return Math.abs(this.geweiht()- another.geweiht()) < 0.001;
    }

    public void transfer (BoxToFruits<? super T> another){
        if(another == this){
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }

    public void add(T fruit){

        container.add(fruit);
    }



}
