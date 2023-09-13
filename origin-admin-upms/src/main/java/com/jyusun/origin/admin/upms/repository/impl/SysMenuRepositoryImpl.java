package com.jyusun.origin.admin.upms.repository.impl;

import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import com.jyusun.origin.base.mybatis.common.util.ConditionUtil;
import com.jyusun.origin.base.mybatis.common.util.PageUtil;
import com.jyusun.origin.core.common.model.DictDTO;
import com.jyusun.origin.core.common.model.page.PageObject;
import com.jyusun.origin.core.common.model.page.PageQuery;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysMenuDO;
import com.jyusun.origin.admin.upms.repository.SysMenuRepository;
import com.jyusun.origin.admin.upms.repository.dal.mapper.SysMenuMapper;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysMenuTreeDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.SysMenuQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作用描述： 菜单管理仓储服务
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysMenuRepositoryImpl extends CoreRepositoryImpl<SysMenuMapper, SysMenuDO> implements SysMenuRepository {

    @Override
    public PageObject<SysMenuTreeDTO> pageTrees(PageQuery pageQuery, SysMenuQuery query) {
        return PageUtil.dataInfo(this.baseMapper.pageTrees(ConditionUtil.pageInfo(pageQuery), query));
    }

    /**
     * 菜单树
     * @return
     */
    @Override
    public List<DictDTO> qryDictMenu(SysMenuQuery query) {
        return this.baseMapper.listDictMenu(query);
    }

}
