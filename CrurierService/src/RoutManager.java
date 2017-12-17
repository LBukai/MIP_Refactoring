
public class RoutManager {
	//Vyberanie ciest
	//Priradeni Ciest (zavolanie ciest)
	String meno;
	int plat;
	
	//Routmanager nacita vsetky cesty a prepocita vsetky kombinacie ciest. Vyberie najefektivnejsie a priradi cesty.
	public RoutManager(String m, int p){
		this.meno = m;
		this.plat = p;		
	}
	void addDrviverToRout(Sofer s, Cesta c){
		c.setMenoVodica(s.meno);
	}

}
