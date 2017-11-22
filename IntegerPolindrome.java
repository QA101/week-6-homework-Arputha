import java.util.Arrays;

public class IntegerPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,3,2,1};
		isPoilndrome(arr);
		
	}
	public static void isPoilndrome(int[] intArr) {
		int[] revArr =new int[intArr.length];
		int i=0;
		int j=0;
		
		for(i=intArr.length-1;i>=0;i--) {
			revArr[j]=intArr[i];
			//System.out.println(revArr[j]);
			j++;
		}
		
		if (Arrays.equals(revArr,intArr)) {
			System.out.println("This is a Polintrome");
		}
		else {
		System.out.println("Not a Polintrome");
	}

}
}
