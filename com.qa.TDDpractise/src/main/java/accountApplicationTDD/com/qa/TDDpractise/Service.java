package accountApplicationTDD.com.qa.TDDpractise;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private Map<Integer, Account> account = new HashMap<Integer, Account>();  

	private static int id = 1;

	
	public void addAccount(Account accountToAdd) {
		account.put(id, accountToAdd);
		id++;
	}
	
	public Account searchAccount(Account idToSearch) {
		Account result = account.get("idToSearch");
		return result;
	}
	
	public void deleteAccount(Integer idToDelete) {
		account.remove(idToDelete);
	}
	
	
	public Map<Integer, Account> cgetAccount() {
		return account;
	}
	
	public void setAccountMap(Map<Integer, Account> account) {
		this.account = account;
	}
	
	
//	public Account findAccountByName(String name){
//	for (int i=0; i<account.size(); i++) {
//		if (account.Account.getFname == name)
//		
//	}
//	return account;
//	}
	
	
}


