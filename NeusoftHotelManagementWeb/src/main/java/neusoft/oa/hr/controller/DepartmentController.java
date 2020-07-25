package neusoft.oa.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import neusoft.oa.hr.model.DepartmentModel;
import neusoft.oa.hr.service.IDepartmentService;
import neusoft.oa.result.Result;



@RestController
@RequestMapping(value="/department")
public class DepartmentController {

	
	@Autowired
	private IDepartmentService ds = null;

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Result<String> add(DepartmentModel dm) throws Exception{
		ds.add(dm);
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加部门成功");
		return result;
	}

	@RequestMapping(value="/modefy", method=RequestMethod.POST)
	public Result<String> modefy(DepartmentModel dm) throws Exception{
		ds.modify(dm);
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改部门成功");
		return result;
	}

	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public Result<String> delete(DepartmentModel dm) throws Exception{
		ds.delete(dm);
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除部门成功");
		return result;
	}

	@RequestMapping(value="/list/all/page", method=RequestMethod.GET)
	public Result<DepartmentModel> getListByAllWithPage(@RequestParam(required=false, defaultValue="10") int rows,
			@RequestParam(required=false, defaultValue="1")int page) throws Exception{
		Result<DepartmentModel> result = new Result<DepartmentModel>();
		result.setCount(ds.getCountByAll());
		result.setPageCount(ds.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPages(page);
		result.setList(ds.getByAllWithPage(rows, page));
		result.setStatus("OK");
		result.setMessage("取部门分页");
		return result;
	}

	@RequestMapping(value="/get", method=RequestMethod.GET)
	public Result<DepartmentModel> getByNo(@RequestParam(required=true)int no){
		Result<DepartmentModel> result = new Result<DepartmentModel>();
		try {
			result.setResult(ds.getByNo(no));
		} catch (Exception e) {
			e.printStackTrace();
		}
		result.setStatus("OK");
		result.setMessage("取ByNo");
		return result;
	}

}
