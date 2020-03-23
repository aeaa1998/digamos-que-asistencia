package com.algoritmos;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Controller {
    private PriorityQueue<String> pq =  new PriorityQueue<>();
    public void showExample(){
        var lel = "Esto cae mal ya tenemos suficientes tareas.".split(" ");
        for (int i = 0; i < lel.length; i++) {
            System.out.println("Se ingreso \n" + lel[i]);
            pq.offer(lel[i]);
        }
        while (!pq.isEmpty()){
            System.out.println("Se imprime \n" + pq.poll());
        }
    }
}
