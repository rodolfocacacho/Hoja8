import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Main {

public static void main(String[] args) throws FileNotFoundException{
	
        // Bienvenida al programa
	System.out.println("¡Bienvenido! A continuación leeremos la lista de espera y la ordenaremos por prioridad.\n");
        
	//Se declaran variables para leer el archivo con los pacientes
	String fileName = "pacientes.txt";
	BufferedReader in = new BufferedReader(new FileReader(fileName));
	//Se crea para el split
	String [] pacientesString;
        String line;
	//Vector que contendra todos los objetos pacientes
	Vector<Paciente> listaEspera = new Vector<Paciente>();
	try {
            //Mientras haya una linea de paciente continua leyendo el archivo
            while ((line = in.readLine()) != null) {
		pacientesString = line.split(",");
		//la linea esta ahora divida en 3 [nombre, sintomas, codigo]
		listaEspera.add(new Paciente(pacientesString[0], pacientesString[1], pacientesString[2]));
		//Se añade el objeto paciente al vector que los contendra a todos
            }			
        } 
        catch (IOException e) {
            //Error si hay algun problema con el ingreso de datos
            System.out.println("Ha ocurrido un error");
	}
        
        //Se crea el VectorHeap y se van quitando desde la raiz
	VectorHeap<Paciente> pacientes = new VectorHeap<Paciente>(listaEspera);
	//Inicializacion de variables a utilizar en el for
	int count = pacientes.size();
	System.out.println("La lista de pacientes segun prioridad es la siguiente:\n");
	for (int i=0; i<count; i++){
            Paciente actual = pacientes.remove();
            String imprimir = "Paciente "+(i+1)+" "+actual.toString();
            System.out.println(imprimir);
	}
    }

}
