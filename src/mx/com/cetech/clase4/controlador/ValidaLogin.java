package mx.com.cetech.clase4.controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.cetech.clase4.dao.UsuarioDAO;


/**
 * Servlet implementation class ValidaLogin
 */
@WebServlet("/ValidaLogin")
public class ValidaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValidaLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Dentro del servlet");
		String usr = request.getParameter("usuario");
		String pass = request.getParameter("password");
		//System.out.println("usuario es:" + usr + "\n");
		//System.out.println("contrasena es:" + pass + "\n");
		System.out.println("la fecha es: "+ new Date());
	
		UsuarioDAO dao = new UsuarioDAO();
		
		
		
		try {
			String resultado = dao.validaUsuario(usr, pass);

			if (resultado.equalsIgnoreCase("Bienvenido")) {
				// request.setAttribute("mensaje", resultado);
				request.getRequestDispatcher("menu.jsp").forward(request, response);
				System.out.println("Dentro del if");
			} else {
				// request.setAttribute("mensaje", resultado);
				request.getRequestDispatcher("index.jsp").forward(request, response);
				System.out.println("Dentro del else, no se encontro usuarios asignados");
			}
			request.setAttribute("mensaje", resultado);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
