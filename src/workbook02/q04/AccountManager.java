package workbook02.q04;

public class AccountManager {
	
	private Account[] accounts = new Account[100];
	private int count = 0;
	
	// 모든계좌찾기
	public Account[] findAllAccounts() {
		return this.accounts;
	}
	
	// 계좌생성
	public int createAccount(Account account) {
		accounts[count++] = account;
		return count;
	}

	// 계좌찾기
	public Account findAccount(String accountNum){
		for(int i=0; i<count; i++){
			if(accounts[i].getNum().equals(accountNum)) return accounts[i];
		}
		return null;
	}
	
	// 입금
	public void deposit(Account account, int money) {
		account.setBalance(account.getBalance() + money);
	}
	
	// 출금
	public void withdrawal(Account account, int money) {
		account.setBalance(account.getBalance() - money);
	}
	
	// 송금
	public void remittance(Account from, Account to, int money) {
		from.setBalance(from.getBalance() - money);
		to.setBalance(to.getBalance()+money);
	}
}
