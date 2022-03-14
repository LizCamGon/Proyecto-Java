package tipo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.stream.Stream;

public class Factoria {

	public static WaterTables leerWaterTables(String rutaFichero) {
		Path ruta = Paths.get(rutaFichero);
		Stream<String> streamLineas = null;
		try{
			streamLineas = Files.lines(ruta);
		}catch (IOException e) {
			e.printStackTrace();
		}
		Stream<WaterTable1> streamWaterTables = streamLineas.skip(1).map(linea -> Factoria.pasearWaterTable(linea));
		WaterTables watertables =  new WaterTables(streamWaterTables);
		
		return watertables;
	}
	
	private static WaterTable1 pasearWaterTable(String linea) {
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

}
