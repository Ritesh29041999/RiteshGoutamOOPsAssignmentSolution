package com.greatlearning.AssessmentOne;
import java.util.*;

class superDepartment{
	String dept_name;
	String get_todays_work;
	String get_work_deadline;
	String is_today_holiday;
	
	public static String dept_name() {
		return "  DEPARTMENT NAME  :  Welcome to Super department.";
	}
	public static String get_todays_work() {
		return "  TODAYS WORK      :  No work as of now.";
	}
	public static String get_work_deadline() {
		return "  WORK DEADLINE    :  Nil.";
	}
	public static String is_today_holiday() {
		return "  HOLIDAY          :  No today is not a holiday.";
	}
}
class adminDepartment extends superDepartment{
	public static String dept_name() {
		
		return "  DEPARTMENT NAME  :  Welcome to Admin Department.";
	}
	public static String get_todays_work() {
		return "  TODAYS WORK      :  Complete your document submission.";
	}
	public static String get_work_deadline() {
		return "  WORK DEADLINE    :  Complete by end of day.";
	}	
}
class hrDepartment extends superDepartment{
	
	public static String dept_name() {
		return "  DEPARTMENT NAME  :  Welcome to Human Resource Department.";
	}
	public static String do_activity() {
		return "  ACTIVITY         :  Team Lunch.";
	}
	public static String get_todays_work() {
		return "  TODAYS WORK      :  Fill today's worksheet and mark your attendance.";
	}
	public static String get_work_deadline() {
		return "  WORK DEADLINE    :  Complete by end of day.";
	}	
}
class techDepartment extends superDepartment {
	
	public static String dept_name() {
		return "  DEPARTMENT NAME  :  Welcome to Technology Department.";
	}
	public static String get_todays_work() {
		return "  TODAYS WORK      :  Complete coding of module 1.";
	}
	public static String get_work_deadline() {
		return "  WORK DEADLINE    :  Complete by end of day.";
	}
	public static String get_tech_stack_information() {
		return "  INFORMATION      :  Core Java.";
	}
}

	
 public class DriverClass {
	public static void main(String[] args) {
    superDepartment obj = new superDepartment();
    System.out.println(obj.dept_name());
    System.out.println(obj.get_todays_work());
    System.out.println(obj.get_work_deadline());
    System.out.println(obj.is_today_holiday());
    System.out.println();
    adminDepartment obj1= new adminDepartment();
    System.out.println(obj1.dept_name());
    System.out.println(obj1.get_todays_work());
    System.out.println(obj1.get_work_deadline());
    System.out.println(obj.is_today_holiday());
    System.out.println();
    hrDepartment obj2= new hrDepartment();
    System.out.println(hrDepartment.dept_name());
    System.out.println(hrDepartment.do_activity());
    System.out.println(obj2.get_todays_work());
    System.out.println(obj2.get_work_deadline());
    System.out.println(obj.is_today_holiday());
    System.out.println();
    techDepartment obj3= new techDepartment();
    System.out.println(obj3.dept_name());
    System.out.println(obj3.get_todays_work());
    System.out.println(obj3.get_work_deadline());
    System.out.println(obj3.get_tech_stack_information());
    System.out.println(obj.is_today_holiday());
    System.out.println();
    
    
	}
}
