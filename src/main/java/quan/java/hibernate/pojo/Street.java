package quan.java.hibernate.pojo;
/**
 * 街道信息
 * @author issuser
 *
 */
public class Street {
	//街道ID
	private long streetId;
	
	//行政区
	private String region;
	
	//街道名称
	private String streetName;
	
	private House house;
	
	public long getStreetId() {
		return streetId;
	}

	public void setStreetId(long streetId) {
		this.streetId = streetId;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	
}
