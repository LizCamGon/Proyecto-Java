package tipo;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class WaterTables implements Comparable<WaterTables> {
	
	
	
	
	
	
	private Set<WaterTable1> waterTables;
	

	//Una colecci�n (Set<TipoBase>) con WaterTable como atributo
	public WaterTables() {
		waterTables = new HashSet<>();
	}

	
	public WaterTables(Stream<WaterTable1> streamWaterTables) {
		waterTables = streamWaterTables
				.collect(Collectors.toSet());
	}
	
	//List<WaterTables> Lista = new ArrayList<WaterTables>();
	
	//Constructor vacio
	/*public WaterTables() {
		
	}*/
	
	//Stream<TipoBase>
	public Stream<WaterTable1> getStreamWaterTables(){
		return waterTables.stream();
	}

	
	
	//Metodos de Object
	//hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((waterTables == null) ? 0 : waterTables.hashCode());
		return result;
	}

	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WaterTables other = (WaterTables) obj;
		if (waterTables == null) {
			if (other.waterTables != null)
				return false;
		} else if (!waterTables.equals(other.waterTables))
			return false;
		return true;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "WaterTables [watertables=" + waterTables + "]";
	}

	
	
	//
	public void anadirWaterTable(WaterTable1 waterTable) {
		waterTables.add(waterTable);
	}
	
	//M�todo public boolean a�adirTipoBase(TipoBase o) que a�ada un elemento al atributo colecci�n.
	public boolean WaterTable(WaterTable1 o) {
		waterTables.add(o);
		return true;
	}
	
	// Devuelve aquellas "filas" que cumplen con el requisito de que una de sus columnas num�ricas est�n comprendida en un rango. Solo ser� v�lida una soluci�n basada en Stream<TipoBase>, no en foreach.
	public SortedSet<WaterTable1> calcularWaterTableEntre(Double limiteInferior, Double limiteSuperior){
		Stream<WaterTable1> filtro = waterTables.stream();
		filtro.filter(wt -> (wt.getLongitude() < limiteSuperior && wt.getLongitude() > limiteInferior))
		.collect(Collectors.toSet());
		return null;
	}
	
	
	
	//Calcular ward por region
	public Integer calcularPabellonesPorRegion(String region) {
		Long contador = waterTables.stream()
				.filter(waterTable -> waterTable.getRegion().equals(region))
				.count();
		return contador.intValue();	
	}
	

	
	//Calcular el maximo latitud
	public WaterTable1 calculaMaximaLatitud() {
		Optional<WaterTable1> optional = waterTables.stream()
				.max(Comparator.comparing(WaterTable1::getLatitude));
		return optional.orElse(null);	
	}
	
	public List<WaterTable1> calculaMaximaLatitud (String region) {
		List<WaterTable1> wtFiltrados = waterTables.stream()
		.filter(waterTable -> waterTable.getRegion().equals(region))
		.collect(Collectors.toList());
		return wtFiltrados;
	}
	
	
	
	//Devuelve una Lista de TipoBase con los limite (n�mero) elementos con mayor XXX, siendo XXX un par�metro de tipo num�rico, ordenados de mayor a menor por orden natural.
  /*  public List<WaterTable> calculaMayorRegioCode(Integer limite){
    	Stream<WaterTable> filtro = waterTables.stream();
		filtro.filter(w -> w.getRegionCode());
        return null;
    	
    }*/
 
	@Override
	public int compareTo(WaterTables o) {
		return 0;
	}

}