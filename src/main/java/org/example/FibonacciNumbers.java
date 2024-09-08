package org.example;

import java.util.LinkedList;

public class FibonacciNumbers {
    static private LinkedList<Integer> dynamicProgrammingListNumbers = new LinkedList<>();
    static {
        dynamicProgrammingListNumbers.add(0);
        dynamicProgrammingListNumbers.add(1);
    }
    //просторова складність  O(n)
    //часова складность  O(1)
    public int integrationMethod(int number){
        int previousNumber;
        int nextNumber = 1;
        int sum = 0;
        for (int i = 1; i <= number; i++){
            previousNumber = nextNumber;
            nextNumber = sum;
            sum = previousNumber + nextNumber;
        }
        return sum;
    }
    //просторова складність  O(2^n)
    //часова складность  O(n)
    public int recursionMethod(int number){
        if (number == 0){
            return 0;
        }
        if (number == 1 || number == 2){
            return 1;
        }
        return recursionMethod(number - 2) + recursionMethod(number - 1);
    }
    //просторова складність  O(1)
    //часова складность  O(n)
    public int dynamicProgrammingMethod(int number){
        if (number < dynamicProgrammingListNumbers.size()){
            return dynamicProgrammingListNumbers.get(number);
        }
        for(int i = dynamicProgrammingListNumbers.size(); i <= number; i++){
            dynamicProgrammingListNumbers.add(dynamicProgrammingListNumbers.get(i - 2) + dynamicProgrammingListNumbers.getLast());
        }
        return dynamicProgrammingListNumbers.getLast();
    }
}
