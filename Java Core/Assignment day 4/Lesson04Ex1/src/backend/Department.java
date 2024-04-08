package backend;

public class Department {
	private int departmentId;
	private String departmentName;
	
	//Constructor khoong có tham số
	public Department() {
		this.departmentId = 0;
		this.departmentName = "";
	}
	
	//Constructor có tham số là nameDepartment
	public Department (String nameDepartment) {
		this.departmentId = 0;
		this.departmentName = nameDepartment;
	}

	public int getId() {
		return departmentId;
	}

	public void setId(int id) {
		this.departmentId = id;
	}

	public String getName() {
		return departmentName;
	}

	public void setName(String name) {
		this.departmentName = name;
	}


}
