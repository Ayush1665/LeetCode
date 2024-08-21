class Solution{
  public static void main(String[] args) {
    int n=153;
    int originalnumber=n;
    int number=0;
    while(n>0){
      int rem=n%10;
      number=number+(rem*rem*rem);
      n=n/10;
    }
    if(originalnumber==number){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}