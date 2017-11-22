
public class WordPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPolindrome("civic");
	}
	public static void isPolindrome(String wrd) {
		int halfLen=wrd.length()/2;
		int wordLen=wrd.length();
		
		String fhalfstr=wrd.substring(0,halfLen);
		System.out.println( "First half of the word : "+fhalfstr);
		String shalfstr;
		 
		if(halfLen%2==0) {
			shalfstr=wrd.substring(halfLen+1,wrd.length());
		}
		else {
			shalfstr=wrd.substring(halfLen,wrd.length());
		}
		System.out.println("Second half of the word : " +shalfstr);
		
		char[] wrdArr=shalfstr.toCharArray();
		char[] revHalfStr=new char[wrdArr.length];
		int j=0;
		
			for(int i=wrdArr.length-1;i>=0;i--) {
				revHalfStr[j]=wrdArr[i];
				
				j++;
				
			}
			String revstr = String.copyValueOf(revHalfStr);
			
				if(fhalfstr.equalsIgnoreCase(revstr)) {
					System.out.println("This word is a Polindrome");
				}
				
				else {
					System.out.println("Not a Polindrome");
				}
				
	}
}
