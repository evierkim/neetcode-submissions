// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> sorted = new ArrayList<>();
        for (int i = 0; i < pairs.size(); i++) { // insert each pair
            Pair curr = pairs.get(i);
            int j = i - 1;

            while(j >= 0 && (pairs.get(j).key > curr.key)) { // traverse all elements to left
                pairs.set(j + 1, pairs.get(j)); // push to right
                j--; // go to next one to left
            }
            pairs.set(j + 1, curr); // put current one at end of shifted elements

            List<Pair> temp = new ArrayList<>();
            for (Pair p: pairs) {
                temp.add(new Pair(p.key, p.value));
            }
            sorted.add(temp);
        }
        return sorted;
    }
}
