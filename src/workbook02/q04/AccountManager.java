package workbook02.q04;

public class AccountManager {
	
	private Account[] accounts = new Account[100];
	private int count = 0;
	
	// ������ã��
	public Account[] findAllAccounts() {
		return this.accounts;
	}
	
	// ���»���
	public int createAccount(Account account) {
		accounts[count++] = account;
		return count;
	}

	// ����ã��
	public Account findAccount(String accountNum){
		for(int i=0; i<count; i++){
			if(accounts[i].getNum().equals(accountNum)) return accounts[i];
		}
		return null;
	}
	
	// �Ա�
	public void deposit(Account account, int money) {
		account.setBalance(account.getBalance() + money);
	}
	
	// ���
	public void withdrawal(Account account, int money) {
		account.setBalance(account.getBalance() - money);
	}
	
	// �۱�
	public void remittance(Account from, Account to, int money) {
		from.setBalance(from.getBalance() - money);
		to.setBalance(to.getBalance()+money);
	}
}
