package javaPrograms;

import java.util.Scanner;

public class Assign {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter student id :");
		int student_id = sc.nextInt();
		System.out.print("enter student name:");
		String student_name =sc.next();
		System.out.print("enter marks(0-100):");
		int student_marks =sc.nextInt();
		System.out.print("fee paid?(true/false):");
		String fees=sc.next().toLowerCase();
		boolean feespaid=fees.equals("true")||fees.equals("false");
//	    boolean b=sc.nextBoolean();
	   
	    
	    String result;
	    if(student_marks >=40)
	    	result="Student passed";
	    
	    else
	        result ="Student failed";
	    
	    System.out.println(result);

	char grade;	
   if(student_marks >= 85)
	  grade='A';
   else if(student_marks>=70 && student_marks<84)
	   grade='B';
   else if(student_marks >=50 && student_marks<69)
	   grade='C';
   else
       grade='D';
   System.out.println(grade+"grade");
   
   boolean pass=student_marks>=40;
    String certificate_Status;
   if(pass && feespaid )
	   certificate_Status="eligible for certificate";
   else
	   certificate_Status="not eligible for certificate";
   System.out.println(certificate_Status);
   String course;
   switch(grade) {
   case 'A':
	   course="Data Science";
	   break;
   case 'B':
	   course="Java full stack";
	   break;
   case 'C':
	   course="Web Development";
	   break;
   case 'D':
	   course="Basic Programming";
	   break;
	default:
		course="Counselling";
		
   }
//   System.out.println("course="+course);
   System.out.println("Student id="+student_id);
   System.out.println("Student name="+student_name);
   System.out.println("student marks="+student_marks);
   System.out.println("Student result="+result);
   System.out.println("student grade="+grade);
   System.out.println("fee paid="+(feespaid ? "Yes":"No"));
   System.out.println("Certificate:"+certificate_Status);
   System.out.println("Course="+course);
   
   }
   

}
