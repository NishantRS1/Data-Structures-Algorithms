package com.Javaquestionbank.javaquestions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class JavaquestionsApplicationTests {

	leaders Leader = new leaders();
	MaximumToys toys= new MaximumToys();

	@Test
	void LeadersTest(){
		int []arr={1,7,2,3,5};
		ArrayList<Integer> actualResult=Leader.FindLeaders(arr);
		ArrayList<Integer> expectedResult= new ArrayList<>();
		expectedResult.add(7);
		expectedResult.add(5);
		assertThat(actualResult).isEqualTo(expectedResult);
		int[] arr1={1,2,3,4,0};
		ArrayList<Integer> actualResult1=Leader.FindLeaders(arr1);
		ArrayList<Integer> expectedResult1= new ArrayList<>();
		expectedResult1.add(4);
		expectedResult1.add(0);
		assertThat(actualResult1).isEqualTo(expectedResult1);
		int[] arr2={1};
		ArrayList<Integer> actualResult2=Leader.FindLeaders(arr2);
		ArrayList<Integer> expectedResult2= new ArrayList<>();
		expectedResult2.add(1);
		assertThat(actualResult2).isEqualTo(expectedResult2);
		int[] arr3={};
		ArrayList<Integer> actualResult3=Leader.FindLeaders(arr3);
		ArrayList<Integer> expectedResult3= new ArrayList<>();
		assertThat(actualResult3).isEqualTo(expectedResult3);
	}
	@Test
	void toysTest(){
		int [] toysArray={1,12,5,111,200,1000,10};
		int amount=50;
		int actualResult=toys.FindMaximumToys(toysArray,amount);
		int expectedResult=4;
		assertThat(actualResult).isEqualTo(expectedResult);
		int [] toysArray1={20,30,50};
		int amount1=100;
		int actualResult1=toys.FindMaximumToys(toysArray1,amount1);
		int expectedResult1=3;
		assertThat(actualResult1).isEqualTo(expectedResult1);
		int [] toysArray2={20,30,50};
		int amount2=0;
		int actualResult2=toys.FindMaximumToys(toysArray2,amount2);
		int expectedResult2=0;
		assertThat(actualResult2).isEqualTo(expectedResult2);
		int [] toysArray3={200};
		int amount3=200;
		int actualResult3=toys.FindMaximumToys(toysArray3,amount3);
		int expectedResult3=1;
		assertThat(actualResult3).isEqualTo(expectedResult3);
	}
	@Test
	void testFreq(){
		FrequencySort freq = new FrequencySort();
		ArrayList<Integer> number = new ArrayList<Integer>(
				Arrays.asList(5,5,4,6,4));
		ArrayList actualResult= freq.freqSort(number);
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(
				Arrays.asList(4,4,5,5,6));
		assertThat(actualResult).isEqualTo(expectedResult);
		ArrayList<Integer> number1 = new ArrayList<Integer>(
				Arrays.asList(9,9,9,2,5));
		ArrayList actualResult1= freq.freqSort(number1);
		ArrayList<Integer> expectedResult1 = new ArrayList<Integer>(
				Arrays.asList(9,9,9,2,5));
		assertThat(actualResult1).isEqualTo(expectedResult1);
		ArrayList<Integer> number2 = new ArrayList<Integer>(
				Arrays.asList(1,2,3,4,5));
		ArrayList actualResult2= freq.freqSort(number2);
		ArrayList<Integer> expectedResult2 = new ArrayList<Integer>(
				Arrays.asList(1,2,3,4,5));
		assertThat(actualResult2).isEqualTo(expectedResult2);
	}
	@Test
	void testMinSwaps(){

		minSwaps mini= new minSwaps();
		int [] swapArray={2,8,5,4};
		int actualResult= mini.minSwapsCount(swapArray);
		int expectedResult=1;
		assertThat(actualResult).isEqualTo(expectedResult);
		int [] swapArray1={6,4,5,3,1};
		int actualResult1= mini.minSwapsCount(swapArray1);
		int expectedResult1=3;
		assertThat(actualResult1).isEqualTo(expectedResult1);
		int [] swapArray2={};
		int actualResult2= mini.minSwapsCount(swapArray2);
		int expectedResult2=0;
		assertThat(actualResult2).isEqualTo(expectedResult2);
		int [] swapArray3={1,2,3,4,5};
		int actualResult3= mini.minSwapsCount(swapArray3);
		int expectedResult3=0;
		assertThat(actualResult3).isEqualTo(expectedResult3);
	}
}
