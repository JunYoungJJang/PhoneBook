import java.util.Scanner;

class PhoneBookVer04 {
	static final Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	public static PhoneInfo readData() {
		PhoneInfo p = null;
		String name, phone, major, company;
		int year;
		
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반 2. 대학 3. 회사");
		System.out.print("선택>> ");
		int sel = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이름 : "); name = sc.nextLine();
		System.out.print("전화번호 : "); phone = sc.nextLine();
		switch(sel)
		{
		case 1:
			p = new PhoneInfo(name, phone);
			break;
		case 2:
			System.out.print("전공 : "); major = sc.nextLine();
			System.out.print("학년 : "); year = sc.nextInt();
			sc.nextLine();
			p = new PhoneUnivInfo(name, phone, major, year);
			break;
		case 3:
			System.out.print("회사 : "); company = sc.nextLine();
			p = new PhoneCompanyInfo(name, phone, company);
			break;
		}
		
		return p;
	}
	
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager(100);
		
		while(true) {
			showMenu();
			int sel = sc.nextInt();
			String name = sc.nextLine();
			
			switch(sel)
			{
			case 1:
				manager.addData(readData());
				break;
			case 2:
				System.out.println("데이터 검색을 시작합니다");
				System.out.print("이름 : "); name = sc.nextLine();
				manager.searchData(name);
				break;
			case 3:
				System.out.println("데이터 삭제를 시작합니다");
				System.out.print("이름 : "); name = sc.nextLine();
				manager.deleteData(name);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				return;
			}
			
			System.out.println();
		}
	}
}
