
package neusoft.oa.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import neusoft.oa.form.model.CheckInModel;
import neusoft.oa.form.service.ICheckInService;
import neusoft.oa.result.Result;

@RestController
@RequestMapping(value="/Fcheckin")
public class CheckInController {
	
	@Autowired
	private ICheckInService cs = null;

	@RequestMapping(value="/list/all", method=RequestMethod.GET)
	public Result<CheckInModel> getListByAll(CheckInModel cm) throws Exception{
		Result<CheckInModel> result = new Result<CheckInModel>();
		result.setList(cs.getListByAll());
		result.setStatus("OK");
		result.setMessage("获取所有入住记录");
		return result;
	}


}