package quan.java.hibernate.pojo;
/**
 * 房屋信息
 * @author issuser
 *
 */
public class House {
	
	//主键ID
	private long houseId;
	
	//面积
	private double area;
	
	//户型
	private String apartmentLayout;
	
	//街道ID
	private Street street;

	public long getHouseId() {
		return houseId;
	}

	public void setHouseId(long id) {
		this.houseId = id;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getApartmentLayout() {
		return apartmentLayout;
	}

	public void setApartmentLayout(String apartmentLayout) {
		this.apartmentLayout = apartmentLayout;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}
	
	

}
