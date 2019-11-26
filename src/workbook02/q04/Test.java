package workbook02.q04;

import java.util.Scanner;

public class Test {

	private static Scanner scanner = new Scanner(System.in);
	private static AccountManager accountManager = new AccountManager();

	public static void main(String[] args) {
		while (true) {
			System.out.println("==========은행계좌관리==========");
			System.out.println("1.계좌등록"); System.out.println("2.전체출력");
			System.out.println("3.입금"); System.out.println("4.출금");
			System.out.println("5.송금"); System.out.println("6.프로그램종료");
			System.out.println("================================");
			System.out.print("선택 : ");
			int menu = scanner.nextInt();
			scanner.nextLine();
			switch (menu) {
				case 1:
					System.out.print("계좌주 이름 입력 : ");
					String name = scanner.nextLine();
					System.out.print("계좌 번호 입력 : ");
					String num = scanner.nextLine();
					System.out.print("잔고입력 : ");
					int balance = scanner.nextInt();
					Account account = new Account(name, num, balance);
					accountManager.createAccount(account);
					break;
				case 2:
					Account[] accounts = accountManager.findAllAccounts();
					int i=0;
					while(accounts[i] != null) {
						System.out.println(accounts[i].toString());
						i++;
					}
					break;
				case 3:
					System.out.print("입금할 계좌번호 입력 : ");
					String depositAccNum = scanner.nextLine();
					System.out.print("입금금액 입력 : ");
					int depositMoney = scanner.nextInt();
					Account depositAcc = accountManager.findAccount(depositAccNum);
					if(depositAcc == null) {
						System.out.println("계좌를 찾을 수 없습니다.");
						break;
					}
					accountManager.deposit(depositAcc, depositMoney);
					break;
				case 4:
					System.out.print("출금할 계좌번호 입력 : ");
					String withdrawalAccNum = scanner.nextLine();
					System.out.print("출금금액 입력 : ");
					int withdrawalMoney = scanner.nextInt();
					Account withdrawalAcc = accountManager.findAccount(withdrawalAccNum);
					if(withdrawalAcc == null) {
						System.out.println("계좌를 찾을 수 없습니다.");
						break;
					}
					accountManager.withdrawal(withdrawalAcc, withdrawalMoney);
					break;
				case 5:
					System.out.print("송금할 계좌번호 입력 : ");
					String fromNum = scanner.nextLine();
					System.out.print("송금 받을 계좌번호 입력 : ");
					String toNum = scanner.nextLine();
					System.out.print("송금금액 입력 : ");
					int remittanceMoney = scanner.nextInt();
					Account fromAcc = accountManager.findAccount(fromNum);
					Account toAcc = accountManager.findAccount(toNum);
					if(fromAcc == null || toAcc == null) {
						System.out.println("계좌를 찾을 수 없습니다.");
						break;
					}
					accountManager.remittance(fromAcc, toAcc, remittanceMoney);
					break;
				case 6:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				default:
					System.out.println("올바른 선택을 하세요.");
					break;
			}
		}
	}
}
