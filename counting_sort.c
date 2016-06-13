// =============================
// Counting sort algorithm
// for TA in CMPS 351, Spring 16
// by Tung Thanh Le
// email: ttungl@gmail.com
// Language: C
// =============================

#include <stdio.h>
#include <stdlib.h>

void Print_Array(int * array, int array_size){
	for (int i = 0; i < array_size; ++i)
	{
		if(i == (array_size-1)){
			printf("%d \n", array[i]);
		} else {
			printf("%d, ", array[i]);
		}
	}
}

int Maximum_Number(int * array, int array_size){
	int max_no = array[0];
	for (int i = 0; i < array_size; ++i)
	{
		if(array[i]> max_no){
			max_no = array[i];
		}
	}
	return max_no;
}

void Counting_Sort(int * array, int array_size){

	int max = Maximum_Number(array, array_size);
	int arrayB[array_size];
	int arrayC[max];
	int k = 0;

	for (int i = 0; i < array_size; ++i) // init B
	{
		arrayB[i] = 0;
	}

	for (int i = 0; i <= max; ++i) // init C
	{
		arrayC[i] = 0;
	}

	for (int i = 0; i < array_size; ++i) 
	{
		arrayC[array[i]]++; 
	}
	
	for(int i = 0; i <= max; i++){ 
		int count = arrayC[i];
		for(int j = 0; j < count; j++){ 
			arrayB[k] = i; 
			k++; 
		}
	}
	printf("Input array: "); Print_Array(array, array_size);
	printf("Sorted array: "); Print_Array(arrayB, array_size);	
}

int main(){
	int arrayA[] = {2, 5, 3, 0, 2, 3, 0, 3}; 
	int sizeA = sizeof(arrayA)/sizeof(int); // size of array A.
	Counting_Sort(arrayA, sizeA); // to the callee
	return 0;
}