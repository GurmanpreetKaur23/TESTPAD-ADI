class Result {
    static long power(int base, int exp) {
      // Write your code here
      if(exp<0) return -1 ;
      if(exp==0) return 1 ;
        
       if(exp%2==0){
           long halfPower = power(base , exp/2) ;
           return halfPower*halfPower ;
       }
        else {
            return base* power(base , exp-1) ;
        }
    }
}
