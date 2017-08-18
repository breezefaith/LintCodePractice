package ÕûÊıÅÅĞò;

public class Solution {
	
	public static void main(String[] args) {
		int []array= {3,2,1,4,5};
		new Solution().sortIntegers(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("");
	}
	
	public void sortIntegers(int[] array) {
		quickSort(array,0,array.length-1);
	}
	private void quickSort(int []array,int left,int right){
		if(left>=right){
			return;
		}
		int i=left;
		int j=right+1;
		do{
			do{ i++; }while(i<right&&array[left]>array[i]);

			do{ j--; }while(j>left&&array[left]<=array[j]);

			if(i<j){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}while(i<j);

		if(left<=j){
			int temp=array[left];
			array[left]=array[j];
			array[j]=temp;
		}

		quickSort(array,left,j);
		quickSort(array,j+1,right);
	}
}
