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
      while (num != 0) {
          if ((num & 1) == 1) {
              count ++; 
          }
          num >>= 1;
      }
      return count;
    }

    
    public static int task3(int value) {
       if (value <= 0) {
          throw new IllegalArgumentException();
       }
       return sumFib (value);
    }
    
    private static int fibRecursive (int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibRecursive (n; n - 1) + fibRecursive (n; n - 2);
    }
    
    private static int sumFib (int n) {
       int sum = 0;
       for (int i = 0; i < n; i++) {
           sum += fibRecursive (i);
       }
       return sum;
    }
}