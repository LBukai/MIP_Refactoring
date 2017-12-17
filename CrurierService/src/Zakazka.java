
public class Zakazka {
	//Cena zakazky
	//[X,Y]= dialka a cas prychodu
	static int dateOfStart;
	static int dateOfEnd;
	boolean typeZakazky;
	int cenaZakazky;
	
	public Zakazka(int day){
		
		dateOfStart = (int )(Math.random() * 10 + 1) + KurierskaSluzba.todayDate;
		if(dateOfStart % 100 > 30){
			dateOfStart += 70;
		}
		dateOfEnd = (int )(Math.random() * 10 + 1) + dateOfStart ;
		if(dateOfEnd % 100 > 30){
			dateOfEnd += 70;
		}
		if (day % 3 == 0){
			typeZakazky = false;
			System.out.println("Cesta pre kamion od: " + dateOfStart%100 + "." + (dateOfStart%10000)/100 + ".20" + dateOfStart/10000 + " do: " + dateOfEnd % 100 + "." + (dateOfEnd%10000)/100 + ".20" + dateOfEnd/10000);
		}
		else{
			typeZakazky = true;
			System.out.println("Expresna cesta od: " + dateOfStart%100 + "." + (dateOfStart%10000)/100 + ".20" + dateOfStart/10000 + " do: " + dateOfEnd%100 + "." + (dateOfEnd%10000)/100 + ".20" + dateOfEnd/10000);
		}
		cenaZakazky = (dateOfEnd - dateOfStart) * 10;
	}
	
		public Zakazka(int day, int cena){			//pretazenie pre zadani s zakazky aj scenou
		
		dateOfStart = (int )(Math.random() * 10 + 1) + KurierskaSluzba.todayDate;
		if(dateOfStart % 100 > 30){
			dateOfStart += 70;
		}
		dateOfEnd = (int )(Math.random() * 10 + 1) + dateOfStart ;
		if(dateOfEnd % 100 > 30){
			dateOfEnd += 70;
		}
		if (day % 3 == 0){
			typeZakazky = false;
			System.out.println("Cesta pre kamion od: " + dateOfStart%100 + "." + (dateOfStart%10000)/100 + ".20" + dateOfStart/10000 + " do: " + dateOfEnd % 100 + "." + (dateOfEnd%10000)/100 + ".20" + dateOfEnd/10000);
		}
		else{
			typeZakazky = true;
			System.out.println("Expresna cesta od: " + dateOfStart%100 + "." + (dateOfStart%10000)/100 + ".20" + dateOfStart/10000 + " do: " + dateOfEnd%100 + "." + (dateOfEnd%10000)/100 + ".20" + dateOfEnd/10000);
		}
	}
}
