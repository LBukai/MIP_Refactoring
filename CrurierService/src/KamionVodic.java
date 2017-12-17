
public class KamionVodic extends  Sofer{
	KamionVodic(String name, boolean t, int date){
		this.meno = name;
		this.type = t;
		this.casDostup = KurierskaSluzba.todayDate;
		this.zarobok = 0;
		this.odpracDni = 0;

	}
	

}
