package neusoft.oa.form.service;

import java.util.List;

import neusoft.oa.form.model.ComsumptionModel;


public interface IComsumptionService {
	public List<ComsumptionModel> getListByAll() throws Exception;
}
