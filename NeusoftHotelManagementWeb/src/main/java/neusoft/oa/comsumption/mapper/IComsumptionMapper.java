package neusoft.oa.comsumption.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import neusoft.oa.comsumption.model.ComsumptionModel;

@Mapper
public interface IComsumptionMapper {
	public void insert(ComsumptionModel cm) throws Exception;
	public void update(ComsumptionModel cm) throws Exception;
	public void delete(ComsumptionModel cm) throws Exception;
	// 获取所有消费记录
	public List<ComsumptionModel> selectByAll() throws Exception;
	// 使用单号获取消费记录
	public ComsumptionModel selectByComsumptionID(int id) throws Exception;
}
