import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Bienvenido al programa\n");
	//Leer archivo de texto
	String fileName = "pacientes.txt";
	BufferedReader in = new BufferedReader(new FileReader(fileName));
	//Se crea para el split
	String [] subStrings;
	//Vector que contendra todos los objetos pacientes
	Vector<Paciente> VecPacientes = new Vector<Paciente>();
        String linea;
	try {
		//Mientras haya una linea de paciente continua leyendo el archivo
		while ((linea = in.readLine()) != null) {
			subStrings = linea.split(",");
			//la linea esta ahora divida en 3 [nombre, sintomas, codigo]
			VecPacientes.add(new Paciente(subStrings[0], subStrings[1], subStrings[2]));
			//Se añade el objeto paciente al vector que los contendra a todos
		}			
	} catch (IOException e) {
			//Error si hay algun problema con el ingreso de datos
			System.out.println("Ha ocurrido un error");
	}
	
}
