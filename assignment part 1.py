#This program allow users to register students, view their details and modify their personal information
#data is stored in a dictionary-a collection of key values pairs-with the student ID as the key
student_data={}
def studentregistration():#function that helps the user to add a new student through their name, course and ID. it is stored in the dictionary
    print("You selected to register a new student.")
    print()
    lname = input("Please enter the student's last name: ")#here the user enters the student's last name
    if lname.isalpha():
        print("You typed '"+lname+"'.")
        fname=input("Please enter student's first name: ")#here the user enters the student's first name
        if fname.isalpha():
            print("You typed '"+fname+"'.")
            course= input("Please enter the student's course: ")#here the user enters the student's course
            if course.isalpha():
                print("You typed '"+course+"'.")
                idnumber= input("Please enter the student's ID number: ")#here the user enters the student's ID
                if idnumber.isdigit():
                    print("You typed '"+idnumber+"'.")
                    student_data[idnumber]={
                        'Last Name ':lname,
                        'First Name ': fname,
                        'Course ':course
                    }
                    print()
                    print("Student '"+lname+" "+fname+"' with ID number '"+idnumber+"' that studies '"+course+"' was added successfully!")
                else:
                    print()
                    print("Invalid ID number. Please use numbers only.")
                    print()
                    studentregistration()
            else:
                print()
                print("Invalid course name. Please use letters only.")
                print()
                studentregistration()
        else:
            print()
            print("Invalid first name. Please use letters only.")
            print()
            studentregistration()
    else:
        print()
        print("Invalid last name. Please use letters only. Let's try again!")
        print()
        studentregistration()
def view_student_details():#functon that allows the user to view the details of a registered student
    print("You selected to view student details.")
    print()
    idnumber= input ("Please enter the student's ID number: ")
    if idnumber in student_data:#checking if the ID entered exists in the saved data
        print()
        print(f"These are the details for the student with ID number '{idnumber}': ")#displaying the details of the student
        print(f"Student's last name: {student_data[idnumber]['Last Name ']}")
        print(f"Student's first name: {student_data[idnumber]['First Name ']}")
        print(f"Student's course: {student_data[idnumber]['Course ']}")
    else:
        print()
        print("No student found with this ID. Please try again!")
def modify_student_details():#function that allows the user to update a registered student's details
    print("You selected to modify student details.")
    print()
    idnumber= input ("Please enter the student's ID number: ")
    print()
    if idnumber in student_data:
        print(f"These are the current details for the student with ID number: {idnumber}")#displaying the current student details
        print()
        print(f"Last name: {student_data[idnumber]['Last Name ']}")
        print(f"First name: {student_data[idnumber]['First Name ']}")
        print(f"Course: {student_data[idnumber]['Course ']}")
        print()
        print("Please choose what you want to modify: ")#asking the user what they want to change
        print()
        print("1. Last name")
        print("2. First name")
        print("3. Course")
        print()
        choice= input("Enter your choice here: ")#updating details chosen by the user
        if choice=='1':
            print()
            new_last_name= input("Please enter the new last name here: ")
            if new_last_name.isalpha():
                student_data[idnumber]['Last Name ']=new_last_name
                print("Last name updated successfully!")
                print(f"Update for student with ID number '{idnumber}': ")
                print(f"Last name is now {student_data[idnumber]['Last Name ']}")
                program()
            else:
                print("Invalid input. Please use letters only. Thank you!")
                modify_student_details()
        elif choice=='2':
            new_first_name= input("Please enter the new first name here: ")
            if new_first_name.isalpha():
                student_data[idnumber]['First Name ']=new_first_name
                print("First name updated successfully!")
                print(f"Update for student with ID number '{idnumber}': ")
                print(f"First name is now {student_data[idnumber]['First Name ']}")
                program()
            else:
                print("Invalid input. Please use letters only. Thank you!")
                modify_student_details()
        elif choice=='3':
            new_course= input("Please enter the new course here: ")
            if new_course.isalpha():
                student_data[idnumber]['Course ']=new_course
                print("Course updated successfully!")
                print(f"Update for student with ID number '{idnumber}': ")
                print(f"Course is now {student_data[idnumber]['Course ']}")
                program()
            else:
                print("Invalid input. Please use letters only. Thank you!")
                modify_student_details()
        else:
            print("Invalid choice. Let's go back to the main menu.")
            program()
    else:
        print("No student found with this ID number. Please try again!")
        modify_student_details()
print("                                                       ")
print("                                                       ")
print("                 Student registration                  ")
def program():
    print("                                                   ")
    print("                                                   ")
    print("  Please choose one of the following instructions: ")
    print("                                                   ")
    print("                                                   ")
    print("a- Register a new student                  ")
    print("b- View account details for a registered student  ")
    print("c- Modify account details for a registered student")
    print("d- Exit current program                        ")
    print("                                                   ")
    print("                                                   ")
    choice=input("          Choice: ")
    print("                                             ")
    if choice=="a":
        studentregistration()
        program()
    elif choice=='b':
        view_student_details()
        program()
    elif choice=='c':
        modify_student_details()
        program()
    elif choice=="d":
                    print("              ")
                    print("          See you later!")
                    print("                                                 ")
                    print("          Thank you and have a lovely day!       ")
                    print("                                                 ")
                    print("Please press the 'Enter' key to close the program. Thank you!")
                    input()
                    exit()
    else:
        print("Please choose a letter from a-d. Thank you!")
program()# starting the main program loop
input(program())