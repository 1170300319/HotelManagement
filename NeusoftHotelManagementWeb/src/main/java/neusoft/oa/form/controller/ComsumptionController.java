package neusoft.oa.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import neusoft.oa.form.model.ComsumptionModel;
import neusoft.oa.form.service.IComsumptionService;
import neusoft.oa.result.Result;

@RestController
@RequestMapping(value="/Fcomsumption")
public class ComsumptionController {
	@Autowired
	private IComsumptionService cs = null;

	@RequestMapping(value="/list/all", method=RequestMethod.GET)
	public Result<ComsumptionModel> getListByAll(ComsumptionModel cm) throws Exception{
		Result<ComsumptionModel> result = new Result<ComsumptionModel>();
		result.setList(cs.getListByAll());
		result.setStatus("OK");
		result.setMessage("获取所有消费记录");
		return result;
	}

}
