import java.util.Arrays;

public class ConsecutivePositiveIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] element1=new int[] {1,5,1,-1,1};
		int[] element2=new int[] {1,5,1,-1,1,1,1,1};
		
		int[] outputArray1=positivenumbers(element1);
		int[] outputArray2=positivenumbers(element2);
		System.out.println("Consecutive Positive Integers : "+Arrays.toString(outputArray1));
		System.out.println("Consecutive Positive Integers : "+Arrays.toString(outputArray2));
		
		
	}
	
	public static int[] positivenumbers(int[] inputArray) {
		int start=0;
		int i=0;
		int maxlength=0;
		int maxpartstart=0;
		
		while (i<inputArray.length) {
			if (inputArray[i]<0) {
				start=i+1;
			}
				else {
					int currentlength= i- start+1;
					if (maxlength<currentlength) {
						maxlength=currentlength;
						maxpartstart=start;
						
					}
				}
				i++;
			}
			return Arrays.copyOf(inputArray,maxpartstart+maxlength);
		}
	}


