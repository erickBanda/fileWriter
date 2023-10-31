package guiWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Enlace {
public String Nombre;
public String Telefono;
public String Correo;
public String Enlace;
public String[] Resultado;
public String Resultado1;

public Enlace(String nombre, String telefono, String correo, String enlace, String[] resultado, String resultado1) {
	super();
	Nombre = nombre;
	Telefono = telefono;
	Correo = correo;
	Enlace = enlace;
	Resultado = resultado;
	Resultado1 = resultado1;
}
public void anadir(String nombre, String telefono, String correo) {
	try {
		BufferedWriter out = new BufferedWriter(new FileWriter("src/guiWriter/texto3/texto.txt", true));
		String cadena =nombre+","+telefono+","+correo+"\n";
			out.write(cadena);						
			out.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		System.out.println(e1.getMessage());
		e1.printStackTrace();						
	}	
}
public String[] buscar(String nombre) {
    try {  	  
        String renglon;
        BufferedReader in = new BufferedReader(new FileReader("src/guiWriter/texto3/texto.txt")); 
        Resultado = new String[3];        
        while ((renglon = in.readLine()) != null) {
            String[] datos = renglon.split(",");
            if (datos.length >= 1 && datos[0].equals(nombre)) {
                if (datos.length >= 3) {
                    Resultado[0] = datos[0]; // Nombre
                    Resultado[1] = datos[1]; // Teléfono
                    Resultado[2] = datos[2]; // Correo
                    break; 
                }
            }
        }
        in.close();
    } catch (IOException e1) {
        System.out.println(e1.getMessage());
    }
    return Resultado;
}
public String MuestraTodo() {
    List<String> resultados = new ArrayList<>();
    try {
        String renglon;
        BufferedReader in = new BufferedReader(new FileReader("src/guiWriter/texto3/texto.txt"));
        while ((renglon = in.readLine()) != null) {
            String[] datos = renglon.split(",");
            if (datos.length >= 3) {
                String infoContacto = "Nombre: " + datos[0] + ", Teléfono: " + datos[1] + ", Correo: " + datos[2];
                resultados.add(infoContacto);
            }
        }
        in.close();
    } catch (IOException e1) {
        System.out.println(e1.getMessage());
    }
    return String.join("\n", resultados);
}




public Enlace(String nombre) {
	Nombre = nombre;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getTelefono() {
	return Telefono;
}
public void setTelefono(String telefono) {
	Telefono = telefono;
}
public String getCorreo() {
	return Correo;
}
public void setCorreo(String correo) {
	Correo = correo;
}
public String getEnlace() {
	return Enlace;
}
public void setEnlace(String enlace) {
	Enlace = enlace;
}
public String[] getResultado() {
	return Resultado;
}
public void setResultado(String[] resultado) {
	Resultado = resultado;
}
public String getResultado1() {
	return Resultado1;
}
public void setResultado1(String resultado1) {
	Resultado1 = resultado1;
}
	


}
