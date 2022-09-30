package com.Javaquestionbank.javaquestions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.*;
@SpringBootApplication
public class JavaquestionsApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaquestionsApplication.class, args);
		leaders Leader= new leaders();
		int [] arr={1,7,2,3,5};
		ArrayList<Integer> list= Leader.FindLeaders(arr);

		MaximumToys toys= new MaximumToys();
		int [] toysArray={1,12,5,111,200,1000,10};
		int amount=50;
		int count=toys.FindMaximumToys(toysArray,amount);
		//System.out.println(count);


		FrequencySort freq = new FrequencySort();
		ArrayList<Integer> number = new ArrayList<Integer>(
				Arrays.asList(5,5,4,6,4));
		ArrayList res= freq.freqSort(number);

		minSwaps mini= new minSwaps();
		int [] swapArray={6,4,5,3,1};
		int miniCount= mini.minSwapsCount(swapArray);
		System.out.println(miniCount);


	}

}
