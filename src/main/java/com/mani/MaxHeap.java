package com.mani;

import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
MaxHeap m = new MaxHeap();
int [] num={3,2,1,5,6,4};
int check=m.findKthLargest(num,4);
 System.out.println(check);
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<>((x, y)->y-x);
        int result = 0;
        for(int num : nums){
            max.add(num);
        }
        System.out.println("queue is "+max);
        for(int i = 0; i < k; i++){
            result = max.poll();
        }
        return result;
    }
}
