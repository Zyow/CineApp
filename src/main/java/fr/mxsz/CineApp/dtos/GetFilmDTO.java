package fr.mxsz.CineApp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetFilmDTO {
	
	private String id;
	private String nom;
	private Float duree;
}
