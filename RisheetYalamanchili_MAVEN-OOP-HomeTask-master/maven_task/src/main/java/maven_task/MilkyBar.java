package maven_task;

public class MilkyBar extends Chocolate{
	String name;
	MilkyBar(int cocoaContent,int milkContent){
		super(cocoaContent,milkContent);
	}
	public void setName(String chocname){
		name = chocname;
	}
}