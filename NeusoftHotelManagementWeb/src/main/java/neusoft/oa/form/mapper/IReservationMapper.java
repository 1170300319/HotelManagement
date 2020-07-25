package neusoft.oa.form.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import neusoft.oa.form.model.ReservationModel;

@Mapper
public interface IReservationMapper {
	// 查询所有记录
	public List<ReservationModel> selectByAll() throws Exception;
}
