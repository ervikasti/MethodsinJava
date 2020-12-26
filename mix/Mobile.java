class Mobile
{
	String OS;
	String brand;
	int battery;
	int camera;
	int ram;
	int rom;
	int size;
	float price;

	Mobile()
	{
		System.out.println("Enter all the mobile property ");
	}

	Mobile(String OS, String brand, int battery, int camera, int ram, int rom, int size, float price)
	{
		this.OS=OS;
		this.brand = brand;
		this.battery=battery;
		this.camera=camera;
		this.ram  = ram;
		this.rom = rom;
		this.size = size;
		this.price = price;
	}

	void display()
	{
		System.out.println("OS       :"+this.OS);
		System.out.println("Brand    :"+this.brand);
		System.out.println("Battery  :"+this.battery+" mH");
		System.out.println("Camera   :"+this.camera+" Pixel");
		System.out.println("RAM      :"+this.ram+" GB");
		System.out.println("ROM      :"+this.rom+" GB");
		System.out.println("SIZE     :"+this.size+" inches");
		System.out.println("PRICE    :"+this.price+" INR");

	}

}
