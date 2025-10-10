/*You are required to complete this function*/
class GfG {
    void addFraction(int num1, int den1, int num2, int den2) {
        // Your code here
        int ans=0,den=0;
        if(den1==den2){
            ans=num1+num2;
            den=den1;
        }
        else{
            ans=(num1*den2)+(num2*den1);
            den=(den2*den1);
        }
        int r=GCD(ans,den);
        ans=ans/r;
        den=den/r;
        System.out.println(ans+"/"+den);
    }
    
    int GCD(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}