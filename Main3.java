class Student{
	private String name;
	private int age;
	private String gender;
	public Student(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void displayStdDet(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
	}
}
class Teacher extends Student{
	private String subjectThaught;
	public Teacher(String name,int age,String gender,String subjectThaught){
		super(name,age,gender);
		this.subjectThaught=subjectThaught;
		
	}
	public void displayTecDet(){
		super.displayStdDet();
		System.out.println("Subject Thaught:"+subjectThaught);
	}
}
public class Main3{
	public static void main(String[] args){
		Student st=new Student("AAKASH",20,"MALE");
		st.displayStdDet();
		Teacher th=new Teacher("JOHN",40,"MALE","JAVA");
		th.displayTecDet();
	}

}	