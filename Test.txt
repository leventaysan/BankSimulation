package BankSimulation;

import java.util.*;

public class Test {
    private static Scanner i;
    public static void showMenu()
            {
		System.out.println("");
	        System.out.println("0. Quit");
		System.out.println("1. Add Customer");
		System.out.println("2. Remove Customer");
		System.out.println("3. List All Customers");
                System.out.println("4. List All Customers by Customer ID");
                System.out.println("5. List All Customers by Customer Name");
                System.out.println("6. List All Customers by Customer Surname");
                System.out.println("7. List All Customers by Customer Gender");
                System.out.println("8. Update Information of Customers");
                System.out.println("9. Add money to Bank");
                System.out.println("10. Draw money from Bank");
                System.out.println("");
		System.out.println("Please enter your choice :");
            }
    
    
    public static void main(String[] args) {
        ArrayList<Customer> myArray = new ArrayList<Customer>();
	Scanner scan = new Scanner(System.in);
	while(true){
            showMenu();
            int choice;
            i = new Scanner(System.in);
            choice = i.nextInt();
            switch(choice){
                
                case 0 :
                    System.out.println("Do you want to exit ? (Y/N)");
                    String ex = scan.nextLine();
                    if (ex.equals("Y") || ex.equals("y"))
                        {
                            i.close();
                            scan.close();
                            System.exit(0);
			}
                    break;    
			    
		case 1 :
                    
                    System.out.println("Please enter the Id :");
                    String a = scan.nextLine();
                    System.out.println("Please enter the Name :");
                    String b = scan.nextLine();
                    System.out.println("Please enter the Surname :");
                    String c = scan.nextLine();
                    System.out.println("Please enter the Gender :");
                    String d = scan.nextLine();
                    System.out.println("Please enter the Credit :");
                    String e = scan.nextLine();
                    Double doubleE = Double.valueOf(e);
                    Customer y = new Customer(a,b,c,d,doubleE);
                    myArray.add(y);
                    System.out.println("Customer added successfully.");
                    break;
                    
			    
		case 2 :
                    System.out.println("Please enter Id :");
                    String searchID = scan.nextLine();
                    for( Iterator<Customer> it = myArray.iterator() ; it.hasNext();)
                    {
                        Customer z = (Customer) it.next();
                        if((z.getId().equals(searchID)))
			{
                            if(z instanceof Customer)
				{
                                    it.remove();
                                    System.out.println("Customer removed successfully.");
                                    break;
				}
			}
                    }
                    break;
		case 3 :
                    System.out.println("");
                    System.out.println("**List of Customers**");	
                    for(Customer q : myArray) 
                    {
                        if (q instanceof Customer) 
                        {
		           System.out.println(q);
			}
		    }
                    break;
                    
                case 4 :
                    System.out.println("");
                    System.out.println("**List of Customers by Customer ID**");	
                    for(Customer q : myArray) 
                    {
                        if (q instanceof Customer) 
                        {
                            System.out.println(q.getId());
                        }
		    }
                    break;
                            
                case 5 :
                    System.out.println("");
                    System.out.println("**List of Customers by Customer Name**");	
                    for(Customer q : myArray) 
                    {
                        if (q instanceof Customer) 
                        {
		            System.out.println(q.getName());
			}
		    }
                    break;
                            
                case 6 :  
                    System.out.println("");
                    System.out.println("**List of Customers by Customer Surname**");	
                    for(Customer q : myArray) 
                    {
                        if (q instanceof Customer) {
		        System.out.println(q.getSurname());
			}
		    }
                    break;
                            
                case 7 :  
                    System.out.println("");
                    System.out.println("**List of Customers by Customer Gender**");	
                    for(Customer q : myArray) 
                    {
			if (q instanceof Customer) 
                        {
                            System.out.println(q.getGender());
			}
		    }
                break;
                 
                case 8 :
                    System.out.println("Please enter Id :");
                    String searchID1 = scan.nextLine();
                    System.out.println("Please enter new name :");
                    String newname = scan.nextLine();
                    System.out.println("Please enter new surname :");
                    String newsurname = scan.nextLine();
                    System.out.println("Please enter new gender :");
                    String newgender = scan.nextLine();
                    for( Iterator<Customer> yy = myArray.iterator() ; yy.hasNext();)
			{
                            Customer customer1 = (Customer) yy.next();
                            if((customer1.getId().equals(searchID1)))
                                {
                                    if(customer1 instanceof Customer)
					{
                                            customer1.setName(newname);
                                            customer1.setSurname(newsurname);
                                            customer1.setGender(newgender);
                                            System.out.println("Update was successful !");
					}
				}
			}
                    break;
                                
                case 9 :
                    System.out.println("Please enter Id :");
                    String searchID2 = scan.nextLine();
                    System.out.println("How much money to deposit to bank ?");
                    double addmoney = scan.nextInt();
                    for( Iterator<Customer> x = myArray.iterator() ; x.hasNext();)
			{
                            Customer customer2 = (Customer) x.next();
                            if((customer2.getId().equals(searchID2)))
				{
                                    if(customer2 instanceof Customer)
					{
                                            double para= addmoney + customer2.getBalance();
                                            customer2.setBalance(para);
                                            System.out.println("Deposit was successful !");
                                            System.out.println("New balance: " + para);
                                            break;
					}
				}
			}
                    break;
                                
                case 10 :
                    System.out.println("Please enter Id :");
                    String searchID3 = scan.nextLine();
                    System.out.println("How much money draw from bank ?");
                    double drawmoney = scan.nextInt();
                    for( Iterator<Customer> q = myArray.iterator() ; q.hasNext();)
			{
                            Customer customer3 = (Customer) q.next();
				if((customer3.getId().equals(searchID3)))
                                    {
					if(customer3 instanceof Customer)
                                            {
                                                if(customer3.getBalance()<=0 || drawmoney > customer3.getBalance()) 
                                                    {
                                                        System.out.println("You can't draw money from bank !");
                                                        break;
                                                    }
                                                double para= customer3.getBalance() - drawmoney;
                                                customer3.setBalance(para);
                                                System.out.println("Drawing money was successful !");
                                                System.out.println("New balance: " + para);
                                                break;
                                            }
                                    }
                                       
                            }
				
                    break;
            }
            if (choice != 0) continue;
            }
    }
    }

