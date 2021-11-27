
public class Category {
	private long id;
	private String name, description;
	
	public Category(long i, String n, String d) {
		setId(i);
		setName(n);
		setDescription(d);
	}
	
	public Category() {
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "id: " + getId() + "\nNome: " + getName() + "\nDescrição: " + getDescription();
	}
}