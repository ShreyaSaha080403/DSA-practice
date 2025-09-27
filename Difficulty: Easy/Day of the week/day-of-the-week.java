// User function Template for Java

class Solution {
    static String getDayOfWeek(int d, int m, int y) {
        // code here
        String week[]={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        if(m==1) {m=13; y--;}
        if(m==2) {m=14; y--;}
        int K=y%100;
        int J=y/100;
        int A= (int)Math.floor((13*(m+1))/5);
        int B=(int)Math.floor((K/4));
        int C=(int)Math.floor((J/4));
        int part1= d+A+K+B+C-(2*J);
        int i=part1%7;
        
        if(i<0){
            while(i<0){
                i=i+7;
            }
        }
        
        return week[i];
        
    }
};