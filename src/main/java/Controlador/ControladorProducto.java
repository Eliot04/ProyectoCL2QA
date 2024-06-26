package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoImp;
import model.TblProductocl2;
import Dao.ParseoDouble;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		
		List<TblProductocl2> listadoproducto=crud.ListadoProducto();
		
		//invocamos el listado 
		request.setAttribute("listadoproducto", listadoproducto);
		//redireccionamos
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//recuperamos los valores del formulario
		String nombre=request.getParameter("nombre");
		double precio = ParseoDouble.getDoubleParameter(request, "precio");
	    double precioven = ParseoDouble.getDoubleParameter(request, "precioven");
		String estado=request.getParameter("estado");
		String descrip=request.getParameter("descrip");
		
		//instanciar las entidades
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		//asignacion de valores
		producto.setNombrecl2(nombre);
		producto.setPrecioventacl2(precio);
		producto.setPreciocompcl2(precioven);
		producto.setEstadocl2(estado);
		producto.setDescripcl2(descrip);
		//invocacion del metodo registrar
		crud.RegistrarProducto(producto);
		//actualizar listado de los productos
		List<TblProductocl2> listadoproducto=crud.ListadoProducto();
		
		//invocamos el listado 
		request.setAttribute("listadoproducto", listadoproducto);
		//redireccionamos
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
		
		
		
	}

}
