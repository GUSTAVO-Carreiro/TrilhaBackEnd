
public class Execucao {
	public static void main(String[] args) {
		Category c1 = new Category(4, "Salário", "Recebimento de Salário");
		Category c2 = new Category();
		c2.setId(1);
		c2.setName("Alimentação");
		c2.setDescription("Gastos com Alimentação");
		System.out.println(c1.toString());
		System.out.println();
		System.out.println(c2.toString());
		Entry e1 = new Entry(3, "Salário na Empresa X", "Adiantamento quinzenal", "revenue", 
				"4405,49", "15/09/2021", true, 4);
		Entry e2 = new Entry();
		e2.setId(2);
		e2.setName("Compra em sorveteria");
		e2.setDescription("Casquinha de baunilha");
		e2.setType("spending");
		e2.setAmount("5,30");
		e2.setDate("21/10/2021");
		e2.setPaid(false);
		e2.setCategoryId(1);
		System.out.println();
		System.out.println(e1.toString());
		System.out.println();
		System.out.println(e2.toString());
	}
}
