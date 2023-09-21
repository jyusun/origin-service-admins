package com.jyusun.origin.admin.upms.repository.dal.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysCompDebtDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.SysTreeQuery;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysDebtDO;
import com.jyusun.origin.base.mybatis.CoreMapper;
import org.apache.ibatis.annotations.Param;

/**
 * 作用描述： - 部门映射器
 *
 * @author jyusun at 2020/1/29 13:13
 * @since 1.0.0
 */
public interface SysDebtMapper extends CoreMapper<SysDebtDO> {

    Page<SysCompDebtDTO> pageTrees(@Param("page") Page<SysCompDebtDTO> page, @Param("query") SysTreeQuery query);

}
