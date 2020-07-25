package neusoft.oa.form.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import neusoft.oa.form.model.CheckOutModel;

@Mapper
public interface ICheckOutMapper {
	// 查询所有记录
	public List<CheckOutModel> selectByAll() throws Exception;

}
