
public class Cesta {
	
	private int cena;
	int dlzka;
	boolean typ;
	int[] Xkoordinaty;
	int[] Ykoordinat;
	private String menoVodica;
	
	public void setMenoVodica(String m){
		this.menoVodica = m;
	}
	public Cesta(Zakazka[] z)
	{
		for(int i = 0; i < z.length; i++){
			this.cena += z[i].cenaZakazky;
		}
		this.typ = true;
	}
	
	public Cesta(Cesta def, Zakazka z){
		this.cena = def.cena;
		this.typ = z.typeZakazky;
	}
	
	public int getCena(int c){
		return c;
	}
	

}
