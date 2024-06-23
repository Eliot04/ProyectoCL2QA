package TestEntidades;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		
		//instancia de clases
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		/*//asignamos valores
		producto.setNombrecl2("Mantequilla");
		producto.setPrecioventacl2(3.20);
		producto.setPreciocompcl2(4.50);
		producto.setEstadocl2("En stock");
		producto.setDescripcl2("Mantequilla de casa");
		//invocacion metodo registro
		crud.RegistrarProducto(producto);
		*/
		
		//testeo del metodo list
		List<TblProductocl2> listado=crud.ListadoProducto();
		//bucle for
		for(TblProductocl2 lis:listado){
			
			//imprimimos
			System.out.println("Codigo : "+lis.getIdproductocl2()+
					"Nombre : "+lis.getNombrecl2()+"PV : "+lis.getPrecioventacl2()
					+"PC : "+lis.getPreciocompcl2()+"Estado : "+lis.getEstadocl2()
					+"Descrip. : "+lis.getDescripcl2());
			
		}
	}
	
}
