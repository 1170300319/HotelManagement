package neusoft.oa.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import neusoft.oa.hr.mapper.IDepartmentMapper;
import neusoft.oa.hr.model.DepartmentModel;
import neusoft.oa.hr.service.IDepartmentService;


@Service("departmentServiceSM")
@Transactional // 环绕事务
public class DepartmentServiceImpl implements IDepartmentService{

	@Autowired
	private IDepartmentMapper departmentMapper = null;
	
	@Override
	public void add(DepartmentModel dm) throws Exception {
		departmentMapper.insert(dm);		
	}

	@Override
	public void modify(DepartmentModel dm) throws Exception {
		departmentMapper.update(dm);		
	}

	@Override
	public void delete(DepartmentModel dm) throws Exception {
		departmentMapper.delete(dm);		
	}

	@Override
	public List<DepartmentModel> getByAll() throws Exception {
		return departmentMapper.selectByAll();
	}

	@Override
	public List<DepartmentModel> getByAllWithPage(int rows, int page) throws Exception {
		return departmentMapper.selectByAllWithPage(rows, page);
	}

	@Override
	public int getCountByAll() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPageCountByAll(int rows) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DepartmentModel getByNo(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
