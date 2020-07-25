package neusoft.oa.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import neusoft.oa.form.model.FComsumptionModel;
import neusoft.oa.form.service.IFComsumptionService;
import neusoft.oa.result.Result;

@RestController
@RequestMapping(value="/Fcomsumption")
public class FComsumptionController {
	@Autowired
	private IFComsumptionService cs = null;

	@RequestMapping(value="/list/all", method=RequestMethod.GET)
	public Result<FComsumptionModel> getListByAll(FComsumptionModel cm) throws Exception{
		Result<FComsumptionModel> result = new Result<FComsumptionModel>();
		result.setList(cs.getListByAll());
		result.setStatus("OK");
		result.setMessage("获取所有消费记录");
		return result;
	}

}
