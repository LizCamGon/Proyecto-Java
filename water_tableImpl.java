package tipo;

import java.time.LocalDate;

public abstract class water_tableImpl implements water_table {
 
	
	//Propiedades 
	
	private Integer id;
	private LocalDate date_recorded;
	private Integer construction_year;
	private Double longitude;
	private Double latitude;
	private String wpt_name;
	private String region;
	private Integer region_code;
	private Boolean public_meeting;
	private String ward;
	
	
	//Constructor por parametro
	
	public water_tableImpl(Integer id, LocalDate date_recorded, Integer construction_year, Double longitude, Double latitude, String wpt_name, String region, Integer region_code, Boolean public_meeting, String ward) {
		
		this.id = id;
		this.date_recorded = date_recorded;
		this.construction_year = construction_year;
		this.longitude = longitude;
		this.latitude = latitude;
		this.wpt_name = wpt_name;
		this.region = region;
		this.region_code = region_code;
		this.public_meeting = public_meeting;
		this.ward = ward;
		
	}
	
	//Constructor vacio
	
	
	public water_tableImpl() {
		this.id = 0;
		this.date_recorded = LocalDate.now();
		this.construction_year = 2000;
		this.longitude = 3.44869848;
		this.latitude = -4.59381039;
		this.wpt_name = "";
		this.region = "";
		this.region_code = 200;
		this.public_meeting = true;
		this.ward = "";
		
	}
	 
	//Propiedades derivadas
	//Imprimir los 3 primeros caracteres de la columna "region" tipo String
	
    public String region() {
		return region.substring(0, 3);
    }


     //Generar Getter y Setter
    
    public Integer getId() {
    	checkId(id);
    	return id;
    }

   
    public void setId(Integer id) {
    	this.id = id;
	}
    
    
    public LocalDate getDate_recorded() {
	return date_recorded;
	}
    
    public void setDate_recorded(LocalDate date_recorded) {
	    checkDateRecorded(date_recorded);
		this.date_recorded = date_recorded;
	}
    
    
    public Integer getConstruction_year() {
	    return construction_year;
	}
    
    
    public void setConstruction_year(Integer construction_year) {
    	this.construction_year = construction_year;
	}

    
    
    public Double getLongitude() {
    	return longitude;
	}
    
    
    public void setLongitude(Double longitude) {
	this.longitude = longitude;
	}
    
    
    public Double getLatitude() {
	return latitude;
	}
    
    
    public void setLatitude(Double latitude) {
	this.latitude = latitude;
	}
    
    
    public String getWpt_name() {
	return wpt_name;
	}
    
    
    public void setWpt_name(String wpt_name) {
	this.wpt_name = wpt_name;
	}
    
    
    public Integer getRegion_code() {
	return region_code;
	}
    
    
    public void setRegion_code(Integer region_code) {
	this.region_code = region_code;
	}
    
    
    public Boolean getPublic_meeting() {
	return public_meeting;
	}
    
    
    public void setPublic_meeting(Boolean public_meeting) {
	this.public_meeting = public_meeting;
	}
    
    
    public String getWard() {
	return ward;
	}
    
    
    public void setWard(String ward) {
	this.ward = ward;
	}
    
    
    public void setRegion(String region) {
	this.region = region;
	}

    
    
     //Restricciones
    private void checkDateRecorded(LocalDate date_recorded) {
    	if(date_recorded.equals(date_recorded)); {
			throw new IllegalArgumentException("La fehca no puede estar vacia");
			}
    }


	private void checkId(Integer id) {
    	if (id < 0 ); {
			throw new IllegalArgumentException("El identificador es incorrecto");
    	}
    }
	
	
	//Generar equals y hashCode

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((construction_year == null) ? 0 : construction_year.hashCode());
		result = prime * result + ((date_recorded == null) ? 0 : date_recorded.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((public_meeting == null) ? 0 : public_meeting.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((region_code == null) ? 0 : region_code.hashCode());
		result = prime * result + ((ward == null) ? 0 : ward.hashCode());
		result = prime * result + ((wpt_name == null) ? 0 : wpt_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		water_tableImpl other = (water_tableImpl) obj;
		if (construction_year == null) {
			if (other.construction_year != null)
				return false;
		} else if (!construction_year.equals(other.construction_year))
			return false;
		if (date_recorded == null) {
			if (other.date_recorded != null)
				return false;
		} else if (!date_recorded.equals(other.date_recorded))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (public_meeting == null) {
			if (other.public_meeting != null)
				return false;
		} else if (!public_meeting.equals(other.public_meeting))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (region_code == null) {
			if (other.region_code != null)
				return false;
		} else if (!region_code.equals(other.region_code))
			return false;
		if (ward == null) {
			if (other.ward != null)
				return false;
		} else if (!ward.equals(other.ward))
			return false;
		if (wpt_name == null) {
			if (other.wpt_name != null)
				return false;
		} else if (!wpt_name.equals(other.wpt_name))
			return false;
		return true;
	}

	
	//Generar toString
	
	@Override
	public String toString() {
		return "nivel_freaticoImpl [id=" + id + ", date_recorded=" + date_recorded + ", construction_year="
				+ construction_year + ", longitude=" + longitude + ", latitude=" + latitude + ", wpt_name=" + wpt_name
				+ ", region=" + region + ", region_code=" + region_code + ", public_meeting=" + public_meeting
				+ ", ward=" + ward + "]";
	}


    
}   


