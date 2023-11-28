/*******************************************************************************************************************************************
 * File	            :	Banking_Exception.java
 * Description      :   Create a mini-application for a banking system in Java. In this program, we will add some 
 * 						basic functionalities of a bank account like a deposit of amount, withdrawal of amount, etc.
 * 						Initially, the program accepts the number of customers (Array of Objects)we need to add
 * 						and adds the customer and account details accordingly. Further, it displays the series of 
 * 						menus to operate over the accounts.
 * 							1. Display all account details
 * 							2. Search by account number
 * 							3. Deposit the amount
 * 							4. Withdraw the amount
 * 							5. Exit 
 * 						Create Custom Exception and perform the following action:
 * 							- Customers are not allowed to deposit amount <= 0 ( In this case throw
 * 							  InvalidAmountException).
 * 							- Customers are not allowed to withdraw amount <= 0 (throw InvalidAmountException).
 * 							- Customers are also not allowed to withdraw an amount greater than (>) the available
 * 							  amount (throw InsufficientFundsException)
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   19/10/23
********************************************************************************************************************************************/

import java.util.Scanner;

class InvalidAmountException extends Exception {
    InvalidAmountException(String str) {
        super(str);
    }
}

class InvalidAccountException extends Exception {
    InvalidAccountException(String str) {
        super(str);
    }
}

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String str) {
        super(str);
    }
}

class Customer {
	int accountNumber;
    String accountType;
    String customerName;
    int accountBalance;
    Scanner sc = new Scanner(System.in);
    
    public void setCustomerDetails() {
        System.out.print("Enter the Account Number: ");
        accountNumber = sc.nextInt();
        System.out.print("Enter the account type: ");
        accountType = sc.next();
        System.out.print("Enter the Customer Name: ");
        customerName = sc.next();
        System.out.print("Enter the Account Opening Balance: ");
        accountBalance = sc.nextInt();
    }
    
    public void getCustomerDetails() {
        System.out.println("_______________________________");
        System.out.println("The Customer Details are:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("_______________________________");
    }
}

public class Banking_Exception {
	public static void main(String[] args) {
		
		InvalidAmountException amountException = new InvalidAmountException("Invalid Amount");
        InsufficientFundsException fundsException = new InsufficientFundsException("Insufficient Funds");
        InvalidAccountException accountException = new InvalidAccountException("Invalid Account Exception");
        
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("Enter the No of Customers");
        int noOfCustomers = sc.nextInt();
        Customer[] customer = new Customer[noOfCustomers];
        
        for (int i=0; i < noOfCustomers; i++) {
        	customer[i] = new Customer();
            customer[i].setCustomerDetails();
        }
        
        do {
        	System.out.println("1. Display Account Details");
            System.out.println("2. Search by account number");
            System.out.println("3. Deposit the amount");
            System.out.println("4. Withdraw the amount");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            
            switch (choice) {
            	case 1:
            		for (int i=0;i<noOfCustomers;i++) {
            			customer[i].getCustomerDetails();
            		}
            		break;
            	case 2:
            		System.out.println("Enter the account number");
                    int searchAccount = sc.nextInt();
                    for (int i = 0; i < noOfCustomers; i++) {
                    	if (customer[i].accountNumber == searchAccount) {
                    		customer[i].getCustomerDetails();
                        }
                    }
                    break;
            	case 3:
            		System.out.println("Enter the account number");
                    searchAccount = sc.nextInt();
                    try {
                    System.out.println("Enter the amount to deposit");
                    int depositAmount = sc.nextInt();
                    if (depositAmount < 0) {
                       throw amountException;
                    } else {
                    	for (int i = 0; i < noOfCustomers; i++) {
                    		if (customer[i].accountNumber == searchAccount) {
                    			customer[i].accountBalance = customer[i].accountBalance + depositAmount;
                    			customer[i].getCustomerDetails();
                    		}
                    	}
                    }
                    } catch (InvalidAmountException e) {
                    	System.out.println(e);
                    }
                    break;
            	case 4:
            		try {
            			System.out.println("Enter the account number");
            			searchAccount = sc.nextInt();
            			for (int i = 0; i < noOfCustomers; i++) {
                			if (customer[i].accountNumber != searchAccount) {
                					throw accountException;
                				}
                    
                    	System.out.println("Enter the amount to withdraw");
                    	int withdrawAmount = sc.nextInt();
                    	if (withdrawAmount <= 0) {
                    		throw amountException;
                    	} else {
                    		for (int i = 0; i < noOfCustomers; i++) {
                    			if (customer[i].accountNumber == searchAccount) {
                    				if (withdrawAmount > customer[i].accountBalance) {
                    					throw fundsException;
                    				} else {
                    					customer[i].accountBalance = customer[i].accountBalance - withdrawAmount;
                    					customer[i].getCustomerDetails();
                    				}
                    			}
                    		}
                    	}
                    } catch (InvalidAmountException e) {
                	   	System.out.println(e);
                    } catch (InsufficientFundsException e) {
                	   	System.out.println(e);
                    } catch (InvalidAccountException e) {
                    	System.out.println(e);
                    }
                    	break;
            	case 5:
            		System.out.println("Exiting Program.");
            		break;
            	default :
            		System.out.println("Invalid choice.");
            }
        } while (choice < 5);
	}

}
