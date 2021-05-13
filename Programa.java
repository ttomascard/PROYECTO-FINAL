import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;
import java.util.*;
import java.util.Scanner;
public class Programa{

	public static String convertirUnicode(String letra,String cadena){
		
		StringBuilder str = new StringBuilder(cadena);
		int indice = -1;
		char caracter = 0;
		indice = str.lastIndexOf(letra);
		
		if(indice>=0 )
		{
			switch(letra){
				case "Á": caracter = '\u00C1';
						  break;
				case "á": caracter = '\u00E1';
					      break;
				case "é": caracter = '\u00E9';
					      break;
				case "í": caracter = '\u00ED';
					      break;
		        case "ó": caracter = '\u00F3';
					      break;
			    case "ú": caracter = '\u00FA';
					      break;
				case "ñ": caracter = '\u00F1';
					      break;
			}
			// System.out.println("\\u" + Integer.toHexString('÷' | 0x10000).substring(1));
			str.replace(indice,indice+1,""+caracter);
		}

		return str.toString();
	}

	public static void imprimir(String cadena)
	{
		String str; 
		str = convertirUnicode("Á",cadena);
		str = convertirUnicode("á",str);
		str = convertirUnicode("é",str);
		str = convertirUnicode("í",str);
		str = convertirUnicode("ó",str);
		str = convertirUnicode("ú",str);
		str = convertirUnicode("ñ",str);

		System.out.println(str);
	}

	public static StringBuilder obtenerLetraCancion(int inicio,int fin, String[]data)
	{
		StringBuilder str = new StringBuilder();
		StringTokenizer temp;

		for(int i = inicio; i<=fin; i++)
		{
			//System.out.println("@  "+data[i]);

			temp = new StringTokenizer(data[i],";");

			while(temp.hasMoreTokens())
			{
				System.out.print(temp.nextToken()+" ");
			}
			System.out.println();
			//str.append(data[i]+"\n");
		}

		return str;
	}

	public static void menu(){
	System.out.println(" ___________________________________________________________________________________________________________________________________________________________________________________ ");
	System.out.println("|													                 							    |");
	System.out.println("|         U  _____  u   ____         ____      _   _      ____     _   _        _             __   __        ____        _   _     _   _       _____         _   _       _          |"); 
	System.out.println("|          \\| ___\"|/   / __\"| u   U /\"___|  U |\"|u| |  U /\"___|   |'| |'|   U  /\"\\  u         \\ \\ / /      U|  _\"\\ u  U |\"|u| |   | \\ |\"|     |_ \" _|     U |\"|u| |  U  /\"\\  u      |"); 
	System.out.println("|           |  _|\"    <\\___ \\/    \\| | u     \\| |\\| |  \\| | u    /| |_| |\\   \\/ _ \\/           \\ V /       \\| |_) |/   \\| |\\| |  <|  \\| |>      | |        \\| |\\| |   \\/ _ \\/       |"); 
	System.out.println("|           | |___     u___) |     | |/__     | |_| |   | |/__   U|  _  |u   / ___ \\          U_|\"|_u       |  __/      | |_| |  U| |\\  |u     /| |\\        | |_| |   / ___ \\       |"); 
	System.out.println("|           |_____|    |____/>>     \\____|   <<\\___/     \\____|   |_| |_|   /_/   \\_\\           |_|         |_|        <<\\___/    |_| \\_|     u |_|U       <<\\___/   /_/   \\_\\      |"); 
	System.out.println("|           <<   >>     )(  (__)_  // \\\\   (__) )(     _// \\\\    //   \\\\    \\\\    >>       .-,//|(_        ||>>_     (__) )(     ||   \\\\,-._   // \\\\    _(__)  )(     \\\\    >>      |"); 
	System.out.println("|          (__) (__)   (__)       (__)(__)      (__)   (__)(__)  (_\") (\"_)  (__)  (__)       \\_) (__)      (__)__)        (__)    (_\")  (_/   (__) (__)       (__)   (__)  (__)     |"); 
	System.out.println("|                                                                                                                                                                                   |");
	System.out.println("|                     _..-...                                                                                                                                                       |"); 
	System.out.println("|                   ,Y+  .:.:\\_                                                                                                                                                     |");
	System.out.println("|                  | |./'     ``-\\                                                      Ingrese una opción así:                                                                     |");
	System.out.println("|                  |,'`           `.                                                     1. Imprimir lista de canciones                                                             |");
	System.out.println("|                  |               `_                                                    2. Reproducir canción                                                                      |");
	System.out.println("|                  |     ,-''-. ,-''':                                                   3. Mostrar letra                                                                           |");
	System.out.println("|                  |    /      .'     :                                _                 4. Detener canción                                                                         |");
	System.out.println("|                  | .\\ |    o  |__o.,'                           _.-' '\\                5. Imprimir información de la canción                                                      |");
	System.out.println("|                 '|\\| \\\\      /    `)                        ,..,'     ,'               6. Salir                                                                                   |");
	System.out.println("|                  |`|  ' `..- .....<:                      ,'    `. ,-:                                                                                                            |");
	System.out.println("|                  ' ,-   _.-'        `.                 _,'       +'  |                                                                                                            |");
	System.out.println("|                   |`|  ,'            '.              ,'       - _/_,'-\\                                                                                                           |");
	System.out.println("|                    `.Y|   _,,.. ____./'           ,-'         /'|`'  _|                                                                                                           |");
	System.out.println("|                      ||  | |  |  | |           _.-              `--+'                                                                                                             |");
	System.out.println("|                      |-.  \"|:.|..|-.    _,.. ,/'               ,..Y'                                                                                                              |");
	System.out.println("|                      / `\\.       ,-'  ,' /,,'               _,'                                                                                                                   |");
	System.out.println("|                     .:_    -----'''|.:   |             _,Y''                                                                                                                      |");
	System.out.println("|                    /  '`'';'.     /:  \\  |        _,Y-'                                                                                                                           |");
	System.out.println("|                    |      |  ' .  | `._| |     _,'                                                                                                                                |");
	System.out.println("|                _/-'';.. _ |     ` |   \\   `.Y'i'                                                                                                                                  |");
	System.out.println("|              ,'    ,'    '             |    i/'                                                                                                                                   |");
	System.out.println("|           ,.'      /                   ..--'                                                                                                                                      |");
	System.out.println("|           |       |                     \\                                                                                                                                         |");
	System.out.println("|           : .     /                      ' .                                                                                                                                      |");
	System.out.println("|          /'  `._ .'                         `.                                                                                                                                    |");
	System.out.println("|          /     _''                            \\                                                                                                                                   |");
	System.out.println("|         /     ./                               \\                                                                                                                                  |");
	System.out.println("|        /      /                                 \\                                                                                                                                 |");
	System.out.println("|       /      |                                   \\                                                                                                                                |");
	System.out.println("|      /     ,'|                                    |                                                                                                                               |");
	System.out.println("|___________________________________________________________________________________________________________________________________________________________________________________|");
	System.out.print("  Escucha&Puntua  ");
	}

