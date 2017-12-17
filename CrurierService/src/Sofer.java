public class Sofer {
	
	String meno;
	boolean type;
	int casDostup;
	boolean dostupnost;
	int zarobok;
	int odpracDni;
	
	public void vypisVodica() {
		System.out.println("Meno: " + this.meno);
		if(this.type){
			System.out.println("ExpressVodic");
		}
		else{
			System.out.println("KamionVodic");
		}
		if(this.casDostup <= KurierskaSluzba.todayDate)
			System.out.println("VOLNY");
		else
			System.out.println("Vodic bude volny od " + ".20" + this.casDostup%100 + "." + (this.casDostup%10000)/100 + this.casDostup/10000);
		System.out.println("Plat za mesiac: "+ zarobok);
		System.out.println("Odpracovane hodiny za mesiac: "+ odpracDni);
		
			System.out.println("-------------------------");		
	}

	
	public boolean CheckCesta(Zakazka za) {
		if(this.casDostup > za.dateOfStart || this.type != za.typeZakazky)
		{
			return false;
		}
		this.casDostup = za.dateOfEnd;
		this.zarobok += za.cenaZakazky;
		this.odpracDni += (za.dateOfEnd - za.dateOfStart);
				
		return true;
	}
}
