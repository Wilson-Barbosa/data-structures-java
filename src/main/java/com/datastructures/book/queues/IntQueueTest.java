package com.datastructures.book.queues;

import com.datastructures.utils.Creators;

public class IntQueueTest {
    public static void main(String[] args) {
        
        int[] array = Creators.generateRandomArray(10, 100);

        IntQueue queue = new IntQueue(array.length);

        for(int i = 0; i < array.length; i++) {
            queue.insert(array[i]);
        }

        queue.printQueueElements();

        queue.remove();
        queue.remove();
        queue.remove();
        
        queue.printQueueElements();

    }


}
