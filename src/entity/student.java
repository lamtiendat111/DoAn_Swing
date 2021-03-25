package entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class student {
	private int id_student;
	private String name;
	private String dia_chi;
	private String sdt;
	private String email;
	private Date ngay_sinh;
	private int id_admission;
	private String urf_image;
}
