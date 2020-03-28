package yiqing;

import java.util.HashSet;
import java.util.Scanner;

public class New {
	 private String ID;
	 private String name;
	 private String classnum;
	 private String telephone;
	 private String locate;
	 private String touch;
	 private String health;
	 private String definite;

	 
	 Scanner sc = new Scanner(System.in);
	 
	  public void add(){ 
		  
	   System.out.println("请输入学号：");
	   ID = sc.nextLine();
	   
	   System.out.println("填报人：");
	   this.name = sc.nextLine();
	   
	   System.out.println("所在班级：");
	   this.classnum=sc.nextLine();
	   
	   System.out.println("联系电话：");
	   this.telephone=sc.nextLine();
	   
	   System.out.println("所在地：");
	   this.locate=sc.nextLine();
	   
	   System.out.println("14日内有没有接触过疫区人员：");
	   this.touch=sc.nextLine();
	   
	   System.out.println("近期有没有发热等症状：");
	   this.health=sc.nextLine();
	   
//	   System.out.println("是确诊病例吗？");
//	   this.health=sc.nextLine();
	 }
	  
	 public int find(String[][] a)
	 {
		 System.out.println("请输入要查询的学生学号：");
		 int n=-1;
		 int id = sc.nextInt();
		 for(int i=0;i<a.length;i++)
		 {
			 if(Integer.parseInt(a[i][0]) == id)
			 {
				 n=i;
				 break;
			 }
		 }
		 return n;
	 }
	 public int delay(String[][] a)
	 {
	  System.out.println("请输入要删除的学生学号！");
	  int id;
	  int n=-1;
	  id= sc.nextInt();
	  for(int i=0;i<a.length;i++)
	  {
	   if(Integer.parseInt(a[i][0])==id)
	   {
	    n=i;
	    break;
	   }
	  }
	  return n;
	 }
	 
	 public int recivice(String[][] a)
	 {
	  System.out.println("请输入要修改信息的学生学号：");
	  int id;
	  int n=-1;
	  id = sc.nextInt();
	  for(int i=0;i<a.length;i++)
	  {
	   if(Integer.parseInt(a[i][0]) == id)
	   {
	    n=i;
	    break;
	   }
	  }
	  return n;
	 }
	 public int Num(){
	  System.out.println("选择你要修改的内容：0.学号 1.姓名 2.班级 3.电话 4.所在地 5.健康状况 ");
	  int n=sc.nextInt();
	  return n;
	 }
	 public void display()
	 {
	  System.out.println("****  疫情上报系统   *****");
	  System.out.println("****  1：添加信息   ****");
	  System.out.println("****  2：查询信息   ****");
	  System.out.println("****  3：修改信息   ****");
	  System.out.println("****  4：删除信息   ****");
	  System.out.println("****  5：退出     ****");
	  System.out.println("**** 请输入您要进行的操作（1-5） ***");
	 }
	 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  New studentMs = new New();
	  boolean flat = true;
	  HashSet a = new HashSet();
	  String[][] student=new String[10][10];
	  int num=0;
	  int number;
	  int m,n;
	  while (flat)
	  {
	   studentMs.display();
	   number=sc.nextInt();
	   switch (number)
	   {
	    case 1:
	    {
	     studentMs.add();
	     student[num][0]=studentMs.ID+"";
	     student[num][1]=studentMs.name+"";
	     student[num][2]=studentMs.classnum+"";
	     student[num][3]=studentMs.telephone+"";
	     student[num][4]=studentMs.locate+"";
	     student[num][5]=studentMs.touch+"";
	     student[num][6]=studentMs.health+"";
//	     student[num][7]=studentMs.definite+"";

	     num++;

	     break;
	    }
	    case 2:
	    {
	     m=studentMs.find(student);
	     if(m>=0){
	      System.out.println("该生学号为："+student[m][0]);
	      System.out.println("该生姓名为："+student[m][1]);
	      System.out.println("该生班级为："+student[m][2]);
	      System.out.println("该学电话为："+student[m][3]);
	      System.out.println("该生目前所在地是："+student[m][4]);
	      System.out.println("该生14日内"+student[m][5]+"接触过疫区人员");
	      System.out.println("该生目前"+student[m][6]+"发热等状况");
//	      System.out.println("该生"+student[m][7]+"确诊病例");


	     }else{
	      System.out.println("学号错误,未找到学生");
	      break;
	     }
	     break;
	    }
	    case 3:
	    {
	     m=studentMs.recivice(student);
	     n=studentMs.Num();
	     System.out.println("请输入你要修改的内容：");
	     student[m][n]=sc.next();
	     System.out.println("修改成功！");
	     break;
	    }
	    case 4:
	    {
	     m=studentMs.delay(student);
	     for(int i=0;i<4;i++)
	     {
	      student[m][i]=null;
	     }
	     System.out.println("已经成功删除学生信息");
	     break;
	    }
	    case 6:
	    {
	     System.out.println("程序退出！");
	     flat=false;
	     break;
	    }
	   }
	  }
	 }

	}