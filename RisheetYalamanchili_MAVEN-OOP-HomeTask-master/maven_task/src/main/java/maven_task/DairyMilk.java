package maven_task;

public class DairyMilk extends Chocolate{
	String name;
	DairyMilk(int cocoaContent,int milkContent){
		super(cocoaContent,milkContent);
	}
	public void setName(String chocname){
		name = chocname;
	}
}