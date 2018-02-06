package javadoc;

//////
////

/**
 * <h2>clase Empleado, se utiliza para crear y leer empleados de una BD </h2>
 * 
 * Busca informaci�n de Javadoc en <a href="http://www.google.com">GOOGLE</a>
 * @see <a href="http://www.google.com"b >Google</a>
 * @version 1-2017
 * @author epozo
 * @since 1-1-2017
 */

////
/////
/////


public class Empleado {
	/**
	 * Atributo Nombre del empleado
	 */
	private String nombre;
	/**
	 * Atributo Apellido del empleado
	 */
	private String apellido;
	/**
	 * Atributo Salario del empleado
	 */
	private double salario;
	
	/**
	 * Constructor con tres par�metros
	 * Crea objetos empleado con nombre, apaellido y salario
	 * @param nombre Nombre del empleado
	 * @param apellido Apellido del empleado
	 * @param salario Salario del empleado
	 */
	public Empleado(String nombre, String apellido, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}
	
	// M�todos p�blicos
	
	/**
	 * Sube el salario al empleado
	 * @see Empleado
	 * @param subida Valor de la subida del salario
	 */
	public void subidaSalario (double subida) {
		salario = salario + subida;
	}


	//M�todos privados
	
	/**
	 * Comprueba que el nombre no est� vacio
	 * @return <ul>
	 *           <li>true: el nombre es una cadena vacia</li>
	 *           <li>false: el nombre No es una cadena vacia</li>
	 *         </ul>
	 */

	private boolean comprobar() {
		if(nombre.equals("")) {
			return false;
		}
		else
			return true;
	}
}
