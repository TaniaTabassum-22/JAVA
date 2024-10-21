public class Strings {
    public static void main(String[] args) {
        
        //String using literals

        String word1 = "Innovation";
        String word2 = "Strategy";
        String word3 = "Knowledge";
        String word4 = "Technology";
        String word5 = "Creativity";
        String word6 = "Learning";
        String word7 = "Motivation";
        String word8 = "Success";
        String word9 = "Progress";
        String word10 = "Wisdom";

        //String using new keyword

        String str1 = new String("Innovation");   
        String str2 = new String("Perseverance");   
        String str3 = new String("Knowledge");   
        String str4 = new String("Resilience");   
        String str5 = new String("Creativity"); 
        String str6 = new String("Focus");        
        String str7 = new String("Motivation"); 
        String str8 = new String("Ambition");     
        String str9 = new String("Progress");
        String str10 = new String("Leadership"); 

        //Comparing strings using equals

        System.out.println(word1.equals(str1));   
        System.out.println(word2.equals(str2));  
        System.out.println(word3.equals(str3));  
        System.out.println(word4.equals(str4));  
        System.out.println(word5.equals(str5));  
        System.out.println(word6.equals(str6));  
        System.out.println(word7.equals(str7));  
        System.out.println(word8.equals(str8));  
        System.out.println(word9.equals(str9));
        System.out.println(word10.equals(str10));

        System.out.println("----------------------------------");

		//Reverse word1 and print each character

		char[] reverseString = word1.toCharArray();

		for (int i = 0; i < reverseString.length; i++){

			System.out.println(reverseString[i]);
		}
			System.out.println("----------------------------------");


		//Reverse word1

		for (int i = reverseString.length - 1; i >= 0; i--) {

			System.out.println(reverseString[i]);
		}
			System.out.println("----------------------------------");

        //Reverse "Creativity"
        
        String value = " "; 
        char[] charArray = word5.toCharArray(); 

        for (int i = charArray.length - 1; i >= 0; i--) {
            value = value + charArray[i]; 
        }

        System.out.println("Reversed String: " + value); 
    }
}


