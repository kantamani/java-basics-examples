/*Execute below statement and print the value of b and i in console
int i=129;
byte b=(byte)i;

float f=(float)10.1;
i=int f;     */



class Test{
public static void main(String[] args){
int i=129;
byte b=(byte)i;
System.out.println(b);
}
}
//output is:-127

class Test1{
	public static void main(String[]args){
	float f=(float)9.0;
	int i=(int)f;
	System.out.println(i);
}
}

//output: 9
//How to represent Binary and Octal number in java
     class Test2{
            public static void main(String[] args){
               int x=0b1011;//binary number
			   System.out.println(x);
			   
			   }
}

class Test3{
            public static void main(String[] args){
               int x=0b1011;
			   int a=0b1011;
			   int b=x+a;//addition of two binary number
			  
			   int y=034,z=053;
			   int c=y+z;//addition of two octal
			   System.out.println(x);
			   System.out.println(c);
			   System.out.println(b);
			   }
}
//Find the unicode
class Unicode{
            public static void main(String[]args){
			 int i=(int)'#';
			 int j=(int)'%';
			 int k=(int)'$';
			 int l=(int)'6';
      System.out.println(i);
	  System.out.println(j);
	  System.out.println(k);
	  System.out.println(l);
}
}


//Find the unicode for all 26 characters in English alphabet
class English{
          public static void main(String[]args){
             //for(int i='a';i<'z';i++)
			 for(int i='A';i<'Z';i++)
			  System.out.println(i);
              //System.out.println(i);
          
}
}
//Assignment String
class Test4{
           public static void main(String[]args){
		   String empID="e1";
		   int eid=Integer.parseInt(empID);
}
}
//Boolen
class Boo{
public static void main(String[] args){
boolean lightsOn=1!=2;
System.out.println(lightsOn);
}
}
//output:tue

