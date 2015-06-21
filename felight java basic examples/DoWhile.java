class DoWhile{
public static void main(String[]args){
int count=0;
do{
System.out.println("I will do my assignments 100 times" +(count+1));
count++;
}
while(count<100);

}
}

//WTP to find Fibonacci series

class Fibonacci{
public static void main(String[]args){
System.out.println("Print the Fibonacci series");
int fib1=1;
int fib2=0;
int i=1;
System.out.println(fib1);
System.out.println(fib2);
do
{
i=fib1+fib2;
System.out.println(i);
fib1=fib2;
fib2=i;
}while(fib2<10);
}
}