package maven_task;

public class Sweet implements Sweets{
	int weight,sugarContent,sweetContent;
	Sweet(int sugarContent,int sweetContent, int weight){
		this.sugarContent = sugarContent;
		this.sweetContent = sweetContent;
		this.weight = weight;
	}
	public int getWeight(){
		return weight;
	}
	public int getSugarPercent(){
		return sugarContent;
	}
	public int getsweetContent(){
		return sweetContent;
	}
	public String isSweet(String sweetname){
		if ((sweetname =="Mawa Bati")||(sweetname =="Basundi")||(sweetname =="Qubani Ka Meetha")){
			return ""+sweetname+" : This is Sweet ";
		}else{
			return ""+sweetname+" :It is not a sweet! ";
		}
	}
	public String isSweet(int sugarContent,int sweetContent){
		if ((sugarContent >= 40) && (sweetContent >=40)) {
			return "This is Too Sweet ";
		}else{
			return "It is not a sweet! ";
		}
	}
}