package maven_task;

public class Chocolate implements Chocolates{
	int cocoaContent,milkContent;
	Chocolate(int cocoa,int milk){
		this.cocoaContent = cocoa;
		this.milkContent = milk;
	}
	public int getcocoaContent(){
		return cocoaContent;
	}
	public int getmilkContent(){
		return milkContent;
	}
	public Boolean isDarkChocolate(int cocoaContent){
		if (cocoaContent >=80){
			return true;
		}else{
			return false;
		}
	}
	public Boolean isDarkChocolate(int cocoaContent,int milkContent){
		if ((cocoaContent >=80)&&(milkContent >60)){
			return false;
		}else{
			return true;
		}
	}
}
