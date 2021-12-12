
public class Entry {
	private long id, categoryId;
	private String name, description, type, amount, date;
	private boolean paid;
	
	public Entry(long id, String name, String description, String type, String amount, String date,  boolean paid, long categoryId) {
		setId(id);
		setCategoryId(categoryId);
		setName(name);
		setDescription(description);
		setType(type);
		setAmount(amount);
		setDate(date);
		setPaid(paid);
	}
	
	public Entry() {
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	
	@Override
	public String toString() {
		return "id: " + getId() + "\nNome: " + getName() + "\nDescri��o: " + getDescription() + 
				"\nTipo: " + getType() + "\nQuantia: " + getAmount() + "\nData: " + getDate() + 
				"\nPago: " + isPaid() + "\nId da Categoria: " + getCategoryId();
	}
}
