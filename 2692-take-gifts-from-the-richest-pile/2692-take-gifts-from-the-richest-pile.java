class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements from the array to the heap
        for (int gift : gifts) {
            pq.add(gift);
        }

        // Perform operations k times
        while (k > 0) {
            int maxGift = pq.poll(); 
            int sqrtGift = (int) Math.sqrt(maxGift);
            pq.add(sqrtGift); // Add the square root of the element back
            k--;
        }

        // Calculate the sum 
        long ans = 0;
        while (!pq.isEmpty()) {
            ans += pq.poll();
        }

        return ans;
    }
}