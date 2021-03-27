package com.epam.test.automation.java.practice2;

public class Main {

    public static int task1(int n) {
       if (n<=0) {
        throw new IllegalArgumentException();
       } 
       int oddSum = 0;
       while (n > 0) {
        	int rem = n % 10;
            if (rem % 2 != 0) {
             oddSum+= rem;
            }
            n = n / 10;
        }
		return oddSum;
    }

   
    public static int task2(int num) {
       if (num<=0) {
          throw new IllegalArgumentException();
       } 
       int count = 0;
       while (num > 0) {
           if ((num & 1) == 1) {
              count ++; 
           }
           num >>= 1;
       }
       return count;
    }

    // /**
    //  * <summary>
    //  * Implement code according to description of task 3.
    //  * </summary>
    //  */
    // public static int task3(int value) {
    //     //TODO: Delete line below and write your own solution;
    //     throw new UnsupportedOperationException();
    // }
}
