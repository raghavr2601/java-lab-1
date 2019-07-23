import java.util.Scanner;
class employee
{
Scanner input=new Scanner(System.in);
private float id,da,hra,lic,pf,hours,gross,net,hourlywage,deductions,basic;
private String name,designation,dob,doj;
private int years;
float get_id()
{
	return id;
}
void input()
{
System.out.println("Enter Employee ID                                          :");
id=input.nextFloat();
System.out.println("Enter Employee name                                        :");
name=input.next();
System.out.println("Enter Employee Designation  (Manager/Intern/Others)        :");
designation=input.next();
System.out.println("Enter Employee DOB                                         :");
dob=input.next();
System.out.println("Enter Employee DOJ                                         :");
doj=input.next();
System.out.println("Enter Employee Basic                                       :");
basic=input.nextFloat();
System.out.println("Does Employee Opt for LIC Premium Account? (1. Yes / 2. No):");
lic=input.nextFloat();
if(lic==1)
{
	                   System.out.println("Enter Employee LIC Amount                              :");
						lic=input.nextFloat();
}
else 
{
	lic=0;
}
System.out.println("Enter Employee hours worked                                 :");
hours=input.nextFloat();
System.out.println("Enter hourly wage                                           :");
hourlywage=input.nextFloat();
System.out.println("Enter experience of the employee (years)                    :");
years=input.nextInt();
}
void calc()
{
if(designation.equals("Intern"))
{
	da=2000;
	hra=1000;
	pf=500;
	gross=(hours*hourlywage)+da+hra;
	deductions=lic+pf;
	net=gross-deductions;
}
else if(designation.equals("Manager"))
{
	da=((0.4f)*basic);
	hra=((0.1f)*basic);
	pf=((0.08f)*basic);
	gross=basic+da+hra;
	deductions=lic+pf;
	net=gross-deductions;
}
else
{
	da=(0.3f*basic);
	hra=(0.1f*basic);
	pf=(0.08f*basic);
	gross=basic+da+hra;
	deductions=lic+pf;
	net=gross-deductions;
}
}
void display()
{
System.out.println("**************************************");
System.out.println("           Employer Details           ");
System.out.println("               Payslip                ");
System.out.println("Emp id            : " +id);
System.out.println("Emp name          : " +name);
System.out.println("Designation       : " +designation);
System.out.println("Basic Pay         : " +basic);
System.out.println("DA                : " +da);
System.out.println("HRA               : " +hra);
System.out.println("PF                : " +pf);
System.out.println("LIC               : " +lic);
System.out.println("Gross Pay         : " +gross);
System.out.println("Deductions        : " +deductions);
System.out.println("Net Salary        : " +net);
System.out.println("**************************************");

}
void promote()
{	
	int ch;
	if((years>0)&&(years<5))
	{
		System.out.println("Promotion to 1. Analyst, 2. Software engineer, 3. TeamLead Possible!");
		System.out.println("Choose option to promote candidate, Enter '4' to exit");
		ch=input.nextInt();
		if(ch==1)
		{
			designation="Analyst";
		}
		else if(ch==2)
		{
			designation="Software Engineer";
		}
		else if(ch==3)
		{
			designation="Team Lead";
		}
		if(ch!=4)
		{
			System.out.println("Promotion Succesful!");
			return;
		}
	}
	else if(years>10)
	{
		if(designation.equals("Manager"))
			System.out.println("Already High Posted!");
		else
		{ 
			System.out.println("Promotion to Manager or other posts available");
			System.out.println("1. Analyst, 2. Software engineer, 3. TeamLead, 4. Manager, 5. Exit");
			ch=input.nextInt();
			if(ch==1)
			{
				designation="Analyst";
			}
			else if(ch==2)
			{
			designation="Software Engineer";
			}
			else if(ch==3)
			{
				designation="Team Lead";

			}
			else if(ch==4)
			{
				designation="Manager";
			}
			if(ch!=5)
			{
				System.out.println("Promotion Succesful!");
				return;
			}
		}
	}
}
	 
		
}
class emp
{
static int n,p,k;
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the number of employees: ");
n=input.nextInt();
employee a[]=new employee[n];
for(int i=0;i<n;i++)
{
	a[i]=new employee();
	a[i].input();
	a[i].calc();
	a[i].display();
	a[i].promote();
}
System.out.println("Enter the Employee ID whose Payslip is to be printed: ");
p=input.nextInt();
for(int k=0;k<n;k++)
{
	if(a[k].get_id()==p)
	{
		break;
	}
}
a[k].display();

}
}
