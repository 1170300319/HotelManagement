package neusoft.oa.hr.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("Department")
public class DepartmentModel implements Serializable {
	// 表属性私有前两个字母小写
	private int no = 0;
	private String code = null;
	private String name = null;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
