
package neusoft.oa.form.service;

import java.util.List;

import neusoft.oa.form.model.CheckInModel;

public interface ICheckInService {
	public List<CheckInModel> getListByAll() throws Exception;
}