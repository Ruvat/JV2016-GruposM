/** Proyecto: Juego de la vida.
 * 	-MODIFICACIÓN-
 *  Resuelve todos los aspectos relacionados con la presentación 
 *  principal del programa con un menú. Colabora en el patron MVC
 *  @since: prototipo2.1
 *  @source: VistaPrincipal.java 
 *  @version: 2.1 - 2017.05.17
 *  @author: Rubén Cervera Sánchez
 */

package accesoUsr.swing;

import javax.swing.JFrame;

import accesoUsr.OperacionesVista;

import javax.swing.JScrollPane;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VistaPrincipal extends JFrame implements OperacionesVista {

	private JMenuBar menuBar;
	private JMenu mnFichero;
	private JMenu mnSimulaciones;
	private JMenu mnMundos;
	private JMenu mnUsuarios;
	private JMenu mnSesiones;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmAcercaDe;
	private JDialog digAcercaDe;
	
	
	// Constructor
	public VistaPrincipal() {
		setTitle("JV.2016 GESTIÓN PRINCIPAL");
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFichero = new JMenu("fichero");
		menuBar.add(mnFichero);
		
		JMenuItem menuItem = new JMenuItem("Salir");
		mnFichero.add(menuItem);
		
		JMenu mnSimulaciones = new JMenu("Simulaciones");
		menuBar.add(mnSimulaciones);
		
		JMenu mnMundos = new JMenu("Mundos");
		menuBar.add(mnMundos);
		
		JMenu mnUsuarios = new JMenu("Usuarios");
		menuBar.add(mnUsuarios);
		
		JMenu mnSesiones = new JMenu("Sesiones");
		menuBar.add(mnSesiones);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmmenuAcercaDe = new JMenuItem("Acerca de");
		mnAyuda.add(mntmmenuAcercaDe);
	}

	public void muestraDialogoAcercaDe() {
		digAcercaDe = new JDialog(this);
	}
	
	public void mostrar() {
		this.mostrarMensaje("\n-- JV-2016 GESTIÓN PRINCIPAL --");
		this.mostrarMensaje(
				"  \nSIMULACIONES\n" +
						"    1. Crear nueva simulación\n" +
						"    2. Modificar simulación existente\n" +
						"    3. Eliminar simulación exitente\n" +
						"    4. Mostrar datos de simulaciones\n" +
						"    5. Mostrar identificadores de simulaciones\n" +
						"    6. Ejecutar simulación de demoostración\n" +
						"  \nMUNDOS\n" +
						"    7. Crear nuevo mundo\n" +
						"    8. Modificar mundo existente\n" +
						"    9. Eliminar mundo esistente\n" +
						"    10. Mostrar datos de mundos\n" +
						"  \nUSUARIOS\n" +
						"    11. Crear nuevo usuario\n" +
						"    12. Modificar usuario existente\n" +
						"    13. Eliminar usuario existente\n" +
						"    14. Mostrar datos de usuarios\n" +
						"  \nSESIONES\n" +
						"    15. Modificar sesión existente\n" +
						"    16. Eliminar sesión existente\n" +
						"    17. Mostrar datos de sesiones\n" +
						"    18. Mostrar identificadores de sesiones\n\n" +
						"     0. SALIR\n " +
						"\nElige una opción: \n" 
				);
	}

	public void pedirOpcion() {

		}
	

	
	@Override
	public void mostrarMensaje(String mensaje) {
		
	}

} //class		
