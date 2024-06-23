package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos los valores del formulario
				String usuario=request.getParameter("usuario");
				String password=request.getParameter("password");
				
				//instanciar las entidades
				TblUsuariocl2 usuario1=new TblUsuariocl2();
				ClassUsuarioImp crud=new ClassUsuarioImp();
				//asignacion de valores
				usuario1.setUsuariocl2("usuario");
				usuario1.setPasswordcl2("password");;
				
				//invocacion del metodo registrar
				crud.RegistrarUsuario(usuario1);;
				
				//redireccionamos
				request.getRequestDispatcher("/FormRegistrarProducto.jsp").forward(request, response);
				
	}

}
