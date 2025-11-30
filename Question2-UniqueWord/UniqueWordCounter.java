import java.util.Scanner;

public class UniqueWordCounterSimple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter paragraph:");
        String input = sc.nextLine();

        
        input = input.toLowerCase();

        // this line is new to me and this is for my understanding remove special characters
        input = input.replaceAll("[^a-z ]", "");

       
        String[] words = input.split(" ");

        
        String[] uniqueWords = new String[words.length];
        int[] count = new int[words.length];

        int uniqueCount = 0;

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals("")) {
                continue; 
            }

            int index = -1;

            
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueWords[j].equals(words[i])) {
                    index = j;
                    break;
                }
            }

            if (index == -1) {
                uniqueWords[uniqueCount] = words[i];
                count[uniqueCount] = 1;
                uniqueCount++;
            } else {
                count[index]++;
            }
        }

    
        System.out.println("Word Frequency:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueWords[i] + " : " + count[i]);
        }

   
        System.out.println("Top 3 Most Frequent Words:");
        for (int k = 1; k <= 3; k++) {

            int max = 0;
            int pos = -1;

            for (int i = 0; i < uniqueCount; i++) {
                if (count[i] > max) {
                    max = count[i];
                    pos = i;
                }
            }

            if (pos != -1) {
                System.out.println(k + ". " + uniqueWords[pos] + " : " + count[pos]);
                count[pos] = -1; 
            }
        }
    }
}
