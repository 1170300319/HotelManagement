package neusoft.oa.form.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import neusoft.oa.form.model.ComsumptionModel;


@Mapper
public interface IFComsumptionMapper {
	// 查询所有记录
	public List<ComsumptionModel> selectByAll() throws Exception;
}
