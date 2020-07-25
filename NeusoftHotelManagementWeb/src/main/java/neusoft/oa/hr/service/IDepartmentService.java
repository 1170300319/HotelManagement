package neusoft.oa.hr.service;

import java.util.List;

import neusoft.oa.hr.model.DepartmentModel;


// 部门的业务接口
public interface IDepartmentService {
	public void add(DepartmentModel dm) throws Exception;
	public void modify(DepartmentModel dm) throws Exception;
	public void delete(DepartmentModel dm) throws Exception;
	public List<DepartmentModel> getByAll() throws Exception;
	public List<DepartmentModel> getByAllWithPage(int rows, int page) throws Exception;
	public int getCountByAll() throws Exception;
	public int getPageCountByAll(int rows) throws Exception;
	public DepartmentModel getByNo(int no) throws Exception;
}
