package test;

public class Postac {
		public int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getStr() {
			return str;
		}
		public void setStr(int str) {
			this.str = str;
		}
		public int getAgi() {
			return agi;
		}
		public void setAgi(int agi) {
			this.agi = agi;
		}
		public int getVit() {
			return vit;
		}
		public void setVit(int vit) {
			this.vit = vit;
		}
		public int getMag() {
			return mag;
		}
		public void setMag(int mag) {
			this.mag = mag;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String name;
		public int str,agi,vit,mag;
		public String sex;
		
		public void wyswietlStatsy(){
			
			System.out.println("|| Nazwa postaci: " + this.name + " || Statystyki: Si³a [" +this.str+"] Zrêcznoœæ ["+this.agi+"] Mana ["+this.mag+"] ¯ycie ["+this.vit+"] ||");
			System.out.println("||===================================================================================================");
		}
		public Postac(){
			this.agi = 1;
			this.str = 1;
			this.mag = 1;
			this.vit = 1;
		};
		
}
