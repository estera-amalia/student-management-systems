//This Java program simulates a student record system
//It allows the user to add new students
				//to retrieve info about students using ID
				//to show details about all students
				//to change student details
package assignmentpart3;
import java.util.Scanner;
import java.util.ArrayList;
class PersonalInfo { //holds all student personal info
	public int id;	//field for info
    public String last_name;
    public String first_name;
    public int day;
    public int month;
    public int studyyear;
    public int phone;
    public String email;
    public String course;
    public int year;
    public int grade;
    public String address;
    public PersonalInfo(int id, String last_name, String first_name, int day, int month, int year,int phone, String email, String course, int studyyear, int grade, String address) {
    	//constructor<-method to use objects
    	this.id = id;
    	this.last_name = last_name;
    	this.first_name = first_name;
    	this.day = day;
        this.month = month;
        this.year = year;
        this.phone=phone;
        this.email=email;
        this.course=course;
        this.studyyear=studyyear;
        this.grade=grade;
        this.address = address;
    }
    public int getId() {//Getter method to retrieve student info
        return id;
    }
    public String getLastName() {
        return last_name;
    }    
    public String getFirstName() {
        return first_name;
    }   
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public int getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getCourse() {
        return course;
    }    
    public int getStudyyear() {
        return studyyear;
    }
    public int getGrade() {
        return grade;
    }    
    public String getAddress() {
        return address;
    }
}

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  //syntax to receive input from user
    int choice;
    ArrayList<PersonalInfo> students = new ArrayList<>();//to put in student records
    do {
    System.out.println();//menu for the user to choose a function
    System.out.println("                                     Student record system");
    System.out.println();
    System.out.println();
	System.out.println("           Please choose one of the options bellow to proceed:");
	System.out.println();
	System.out.println();
	System.out.println("        1. Add new student");
	System.out.println();
	System.out.println("        2. Retrieve student information-> ID number required!");
	System.out.println();
	System.out.println("        3. Amend student details");
	System.out.println();
	System.out.println("        4. All students details");
	System.out.println();
	System.out.println("        5. Exit");
	System.out.println();
	System.out.println();
	System.out.println("        Thank you!");
	System.out.println();
	System.out.println();
	System.out.println("           Please type your prefered choice here: ");
	choice = scan.nextInt();
	if(choice == 1) {//adding a new student
	    System.out.println("You want to add a new student.");
	    System.out.println("Please enter student's ID: ");//starting to input student details
        int id = scan.nextInt();
        scan.nextLine();
	    System.out.print("Please enter student's last name: ");
	    String last_name=scan.nextLine();
	    System.out.print("Please enter student's first name: ");
	    String first_name=scan.nextLine();
	    System.out.print("Please enter student's date of birth (DD): ");
	    int day = scan.nextInt();
	    System.out.print("Please enter student's birth month (MM): ");
	    int month = scan.nextInt();
	    System.out.print("Please enter student's birth year (YYYY): ");
	    int year = scan.nextInt();
	    System.out.print("Please enter student's phone number: ");
	    int phone = scan.nextInt();
	    scan.nextLine();//we use this because it would skip the next string input
	    System.out.print("Please enter student's email: ");
	    String email = scan.nextLine();
	    System.out.print("Please enter student's course: ");
	    String course = scan.nextLine();
	    System.out.print("Please enter student's year of study: ");
	    int studyyear = scan.nextInt();
	    System.out.print("Please enter student's grade: ");
	    int grade = scan.nextInt();
	    scan.nextLine();
	    System.out.print("Please enter student's address: ");
	    String address = scan.nextLine();
	    PersonalInfo personalInfo = new PersonalInfo (id, last_name, first_name, day, month, year, phone,email,course,studyyear, grade, address);
	   
	    System.out.println("Student's ID is: " + personalInfo.getId());
	    System.out.println("Student's last name is: " + personalInfo.getLastName());
	    System.out.println("Student's first name is: " + personalInfo.getFirstName());
	    System.out.println("Student's day of birth is: " + personalInfo.getDay());
	    System.out.println("Student's month of birth is: " + personalInfo.getMonth());
	    System.out.println("Student's year of birth is: " + personalInfo.getYear());
	    System.out.println("Student's phone number is: " + personalInfo.getPhone());
	    System.out.println("Student's email is: " + personalInfo.getEmail());
	    System.out.println("Student's course is: " + personalInfo.getCourse());
	    System.out.println("Student's year of study is: " + personalInfo.getStudyyear());
	    System.out.println("Student's grade is: " + personalInfo.getGrade());
	    System.out.println("Student's address is: " + personalInfo.getAddress());
	    students.add(personalInfo);
        System.out.println("Student added successfully!");
		} 
	else 
		if(choice == 2) {//use student ID to see student info
	    System.out.println("You want to retrieve student information.");
	    System.out.print("Please enter student ID: ");
        int id = scan.nextInt();
        boolean found = false;
        for (PersonalInfo student : students) {//checking student IDs to match with what the user is searching for
            if (student.getId() == id) {
                System.out.println("Student's last name is: " + student.getLastName());
                System.out.println("Student's first name is: " + student.getFirstName());
                System.out.println("Student's day of birth is: " + student.getDay());
        	    System.out.println("Student's month of birth is: " + student.getMonth());
        	    System.out.println("Student's year of birth is: " + student.getYear());
        	    System.out.println("Student's phone number is: " + student.getPhone());
        	    System.out.println("Student's email is: " + student.getEmail());
        	    System.out.println("Student's course is: " + student.getCourse());
        	    System.out.println("Student's year of study is: " + student.getStudyyear());
                System.out.println("Student's grade is: " + student.getGrade());
                System.out.println("Student's address is: " + student.getAddress());
                found = true;
                break;
            	}
        	if (!found) {//error handling for when the user types an ID that is not here
            System.out.println("Student with ID " + id + " not found.");
        		}
        	}
		}
     else 
    	 if(choice == 3) {// change student details
	    System.out.println("You want to amend student details.");
	    System.out.print("Please enter student ID to amend: ");//we use the ID to find the student that we want to change the details for
	    int id = scan.nextInt();
	    boolean found = false;
	    for (PersonalInfo student : students) {
	        if (student.getId() == id) {
	            found = true;
	            System.out.println("Current student's details: ");//small menu for the user to pick what they want to change
	            System.out.println();
	            System.out.println("1. Name: " + student.getFirstName() + " " + student.getLastName());
	            System.out.println("2. Day of birth: " + student.getDay());
	            System.out.println("3. Month of birth: " + student.getMonth());
	            System.out.println("4. Year of birth: " + student.getYear());
	            System.out.println("5. Phone number: " + student.getPhone());
	            System.out.println("6. Email: " + student.getEmail());
	            System.out.println("7. Course: " + student.getCourse());
	            System.out.println("8. Grade: " + student.getGrade());
	            System.out.println("9. Address: " + student.getAddress());
	            System.out.println();
	            System.out.print("Enter what you want to change: ");
	            int change = scan.nextInt();
	            scan.nextLine();
	            switch (change) {//switch function to change whatever the user wants on the menu
                case 1:
                    System.out.print("Enter new last name: ");
                    String new_last_name = scan.next();
                    student.last_name = new_last_name;
                    System.out.print("Enter new first name: ");
                    String new_first_name = scan.next();
                    
                    student.first_name = new_first_name;
                    break;
                case 2:
                    System.out.print("Enter new day of birth: ");
                    int newDay = scan.nextInt();
                    student.day = newDay;
                    break;

                case 3:
                    System.out.print("Enter new month of birth: ");
                    int newMonth = scan.nextInt();
                    student.month = newMonth;
                    break;

                case 4:
                    System.out.print("Enter new year of birth: ");
                    int newYear = scan.nextInt();
                    student.year = newYear;
                    break;

                case 5:
                    System.out.print("Enter new phone number: ");
                    int newPhone = scan.nextInt();
                    student.phone = newPhone;
                    break;

                case 6:
                    System.out.print("Enter new email: ");
                    String newEmail = scan.next();
                    student.email = newEmail;
                    break;

                case 7:
                    System.out.print("Enter new course: ");
                    String newCourse = scan.next();
                    student.course = newCourse;
                    break;

                case 8:
                    System.out.print("Enter new grade: ");
                    int newGrade = scan.nextInt();
                    student.grade = newGrade;
                    break;

                case 9:
                    System.out.print("Enter new address: ");
                    String newAddress = scan.next();
                    student.address = newAddress;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println("Student details updated successfully.");
            break;
        }
    }

    if (!found) {// error handling for when the user types the wrong ID
        System.out.println("Student with ID " + id + " not found.");
    }
}
    else
    		 if(choice == 4) {//4 is to show all student details
	    System.out.println("You want to see all students' details.");
	    if(students.isEmpty()) {
	        System.out.println("No students in the system.");
	    } else {
	        for (PersonalInfo student : students) { //to display each student's info
	        	System.out.println("Student's ID is: " + student.getId());
	        	System.out.println("Student's lastname is: " + student.getLastName());
	        	System.out.println("Student's first name is: " + student.getFirstName());
	        	System.out.println("Student's day of birth is: " + student.getDay());
	    	    System.out.println("Student's month of birth is: " + student.getMonth());
	    	    System.out.println("Student's year of birth is: " + student.getYear());
	    	    System.out.println("Student's phone number is: " + student.getPhone());
	    	    System.out.println("Student's email is: " + student.getEmail());
	        	System.out.println("Student's course is: " + student.getCourse());
	        	System.out.println("Student's year of study is: " + student.getStudyyear());
	        	System.out.println("Student's grade is: " + student.getGrade());
	            System.out.println("Student's address is: " + student.getAddress());
	           
	            System.out.println();
	        }
	    }
    		 } 
    else 
    	if(choice == 5) {// 5 is for end the program
	    System.out.println("Exiting program. Thank you and goodbye!");
    		} 
    else {
	    System.out.println("Please type a valid choice between 1-5.");//error handling for when the user doesn't type the right characters
    }
    } while (choice != 5);// so the loop doesn't end
scan.close();// close scanner
    }
}