package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarregaTarefa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
	    EntityManager manager = factory.createEntityManager();

	    Tarefa encontrada = manager.find(Tarefa.class, 1L);
	    System.out.println(encontrada.getDescricao());    

	    manager.close();
	}

}
