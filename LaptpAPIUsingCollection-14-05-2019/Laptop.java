import java.util.ArrayList;


class Laptop{
	private Integer ramCapacity, hddCapacity;
	private String laptopID, brandName;

	Laptop(String laptopID, int ramCapacity, int hddCapacity, String brandName ){
		this.laptopID = laptopID;
		this.ramCapacity = ramCapacity;
		this.hddCapacity = hddCapacity;
		this.brandName = brandName;
	}

	//Creating the getters
	public String getLaptopID(){
		return this.laptopID;
	}

	public Integer getRamCapacity(){
		return this.ramCapacity;
	}

	public Integer getHddCapacity(){
		return this.hddCapacity;
	}

	public String getBrandName(){
		return this.brandName;
	}
    
    //creating the setters
	public void setRamCapacity(int ram){
		this.ramCapacity = ram;
	}

	public void setHddCapacity(int hdd){
		this.hddCapacity = hdd;
	}

	public void setBrand(String brand){
		this.brandName = brand;
	}
    
    
    @Override
    public String toString(){
    	return "Laptop ID: " + this.laptopID + "\nRAM Capacity: " + this.ramCapacity + "\nHDD Capacity: " + this.hddCapacity + "\nBrand Name: " + this.brandName + "\n";
    }

}


