//Using for loop

class UsingFor{
public static void main(String[]args){
int count;
for(count=1000;count<=1020;count++){
if(count%2==0)
System.out.println(count +"is even number");
}
}
}

//for Odd number
class Odd{
public static void main(String[]args){
int count;
for(count=500;count<=600;count++){
if(count%2!=0)
System.out.println(count +"is odd number");
}
}
}


//For finding prime number
class Prime{
public static void main(String[]args){
int num=12,n;
for(n=2;n<num;n++){

if(num%n!=0){
System.out.println(num+ "is prime number");
break;
}
else
System.out.println(num+ "is not a prime");
}
}
}

//WTP to check if the number is divisible by 6 
class Six{
public static void main(String[] args){
int num1=70;
if(num1%6==0)
System.out.println(num1+ "is divisible by 6");
else
System.out.println(num1+ "is not divisible by 6");
}
}

//WTP to print prime number between 100 to 200
class Prime1{
public static void main(String[]args){
int a=200;
System.out.println("Prime numbers between 100 and " +200);
for(int i=100;i<200;i++){
boolean flag=true;
for (int j=2;j<i;j++){
if(i%j==0){
flag=false;
break;
}
}
if(flag)
System.out.println(i +"");
}
}
}
//WTP to print number between 100 to 200
class Six1{
public static void main(String[] args){
int count;
for(count=100;count<=200;count++){
if(count%6==0)
System.out.println(count + "is divisible by 6");
else
System.out.println(count + "is not divisible by 6");
}
}
}


//WTP to find given number is Fibonacci series or not

