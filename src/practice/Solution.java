package practice;

class Solution {
    public int solution(String str1, String str2) {

        return contains(str1, str2)? 1 : 0;

        /* if(str2.indexOf(str1) != -1)
            return 1;

        else
            return 0; */

    }

    private boolean contains(String subStr, String fullStr) {
        for (int i = 0; i <= fullStr.length() - subStr.length(); i++) {
            if (fullStr.charAt(i) == subStr.charAt(0)) {
                int j;
                for (j = 1; j < subStr.length(); j++) {
                    if (fullStr.charAt(i + j) != subStr.charAt(j)){
                        break;
                    }
                }

                if (j == subStr.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}