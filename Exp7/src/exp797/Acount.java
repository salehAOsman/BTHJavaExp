package exp797;
import java.util.Date;
public class Acount {
	private int id;
	private double balance;// for the acount
	private double annualInterestRate;// store rate
	private Date dateCreated;// store date for new acount

	public Acount() {
	}

	public Acount(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0.045;// 4.5 %
		this.dateCreated = getNowDate();
	}

	Date getNowDate() {
		Date now = new Date();
		return now;
	}

	public double getMonthlyInterestRate() {
		return getAnnualInterestRate() / 12;
	}

	public double getMonthlyInterest() {
		return getBalance() * getMonthlyInterestRate();
	}
	
	public boolean withDraw(int amount) {
		if (amount < 0) {
			return false;
		}
		setBalance(getBalance() - amount);
		return true;
	}
	public boolean deposit(int amount) {
		if (amount < 0) {
			return false;
		}
		setBalance(getBalance() + amount);
		return true;
	}

	@Override
	public String toString() {
		return "Acount [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
				+ ", dateCreated=" + dateCreated + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

}