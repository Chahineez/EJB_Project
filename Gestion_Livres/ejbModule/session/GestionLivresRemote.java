package session;
import java.util.List;

import javax.ejb.Remote;

import entite.Livre;

@Remote
public interface GestionLivresRemote {
void ajouterLivre(Livre livre);
List<Livre> listerTousLesLivres();
}