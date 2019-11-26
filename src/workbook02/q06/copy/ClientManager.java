package workbook02.q06.copy;

public class ClientManager {
	Client[] arr = new Client[100];
	int count = 0;
	
	public boolean insertClient(Client c) {
		boolean flag = true;
		for(int i=0; i<count; i++) {
			if(arr[i].getCsn().equals(c.getCsn())) {
				flag = false;
				break;
			}
		}
		
		if(flag) arr[count++] = c;
		return flag;
	}
	
	public void printAll() {
		for(int i=0; i<count; i++) {
			arr[i].print();
		}
	}
}
