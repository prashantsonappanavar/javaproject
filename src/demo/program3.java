package demo;

public class program3 {
	
       public static void main(String[]args) {
           // TODO Auto-generated method stub 
int num=1;
while (num<=10) {
      int factorial =1;
      int i=num;
      while(i>0) {
          factorial *= i;
          i-- ;
          System.out.println("factorial of "+num+"is:"+factorial);
          num ++  ;
     }
 }
	 
	}
}