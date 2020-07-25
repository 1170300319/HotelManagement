package neusoft.oa.form.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import neusoft.oa.form.mapper.IComsumptionMapper;
import neusoft.oa.form.model.ComsumptionModel;
import neusoft.oa.form.service.IComsumptionService;


@Service("FcomsumptionService")
@Transactional // 环绕事务
public class ComsumptionServiceImpl implements IComsumptionService{

	@Autowired
	private IComsumptionMapper comsumptionMapper = null;


	@Override
	public List<ComsumptionModel> getListByAll() throws Exception {
		return comsumptionMapper.selectByAll();
	}
}
