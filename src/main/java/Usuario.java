
public class Usuario implements java.io.Serializable
	{
//Atributos
public String n; //nombre
public String pass;// password
public int punt; // puntos
public String img;//imagen
                
                
		
public Usuario(String _nombre, String _pass)
		{
			n = _nombre;
			pass = _pass;
			punt = 1000;
			img = "";
		}
		
		
		
		
public boolean equals(Object o)
		{
			if(o instanceof Jugador)
			{
				Jugador j = (Jugador) o;
				
				if (n.equals(this.n))
					return true;
				else
					return false;
			}
			else
				return false;
		}
		
		
	/** Crea un metodo que Devuelva una representacion en forma de String del usuario */
		
println( "\nNombre: " + n + "\nPuntos: " + punt);
		
/** Devuelve un entero que se corresponde con la representacion hash del usuario */
public int hashCode()
{
return n.hashCode();
}
                
                
 //GENERA LA DOCUMENTACION DEL PROYECTO
	}

