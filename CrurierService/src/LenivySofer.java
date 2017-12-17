
public class LenivySofer extends Sofer{ 		
	
	LenivySofer(String name, boolean t, int date){
		
		this.meno = name;
		this.type = t;
		this.casDostup = KurierskaSluzba.todayDate;
		this.zarobok = 0;
		this.odpracDni = 0;
	}
		
	public boolean CheckCesta(Zakazka za) {										//overriding class sofer. Sofer potrebuje +1den volna po ceste lebo je leniviy
		if(this.casDostup + 1 >= za.dateOfStart || this.type != za.typeZakazky)
		{
			return false;
		}
		this.casDostup = za.dateOfEnd;
		this.zarobok += za.cenaZakazky;
		this.odpracDni += (za.dateOfEnd - za.dateOfStart);
				
		return true;
	}
}
