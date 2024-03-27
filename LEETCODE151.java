class Solution {
    public String reverseWords(String s) {
        String word[]=s.split(" +"); // to store in array
        System.out.println(Arrays.toString(word)); // to store in string
        StringBuilder sb = new StringBuilder();
        for(int i=word.length-1;i>=0;i--){// to reverse
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
        
    }
}

//Input: "Hello World  Java  Program"

//1. Splitting the String:
  // - After splitting, the array `words` becomes: ["Hello", "World", "Java", "Program"]

//2. Reversing the Order:
  // - Iterating through `words` array in reverse order:
    // - Append "Program "
     //- Append "Java "
     //- Append "World "
     ////- Append "Hello "

//3. Trimming the Result:
  // - Trim removes the trailing space: "Program Java World Hello"

// 4. Returning the Reversed String: "Program Java World Hello"
