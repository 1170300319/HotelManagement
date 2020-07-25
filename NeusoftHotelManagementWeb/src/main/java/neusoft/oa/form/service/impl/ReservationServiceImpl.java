package neusoft.oa.form.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import neusoft.oa.form.mapper.IReservationMapper;
import neusoft.oa.form.model.ReservationModel;
import neusoft.oa.form.service.IReservationService;


@Service("FreservationService")
@Transactional // 环绕事务
public class ReservationServiceImpl implements IReservationService{

	@Autowired
	private IReservationMapper reservationMapper = null;


	@Override
	public List<ReservationModel> getListByAll() throws Exception {
		return reservationMapper.selectByAll();
	}
}
