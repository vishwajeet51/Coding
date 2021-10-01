/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

 class Solution {
    public String multiply(String num1, String num2) {
        int prod = 0, carry = 0;
        String ans = "";
        for (int i = num2.length() - 1; i >= 0; i--) {
            int a = Character.getNumericValue(num2.charAt(i));
            for (int j = num1.length() - 1; j >= 0; j--) {
                int b = Character.getNumericValue(num1.charAt(j));
                prod = (a * b) + carry;
				// check if any digit in present at the index in which current result will be added
                int index = ans.length() - 1 - (num2.length() - 1 - i) - (num1.length() - 1 - j); 
                if (index >= 0) {
                    prod += Character.getNumericValue(ans.charAt(index));
                    int val = prod % 10;
                    char[] temp = ans.toCharArray();
                    temp[index] = ("" + val).charAt(0);
                    ans = String.valueOf(temp);
                    carry = prod / 10;
                }
                else {
                    ans = (prod % 10) + ans;
                    carry = prod / 10;
                }
            }
            if (carry > 0)
                ans = carry + ans;
            carry = 0;
        }
        // if all digit are 0s then return "0"
        int i = 0; 
        while (i < ans.length() && ans.charAt(0) == '0')
            i++;
        if (i == ans.length())
            return "0";
        return ans.substring(i);
    }
}

/*
Video explaination:-https://youtu.be/hDueaAjITi4
*/