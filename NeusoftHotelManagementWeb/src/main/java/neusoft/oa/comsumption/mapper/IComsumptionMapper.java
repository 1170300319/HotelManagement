package neusoft.oa.comsumption.mapper;

import org.apache.ibatis.annotations.Mapper;

import neusoft.oa.comsumption.model.ComsumptionModel;

@Mapper
public interface IComsumptionMapper {
	public void insert(ComsumptionModel cm) throws Exception;
	public void update(ComsumptionModel cm) throws Exception;
	public void delete(ComsumptionModel cm) throws Exception;
	// 获取所有消费记录
	public void selectByAll() throws Exception;
	// 使用单号获取消费记录
	public void selectByComsumptionID(ComsumptionModel cm) throws Exception;
}
