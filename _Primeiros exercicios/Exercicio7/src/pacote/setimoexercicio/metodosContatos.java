package pacote.setimoexercicio;

public interface metodosContatos {
	/*Metodo que ira adicionar um contacto*/
	void addContact();
	
	/*Metodo que ira retornar um contacto*/
	Contacto returnContact(String nomeContacto);
	
	/*Metodo que ira deletar um contacto*/
	Contacto deleteContact(String nomeContacto);
	

}