	public static void main(String[] args) {
		
		//AnsiConsole.systemInstall();
		
		Audio audio = new Audio();
		int centinela = 0;	
		int indice_cancion = 0;
		int inicio_letra = 0, fin_letra = 0;
		String [] canciones;
		String [][] info_canciones;
		StringBuilder letra_cancion;
		//int bandera; //Si hay un caracter que no es valido

		canciones = ConsoleFile.readBigFile("recursos/letras.csv");
		info_canciones = ConsoleData.dataList(canciones);

		try{
			
			do{

				// imprimir(""+RandomHelper.random(1,10));
				//bandera=0; 
				System.out.println();
				//TODO: Terminar la funcion para que imprima todos los caracteres especiales que use el programa
				menu();
				//TODO: Ojo falta validar la entrada de datos
				//TODO: Recuerde usar el helper ConsoleInput y validar
				centinela = ConsoleInput.getInt();


				//Si el usuario ingresa el 1, se mostrará una lista del nombre de la canción, el autor, album y año
				if(centinela == 1)
				{
					for(int i=0;i<=info_canciones.length-1;i++)
					{
						indice_cancion=i;
						if(i<10)
						{
						System.out.println(" "+i+" | "+info_canciones[indice_cancion][ConsoleData.NOMBRE_CANCION]+" | "+info_canciones[indice_cancion][ConsoleData.AUTOR_CANCION]+" | "+info_canciones[indice_cancion][ConsoleData.ALBUM_CANCION]+" | "+info_canciones[indice_cancion][ConsoleData.FECHA_CANCION]);
						}
						else
						{
							System.out.println(i+" | "+info_canciones[indice_cancion][ConsoleData.NOMBRE_CANCION]+" | "+info_canciones[indice_cancion][ConsoleData.AUTOR_CANCION]+" | "+info_canciones[indice_cancion][ConsoleData.ALBUM_CANCION]+" | "+info_canciones[indice_cancion][ConsoleData.FECHA_CANCION]);
						}
					}
				}

				if(centinela == 2)
				{
					
					imprimir("Ingrese indice de la cancion, entre 0 y "+(info_canciones.length-1));
					indice_cancion = ConsoleInput.getInt();
					
					//Control de que el dato ingresado por el usuario esté entre 0 y 18.
					while(indice_cancion>18||indice_cancion<0)

					{
						System.out.println("El número debe estar entre 0 y 18, vuelva a intentarlo");
						System.out.println("Ingrese índice de la canción, entre 0 y 18");
						indice_cancion = ConsoleInput.getInt();
					}
					audio.seleccionarCancion(info_canciones[indice_cancion][ConsoleData.RUTA_CANCION]);
					audio.reproducir();
				}

				if(centinela == 3)
				{
					//TODO: Ojo, falta validar el valor ingresado
					//TODO: Falta darle formato amigable de lectura al usuario 
					imprimir("Ingrese indice de la cancion, entre 0 y "+(info_canciones.length-1));
					indice_cancion = ConsoleInput.getInt();

					inicio_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.INICIO_CANCION]);
					fin_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.FIN_CANCION]);
					
