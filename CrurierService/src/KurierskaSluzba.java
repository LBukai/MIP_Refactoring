
public class KurierskaSluzba {

	public static int todayDate = 171102;
	public static void main(String[] args) {
		Zakazka[] z = new Zakazka[100];
		KamionVodic ImiVodic = new KamionVodic("Imi", true, 0);
		KamionVodic MarciVodic = new KamionVodic("Marci", true, 0);
		ExpressVodic LacoVodic = new ExpressVodic("Laco", false, 0);
		for (int i = 0; i < 30; i++) {			
			System.out.println("~~~~~~~~~~~~~~~~~~ " +  todayDate%100 + "." + (todayDate%10000)/100 + ".20" + todayDate/10000 + " ~~~~~~~~~~~~~~~~~~");
			todayDate++;
			if(todayDate % 100 > 30){
				todayDate += 70;
			}
			int dateOfStart = todayDate +i;
			if(dateOfStart % 100 > 30){
				dateOfStart += 70;
			}				
			int dateOfEnd = dateOfStart + (int )(Math.random() * 10 + 1);
			if(dateOfEnd % 100 > 30){
				dateOfEnd += 70;
			}
			if(KurierskaSluzba.todayDate % 100 > 30){
				KurierskaSluzba.todayDate += 70;
			}
			
			z[i] = new Zakazka(i);
			if(ImiVodic.CheckCesta(z[i])){
				System.out.println("K vodicovi Imi bola priradena cesta od " + z[i].dateOfStart + " do " + z[i].dateOfEnd);
				continue;
			}
			else if(MarciVodic.CheckCesta(z[i])){
				System.out.println("K vodicovi" + " Marci bola priradena cesta od " + z[i].dateOfStart + " do " + z[i].dateOfEnd);
				continue;
			}
			else if(LacoVodic.CheckCesta(z[i])){
				System.out.println("K vodicovi Laco bola priradena cesta od " + z[i].dateOfStart + " do " + z[i].dateOfEnd);
				continue;
			}			
			else System.out.println("Ziadnemu vodicovi nevyhovuje cesta od " + z[i].dateOfStart + " do " + z[i].dateOfEnd);
		}
		System.out.println("-------------------------");
		ImiVodic.vypisVodica();
		MarciVodic.vypisVodica();
		LacoVodic.vypisVodica();
	}
}
