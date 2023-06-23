package day0623;

/**
 * 주민번호로 길이, 형식, 생년월일, 나이, 성별, 띠 를 구하는 일을 가지고 있는 클래스
 * @author USER
 */
public class Work0622 {
	private String ssn;
	private int year;
	private int genderFlag;
	
	/**
	 * 주민번호를 입력받아 인스턴스 변수에 저장하는 생성자
	 * @param ssn
	 */
	public Work0622(String ssn) {
		this.ssn = ssn;
	}
	
	/**
	 * 인스턴스 변수에 저장된 주민번호를 변경할 때 사용하는 method
	 * @param ssn 주민번호
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	/**
	 * 객체가 가지고 있는 주민번호를 반환하는 일
	 * @return 주민번호
	 */
	public String getSsn() {
		return ssn;
	}
	
	/**
	 * 주민번호의 길이가 14자인지 체크하는 일
	 * @return boolean
	 */
	public boolean chkSsnLength() {
		return ssn.length() == 14;
	}
	
	/**
	 * 주민번호의 '-' 위치를 체크하는 일
	 * @return boolean
	 */
	public boolean chkSsnHyphen() {
		return ssn.indexOf("-") == 6;
	}
	
	/**
	 * 주민번호에서 생년월일을 잘라내서 반환하는 일
	 * @return 생년월일
	 */
	public String birth() {
		String result = ""; // "" => empty
		// '-'의 뒷자리가 1,2 - 내국인 1900년대생, 5,6 - 외국인 1900년대생
		// 3,4 - 내국인 2000년대생, 7,8 - 외국인 2000년대생
		// 0,9 - 년대생 1800년대생
		genderFlag = ssn.charAt(7)-'0';
		
//		int tempYear = 1800;// 95
//		if (genderFlag == 1 || genderFlag == 2 || genderFlag == 5 || genderFlag == 6) {
//			tempYear = 1900;
//		}else if(genderFlag == 3 || genderFlag == 4 || genderFlag == 7 || genderFlag == 8) {
//			tempYear = 2000;
//		}
		int[] temp = {1800,1900,1900,2000,2000,1900,1900,2000,2000,1800};
		
		year = temp[genderFlag] + Integer.parseInt(ssn.substring(0,2));
		result = year + "년 " + ssn.substring(2,4) + "월 " + ssn.substring(4,6) + "일";
		return result;
	}
	
	/**
	 * 주민번호에서 나이를 구하여 반환하는 일
	 * @return 나이
	 */
	public int age() {
		int age = 2023-year;		
		return age;
	}
	
	/**
	 * 주민번호에서 성별을 반환하는 일
	 * @return 성별
	 */
	public String gender() {
		String gender = "";
		
		gender = genderFlag%2 == 0?"여자" : "남자";
		
		return gender;
	}
	
	/**
	 * 주민번호에서 띠를 반환하는 일
	 * @return 띠
	 */
	public String zodiac() {
		//String[] zodiacTitle = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","용"} ;
		
		return "원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양".split(",")[year%12];
	}
}
