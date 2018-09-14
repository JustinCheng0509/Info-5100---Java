Problem 2 Taxi Calling
Yusi Cheng
/*
	NEU-SEA Info 5100 
	Assignment 1
	@author Yusi Cheng
*/

Customer:
	Data: Name, PhoneNumber, Address
	Behavior: CallForTaxi, CancelTaxi, Pay, Review

Internet:
	Data: Uber, Lyft, Taxi
	Behavior: InternetConnection
	
Application:
	Data: AvailableDriver
	Behavior: DriverLocation, CustomerLocation, SearchTaxi, Navigation
	
Driver:
	Data: Name, PhoneNumber, LicensePlate
	Behavior: ConfirmPickup, ConfirmDropoff
	
CreditCard:
	Data: Number, Name, Company, Expiration, SecurityCode
	
CreditCardCompany:
	Behavior: Authorization
	
Internet Internet;
Customer John;
Driver Jane;
Application Lyft;
	
	while Internet.isAvailable()
		John.CallForTaxi
		Lyft.PickupLocation -> Lyft.CustomerLocation
		John.SelectDestidation: Order successful
		
		if Jane.ConfirmPickup:
			while Jane.ConfirmDropoff is False
				Lyft.Navigation();
		end;
		
		if Jane.ConfirmDropoff(){
			John.Pay();
			John.Review();
		end;
		
	if Internet.isAvailable() = False
	Loop
		Internet.reconnection;
	end