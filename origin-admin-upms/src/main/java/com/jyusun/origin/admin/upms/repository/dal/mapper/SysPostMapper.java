package com.jyusun.origin.admin.upms.repository.dal.mapper;

import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysPostDO;
import com.jyusun.origin.base.mybatis.CoreMapper;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysPostTreeDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.SysTreeQuery;

import java.util.List;

/**
 * 作用描述： - 岗位映射器
 *
 * @author jyusun at 2020/1/29 13:13
 * @since 1.0.0
 */
public interface SysPostMapper extends CoreMapper<SysPostDO> {

	/**
	 * 树查询
	 * @param query 查询参数
	 * @return {@link List <SysPostTreeDTO>}
	 */
	List<SysPostTreeDTO> listTree(SysTreeQuery query);

}
