package session;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entite.Livre;

@Stateless
public class GestionLivres implements GestionLivresRemote {
@PersistenceContext(unitName="MonEntiteEJB3")
private EntityManager em;
public GestionLivres() {
}
@Override
public void ajouterLivre(Livre livre) {
em.persist(livre);
}
@Override
public List<Livre> listerTousLesLivres() {
return em.createQuery("select l from Livre l").getResultList();
}
}