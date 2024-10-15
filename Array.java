public class Array{
    public static void main(String[] args){
        int[] marks = {1, 5, 8, 10, 7, 45, 23, 50, 57, 22};
        float[] percent = {5.8f, 95.2f, 99.88f, 6.6f, 7.99f, 33.5f, 2.2f, 1.8f, 3.5f, 4.9f};
        char[] charArray = {'A','B','C','D','E','F','G','H','I','J'};

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        for(int i = 0; i < percent.length; i++){
            System.out.println(percent[i]);
        }
        for(int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }
        
        System.out.println("---------------------------");

        for(int i = marks.length - 1; i >= 0; i--){
            System.out.println(marks[i]);
        }
        for(int i = percent.length - 1; i >= 0; i--){
            System.out.println(percent[i]);
        }
        for(int i = charArray.length - 1; i >= 0; i--){
            System.out.println(charArray[i]);
        }
        
        System.out.println("---------------------------");

        for(int i = 5; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        for(int i = 5; i < percent.length; i++){
            System.out.println(percent[i]);
        }
        for(int i = 5; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }

        System.out.println("---------------------------");

        for(int i = 5; i >=0; i--){
            System.out.println(marks[i]);
        }
        for(int i = 5; i >=0; i--){
            System.out.println(percent[i]);
        }
        for(int i = 5; i >=0; i--){
            System.out.println(charArray[i]);
        }

        System.out.println("---------------------------");

        for(int i = 0; i < marks.length; i +=2){
            System.out.println(marks[i]);
        }
        for(int i = 0; i < percent.length; i +=2){
            System.out.println(percent[i]);
        }
        for(int i = 0; i < charArray.length; i +=2){
            System.out.println(charArray[i]);
        }
    }
}
