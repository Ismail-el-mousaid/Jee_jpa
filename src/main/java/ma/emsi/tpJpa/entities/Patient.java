package ma.emsi.tpJpa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name = "PATIENTS")

@Data  // automatiquent lombock va générer getter et setter
@NoArgsConstructor // constructeur sas parametre
@AllArgsConstructor // constructeur avec les parametres
@ToString // générer méthode toString()
public class Patient {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NOM", length = 25)
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date datNaissance;
	private int score;
	private boolean malade;
	

}
