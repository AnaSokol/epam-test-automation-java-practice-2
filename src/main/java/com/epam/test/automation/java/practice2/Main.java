package com.epam.test.automation.java.practice2;

public class Main {

    public static int task1(int n) {
       if (n<=0) {
        throw new IllegalArgumentException();
       } 
       int oddSum = 0;
       while (n > 0)
        {
        	int rem = n % 10;
            if (rem % 2 != 0) {
             oddSum+= rem;
            }
            n = n / 10;
        }
		return oddSum;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int num) {
       if (num<=0) 
       {
        throw new IllegalArgumentException();
       } 
       for(int num)
       { 
           char[] binaryArr = convertNumberToBinary(num);
           int result = getCountOfCharInArray(binaryArr,'1');
        } 
    }
    public static int getCountOfCharInArray(char[] number, char 1)
    {
        int count=0;
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==1)
            {
             count+=1; //add 1 to the count
            }
        }
        return count;
    }
    public static char[] convertNumberToBinary(num)
    {
      String binaryNum = Integer.toBinaryString(num);
      char[] binaryCharArray = binaryNum.toCharArray();
      return binaryCharArray;
    }
    

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int task3(int value) {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }
}
