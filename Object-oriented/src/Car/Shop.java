package Car;

public class Shop { 

	private int money = 0; //售車收入 

	public void sellCar(Car car) {  //賣出一部車 
		System.out.println("車型："  + car.getName()   +" 單價："  + car.getPrice()); 
		money  = car.getPrice();  //增加賣出車售價的收入 
	} 
//售車總收入 
public int getMoney() { 
	return money; 
} 
public static void main(String[] args) { 
		Shop aShop = new Shop(); 
		aShop.sellCar(new BMW()); //賣出一輛寶馬 
		aShop.sellCar(new CheryQQ()); //賣出一輛奇瑞QQ 
		System.out.println("總收入："  + aShop.getMoney()); 
	} 
} 

//汽車介面 
interface Car { 
	String getName(); 	//汽車名稱 
	int getPrice();  	//獲得汽車售價 
} 
interface Costomer { 
	String getName(); 	//顧客名稱 
	String getPhone();  	//顧客手機
} 

//寶馬 
class BMW  implements Car,Costomer  { //雙重繼承
	//String Tires;
	public String getPhone() {
		return "09999999" ;
	}
	public String getName() { 
		return "BMW"; 
	} 
	public int getPrice() { 
		return 300000; 
	} 
} 
//奇瑞QQ 
class CheryQQ implements Car { 
	public String getName() { 
		return "CheryQQ"; 
	} 
	public int getPrice() { 
		return 20000; 
	} 
} 
class text {
	
}
