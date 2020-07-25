package neusoft.oa.form.service;

import java.util.List;

import neusoft.oa.form.model.FComsumptionModel;


public interface IFComsumptionService {
	public List<FComsumptionModel> getListByAll() throws Exception;
}
