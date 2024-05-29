class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e =letters.length-1;
        
        while(s<=e){
            
            int m=(e+s)/2;
            
            if (letters[m]>target){
                e=e-1;
            }
            else{
                s=m+1;
            }
        }
        return letters[s%letters.length] ;
    }
}