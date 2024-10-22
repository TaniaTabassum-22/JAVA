public class Strings {
    public static void main(String[] args) {
        
        //String using literals

        String innovationConcept = "Innovation";
        String businessStrategy = "Strategy";
        String knowledgeBase = "Knowledge";
        String emergingTechnology = "Technology";
        String creativeThinking = "Creativity";
        String lifelongLearning = "Learning";
        String personalMotivation = "Motivation";
        String pathToSuccess = "Success";
        String continuousProgress = "Progress";
        String gainedWisdom = "Wisdom";

        //String using new keyword

        String innovativeMindset = new String("Innovation");   
        String strongPerseverance = new String("Perseverance");   
        String deepKnowledge = new String("Knowledge");   
        String resilientNature = new String("Resilience");   
        String creativeAbility = new String("Creativity"); 
        String focusedEffort = new String("Focus");        
        String internalMotivation = new String("Motivation"); 
        String ambitiousDrive = new String("Ambition");     
        String steadyProgress = new String("Progress");
        String leadershipSkill = new String("Leadership"); 

        //Comparing strings using equals

        System.out.println(innovationConcept.equals(innovativeMindset));   
        System.out.println(businessStrategy.equals(strongPerseverance));  
        System.out.println(knowledgeBase.equals(deepKnowledge));  
        System.out.println(emergingTechnology.equals(resilientNature));  
        System.out.println(creativeThinking.equals(creativeAbility));  
        System.out.println(lifelongLearning.equals(focusedEffort));  
        System.out.println(personalMotivation.equals(internalMotivation));  
        System.out.println(pathToSuccess.equals(ambitiousDrive));  
        System.out.println(continuousProgress.equals(steadyProgress));
        System.out.println(gainedWisdom.equals(leadershipSkill));

        System.out.println("----------------------------------");

		//Reverse word1 and print each character

		char[] reverseString = innovationConcept.toCharArray();

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
        char[] charArray = creativeThinking.toCharArray(); 

        for (int i = charArray.length - 1; i >= 0; i--) {
            value = value + charArray[i]; 
        }

        System.out.println("Reversed String: " + value); 
    }
}


