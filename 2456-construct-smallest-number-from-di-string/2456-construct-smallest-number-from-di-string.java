import java.util.HashSet;
import java.util.Set;

class Solution {
    String ans = ""; // Stores the lexicographically smallest valid number
    
    public String smallestNumber(String pattern) {
        // Try starting with each digit from 1 to 9 as the first number
        for (int i = 1; i <= 9; i++) {
            Set<Integer> used = new HashSet<>(); // Keeps track of used digits
            used.add(i);
            
            // If a valid sequence is found, return it immediately
            if (sol(0, pattern, "" + i, used)) {
                return ans;
            }
        }
        return ""; // This line will never be reached as a solution always exists
    }

    private boolean sol(int idx, String pattern, String temp, Set<Integer> used) {
        // Base case: If we have processed the entire pattern, store the answer and return true
        if (idx == pattern.length()) {
            ans = temp;
            return true;
        }

        int prev = temp.charAt(temp.length() - 1) - '0'; // Last digit of temp as integer

        // If current pattern character is 'I', next digit must be greater
        if (pattern.charAt(idx) == 'I') {
            for (int i = prev + 1; i <= 9; i++) { // Try all greater unused digits
                if (used.contains(i)) continue;
                
                used.add(i);
                if (sol(idx + 1, pattern, temp + i, used)) {
                    return true;
                }
                used.remove(i); // Backtrack
            }
        } 
        else { // If pattern character is 'D', next digit must be smaller
            for (int i = 1; i < prev; i++) { // Try all smaller unused digits
                if (used.contains(i)) continue;
                
                used.add(i);
                if (sol(idx + 1, pattern, temp + i, used)) {
                    return true;
                }
                used.remove(i); // Backtrack
            }
        }
        return false; // If no valid number is found
    }
}