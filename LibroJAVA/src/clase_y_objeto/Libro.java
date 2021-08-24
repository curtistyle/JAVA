package clase_y_objeto;

// Declara un tipo de enum con constructor y campos de instancia explicitos,
// junto con metodos de acceso para estos campos
public enum Libro {
	// declara constantes de tipo enum
	JHTP6( "Java How to Program 4e", "2005" ),
	CHTP4( "C How to Program 4e", "2004"),
	IW3HTP3( "Internet & World Wide Web How to Program 3e", "2004" ),
	CPPHTP4( "C++ How to Program 4e", "2003" ),
	VBHTP2( "Visual Basic .NET How to Program 2e", "2002" ),
	CSHARPHTP( "C# How to Program", "2002" );

	// campos de instancia
	private final String titulo; // titulo del libro
	private final String anioCopyright; // año de copyright
	
	// constructor de enum
	Libro( String tituloLibro, String anio){
		titulo = tituloLibro;
		anioCopyright = anio;
	} // fin de constructor enum Libro
	
	// metodo de acceso para el compo titulo
	public String obtenerTitulo() {
		return titulo;
	} // fin del metodo obtenerTitulo
	
	// metodo de acceso para el campo anioCopyright
	public String obtenerAnioCopiright() {
		return anioCopyright;
	} // fin del metodo obtenerAnioCopyright
	
} //fin del enum Libro
