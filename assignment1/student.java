package stu;
import java.util.*;
class Student
{
Scanner input=new Scanner(System.in);
int regno,total;
String name,dept,grade;
float avg;
int mark[]=new int[3];
Student()
{
  regno=0;
}
Student(String name,int regno,String dept,int mark[])
{
  this.name=name;
  this.regno=regno;
  this.dept=dept;
  this.mark[0]=mark[0];
  this.mark[1]=mark[1];
  this.mark[2]=mark[2];
}
void calculate()
{
  total=mark[0]+mark[1]+mark[2];
  avg=total/3;
  if(avg>90)
  { grade="O";
   
  }
  else if((avg>80)&&(avg<=90))
  {
    grade="A+";
   
  }
  else if((avg>70)&&(avg<=80))
  {
    grade="A";
   
  }
  else if((avg>60)&&(avg<=70))
  {
    grade="B+";
   
  }
  else if((avg>=50)&&(avg<=60))
  {
    grade="B";
   
  }
  else
  {
    grade="RA";
   
  }
}
void display()
{
  System.out.println("***************************");
  System.out.println("     Student Details    ");
  System.out.println("Name          : "+name);
  System.out.println("Regno         : "+regno);
  System.out.println("Department    : "+dept);
  System.out.println("Grade         : "+grade);
  System.out.println("***************************");
}

void search(int regno, Student s[],int n)
{
  int flag=0;
  for(int i=0;i<n;i++)
  {
    if(s[i].regno==regno)
    {
      flag=1;
      s[i].display();
      break;
    }
  }
  if(flag==0)
    System.out.println("Record not found");        
}
   
void search(String sdept,Student s[],int n)
{
  int i,flag=0;
  for(i=0;i<n;i++)
  {
    if(((s[i].dept).equals(sdept)))
    {
      flag=1;
      s[i].display();
    }
  }
  if(flag==0)
    System.out.println("Record not found");
  }

void marksheet(int regno, Student s[],int n)
{
  int flag=0;
  for(int i=0;i<n;i++)
  {
    if(s[i].regno==regno)
    {
      flag=1;
      System.out.println("**************************************");
      System.out.println("              Marksheet               ");
      System.out.println("Name       : "+s[i].name);
      System.out.println("Regno      : "+s[i].regno);
      System.out.println("Department : "+s[i].dept);
      System.out.println("Subject 1  : "+s[i].mark[0]);
      System.out.println("Subject 2  : "+s[i].mark[1]);
      System.out.println("Subject 3  : "+s[i].mark[2]);
      System.out.println("**************************************");
      System.out.println("Total      : "+s[i].total);
      System.out.println("Grade      : "+s[i].grade);
      System.out.println("**************************************");
      System.out.println();
      break;
    }
  }
  if(flag==0)
    System.out.println("Record not found");
   
}

}

class Stu
{
static int n,id,choice,flag;
static String dept;
public static void main(String args[])
{
  int regno,total;
  String name,dept,grade;
  float avg;
  int mark[]=new int[3];
   Scanner input=new Scanner(System.in);
  Student st=new Student();
 
  Student rec[]=new Student[50];
 
  while(choice!=6)
  {
    System.out.println("\n\tMenu ");
    System.out.println("1. Enter Student Records");
    System.out.println("2. Display Student Records ");
    System.out.println("3. Generate Marksheet ");
    System.out.println("4. Search Student using ID ");
    System.out.println("5. Search Students using Dept");
    System.out.println("6. Exit ");
    System.out.print("Enter Choice : ");
    choice=input.nextInt();
   
    if(choice==1)
    {
        System.out.print("Enter the number of students : ");
        n=input.nextInt();
        for(int i=0;i<n;i++)
        {
        System.out.println("Enter Details : ");
        System.out.print("Student Name : ");
        name=input.next();
        System.out.print("Student Regno : ");
        regno=input.nextInt();
        System.out.print("Student Department : ");
        dept=input.next();
        System.out.print("Subject 1 : ");
        mark[0]=input.nextInt();
        System.out.print("Subject 2 : ");
        mark[1]=input.nextInt();
        System.out.print("Subject 3 : ");
        mark[2]=input.nextInt();
        rec[i]=new Student(name,regno,dept,mark);
        rec[i].calculate();
        System.out.println();
        }
    }
    if(choice==2)
    {
        for(int i=0;i<n;i++)
        {
            rec[i].display();
        }
    }
    if(choice==3)
    {
        System.out.print("Enter Student ID to generate Marksheet: ");
        id=input.nextInt();
        st.marksheet(id,rec,n);
    }
    else if(choice==4)
    {
      System.out.print("Enter Student ID to search: ");
      id=input.nextInt();
      st.search(id, rec, n);  
    }
    else if(choice==5)
    {
      System.out.print("Enter Student Dept to search : ");
      input.nextLine();
      dept=input.nextLine();
      st.search(dept,rec,n);
    }
  }
}
}
