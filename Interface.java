class MyCalculator implements AdvancedArithmetic{
    int sum=0;
    int add=0;
    
    public int divisor_sum(int s){
        for(int sum=1;sum<=s;sum++){
            if(s%sum==0){
                add=add+sum;
            }
        
        }
        return add;
        
        
    }
}
