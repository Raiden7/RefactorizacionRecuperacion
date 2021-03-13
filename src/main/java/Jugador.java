
	/* 
		Esta es la clase para el mus
		Define a los jugadores de mus
	*/
	

	public class Jugador extends Usuario
	{
		//Atributos
		
		private int posicionMano;	// 1, 2, 3, 4
	

		/** Crea una instancia de jugador */
		public Jugador(String _nombre, String _pass, int _posicionMano)
		{
			super(_nombre, _pass);
			posicionMano = _posicionMano;
		}
	

		
		/** Devuelve la posicion de la mano de ese jugador en la ronda actual */
		public int getPosicionMano()
		{
			return posicionMano;
		}
		
		/** Cambia la posicion de la mano de este jugador para la siguiente ronda */
		public void setPosicionMano(int posicionMano)
		{
			if(posicionMano > 0 && posicionMano < 5)
			{
				this.posicionMano = posicionMano;
			}
		}
		
		
	}