					letra_cancion = obtenerLetraCancion(inicio_letra,fin_letra,canciones);
					//imprimir(letra_cancion.toString());
				}

				if(centinela == 4)
				{
					audio.detener();
					System.out.print(" Detuviste la canción ¿Cómo calificarías la parte que has escuchado del 1 al 10?, donde 1 es muy malo, 5 intermedio y 10 muy bueno: ");
					int calificacion1=ConsoleInput.getInt();
					
					//Control de que el número ingresado por el usuario esté entre el 1 y el 10, o sea el 100.
					while(calificacion1<1||calificacion1>10&&calificacion1!=100)
					{
					System.out.println(" La calificación debe ser entre 1 y 10, vuelve a intentarlo");
					System.out.println();
					System.out.print(" ¿Cómo calificarías la parte que has escuchado del 1 al 10?, donde 1 es muy malo, 5 intermedio y 10 muy bueno: ");
					calificacion1=ConsoleInput.getInt();
					}
					
					//Respuestas que da el sistema según cual sea la puntuación que el usuario le dio
					if(calificacion1>=1&&calificacion1<=10)
					{
					
						if(calificacion1>0&&calificacion1<4)
						{
						System.out.println(" Escucha otra canción posiblemente te guste más");
						}
						else
						{
					
							if(calificacion1>=4&&calificacion1<8)
							{
							System.out.println(" La siguiente canción puede que te guste más o incluso menos");
							}
							else
							{
							System.out.println(" Sigue escuchando más canciones, te gustaran muchas más");
							}
						}
					}
					else if(calificacion1==100)
					{
					System.out.println(" Nos encanta que te haya encantado la cancion, sigue escuchando para encontrar muchas más canciones");
					}
				}

				if(centinela==5)
				{
					/* La informacion de las canciones esta
					en la matriz info_canciones, acá un ejemplo de como imprimir
					el nombre de la primer canción y su autor */
					
					//TODO: Ojo, falta validar el valor ingresado
					imprimir("Ingrese indice de la cancion, entre 0 y "+(info_canciones.length-1));
					indice_cancion = ConsoleInput.getInt();

					inicio_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.INICIO_CANCION]);
					fin_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.FIN_CANCION]);

					System.out.println();
					//imprimir("Inicio letra "+inicio_letra);
					//imprimir("Fin letra "+fin_letra);
					imprimir("Nombre:   "+info_canciones[indice_cancion][ConsoleData.NOMBRE_CANCION]);
					imprimir("Autor:    "+info_canciones[indice_cancion][ConsoleData.AUTOR_CANCION]);
					imprimir("Album:    "+info_canciones[indice_cancion][ConsoleData.ALBUM_CANCION]);
					imprimir("Fecha:    "+info_canciones[indice_cancion][ConsoleData.FECHA_CANCION]);
					
					//imprimir("Archivo "+info_canciones[indice_cancion][ConsoleData.RUTA_CANCION]);
					//imprimir("Primera estrofa: "+canciones[inicio_letra]);
					//imprimir("Última estrofa: "+canciones[fin_letra]);
					
					//TODO:Convertir a unicode mayúsculas y caracteres especiales
					//TODO:Explicar como funciona el archivo y como se analiza cada línea
					//TODO:Imprimir la lista completa
				}

			}while(centinela!=6);

		}
		

		catch(Exception e){
			System.out.println(e);
			//bandera=1;
			//System.out.println("El caracter no es valido");
			}
		finally{
			audio.detener();
		}//while(bandera !=0);
	}
}