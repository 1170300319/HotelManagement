package neusoft.oa.comsumption.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import neusoft.oa.comsumption.model.ComsumptionModel;
import neusoft.oa.comsumption.service.IComsumptionService;
import neusoft.oa.result.Result;

@RestController
@RequestMapping(value="/comsumption")
public class ComsumptionController {
	@Autowired
	private IComsumptionService cs = null;

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Result<String> add(@RequestBody ComsumptionModel cm) throws Exception{
		cs.add(cm);
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加消费记录成功");
		return result;
	}

	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public Result<String> modify(@RequestBody ComsumptionModel cm) throws Exception{
		cs.modify(cm);
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改修改消费记录成功");
		return result;
	}

	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public Result<String> delete(@RequestBody ComsumptionModel cm) throws Exception{
		cs.delete(cm);
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除消费记录成功");
		return result;
	}

	@RequestMapping(value="/list/all", method=RequestMethod.GET)
	public Result<ComsumptionModel> getListByAll(ComsumptionModel cm) throws Exception{
		Result<ComsumptionModel> result = new Result<ComsumptionModel>();
		result.setList(cs.getListByAll());
		result.setStatus("OK");
		result.setMessage("获取所有消费记录");
		return result;
	}

	@RequestMapping(value="/get", method=RequestMethod.GET)
	public Result<ComsumptionModel> getListByAllWithComsumpID(@RequestParam(required=true)int id) throws Exception{
		Result<ComsumptionModel> result = new Result<ComsumptionModel>();
		try {
			result.setResult(cs.getListByAllWithComsumpID(id));
		}catch (Exception e) {
			e.printStackTrace();
		}
		result.setStatus("OK");
		result.setMessage("按单号获取消费记录");
		return result;
	}

}
