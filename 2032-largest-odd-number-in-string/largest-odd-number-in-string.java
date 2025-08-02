// class Solution {
//     public String largestOddNumber(String num) {
//         int num1 = Integer.parseInt(num);
//         if(num1%2 != 0){
//             return String.valueOf(num);
//         }
//         while(num1>0){
//             num1 = num1/10;
//             if(num1%2 != 0){
//                 return String.valueOf(num);
//             }
//         }
//         return "";
//     }
// }

class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}