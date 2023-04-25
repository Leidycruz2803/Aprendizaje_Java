/**
 * @author Leidy Cruz
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        String nombre = "Dina Luz ";
        nombre += "Ortega";
        System.out.println(nombre);
		
		
		
    }
	
	public static String getNombre(String nombre){
		if(nombre == "Dina Luz Ortega"){
			System.out.println("Nombre correcto.");
			
		}else{
			System.out.println("Nombre no es correcto.");
		}
	}
}
