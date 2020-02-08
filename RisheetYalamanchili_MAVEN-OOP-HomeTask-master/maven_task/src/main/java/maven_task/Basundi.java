package maven_task;

public class Basundi extends Sweet{
	String Sweetname;
	Basundi(int sugar, int sweet, int weight){
		super(sugar,sweet,weight);
	}
	public void setName(String name){
		Sweetname = name;
	}
}