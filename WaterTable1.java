package tipo;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

import java.time.Period;

public class WaterTable1 implements Comparable<WaterTable1> {

	// Propiedades

	private Integer id;
	private LocalDate dateRecorded;
	private Integer constructionYear;
	private Double longitude;
	private Double latitude;
	private String wptName;
	private String region;
	private Integer regionCode;
	private Boolean publicMeeting;
	private String ward;
	
	public static WaterTable1 of(String linea) {
		String lineasSinEspacios = linea.trim();
		String[] trozos = lineasSinEspacios.split(",");
		
		if (trozos.length != 10) {
			throw new IllegalArgumentException(
					"Cadena con formato no valido");
		}
		Integer id = Integer.valueOf(trozos[0]);
		LocalDate dateRecorded = LocalDate.parse(trozos[1]);
		Integer constructionYear = Integer.valueOf(trozos[2]);
		Double longitude = Double.valueOf(trozos[3]);
		Double latitude = Double.valueOf(trozos[4]);
		String wptName = trozos[5].trim();
		String region = trozos[6].trim();
		Integer regionCode = Integer.valueOf(trozos[7]);
		Boolean publicMeeting = Boolean.parseBoolean(trozos[8]);
		String ward = trozos[9].trim();
		
		return new WaterTable1(id, dateRecorded, constructionYear, longitude, latitude, wptName, region, regionCode, publicMeeting, ward);
	}

	// Constructor por parametro

	public WaterTable1(Integer id, LocalDate dateRecorded, Integer constructionYear, Double longitude,
					   Double latitude, String wptName, String region, Integer regionCode, Boolean publicMeeting, String ward) {

		this.id = id;
		this.dateRecorded = dateRecorded;
		this.constructionYear = constructionYear;
		this.longitude = longitude;
		this.latitude = latitude;
		this.wptName = wptName;
		this.region = region;
		this.regionCode = regionCode;
		this.publicMeeting = publicMeeting;
		this.ward = ward;

	}

	// Constructor vacio

	public WaterTable1() {

	}

	// Propiedades derivadas
	// Imprimir los 3 primeros caracteres de la columna "region" tipo String

	public String region() {
		return region.substring(0, 3);
	}

	// Generar Getter y Setter

	public Integer getId() {
		checkId(id);
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDateRecorded() {
		return dateRecorded;
	}

	public void setDateRecorded(LocalDate dateRecorded) {
		checkDateRecorded(dateRecorded);
		this.dateRecorded = dateRecorded;
	}

	public Integer getConstructionYear() {
		return constructionYear;
	}

	public void setConstructionYear(Integer constructionYear) {
		this.constructionYear = constructionYear;
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

	public String getWptName() {
		return wptName;
	}

	public void setWptName(String wptName) {
		this.wptName = wptName;
	}

	public Integer getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(Integer regionCode) {
		this.regionCode = regionCode;
	}

	public Boolean getPublicMeeting() {
		return publicMeeting;
	}

	public void setPublicMeeting(Boolean publicMeeting) {
		this.publicMeeting = publicMeeting;
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

	public String getRegion() {
		return region;
	}

	// Restricciones
	private void checkDateRecorded(LocalDate dateRecorded) {
		if (dateRecorded == null) {
			throw new IllegalArgumentException("La fehca no puede estar vacia");
		}
	}

	private void checkId(Integer id) {
		if (id < 0) {
			throw new IllegalArgumentException("El identificador es incorrecto");
		}
	}

	// Generar equals y hashCode

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((constructionYear == null) ? 0 : constructionYear.hashCode());
		result = prime * result + ((dateRecorded == null) ? 0 : dateRecorded.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((publicMeeting == null) ? 0 : publicMeeting.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((regionCode == null) ? 0 : regionCode.hashCode());
		result = prime * result + ((ward == null) ? 0 : ward.hashCode());
		result = prime * result + ((wptName == null) ? 0 : wptName.hashCode());
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
		WaterTable1 other = (WaterTable1) obj;
		if (constructionYear == null) {
			if (other.constructionYear != null)
				return false;
		} else if (!constructionYear.equals(other.constructionYear))
			return false;
		if (dateRecorded == null) {
			if (other.dateRecorded != null)
				return false;
		} else if (!dateRecorded.equals(other.dateRecorded))
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
		if (publicMeeting == null) {
			if (other.publicMeeting != null)
				return false;
		} else if (!publicMeeting.equals(other.publicMeeting))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (regionCode == null) {
			if (other.regionCode != null)
				return false;
		} else if (!regionCode.equals(other.regionCode))
			return false;
		if (ward == null) {
			if (other.ward != null)
				return false;
		} else if (!ward.equals(other.ward))
			return false;
		if (wptName == null) {
			if (other.wptName != null)
				return false;
		} else if (!wptName.equals(other.wptName))
			return false;
		return true;
	}

	// Generar toString

	@Override
	public String toString() {
		return "nivel_freaticoImpl [id=" + id + ", date_recorded=" + dateRecorded + ", construction_year="
				+ constructionYear + ", longitude=" + longitude + ", latitude=" + latitude + ", wpt_name=" + wptName
				+ ", region=" + region + ", region_code=" + regionCode + ", public_meeting=" + publicMeeting
				+ ", ward=" + ward + "]";
	}

	// Igualdad
	public boolean equals1(Object o) {
		boolean l = false;
		if (o instanceof WaterTable1) {
			WaterTable1 p = (WaterTable1) o;
			l = this.getWard().equals(p.getWard()) && this.getConstructionYear().equals(p.getConstructionYear())
					&& this.getWptName().equals(p.getWptName()) && this.getDateRecorded().equals(p.getDateRecorded());
		}
		return l;
	}

	// Comparacion
	public int compareTo(WaterTable1 o) {
		int r;
		if (o == null) {
			throw new NullPointerException();
		}
		r = getId().compareTo(o.getId());
		if (r == 0) {
			r = getConstructionYear().compareTo(o.getConstructionYear());
			if (r == 0) {
				r = getRegion().compareTo(o.getRegion());
				if (r == 0) {
					r = getRegionCode().compareTo(o.getRegionCode());
				}
			}
		}

		return r;
	}

	

	// funcion para obtener la diferencia anual
	public Period getDelta(WaterTable1 o) {
		return Period.between(getDateRecorded(), o.getDateRecorded());
	}
	
	
	//Calcular dias desde fecha actual hasta otra en el dataset
	public static void main(String[] arg){
		LocalDate fin = LocalDate.now();
		LocalDate inicio = LocalDate.of(2010, 8, 2);
		long dias = DAYS.between(fin, inicio) ;
		System.out.println("Cantidad de dias" + dias);
	
	}
	
	//Constructor a partir de String
	public static String obtenerRegiones(WaterTable1 r) {
		return r.getRegion();
	}
	
	
	public static LocalDate getNumeroDias(WaterTables fecha) {
		return WaterTable1.getNumeroDias(fecha);
	}
	
	public WaterTable1(String row) {
	}
}
