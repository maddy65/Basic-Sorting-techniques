package HashSet;

public class Price {
	
	private String item;
	private int price;
	
	public Price(String i, int p){
		this.item = i;
		this.price = p;
	}
	
	public int hashCode(){
		int hashCode = 0;
		hashCode = price * 20;
		hashCode += item.hashCode();
		return hashCode;
	}
	
	public boolean equals(Object obj){
		System.out.println("In equals");
		if(obj instanceof Price){
			Price pp = (Price)obj;
			return(pp.item.equals(this.item)&&pp.price==this.price);
		}else{
			return false;
		}
	}
	public String getItem(){
		return item;
	}
	public void setItem(String item){
		this.item = item;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int Price){
		this.price = price;
	}
	public String toString(){
		return "item: "+item+"Price: "+price;
	}
}
