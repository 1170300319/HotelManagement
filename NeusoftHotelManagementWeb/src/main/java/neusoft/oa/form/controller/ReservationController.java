package neusoft.oa.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import neusoft.oa.form.model.ReservationModel;
import neusoft.oa.form.service.IReservationService;
import neusoft.oa.result.Result;

@RestController
@RequestMapping(value="/Freservation")
public class ReservationController {
	@Autowired
	private IReservationService rs = null;

	@RequestMapping(value="/list/all", method=RequestMethod.GET)
	public Result<ReservationModel> getListByAll(ReservationModel cm) throws Exception{
		Result<ReservationModel> result = new Result<ReservationModel>();
		result.setList(rs.getListByAll());
		result.setStatus("OK");
		result.setMessage("获取所有预定记录");
		return result;
	}

}
