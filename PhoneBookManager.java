public class PhoneBookManager {
	private PhoneInfo[] arr;
	private int capacity = 30;
	private int cnt = 0;
	
	public PhoneBookManager() { arr = new PhoneInfo[30]; }
	public PhoneBookManager(int cap) {
		if(cap < 10) {
			arr = new PhoneInfo[30];
		} else {
			capacity = cap;
			arr = new PhoneInfo[cap];
		}
	}
	
	public void expand(int num) {
		capacity += num;
		PhoneInfo[] temp = arr;
		arr = new PhoneInfo[capacity];
		System.arraycopy(temp, 0, arr, 0, cnt);
	}
	
	public void addData(PhoneInfo p) {
		if(cnt == capacity) {
			System.out.println("데이터 입력 실패 : 용량 초과!");
			return;
		} else if(p == null) {
			System.out.println("데이터 입력 실패 : null");
			return;
		}
		arr[cnt++] = p;
	}
	
	private int search(String name) {
		for(int i=0; i<cnt; i++) {
			if(arr[i].getName().equals(name)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void searchData(String name) {
		int idx = search(name);
		
		if(idx == -1) {
			System.out.println("존재하지 않는 데이터입니다.");
			return;
		}
		
		System.out.println("데이터 조회: ");
		arr[idx].printInfo();
	}
	
	public void deleteData(String name) {
		int idx = search(name);
		
		if(idx == -1) {
			System.out.println("존재하지 않는 데이터입니다.");
			return;
		}
		
		cnt--;
		for(int i=idx; i<cnt; i++) {
			arr[i] = arr[i+1];
		}
		
		System.out.println("데이터 삭제가 완료되었습니다.");
	}
}
