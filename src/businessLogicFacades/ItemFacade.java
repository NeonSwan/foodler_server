package businessLogicFacades;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.ItemBean;

import com.google.gson.Gson;

public class ItemFacade {
	private static final String PERSISTENCE_UNIT_NAME = "punit";

	private static final Gson GSON = new Gson();

	public static void createItem(String subjectID) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		ItemBean subjectBean = new ItemBean();
		subjectBean.setItemName(subjectID);
		em.persist(subjectBean);
		em.getTransaction().commit();

		em.close();
	}

	public static String getItemBySearchQuery(String query) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		Query q = em.createQuery("SELECT * FROM ItemBean WHERE ItemBean LIKE "
				+ query + ";");
		List<ItemBean> subjectList = q.getResultList();
		return GSON.toJson(subjectList);
	}

	public static void deleteItem(String subject) {

	}

	public static String getAllItems() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		Query q = em.createQuery("SELECT * FROM ItemBean;");
		List<ItemBean> subjectList = q.getResultList();
		return GSON.toJson(subjectList);
	}

}
