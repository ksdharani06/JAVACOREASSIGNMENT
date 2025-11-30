import java.util.*;

public class UniqueWordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.println("Enter paragraph:");
        String input = sc.nextLine();

        input = input.toLowerCase();
        input = input.replaceAll("[^a-z ]", "");

        String[] words = input.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

       
        Map<String, Integer> sortedMap = new TreeMap<>(map);

        System.out.println("Word Frequency (Alphabetical):");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

   
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> e1,
                               Map.Entry<String, Integer> e2) {
                return e2.getValue() - e1.getValue(); // descending
            }
        });

        System.out.println("\nTop 3 Most Frequent Words:");
        for (int i = 0; i < 3 && i < list.size(); i++) {
            Map.Entry<String, Integer> entry = list.get(i);
            System.out.println((i + 1) + ". " +
                    entry.getKey() + " : " + entry.getValue());
        }
    }
}

