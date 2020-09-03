

//CLASSE DO EXERCICIO 2.28.
public class CadernoDeEnderecos {
	private Pessoa nomePessoa;
	private Pessoa telemovel;
	private Pessoa email;
	private Pessoa enderecoFisico;
	
//	METODO PARA ADICIONAR NOVO CONTACTO
	public void addContacto() {
		System.out.println("Adicionar novo usuario!");
	}
	
//	METODO PARA EDITAR USUARIO
	public void editContacto(Pessoa pessoa) {
		System.out.println("Editando contacto usado!");
	}
	
//	METODO PARA EXCLUIR USUARIO
	public void deleteContacto(Pessoa pessoa) {
		System.out.println("Excluindo contacto!");
	}
	
//	LISTAR TODOS OS CONTACTOS DA AGENDA
	public String listarContactos(){
		return "Retornar lista" ;
	}
	
	
//	METODOS GETTERS E SETTERS
	public Pessoa getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(Pessoa nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public Pessoa getTelemovel() {
		return telemovel;
	}

	public void setTelemovel(Pessoa telemovel) {
		this.telemovel = telemovel;
	}

	public Pessoa getEmail() {
		return email;
	}

	public void setEmail(Pessoa email) {
		this.email = email;
	}

	public Pessoa getEnderecoFisico() {
		return enderecoFisico;
	}

	public void setEnderecoFisico(Pessoa enderecoFisico) {
		this.enderecoFisico = enderecoFisico;
	}
}
