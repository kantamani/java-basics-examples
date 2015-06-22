//Write a program to find a year is leap year or not
class LeapYear{
       public static void main(String[]args){
int year=2015,year1=2004;

boolean flag1=(year%400==0)||((year%4==0)&&(year%100 !=0));
boolean flag2=(year1%400==0)||((year1%4==0)&&(year1%100 !=0));
if(flag1){
System.out.println("year"+ year+ "is a leap year");
}
else{
System.out.println("year" + year+ "is not a leap year");
}
if(flag2){
System.out.println("year1  "  + year1+ " is a leap year");
}
else{
System.out.println("year1 "  + year1+ "is not a leap year");
}
}
}
