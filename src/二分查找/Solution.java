package ¶ş·Ö²éÕÒ;

public class Solution {

	public static void main(String[] args) {
		int []array= {};
		int target=0;
		System.out.println(new Solution().findPosition(array, target));
	}
	public int findPosition(int[] array, int target) {
		return findPosition(array, 0, array.length-1, target);
	}
	private int findPosition(int []array,int left,int right,int target) {
		int result=-1;
		int mid=0;
		while(left<=right) {
			mid=(right+left)/2;
			if(array[mid]==target) {
				result=mid;
				break;
			}else if(array[mid]>target) {
				right=mid-1;
			}else if(array[mid]<target){
				left=mid+1;
			}
			
		}
		return result;
	}
}
