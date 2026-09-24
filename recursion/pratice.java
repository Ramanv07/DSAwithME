
public class pratice {
public static void main ( String[] args){

int n= 2;
int x = 2;
int result = PwrOfx(x, n);
System.out.println("Power of " + x + " to the power of " + n + " is: " + result );

}    
public static int PwrOfx(int x,int n){
  if (n==0){
    return 1;
  }
  if (x==0){
    return 0;
  }

  return x * PwrOfx(x, n - 1);
}


}

 

