package neusoft.oa.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import neusoft.oa.hr.model.DepartmentModel;


@Mapper
public interface IDepartmentMapper {
	public void insert(DepartmentModel dm) throws Exception;
	public void update(DepartmentModel dm) throws Exception;
	public void delete(DepartmentModel dm) throws Exception;

	// 获取所有部门
	public List<DepartmentModel> selectByAll() throws Exception;
	// 由No取得指定部门
	public DepartmentModel selectByNo(int no) throws Exception;
	// 取所有部门
	public List<DepartmentModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	// 取部门个数
	public int selectCountByAll() throws Exception;

}
