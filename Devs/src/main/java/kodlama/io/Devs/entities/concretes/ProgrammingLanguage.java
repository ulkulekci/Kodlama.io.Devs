package kodlama.io.Devs.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="languages")
@Builder
public class ProgrammingLanguage {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)	
	  private int id;
	  private String name;
	  
	  @OneToMany(mappedBy = "programmingLanguage", fetch = FetchType.EAGER)
	    @JsonIgnore
	    private List<Technology> technologies;
}
