package backend;

import java.util.Date;

public class Account extends Position {
	private int accountId;
	private String email;
	private String userName;
	private String firstName;
	private String lastName;
	private String fullName;
	private Date createDate;
	
	
	public Account() {
		this.accountId = 0;
		this.email = "";
		this.userName = "";
		this.firstName = "";
		this.lastName = "";
		this.fullName = this.fullName = this.firstName + " " + this.lastName;;
	};
	
	public Account (int id, String email, String userName, String firstName, String lastName) {
		this.accountId = id;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = this.firstName + " " + this.lastName;
	};
	
	public Account(int id, String email, String userName, String firstName, String lastName, Position position) {
		super(position.getPositionName());
		this.accountId = id;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = this.firstName + " " + this.lastName;
		this.createDate = new Date();
	};
	
	public Account(int id, String email, String userName, String firstName, Position position, Date createDate) {
		super(position.getPositionName());
		this.accountId = id;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = this.firstName + " " + this.lastName;
		this.createDate = createDate;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	};
	
	

}
