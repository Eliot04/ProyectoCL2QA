package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class ClassUsuarioImp implements IUsuario{

	@Override
	public void RegistrarUsuario(TblUsuariocl2 usuario) {
		//cadena de conexion con la unidad de persistencia
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoCL2QA");
				//gestion de entidades
				EntityManager em=fabr.createEntityManager();
				//inicio de transaccion
				em.getTransaction().begin();
				//registramos
				em.persist(usuario);
				//mensaje de consola
				System.out.println("Usuario Registrado en la BD");
				//confirmamos
				em.getTransaction().commit();
				//cerramos
				em.close();
			}//fin del registro
		
	}
	

