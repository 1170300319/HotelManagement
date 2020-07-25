package neusoft.oa.form.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import neusoft.oa.form.model.CheckInModel;

@Mapper
public interface ICheckInMapper {
	// 查询所有记录
	public List<CheckInModel> selectByAll() throws Exception;

}
