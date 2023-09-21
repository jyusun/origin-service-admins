package com.jyusun.origin.admin.upms.repository.impl;

import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysCompDebtDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.SysTreeQuery;
import com.jyusun.origin.admin.upms.repository.SysDebtRepository;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysDebtDO;
import com.jyusun.origin.admin.upms.repository.dal.mapper.SysDebtMapper;
import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import com.jyusun.origin.base.mybatis.common.util.ConditionUtil;
import com.jyusun.origin.base.mybatis.common.util.PageUtil;
import com.jyusun.origin.core.common.model.page.PageObject;
import com.jyusun.origin.core.common.model.page.PageQuery;
import org.springframework.stereotype.Repository;

/**
 * 作用描述： 角色管理仓储服务
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysDebtRepositoryImpl extends CoreRepositoryImpl<SysDebtMapper, SysDebtDO> implements SysDebtRepository {

    @Override
    public PageObject<SysCompDebtDTO> listCompDebtTree(PageQuery pageQuery, SysTreeQuery query) {
        return PageUtil.dataInfo(this.baseMapper.pageTrees(ConditionUtil.pageInfo(pageQuery), query));
    }

}
