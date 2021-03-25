package entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class staff {
	private int id_staff;
	private String name;
	private String dia_chi;
	private int sdt;
	private String email;
	private Date ngay_sinh;
	private String mo_ta_nhan_vien;
	private int id_education;
	private int id_experience;
	private String urf_image;
	
	


}
