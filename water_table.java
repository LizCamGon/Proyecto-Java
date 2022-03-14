package tipo;

import java.time.LocalDate;


public interface water_table {
	public Integer getId();
	public LocalDate getDateRecorded();
	public Integer getConstructionYear();
	public Double getLongitude();
	public Double getLatitude();
	public String getWptName();
	public String getRegion();
	public Integer getRegionCode();
	public Boolean getPublicMeeting();
	public String getWard();
	public void getRegion(String string);
	

}
