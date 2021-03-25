package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class institute {
	private int id_institute;
	private int id_student;
	private String name_institute;
	private String reason_leaving;
	
	

}
