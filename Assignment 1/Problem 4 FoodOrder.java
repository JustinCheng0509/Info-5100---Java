Problem 4 FoodOrder in Restaurant
Yusi Cheng
/*
	NEU-SEA Info 5100 
	Assignment 1
	@author Yusi Cheng
*/

Restaurant 
	Data: Hours, Location
	Behavior: isFull, isOpen
Menu
	Data: Appitizer, Pasta, Beef, Poultry, Seafood,: Collection of food typr
	Behaviors

Customer
	Data: TableNumber, NumberOfCustomer
	Behavior: Pay, Add, Order, Cancel,
	
Waiter
	Data: Name, StaffID
	Behaviour: TakeOrder, ServeDrinks, Serve Food, ClosingCheck

Chef
	Data: Name, StaffID
	Behaviour: CookOrder, CheckOrder
	

Food
	Data: Name, Type, Price
	
	
Customer customer
Menu menu
Waiter waiter
Chef chef

if Restaurant.isOpen = true{
	while Restaurant.isFull() = false{
		customer.enter -> restaurant
		customer.reviewMenu();
		customer.Order(lambstew);
		while Order.isAvailable(){
			waiter.TakeOrder();
			waiter.ServeDrinks(Water);
			chef.cookOrder(lambstew);
			waiter.serve(lambstew);
		}
		else {
			customer.Order();
		}
		customer.pay();
	}
	else {
		return Restaurant.isFull()
		customer.wait();
	}
}
else {
	customer.changeRestaurant();
}