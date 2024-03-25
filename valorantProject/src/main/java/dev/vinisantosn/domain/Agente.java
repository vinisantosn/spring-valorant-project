package dev.vinisantosn.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author vinisantosn
 * */

@Entity
@Table(name= "TBL_AGENTE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Agente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="NOME", nullable=false,length= 50)
    private String nome;
	@Column(name="PAPEL", nullable=false,length= 50)
    private String papel;
	@Column(name="SAUDE", nullable=false)
    private int saude;
	@Column(name="ARMADURA", nullable=false)
    private int armadura;
	@Column(name="ULTIMATE", nullable=false,length= 50)
    private String ultimate;
//	public static AgenteBuilder builder() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}