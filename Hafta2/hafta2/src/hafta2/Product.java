package hafta2;

public class Product {
	
	public Product() {
		System.out.println("Yap�c� blok �al��t�.");
	}
	// attribute | field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

	// getter
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int id) {
		this._id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String getRenk() {
		return _renk;
	}

	public void setRenk(String renk) {
		this._renk = renk;
	}

	public String getKod() {
		return this._name.substring(0,1) + _id;
	}

	

}
