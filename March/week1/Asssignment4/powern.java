class Solution {

double res;

public double myPow(double x, int n) 
{
    return pow(x,n);
}

public double pow(double x, long n)         
{
    if(n==0) 
        return 1;
    
    if(n<0)                   //If n is negative
        return pow(1/x, -n);
    
    res=pow(x*x,n/2);
    
    if(n%2==1)               //If n is odd
        res=res*x;
    
    return res;
}
}
