package fr.mxsz.CineApp.dtos;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import fr.mxsz.CineApp.entities.Film;
import fr.mxsz.CineApp.entities.Salle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class GetSeanceDTO {

	private String id;
	private Date date;
	
	@DBRef
	private Film film;
	@DBRef
	private Salle salle;
}
