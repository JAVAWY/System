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
		  
	   System.out.println("������ѧ�ţ�");
	   ID = sc.nextLine();
	   
	   System.out.println("��ˣ�");
	   this.name = sc.nextLine();
	   
	   System.out.println("���ڰ༶��");
	   this.classnum=sc.nextLine();
	   
	   System.out.println("��ϵ�绰��");
	   this.telephone=sc.nextLine();
	   
	   System.out.println("���ڵأ�");
	   this.locate=sc.nextLine();
	   
	   System.out.println("14������û�нӴ���������Ա��");
	   this.touch=sc.nextLine();
	   
	   System.out.println("������û�з��ȵ�֢״��");
	   this.health=sc.nextLine();
	   
//	   System.out.println("��ȷ�ﲡ����");
//	   this.health=sc.nextLine();
	 }
	  
	 public int find(String[][] a)
	 {
		 System.out.println("������Ҫ��ѯ��ѧ��ѧ�ţ�");
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
	  System.out.println("������Ҫɾ����ѧ��ѧ�ţ�");
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
	  System.out.println("������Ҫ�޸���Ϣ��ѧ��ѧ�ţ�");
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
	  System.out.println("ѡ����Ҫ�޸ĵ����ݣ�0.ѧ�� 1.���� 2.�༶ 3.�绰 4.���ڵ� 5.����״�� ");
	  int n=sc.nextInt();
	  return n;
	 }
	 public void display()
	 {
	  System.out.println("****  �����ϱ�ϵͳ   *****");
	  System.out.println("****  1�������Ϣ   ****");
	  System.out.println("****  2����ѯ��Ϣ   ****");
	  System.out.println("****  3���޸���Ϣ   ****");
	  System.out.println("****  4��ɾ����Ϣ   ****");
	  System.out.println("****  5���˳�     ****");
	  System.out.println("**** ��������Ҫ���еĲ�����1-5�� ***");
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
	      System.out.println("����ѧ��Ϊ��"+student[m][0]);
	      System.out.println("��������Ϊ��"+student[m][1]);
	      System.out.println("�����༶Ϊ��"+student[m][2]);
	      System.out.println("��ѧ�绰Ϊ��"+student[m][3]);
	      System.out.println("����Ŀǰ���ڵ��ǣ�"+student[m][4]);
	      System.out.println("����14����"+student[m][5]+"�Ӵ���������Ա");
	      System.out.println("����Ŀǰ"+student[m][6]+"���ȵ�״��");
//	      System.out.println("����"+student[m][7]+"ȷ�ﲡ��");


	     }else{
	      System.out.println("ѧ�Ŵ���,δ�ҵ�ѧ��");
	      break;
	     }
	     break;
	    }
	    case 3:
	    {
	     m=studentMs.recivice(student);
	     n=studentMs.Num();
	     System.out.println("��������Ҫ�޸ĵ����ݣ�");
	     student[m][n]=sc.next();
	     System.out.println("�޸ĳɹ���");
	     break;
	    }
	    case 4:
	    {
	     m=studentMs.delay(student);
	     for(int i=0;i<4;i++)
	     {
	      student[m][i]=null;
	     }
	     System.out.println("�Ѿ��ɹ�ɾ��ѧ����Ϣ");
	     break;
	    }
	    case 6:
	    {
	     System.out.println("�����˳���");
	     flat=false;
	     break;
	    }
	   }
	  }
	 }

	}