package model;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AtualizarTarefa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tarefa tarefa = new Tarefa();
		tarefa.setId(1L); //esse id já existe no banco
		tarefa.setDescricao("Estudar JPA e Hibernate atualizado!");
		tarefa.setFinalizado(false);
		tarefa.setDataFinalizacao(Calendar.getInstance());

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
	    EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.merge(tarefa);
		manager.getTransaction().commit();
	}

}
