package ClassesWithAttributes;

public class Product {
	
	//Constructor
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok calisti");
		
		this._id = id;
		this._renk = renk;
		this._name = name;
		this._price = price;
		this._description = description;
		this._stockAmount = stockAmount;
	}
	
	public Product()
	{
		
	}
	
	
	//Private sadece tanımlandıgı alanda gecerlidir.
	//Attribute | Field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	
	//Sadece Okunabilir kılar.
	//getter
	public int getId() {
		return _id;
	}
	
	// Parametre olarak verilmelidir!
	//setter
	public void setId(int id) {
		_id=id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String _renk) {
		this._renk = _renk;
	}

	public String get_kod() {
		return this._name.substring(0,1)+_id;
	}

	

	
	
}
