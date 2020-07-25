package neusoft.oa.form.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import neusoft.oa.form.mapper.IFComsumptionMapper;
import neusoft.oa.form.model.FComsumptionModel;
import neusoft.oa.form.service.IFComsumptionService;


@Service("FcomsumptionService")
@Transactional // 环绕事务
public class FComsumptionServiceImpl implements IFComsumptionService{

	@Autowired
	private IFComsumptionMapper comsumptionMapper = null;


	@Override
	public List<FComsumptionModel> getListByAll() throws Exception {
		return comsumptionMapper.selectByAll();
	}
}
