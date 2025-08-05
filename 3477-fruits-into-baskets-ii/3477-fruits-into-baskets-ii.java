class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int placed = 0; // number of fruits successfully placed
        int j = 0;      // basket index

        for (int i = 0; i < fruits.length; i++) {
            // Find the leftmost available basket that can hold the fruit
            while (j < baskets.length && fruits[i] > baskets[j]) {
                j++;
            }

            // If a valid basket is found
            if (j < baskets.length) {
                placed++;
                baskets[j] = 0; // mark the basket as used
                        // reset basket pointer for next fruit
            }
            j = 0;  
        }

        return fruits.length - placed; // return number of unplaced fruits
    }
}
