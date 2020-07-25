package neusoft.oa.comsumption.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import neusoft.oa.comsumption.mapper.IComsumptionMapper;
import neusoft.oa.comsumption.model.ComsumptionModel;
import neusoft.oa.comsumption.service.IComsumptionService;


@Service("comsumptionService")
@Transactional // 环绕事务
public class ComsumptionServiceImpl implements IComsumptionService{

	@Autowired
	private IComsumptionMapper comsumptionMapper = null;


	@Override
	public void add(ComsumptionModel cm) throws Exception {
		comsumptionMapper.insert(cm);
	}

	@Override
	public void modify(ComsumptionModel cm) throws Exception {
		comsumptionMapper.update(cm);
	}

	@Override
	public void delete(ComsumptionModel cm) throws Exception {
		comsumptionMapper.delete(cm);		
	}

	@Override
	public List<ComsumptionModel> getListByAll() throws Exception {
		return comsumptionMapper.selectByAll();
	}

	@Override
	public ComsumptionModel getListByAllWithComsumpID(int id) throws Exception {
		return comsumptionMapper.selectByComsumptionID(id);
	}

}
