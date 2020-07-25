package neusoft.oa.form.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import neusoft.oa.form.mapper.ICheckInMapper;
import neusoft.oa.form.model.CheckInModel;
import neusoft.oa.form.service.ICheckInService;


@Service("FcheckInService")
@Transactional // 环绕事务
public class CheckInServiceImpl implements ICheckInService{

	@Autowired
	private ICheckInMapper checkInMapper = null;


	@Override
	public List<CheckInModel> getListByAll() throws Exception {
		return checkInMapper.selectByAll();
	}
}
