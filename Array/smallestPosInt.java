package Array;

public class smallestPosInt {
	public static void main(String[] args) {
		int arr[]= {7,8,9,11,12,1};
		
		int[] temp = new int[arr.length];
		for (int i = 0; i<arr.length; i++)
			temp[i] = i+1;
		int small = 1;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>0) {
			if(small<arr[i])
				continue;
			else if(small == arr[i])
				small = arr[i]+1;
			else if(arr[i]-1 > 0)small = arr[i]-1;
			}
		}
		System.out.println(small);
			
	}
}
