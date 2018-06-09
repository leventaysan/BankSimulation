package BankSimulation;

public class Customer {
	String id,name,surname,gender;
	double balance;
	
	public Customer(String id, String name, String surname, String gender, double balance){
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.gender=gender;
		this.balance=balance;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	
	public void setSurname(String newSurname){
		surname = newSurname;
	}
	public String getSurname(){
		return surname;
	}
	public void setId(String newId){
		id = newId;
	}
	public void setGender(String newGender){
		gender = newGender;
	}
	public String getGender(){
		return gender;
	}
	public String getId(){
		return id;
	}
	public void setBalance(Double newbalance){
		balance =newbalance;
	}
	public Double getBalance(){
		return balance;
	}
	
	public String toString(){
	    String credit = String.valueOf(balance);
	    return id + " " + name + " " + surname + " " + gender + " " + credit;
	}	

	

}
