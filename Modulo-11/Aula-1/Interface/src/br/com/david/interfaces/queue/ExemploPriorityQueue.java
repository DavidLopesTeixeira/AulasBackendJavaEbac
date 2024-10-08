package br.com.david.interfaces.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploPriorityQueue {
    public static void main(String[] args) {
        //Ordenação natural
        // interface -> tipo nome -> instancia
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("Short");
        queue.add("Very long indeed");
        queue.add("Medium");

        while (queue.size() !=0){
            System.out.println(queue.remove());
        }
    }
}
