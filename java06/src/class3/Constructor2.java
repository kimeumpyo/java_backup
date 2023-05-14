package class3;

public class Constructor2 {
	public static void main(String[] args) {
		Person ps1 = new Person("홍길동", 15);	// 기본생성자를 안만들어놔서 무조건 입력
		Person ps2 = new Person("이순신", 25);
		
		PersonView pv1 = new PersonView();		// 기본생성자를 오버로딩해놔서 입력안해도 가능
		PersonView pv2 = new PersonView(ps2);

		pv2.info1();			// info : 바로 정보출력
		
		pv1.info2(ps1);		// info : 들어온 값을 저장하고 정보출력
		
		
	}
}
class Person{
	// 멤버변수 : 이름, 나이
	private String name;
	private int age;
	
	// 생성자	(생성자 통해서 멤버변수 초기화)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	// 게터세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
class PersonView{
	Person person;
	//	pv.info(ps1); 도 허용하겠다~ (여러 형태의 생성자(개체화)를 허용해주려고
	public PersonView() {}
	// PersonView a = new PersonView();
	
	// 생성자 : 받아온 객체를 멤버변수에 백업
	public PersonView(Person ps) {
		this.person = ps;
	}
	
	// 메서드(멤버변수 출력용)
	public void info1() {
		System.out.println("이름: "+person.getName()+", 나이: "+person.getAge());
	}
	// 메서드 오버로딩 (바뀐 사람으로 저장 후 출력)
	public void info2(Person person) {
		this.person = person;
		System.out.println("이름: "+person.getName()+", 나이: "+person.getAge());
	}
}
