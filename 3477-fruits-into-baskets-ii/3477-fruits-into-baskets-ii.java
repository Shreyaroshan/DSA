class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c = 0; 
        int j = 0;      

        for (int i = 0; i < fruits.length; i++) {
            
            while (j < baskets.length && fruits[i] > baskets[j]) {
                j++;
            }

            // If a valid basket is found
            if (j < baskets.length) {
                c++;
                baskets[j] = 0; 
            }
            j = 0;  
        }

        return fruits.length - c
    }
}
