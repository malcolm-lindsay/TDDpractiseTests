package manager;

public class Account {
private String fname,lname,accountNum;

public Account(String fname, String lname, String accountNum) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.accountNum = accountNum;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getAccountNum() {
	return accountNum;
}

public void setAccountNum(String accountNum) {
	this.accountNum = accountNum;
}

}
