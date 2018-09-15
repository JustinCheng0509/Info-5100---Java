Problem 3 Job Search Platform 
Yusi Cheng
/*
	NEU-SEA Info 5100 
	Assignment 1
	@author Yusi Cheng
*/

CompanyRecruit
	Data: CompanyName, RecruiterName, RecruiterEmail
	Behavior: AddPosition, DeletePosition, EditPosition, PostPosition
	
Platform
	Data: JobInformation(Collection of jobs)
	Behavior: SearchJob, CustomLogin, CompanyLogin, Filter
	
Custom:
	Data: Name, PhoneNumber, Resume, Email
	Behavior: PostResume, Apply
	
Internet Internet;
Platform Indeed;
CompanyRecruit company;
Custom Custom;

if Internet.isAvailable
	if (Indeed.companyLogin = true){
		Indeed.searchCompany -> company.displayinfo
		if company.JobAvailable(){
			
			company.PostPosition();
		else
			company.AddPosition();
		else
		return NoJobAvailable();
		}
	}
	if （Indeed.CustomLogin = true){
		while custom.completeProfile = false {
			custom.AskcompleteProfile();
			custom.PostResume();
			break;
		}
		Indeed.Filter -> jobs, salary, desired field;(Job collections)
		custom.searchJobTitle();
		if custom.HasDesiredJob{
			custom.Apply();
		}
		else searchJobTitle();
		("No Job Title Available");
		else{
			custom.completeProfile();
		}
	}
else {
	Internet.reconnect();
}