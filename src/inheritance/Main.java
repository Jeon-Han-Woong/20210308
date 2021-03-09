package inheritance;

public class Main {

	public static void main(String[] args) {
		Student stu1 = new Student("김민수", "학생", 23, "010-1111-2222");
		stu1.grade = 1;
		stu1.major = "컴퓨터공학";
		stu1.getInfo();
		stu1.setGrade(4);
		
		System.out.println();
		stu1.getInfo(stu1.name);
		
		System.out.println();
		
		SalaryMan sal1 = new SalaryMan("박정민", "회사원", 30, "010-8888-1123");
		sal1.salary = 3000;
		sal1.getInfo();
		
	}

}
