import java.lang.*;

class Methods{

	

   public static int add(int num1,int num2){
   int sum; 
    sum=num1+num2;
   return sum;
}



    public static double addition(double num1,double num2){
     double sum;
     sum=num1+num2;
     return sum;
}

   public static double speed(double distance,double time){
   double speed;
   speed=distance/time;
   return speed;
}

   public static double area(double radius){
   double area;
   area=3.141*radius*radius;
   return area;
}


  public static double fact(int num){
 int n=num;
 while(num>1){
 n=n*(num-1);
 num--;
}
return n;
}
 
 public static boolean even(int num){
 
 if(num%2==0)
 return true;
 else
 return false;
}


public static boolean odd(int num){
if(num%2!=0)
return true;
else
return false;
}


/*public static boolean prime(int n){
int num=12;
for(n=2;n<num;n++){
if(num%n!=0)
return true;
else
return false;
}
}*/


public static boolean palindrome(int num){
int rmd=0,rvr=0;
int n=num;
while(num>0){
rmd=num%10;
rvr=rvr*10+rmd;
num=num/10;
}

if
(rvr==n)
return true;
else
return false;
}

/*public static void int fibo(int num){
int fib1=1;
int fib2=0;
int i=1;
do{
i=fib1+fib2;
fib1=fib2;
fib2=i;
}while(fib2<num)
}
*/

public static boolean divisix(int num){
if (num%6==0)
return true;
else
return false;
}

public static double hour(int seconds){
double hour=seconds/3600;
return hour;
}

public static int digit(int num){
int n,digit=0;
while(num>0){
n=num%10;
digit++;
num=num/10;
}
return digit;
}

public static double twice(long num){
long dig=0,twice=0,num1,x;
num1=num;
while(num>0){
num=num/10;
dig++;
}
x=(long)Math.pow(10,dig);
twice=num1*x+num1;
return twice;
}


public static int hundread(int num){
int n=0,count=0;
while(count!=3  ){
n=num%10;
num=num/10;
count++;
}
return n;
}

public static int sumdigit(int num){
int sum=0,rmd=0;
while(num>0){
rmd=num%10;
sum=sum+rmd;
num=num/10;
}
return sum;
}

public static void main(String[]args){
int ans=add(10,10),ans2=add(4,2);
double ans1=addition(1.1,100.5), ans3= addition(5.1,20.5);
double ans4=speed(100.45,2.5), ans5=speed(25.66,60.25);
double ans6=area(3.2),ans7=area(10.9);
double num=fact(5),num1=fact(9);
boolean aa=even(10),aa1=even(11);
boolean ad=odd(24),ad1=odd(61);
//boolean p1=prime(15);
boolean pal=palindrome(1221),pal1=palindrome(1144);
//int fi=fibo(10);
boolean six=divisix(24),six1=divisix(67);
double hr=hour(3600),hr1=hour(18000);
int digi=digit(1113),digi1=digit(516);
double tw=twice(6);
int hn=hundread(12345);
int sm=sumdigit(57);


System.out.println(ans+" " +ans2);
System.out.println(ans1+ "and" +ans3);
System.out.println(ans4+ "and" +ans5);
System.out.println(ans6+ "and" +ans7);
System.out.println(num+ "and" +num1);
System.out.println(aa+ "and" +aa1);
System.out.println(ad+ "and" +ad1);
//System.out.println(p1);
System.out.println(pal+ "and" +pal1);
System.out.println(six+ "  and  " +six1);
System.out.println(hr+ "  and  " +hr1);
System.out.println(digi+ " and " +digi1);
System.out.println(tw);
System.out.println(hn);
System.out.println(sm);

}

}

