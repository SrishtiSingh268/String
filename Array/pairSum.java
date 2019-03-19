package Array;
import java.util.Scanner;
public class pairSum {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		System.out.println("Enter numbers(space separated)");
		Scanner s = new Scanner(System.in);
		String str[] = s.nextLine().split(" ");
		int i = 0, j= 0;
		int nums[]= new int[str.length];
		for(String s1: str)
		{
			nums[i++] = Integer.parseInt(s1);
		}
		
		System.out.println("Enter sum: ");
		int sum = s.nextInt();
		i=0; j=nums.length-1;
		
		while(i<j){
			if(nums[i] + nums[j] == sum)
				System.out.println(nums[i++] + ", " + nums[j--]);
			else if(nums[i] + nums[j] > sum)
				j--;
			else i++;
		}
	}
}
	