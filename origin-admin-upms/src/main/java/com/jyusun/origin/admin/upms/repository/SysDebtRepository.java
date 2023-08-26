package com.jyusun.origin.admin.upms.repository;

import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysDebtDO;
import com.jyusun.origin.base.mybatis.CoreRepository;
import com.jyusun.origin.core.common.model.page.PageObject;
import com.jyusun.origin.core.common.model.page.PageQuery;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysCompDebtDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.SysTreeQuery;

/**
 * 作用描述：部门管理
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
public interface SysDebtRepository extends CoreRepository<SysDebtDO> {

	PageObject<SysCompDebtDTO> listCompDebtTree(PageQuery pageQuery, SysTreeQuery query);

}
