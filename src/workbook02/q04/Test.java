package workbook02.q04;

import java.util.Scanner;

public class Test {

	private static Scanner scanner = new Scanner(System.in);
	private static AccountManager accountManager = new AccountManager();

	public static void main(String[] args) {
		while (true) {
			System.out.println("==========������°���==========");
			System.out.println("1.���µ��"); System.out.println("2.��ü���");
			System.out.println("3.�Ա�"); System.out.println("4.���");
			System.out.println("5.�۱�"); System.out.println("6.���α׷�����");
			System.out.println("================================");
			System.out.print("���� : ");
			int menu = scanner.nextInt();
			scanner.nextLine();
			switch (menu) {
				case 1:
					System.out.print("������ �̸� �Է� : ");
					String name = scanner.nextLine();
					System.out.print("���� ��ȣ �Է� : ");
					String num = scanner.nextLine();
					System.out.print("�ܰ��Է� : ");
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
					System.out.print("�Ա��� ���¹�ȣ �Է� : ");
					String depositAccNum = scanner.nextLine();
					System.out.print("�Աݱݾ� �Է� : ");
					int depositMoney = scanner.nextInt();
					Account depositAcc = accountManager.findAccount(depositAccNum);
					if(depositAcc == null) {
						System.out.println("���¸� ã�� �� �����ϴ�.");
						break;
					}
					accountManager.deposit(depositAcc, depositMoney);
					break;
				case 4:
					System.out.print("����� ���¹�ȣ �Է� : ");
					String withdrawalAccNum = scanner.nextLine();
					System.out.print("��ݱݾ� �Է� : ");
					int withdrawalMoney = scanner.nextInt();
					Account withdrawalAcc = accountManager.findAccount(withdrawalAccNum);
					if(withdrawalAcc == null) {
						System.out.println("���¸� ã�� �� �����ϴ�.");
						break;
					}
					accountManager.withdrawal(withdrawalAcc, withdrawalMoney);
					break;
				case 5:
					System.out.print("�۱��� ���¹�ȣ �Է� : ");
					String fromNum = scanner.nextLine();
					System.out.print("�۱� ���� ���¹�ȣ �Է� : ");
					String toNum = scanner.nextLine();
					System.out.print("�۱ݱݾ� �Է� : ");
					int remittanceMoney = scanner.nextInt();
					Account fromAcc = accountManager.findAccount(fromNum);
					Account toAcc = accountManager.findAccount(toNum);
					if(fromAcc == null || toAcc == null) {
						System.out.println("���¸� ã�� �� �����ϴ�.");
						break;
					}
					accountManager.remittance(fromAcc, toAcc, remittanceMoney);
					break;
				case 6:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
				default:
					System.out.println("�ùٸ� ������ �ϼ���.");
					break;
			}
		}
	}
}
