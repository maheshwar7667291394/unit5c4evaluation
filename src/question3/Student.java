package question3;

public class Student {
	private int roll;
	private String name;
	private String standard;
	private String dateofbitrth;
	private int fee;
	
	public Student() {}

	public Student(int roll, String name, String standard, String dateofbitrth, int fee) {
		super();
		this.roll = roll;
		this.name = name;
		this.standard = standard;
		this.dateofbitrth = dateofbitrth;
		this.fee = fee;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getDateofbitrth() {
		return dateofbitrth;
	}

	public void setDateofbitrth(String dateofbitrth) {
		this.dateofbitrth = dateofbitrth;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", standard=" + standard + ", dateofbitrth=" + dateofbitrth
				+ ", fee=" + fee + "]";
	}
	

}
