package tareaGit;

public class GitEnlace {
	int Radio;
	int Base;
	int Altura;
	
    public String Nom;

    public GitEnlace(String nom) {
        Nom = nom;
    }

    public int calculo(String nombre, int radio, int base, int altura) {
        int area; 

        switch (nombre) {
            case "circulo":
                area = (int) (radio * radio * Math.PI);
                return area;
            case "triangulo":                
            case "cuadrado":             
            default:
                return 0; 
        }
       }
    }