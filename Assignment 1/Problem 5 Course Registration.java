Problem 5 Course Registration
Yusi Cheng
/*
	NEU-SEA Info 5100 
	Assignment 1
	@author Yusi Cheng
*/

Internet
	Data:
	Behavior: isconnect
	
CourseList
	Data: Courses, 
	Behavior: ShowCourseList, check;
	
Course:
	Data: CourseName, CourseNumber, Instructor, Hour, Credit
	Behavior: isAvailable
	
Student
	Data: Name, StudentID
	Behavior: WebAdd, WebDrop, Login
	
	
	
Internet internet;
CourseList NEU;
Course Info5100;
Student john;

while internet.isConnected(){
	if john.Login() = true
		NEU.ShowCourseList();
		john.search(Info5100);
		if Info5100 = NEU(course){
			if Info5100.isAvailable(){
				john.WebAdd()
			}
			else return Info5100 + "Not Available")
		}
		else return Info5100 + "does not exist";
	}
	else{ 
		student.Login();
	}
}
		