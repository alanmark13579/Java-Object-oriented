package Car;

public class Shop { 

	private int money = 0; //�⨮���J 

	public void sellCar(Car car) {  //��X�@���� 
		System.out.println("�����G"  + car.getName()   +" ����G"  + car.getPrice()); 
		money  = car.getPrice();  //�W�[��X����������J 
	} 
//�⨮�`���J 
public int getMoney() { 
	return money; 
} 
public static void main(String[] args) { 
		Shop aShop = new Shop(); 
		aShop.sellCar(new BMW()); //��X�@���_�� 
		aShop.sellCar(new CheryQQ()); //��X�@���_��QQ 
		System.out.println("�`���J�G"  + aShop.getMoney()); 
	} 
} 

//�T������ 
interface Car { 
	String getName(); 	//�T���W�� 
	int getPrice();  	//��o�T����� 
} 
interface Costomer { 
	String getName(); 	//�U�ȦW�� 
	String getPhone();  	//�U�Ȥ��
} 

//�_�� 
class BMW  implements Car,Costomer  { //�����~��
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
//�_��QQ 
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
