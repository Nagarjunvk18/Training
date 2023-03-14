package cg.dayfive.monday;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

class Order {
	int orderId;
	LocalDate date;
	int numberOfItems;
	double amount;

	public Order(int orderId, LocalDate date, int numberOfItems, double amount) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.numberOfItems = numberOfItems;
		this.amount = amount;
	}

	public String showDetailsOfOrder() {
		return "Order [orderId=" + this.orderId + ", date=" + this.date + ", numberOfItems=" + numberOfItems
				+ ", amount=" + this.amount + "]";
	}

	public Month showMonth() {
		return date.getMonth();
	}

	public boolean checkCoupon() {
		if (this.date.getMonthValue()==1 && this.amount > 10000) {
			return true;
		}
		return false;
	}

}

public class OrderDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int orderId, numberOfItems;
		String date;
		double amount;

		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		Order[] orders = new Order[3];
		for (int i = 0; i < orders.length; i++) {
			LocalDate localDate;
			Order order;
			System.out.println("Enter the details for order " + (i + 1));
			System.out.println("------------------------------------");
			System.out.println("Enter the order id");
			orderId = sc.nextInt();
			System.out.println("Enter the order date");
			date = sc.next();
			System.out.println("Enter the number of items");
			numberOfItems = sc.nextInt();
			System.out.println("Enter the order amount");
			amount = sc.nextDouble();
			localDate = LocalDate.parse(date);
			order = new Order(orderId, localDate, numberOfItems, amount);
			orders[i] = order;
		}
		for (Order order1 : orders) {
			if (order1.checkCoupon()) {
				System.out.println(order1.showDetailsOfOrder());
				System.out.println("you will get coupon of Rs.1000 for above order");
			} else {
				System.out.println("you will not receive any coupon");
			}
		}
		sc.close();
	}

}
/*
 * Create a class Order with orderid,date,noofitems,amount use constructor to
 * initialze Create 3 orders and create a methods showDetails() -to the order
 * details, checkCupon() which checks the order placed in month of Jan if it is
 * place in Jan and amount is greater than 10000 then display you
 * "get coupan of Rs.1000" ortherwise display "you do not get coupan"
 */