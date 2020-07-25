
package neusoft.oa.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import neusoft.oa.form.model.CheckOutModel;
import neusoft.oa.form.service.ICheckOutService;
import neusoft.oa.result.Result;

@RestController
@RequestMapping(value="/Fcheckout")
public class CheckOutController {
	@Autowired
	private ICheckOutService cs = null;

	@RequestMapping(value="/list/all", method=RequestMethod.GET)
	public Result<CheckOutModel> getListByAll(CheckOutModel cm) throws Exception{
		Result<CheckOutModel> result = new Result<CheckOutModel>();
		result.setList(cs.getListByAll());
		result.setStatus("OK");
		result.setMessage("获取所有退房记录");
		return result;
	}

}