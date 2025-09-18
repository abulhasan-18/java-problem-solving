class Palindrome {
    public boolean isPalindrome(int x) {
        
       
        String normal = String.valueOf(x);
        // Using StringBuilder
        StringBuilder sb = new StringBuilder(normal);
        String reversed = sb.reverse().toString();

      

        if(normal.equals(reversed)){
            return true;
        }else{
            return false;
        }

    }
}
