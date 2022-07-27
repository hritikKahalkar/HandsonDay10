/*Write a program in Java to demonstrate Java 8 Functional Interface Predicate feature. The class will print all numbers , even numberrs and number greater than 3 of the numbers in the array list

Step1: create Java main class Java8 Tester

Step2: create a method eval which will take 2 parameters (list of numbers from 1 to 9 and predicate condition)

Step3: call the eval method from main method to print all the even numbers by passing appropriate parameters

Step4: call the eval method from main method to print all the numbers greater than 3 by passing appropriate parameters

Sample output

Print all numbers:

1

2

3

4

5

6

7

8

9

Print even numbers:

2

4

6

8

Print numbers greater than 3:

4

5

6

7

8

9*/

import java.util.*;
import java.util.function.*;


public class Java8Tester {
	
	static void eval(List<Integer> list, Predicate<Integer> predicate) {
		
		for(Integer n: list) {
			if(predicate.test(n)) {
				System.out.println(n);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println("Print all numbers : ");
		eval(list, (n)->true);
		
		System.out.println("Print Even Numbers : ");
		eval(list, (n)->n%2==0);
		
		System.out.println("Print numbers Greater than 3 : ");
		eval(list, (n)->n>3);
		
		


	}

}
