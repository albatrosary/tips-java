package org.albatrosary.bl;

import java.util.List;

import org.albatrosary.RVTBKX;
import org.albatrosary.data.mapper.RVTBKXMapper;

public class RVTBKXLogicImpl implements RVTBKXLogic {
	
	private RVTBKXMapper rvtbkxMapper;
	
	public void setRVTBKXMapper(RVTBKXMapper rvtbkxMapper) {
		this.rvtbkxMapper = rvtbkxMapper;
	}
	
	public void execute() {
		List<RVTBKX> rvtbkx = rvtbkxMapper.selectRVTBKX("тоюч");
		
		for(RVTBKX v:rvtbkx) {
			System.out.println(v.getRvkx_sei_nk());
		}
	}
}
