public class Encapsulation {

	private String name;
	private int id;
	private String college;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

	public String toString() {
		return "Encapsulation [id=" + id + ", name=" + name + ", college=" + college +" ]";  }
	
	public static void main(String[] args) {
		
           Encapsulation e = new Encapsulation();
           e.setName("Siddiq");
           e.setId(1);
           e.setCollege("IIT");
           
           System.out.println(e);
	}

}
