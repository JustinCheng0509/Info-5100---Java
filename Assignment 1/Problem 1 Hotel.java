Problem 1 Hotel Booking
Yusi Cheng
/*
	NEU-SEA Info 5100 
	Assignment 1
	@author Yusi Cheng
*/

Customer (Traveller):
	Data: Name, Address, Phone
	Behaviors: Book, Search, Review, Compare, Cancel

Internet:
	Data: Websites[] sites:[Expedia, Orbitz, Kayak, (Group of websites)]
	Behaviors: searchForWebsites

BookingWebsite:
	Data: URL, Hotel[] hotels, BankAccount, Customer Info
	Behavior: Search, Sort, Display, Compare, BookHotel

Hotels
	Data: Price, RoomSize, Dates, Location, Stars, CustomerReviewRate, Breakfast included, WifiSupport

CreditCard
	Data: Number, Name, Bank, ExpirationDate, SecurityCode
	
Bank
	Behavior: TransactionAuthorization


BookHotelOnline:
	Customer: John,
	Website Websites,
	BookingWebsite Kayak,
	Hotels Sheraton,
	CreditCard Card,
	Bank Visa,
	
	If Internet.isAvailable,
		John.searchForWebsites -> Websites, question: Websites[] search Websites
		if Kayak.isAvailable
			Kayak.searchHotel -> Hotel.Data
			Sheraton = Hotel;
			John.BookHotel -> Sheraton, CreditCard, Customer.Data, Kayak: Booking Confirmation
			Return BookingConfirmation
			if Visa.Authorize = true
				return BookConfirmation
			Else
				John.BookUnsuccessful();
			break;
		Else
			John.SearchDifferentSite();
		break;
	Else 
		Internet.Reconnect;
	break;
	