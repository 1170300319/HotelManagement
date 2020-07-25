package neusoft.oa.form.service;

import java.util.List;

import neusoft.oa.form.model.CheckOutModel;

public interface ICheckOutService {
	public List<CheckOutModel> getListByAll() throws Exception;
}
