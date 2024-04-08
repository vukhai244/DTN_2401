package backend;

public abstract class Student extends Person {
	public int id;

    public Student(int id, String name) {
        super(name);
        this.id = id;
    }
}
