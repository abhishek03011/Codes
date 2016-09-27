public class PhoneMain {

	static String alphabetArray[] = {"","", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};

	public static void main(String[] args) {

		int digitNumber[] = new int[]{9,3,4};
		PhoneMain.printAllPossibleCombination(digitNumber);

	}
	
	private static void printAllPossibleCombination(int arr[]) {
		
		int i = 0;
		int j = 0;
		
		while (i < alphabetArray[arr[0]].length() && j < alphabetArray[arr[1]].length()) 
		{
			
			if(j < alphabetArray[arr[1]].length()) {
				
			   PhoneMain.printPossibleCombination(alphabetArray[arr[0]].substring(i, i+1).concat(alphabetArray[arr[1]].substring(j, j+1)),arr);
				if(j !=alphabetArray[arr[1]].length()-1) {
				    j++;

				}else{
					j=0;
					i++;	
				}
			}
		}		
	}	
	
	private static void printPossibleCombination(String s1 , int arr[]) {
		
		int i = 0;
		while (i < alphabetArray[arr[2]].length()) {
			
			System.out.println(s1.concat(alphabetArray[arr[2]].substring(i, i+1)));
			i++;
		}
		
	}

}