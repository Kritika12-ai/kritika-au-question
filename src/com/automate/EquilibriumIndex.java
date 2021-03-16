package com.automate;

public class EquilibriumIndex {
	
	int EquilibriumNumber(int arr[], int n)
	{
		int i;
		int j;
		int left_sum;
		int right_sum;
		
		for(i = 0; i < n; ++i)
		{
			left_sum = 0;
			for(j = 0; j < i; j++)
			{
				left_sum = left_sum + arr[j];
			}
			right_sum = 0;
			for(j = i+1; j < n; j++)
			{
				right_sum = right_sum + arr[j];
			}
			if(left_sum == right_sum)
			{
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EquilibriumIndex eq = new EquilibriumIndex();
		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
		int arr_size = arr.length;
		System.out.println(eq.EquilibriumNumber(arr, arr_size));

	}

}
