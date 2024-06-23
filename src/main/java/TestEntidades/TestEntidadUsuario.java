package TestEntidades;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {
public static void main(String[] args) {
		
		//instancia de clases
		TblUsuariocl2 usuario=new TblUsuariocl2();
		ClassUsuarioImp crud=new ClassUsuarioImp();
		//asignamos valores
		usuario.setUsuariocl2("Juanalberto2344");
		usuario.setPasswordcl2("juan1234");
		
		//invocacion metodo registro
		crud.RegistrarUsuario(usuario);
		
}
}
