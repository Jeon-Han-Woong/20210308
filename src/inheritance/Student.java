package inheritance;

public class Student extends Person {
	
	public int grade;
	public String major;
	
	public Student (String name, String job, int age, String pnum) {
		this.age = age;
		this.name = name;
		this.job = job;
		this.pnum = pnum;
	}
	
	@Override
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("나이 : " + age);
		System.out.println("폰번호 : " + pnum);
		System.out.println("학년 : " + grade);
		System.out.println("전공 : " + major);
	}
	
	public void getInfo(String name) {
		System.out.println(this.name + "의 상세 정보");
		System.out.println("직업 : " + job);
		System.out.println("나이 : " + age);
		System.out.println("폰번호 : " + pnum);
		System.out.println("학년 : " + grade);
		System.out.println("전공 : " + major);
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
