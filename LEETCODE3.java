class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Create a HashMap to store characters and their indices
        Map<Character,Integer> map = new HashMap<>();
        
        // Initialize variables to keep track of the start index of the current substring and the length of the longest substring
        int start = 0;
        int len = 0;
        
        // Loop through each character in the input string
        for (int end = 0; end < s.length(); end++) {
            // Get the character at the current index
            char c = s.charAt(end);
            
            // If the character is already present in the map and its index is greater than or equal to the start index of the current substring
            if (map.containsKey(c)) {
                if (start <= map.get(c)) {
                    // Update the start index of the current substring to the index of the repeated character + 1
                    start = map.get(c) + 1;
                }
            }
            
            // Calculate the length of the current substring (end - start + 1) and update the longest substring length if necessary
            len = Math.max(len, end - start + 1);
            
            // Update the index of the current character in the map
            map.put(c, end);
        }
        
        // Return the length of the longest substring without repeating characters
        return len;
    }
}
