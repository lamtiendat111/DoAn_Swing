package entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class family {
	private int id_family;
	private String name	;
	private String sdt	;
	private Date nam_sinh;	
	private String dia_chi	;
	private int id_student	;
	private int id_staff;
}
