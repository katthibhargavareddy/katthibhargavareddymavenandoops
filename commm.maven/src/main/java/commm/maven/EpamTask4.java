package commm.maven;

import java.util.Scanner;
class Sweet
{
void chocolates(String a[],int b[])
{
int l=a.length,sum=0;
System.out.println("\nOutputoftheProgram:\n");
System.out.println("TheChocolatesPresentare:");
for(int i=0;i<l;i++)
{
System.out.println("\t\t\t "+a[i]);
}
for(int i=0;i<l;i++)
{
sum=sum+b[i];
}
System.out.println("\nTheTotalWeightoftheChocolatesis:"+sum);
System.out.println("\nAfterSortingTheChocolatesare:");
for(int i=0;i<l;i++)
{
for(int j=0;j<l-1;j++)
{
if((a[j].compareTo(a[j+1]))>0)
{
String temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(int i=0;i<l;i++)
{
System.out.println("\t\t\t\t"+a[i]);
}
}
}
public class EpamTask4
{
public static void main(String arg[])
{
Sweet obj=new Sweet();
Scanner s=new Scanner(System.in);
System.out.println("Enterthenumberofchocolates:");
int n=4;
String a[]= {"chocolate","kitkat","cadbury","snickers"};
int w[]= {1,2,3,4};

obj.chocolates(a,w);
}
}