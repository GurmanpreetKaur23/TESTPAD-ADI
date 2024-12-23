class Result{
  /*
   * Complete the function 'factorial' given below
   * @params
   *  n -> an integer whose factorial is to be calculated
   * @return
   *  The factorial of integer n
   */
  static int factorial(int n) {
    // Write your code here
      if(n==0) return 1;
      if(n==1) return 1;
      if(n==2) return 2;
      
      return factorial(n-1)*n ;

  }
}
