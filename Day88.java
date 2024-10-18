import java.util.PriorityQueue;  

class Solution {  
    public int halveArray(int[] nums) {  
        double initialSum = 0;  
        for (int num : nums) {  
            initialSum += num;  
        }  
        double targetSum = initialSum / 2;  
        double currentSum = initialSum;  

        PriorityQueue<Double> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b, a));  

        for (int num : nums) {  
            maxHeap.add((double) num);  
        }  
        int operations = 0; 

        while (currentSum > targetSum) {  
            double largest = maxHeap.poll(); 
            currentSum -= largest / 2; 
            maxHeap.add(largest / 2);  
            operations++;  
        }  
        return operations; 
    }  
}