package Interfaces;

import java.util.List;

import model.TblProductocl2;

public interface IProducto {
	//declaracion de metodos
	public void RegistrarProducto (TblProductocl2 producto);
	public List<TblProductocl2> ListadoProducto();
}
