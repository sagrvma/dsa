class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while(l<r){
            char left = Character.toLowerCase(s.charAt(l));
            char right = Character.toLowerCase(s.charAt(r));
            if(!Character.isLetterOrDigit(left)){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                r--;
                continue;
            }
            if(left!=right){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isAlphaNumeric(char ch){
        if(('a'<=ch && ch<='z')||('A'<=ch && ch<='Z')||('0'<=ch && ch<='9')){
            return true;
        }
        return false;
    }

    public boolean isPalindromeRaw(String s) {
        int l = 0, r = s.length()-1;
        while(l<r){
            char left = s.charAt(l);
            char right = s.charAt(r);

            if(!isAlphaNumeric(left)){
                l++;
                continue;
            }
            if(!isAlphaNumeric(right)){
                r--;
                continue;
            }

            if('A'<=left && left<='Z'){
                left += 32;
            }
            if('A'<=right && right<='Z'){
                right+=32;
            }

            if(left!=right){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}