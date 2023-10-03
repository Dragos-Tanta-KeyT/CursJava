package curs8;

public interface Angajat {

	public static final String salariu = "100";
	
	public void setName(String name);
	public String getName();
	
	
	public void setEmail(String email);
	public String getEmail();
	
	default void departament() {
		System.out.println("QA");
	};
	
}
