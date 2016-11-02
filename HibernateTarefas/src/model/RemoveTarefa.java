package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveTarefa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
	    EntityManager manager = factory.createEntityManager();
	    
		Tarefa encontrada = manager.find(Tarefa.class, 2L);

		manager.getTransaction().begin();
		manager.remove(encontrada);
		manager.getTransaction().commit();
	}	

}
