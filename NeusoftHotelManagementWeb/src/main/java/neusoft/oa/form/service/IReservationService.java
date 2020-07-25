
package neusoft.oa.form.service;

import java.util.List;

import neusoft.oa.form.model.ReservationModel;

public interface IReservationService {
	public List<ReservationModel> getListByAll() throws Exception;
}