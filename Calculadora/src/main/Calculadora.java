package main;

/**
 * @author 03ras
 * 
 * Clase Calculadora
 * 
 * suma, resta, multiplica y divide.
 * 
 * @since 1.8
 * 
 * @version 1.0
 *
 */
public class Calculadora {
	
	
	
	public Calculadora()
	{
		
	}
	
	
	/**
	 * @param x
	 * @param i
	 * @return suma x y i
	 */
	public int sumar(int x, int i)
	{
		return x + i;
	}
	
	/**
	 * @param x
	 * @param i
	 * @return resta x y i
	 */
	public int restar(int x, int i)
	{
		return x - i;
	}
	
	/**
	 * @param x
	 * @param i
	 * @return multiplica x y i
	 */
	public int multiplicar(int x, int i)
	{
		return x * i;
	}
	
	/**
	 * @param x
	 * @param i
	 * @return divide x y i
	 */
	public int dividir(int x, int i)
	{
		return x / i;
	}

}
