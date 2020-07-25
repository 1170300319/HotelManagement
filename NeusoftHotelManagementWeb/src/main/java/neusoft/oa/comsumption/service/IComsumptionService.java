package neusoft.oa.comsumption.service;

import java.util.List;

import neusoft.oa.comsumption.model.ComsumptionModel;

public interface IComsumptionService {
	public void add(ComsumptionModel cm) throws Exception;
	public void modify(ComsumptionModel cm) throws Exception;
	public void delete(ComsumptionModel cm) throws Exception;
	public List<ComsumptionModel> getListByAll() throws Exception;
	public ComsumptionModel getListByAllWithComsumpID(int id) throws Exception;
}
