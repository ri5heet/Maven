package maven_task;

public class NewYearGift{
	public static void main(String[] args) {
		MaWaBati mb = new MaWaBati(90,70,5);
		mb.setName("Mawa Bati");
		System.out.println("Sweets Name : "+" "+mb.Sweetname+" Sugar Content :"+mb.getSugarPercent()+"% "+" Sweet Content :"+mb.getsweetContent()+"% "+" Weight :"+mb.getWeight()+"gm");

		

		Basundi basundi = new Basundi(60,40,10);
		basundi.setName("Basundi");
		System.out.println("Sweets Name : "+" "+basundi.Sweetname+" Sugar Content :"+basundi.getSugarPercent()+"% "+" Sweet Content :"+basundi.getsweetContent()+"% "+" Weight :"+basundi.getWeight()+"gm");


		QubaniKaMeetha meetha = new QubaniKaMeetha(90,60,20);
		meetha.setName("Qubani Ka Meetha");
		System.out.println("Sweets Name : "+" "+meetha.Sweetname+" Sugar Content :"+meetha.getSugarPercent()+"% "+" Sweet Content :"+meetha.getsweetContent()+"% "+" Weight :"+meetha.getWeight()+"gm");


		System.out.println(mb.isSweet("Mawa Bati"));
		System.out.println("Basundi : "+basundi.isSweet(40,55));


		DairyMilk silk = new DairyMilk(80,20);
		silk.setName("Silk Redvelvet");
		System.out.println("Chocolate : "+" "+silk.name+" "+"Chocolate Content :"+silk.getcocoaContent()+"% "+" "+"Milk Content: "+silk.getmilkContent()+"%");


		MilkyBar bar = new MilkyBar(40,60);
		bar.setName("Milky Bar");
		System.out.println("Chocolate : "+" "+bar.name+" "+"Chocolate Content :"+bar.getcocoaContent()+"% "+" "+"Milk Content: "+bar.getmilkContent()+"%");

		//Sorting the order of chocolates based on  cocoaContent as there are 2 items in the pre determined gift chocolates
		//finding the Candies in the gift box
		if (silk.getcocoaContent()>bar.getcocoaContent()){
			System.out.println("Candies in the box : "+bar.name);
			System.out.println("Items in the gift Box : "+bar.name+ ", "+silk.name+ ", "+mb.Sweetname+ ", "+basundi.Sweetname+ ", "+meetha.Sweetname);
		}else{
			System.out.println("Candies in the box : "+silk.name);
			System.out.println("Items in the gift Box : "+silk.name + ", "+bar.name+ ", "+mb.Sweetname+ ", "+basundi.Sweetname+ ", "+meetha.Sweetname);
		}

		int chowt = mb.getWeight()+basundi.getWeight()+meetha.getWeight();
		System.out.println("Weight of the Gift is : "+getGiftWeight(chowt,50)+"gm");

	}

	public static int getGiftWeight(int chocolateswght,int sweetswght){
		return chocolateswght+sweetswght;
	}

		
}