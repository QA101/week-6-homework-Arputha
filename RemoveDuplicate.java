import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console= new Scanner (System.in);
	      System.out.println("Enter a String: ");
        String inputStr = console.nextLine();
		   String output=removeDuplicates(inputStr);
          System.out.println(output);
	}	
		public static String removeDuplicates(String str) {
			 
			String result = "";
			    for (int i = 0; i < str.length(); i++) {
			        if(!result.contains(String.valueOf(str.charAt(i)))) {
			            result += String.valueOf(str.charAt(i));
			        }
			    }
			    return result;

	}

}
