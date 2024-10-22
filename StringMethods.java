public class StringMethods {

    public static void main(String[] args) {

        // Uppercase

        String seriesTitle = "game of thrones";
        String formattedSeriesTitle = seriesTitle.toUpperCase();
        System.out.println(formattedSeriesTitle);

        // Concat

        String famousQuote = "When you play the game of thrones, ";
        String concatenatedFamousQuote = famousQuote.concat("you win or you die");
        System.out.println(concatenatedFamousQuote);

        // Lowercase

        String seriesGenre = "FANTASY";
        String formattedGenre = seriesGenre.toLowerCase();
        System.out.println(formattedGenre);

        // Trim

        String leadActorName = "            Jon Snow          ";
        String trimmedActorName = leadActorName.trim();
        System.out.println(trimmedActorName);

        // IsEmpty

        String kingdomName = "";
        boolean isKingdomNameEmpty = kingdomName.isEmpty();
        System.out.println(isKingdomNameEmpty);

        // Length

        String iconicWeapon = "Dragonglass";
        int weaponUsed = iconicWeapon.length();
        System.out.println(weaponUsed);

        // Split (String regex)

        String keyTheme = "Power and Betrayal";
        String[] splittedString = keyTheme.split(" ");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[2]);

        // StartsWith

        String fanFavoriteCharacter = "Tyrion Lannister";
        boolean isTyrionFavorite = fanFavoriteCharacter.startsWith("Tyrion");
        System.out.println(isTyrionFavorite);

        // EndsWith

        String significantEvent = "The Red Wedding";
        boolean isTheEventWedding = significantEvent.endsWith("Wedding");
        System.out.println(isTheEventWedding);

        // ToCharArray

        String notableHouse = "Lannister"; 
        char[] charArray = notableHouse.toCharArray(); 

        StringBuilder reversedHouse = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedHouse.append(charArray[i]); 
        }
        System.out.println(reversedHouse.toString());

        // CharAt

        String iconicSymbol = "The Iron Throne";
        char specificSymbolChar = iconicSymbol.charAt(4);
        System.out.println(specificSymbolChar);


        //palindrome

        String palindrome = "sagas";

        char[] palindromeChars = palindrome.toCharArray(); 
        String reversedValue = "";

        for (int i = palindromeChars.length - 1; i >= 0; i--) {
            reversedValue += palindromeChars[i];
        }

        if (palindrome.equals(reversedValue)) {
            System.out.println("Given input is a palindrome");
        } else {
            System.out.println("Given input is not a palindrome");
        }
    }
    
}