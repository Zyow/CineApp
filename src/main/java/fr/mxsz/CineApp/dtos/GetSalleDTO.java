package fr.mxsz.CineApp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetSalleDTO {

	private String id;
	private Integer numero;
	private Integer nbrPlaces;
}
