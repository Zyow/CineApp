package fr.mxsz.CineApp.entities;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Seance {

	@Id
	private String id;
	private Date date;
	
	@DBRef
	private Film film;
	@DBRef
	private Salle salle;
}
