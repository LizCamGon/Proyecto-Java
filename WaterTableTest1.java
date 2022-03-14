package test;

import java.time.LocalDate;

import tipo.WaterTable1;

public class WaterTableTest1 {
	
	public static void main(String[] args) {
		WaterTable1 nuevo = new WaterTable1(50785, LocalDate.of(2013, 2, 4), 2012, 35.2907992, -4.05969643, "Dinamu Secondary School", "Manyara", 21, true, "Bashay"  );
		System.out.println(nuevo);
		
		System.out.println("La region es: " + nuevo.getRegion());
		nuevo.setRegion("Arusha");
		
		System.out.println("La nueva region es: " + nuevo.getRegion());
		
		System.out.println("El pabellon es:" + nuevo.getWard());
		
		System.out.println("La fecha es: " + nuevo.getDateRecorded());
		
		System.out.println("El meeting fue publico? " + nuevo.getPublicMeeting());
		
		//NivelFreatico nuevo2 = new NivelFreatico (51630, LocalDate.of(2013, 2, 4), 2000, 36.65670893, -3.30921425, "Kimnyak", "Arusha", 2, true, "Kimnyaki");
		
		WaterTable1 nuevo3 = new WaterTable1(0, LocalDate.of(2013, 2, 4), 2010, 34.76786315, -5.00434437, "Puma Secondary", "Singida", 13, true, "Puma");
		
		//System.out.println("jskjak" + nuevo.compareTo(nuevo3));
		
		System.out.println("La diferencia entre los a�os de construccion es: " + nuevo.getDelta(nuevo3));
		
		
		System.out.println("Provocamos una excepcion al meter un identificador menor que cero.");
		nuevo3.getId();
		
		//System.out.println("El maximo valor es: "+ nuevo.getPosition());
		
		//TRABAJO CON EL CSV
		
		
	}


}

