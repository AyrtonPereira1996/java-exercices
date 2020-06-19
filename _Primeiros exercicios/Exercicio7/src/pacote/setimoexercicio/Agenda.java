package pacote.setimoexercicio;

import java.util.Scanner;

public class Agenda implements metodosContatos {
	Contacto[] vetorContacto = new Contacto[5];
	Contacto contacto = new Contacto();
	private Scanner entrada = new Scanner(System.in);
	String resp;

	@Override
	public void addContact() {
		String auxiNome = "", auxiEmail = "";

		for (int cont = 0; cont < vetorContacto.length; cont++) {
			vetorContacto[cont] = contacto;

			System.out.print("Insira o nome do contacto na posição " + cont + " : ");
			auxiNome = entrada.next();
			vetorContacto[cont].setNome(auxiNome);

			System.out.print("Insira o e-mail do contacto " + cont + " : ");
			auxiEmail = entrada.next();
			vetorContacto[cont].setEmail(auxiEmail);

			System.out.println("\nQuer adicionar mais algum contacto?");
			resp = entrada.next();
			
			if (resp.equalsIgnoreCase("n")) {
				System.out.println("\nFaltam mais " + (vetorContacto.length - (cont + 1)) + " posições do vetor");
				break;
			}
			
			if (vetorContacto[4] != null) {
				System.out.println("Não é possivel adicionar mais contactos porque o vetor apenas tem " + vetorContacto.length + " posições");
				break;
				
			}
			
			
		}
		
	}

	/* Metodo da interface que ira returnar */
	@Override
	public Contacto returnContact(String nomeContacto) {
		Contacto auxiContacto = new Contacto();

		for (int cont = 0; cont < vetorContacto.length; cont++) {
			vetorContacto[cont] = contacto;
			if (vetorContacto[cont].getNome().equalsIgnoreCase(nomeContacto)) {
				auxiContacto.setNome(vetorContacto[cont].getNome());
				auxiContacto.setEmail(vetorContacto[cont].getEmail());

			} else {
				auxiContacto.setNome("Não foi encontrado nenhum nome");
				auxiContacto.setEmail("Não foi encontrado nenhum email");
			}

		}
		return auxiContacto;

	}

	/* Metodo que ira excluir um contacto */
	@Override
	public Contacto deleteContact(String nomeContacto) {
		for (int cont = 0; cont < vetorContacto.length; cont++) {
//			vetorContacto[cont] = new Contacto();
			if (vetorContacto[cont].getNome().equals(nomeContacto)) {
				vetorContacto[cont].setEmail(null);
				vetorContacto[cont].setNome(null);
				System.out.println("Contacto excluido com sucesso!");
				break;
			} else if (vetorContacto[cont].getNome() == null) {
				System.out.println("O contacto nao existe");
			}
		}
		
		return contacto;
	}

	/* Metodo que controla as funcionalidades de inserir, retornar e excluir */
	@SuppressWarnings("resource")
	public void main() {
		Contacto contacto = new Contacto();
		Scanner input = new Scanner(System.in);
		String resp;
		boolean fim = false;

		while (!fim) {
			System.out.println("-------- 7º Ultimo exercicio --------\n");
			System.out.println("Escolha uma das opções");
			System.out.println("A. Adicionar contactos (Obrigatorio caso não tenha adicionado)");
			System.out.println("B. Procurar contacto por nome (Apenas se já tiver adicionado algum contacto)");
			System.out.println("C. Excluir contacto (Apenas se já tiver adicionado algum contacto)");

			resp = input.next();
			boolean sair = false;

			while (!sair) {
				switch (resp) {
				case "a":
				case "A":
					addContact();
					sair = true;
					break;

				case "b":
				case "B":
					boolean pararRepeticao = false;
					while (!pararRepeticao) {
						System.out.println("Qual o nome do contacto que pretende retornar?");
						String auxi = input.next();
						contacto = returnContact(auxi);
						System.out.print("Nome do contacto: " + contacto.getNome() + "\nEmail do contacto: "
								+ contacto.getEmail() + "\n");

						System.out.println("Deseja repetir a pesquisa?S-(Sim) ou N-(Não)");
						auxi = "";
						auxi = input.next();
						switch (auxi) {
						case "s":
						case "S":
							pararRepeticao = false;
							break;
						case "N":
						case "n":
							pararRepeticao = true;
							sair = true;
							break;
						default:
							System.out.println("Resposta invalida");
							pararRepeticao = true;
							sair = true;
							break;
						}
					}
					break;

				case "c":
				case "C":
					boolean pararRep = false;
					while (!pararRep) {
						System.out.println("Qual o contacto que pretende excluir? Digite o nome");
						String auxiExclusao = input.next();
						deleteContact(auxiExclusao);

						System.out.println("Pretende excluir mais algum contacto?");
						auxiExclusao = entrada.next();
						switch (auxiExclusao) {
						case "S":
						case "s":
							pararRep = false;
							break;

						case "N":
						case "n":
							pararRep = true;
							sair = true;
							break;

						default:
							System.out.println("Resposta invalida");
							pararRep = true;
							break;
						}

					}
					break;

				default:
					System.out.println("Resposta não é válida");
					break;
				}
			}

		}
	}

}
