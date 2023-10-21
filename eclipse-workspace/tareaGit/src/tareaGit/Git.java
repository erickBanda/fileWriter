package tareaGit;

public class Git {
	private String Nombre;
	private int Altura;
	private int Base;
	private int Area;
	private int Radio;
	public Git(String nombre, int altura, int base, int area, int radio) {
		super();
		Nombre = nombre;
		Altura = altura;
		Base = base;
		Area = area;
		Radio = radio;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getAltura() {
		return Altura;
	}
	public void setAltura(int altura) {
		Altura = altura;
	}
	public int getBase() {
		return Base;
	}
	public void setBase(int base) {
		Base = base;
	}
	public int getArea() {
		return Area;
	}
	public void setArea(int area) {
		Area = area;
	}
	public int getRadio() {
		return Radio;
	}
	public void setRadio(int radio) {
		Radio = radio;
	}
	
}
