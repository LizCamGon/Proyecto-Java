# Proyecto-Java

NIVEL FREATICO

Clase NivelFreatico:
•   se encuentra el desarrollo de las funciones 
Clase nivel_freatico_test:
•   implementa las funciones 

Nota: esta creada una interfase y otra clase para trabajo personal, aun no se han utilizado en el proyecto.

Propiedades:
•	id, de tipo Integer, consultable y modificable
•	date_recorded, de tipo LocalDate, consultable y modificable
•	construction_year, de tipo Integer, consultable y modificable
•	longitude, de tipo Double, consultable y modificable
•	latitude, de tipo Double, consultable y modificable
•	wpt_name, de tipo String, consultable y modificable
•	región, de tipo String, consultable y modificable
•	región_code, de tipo Integer, consultable y modificable
•	public_meeting, de tipo Boolean, consultable y modificable
•	ward, de tipo String, consultable y modificable.


Constructor:
•	No1: Recibe como parámetros el identificador, la fecha, el año de construcción, longitud, latitud, nombre, región, código regional, meeting y el pabellón.
•	No2: Recibe parametros que he generado aleatoriamente y algunos reciben "null",crea un identificador, fecha, año de construcción, longitud, latitud, nombre, región, código regional, meeting y pabellón.


Representación como cadena: (toString)
•   Todo va separado por comas, empezando por el identificador, la fecha grabada, el año de construcción, seguido por las coordenadas, divididas en longitud y latitud, el nombre, la región, el código regional, si es o no una reunión pública y el pabellón.


Restricciones:
•	La fecha no puede estar vacía 
•	El identificador debe ser mayor que cero


Criterio de Igualdad:
•   Dos niveles freaticos son iguales si tienen igual el pabello, año de construccion, nombre y fecha.


Criterio de Ordenacion:
•   Se ordenan segun identificador, año de construccion, region y codigo regional.


Propiedades derivadas:
•   region.substring (0,3), devuelve los 3 primeros caracteres de la columna region de tipo String


Generacion de equals y hashCode para todos los parametros.
