package br.com.agenda.aplicacao;
import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

//MVC
/*
 * Model
 * View
 * Controller
 */

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();

		Contato contato = new Contato();
		contato.setNome("Ryan Lima");
		contato.setIdade(16);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		//Atualizar o contato
		Contato c1 = new Contato();
		c1.setNome("Ryan dos Santos de Lima up");
		c1.setIdade(19);
		c1.setDataCadastro(new Date());
		c1.setId(1); // � o n�mero que est� no banco de dados da PK
		
		//contatoDao.update(c1);
		
		//Deletar o contato pelo seu n�mero de ID
		contatoDao.deleteById(3);
		
		//Visualiza��o dos registros do banco de dados TODOS
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: "+c.getNome());
		}
	}

}