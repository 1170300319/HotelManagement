
package neusoft.oa.form.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import neusoft.oa.form.mapper.ICheckOutMapper;
import neusoft.oa.form.model.CheckOutModel;
import neusoft.oa.form.service.ICheckOutService;


@Service("FcheckOutService")
@Transactional // 环绕事务
public class CheckOutServiceImpl implements ICheckOutService{

	@Autowired
	private ICheckOutMapper checkOutMapper = null;


	@Override
	public List<CheckOutModel> getListByAll() throws Exception {
		return checkOutMapper.selectByAll();
	}
}