package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class ClassProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		//cadena de conexion con la unidad de persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoCL2QA");
		//gestion de entidades
		EntityManager em=fabr.createEntityManager();
		//inicio de transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(producto);
		//mensaje de consola
		System.out.println("Producto Registrado en la BD");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
	}//fin del registro

	@Override
	public List<TblProductocl2> ListadoProducto() {
		//cadena de conexion con la unidad de persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoCL2QA");
		//gestion de entidades
		EntityManager em=fabr.createEntityManager();
		//inicio de transaccion
		em.getTransaction().begin();
		//recuperamos los productos de la bd(jpql)
		List<TblProductocl2> listadoproducto= em.createQuery("select c from TblProductocl2 c",TblProductocl2.class).getResultList();
		//confirmamos la transaccion
		em.getTransaction().commit();
		//cerramos
		em.close();
				
		return listadoproducto;
	}

}
