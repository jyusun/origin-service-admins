package com.jyusun.origin.admin.upms.repository;


import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysMenuDO;
import com.jyusun.origin.base.mybatis.CoreRepository;
import com.jyusun.origin.core.common.model.DictDTO;
import com.jyusun.origin.core.common.model.page.PageObject;
import com.jyusun.origin.core.common.model.page.PageQuery;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysMenuTreeDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.SysMenuQuery;

import java.util.List;

/**
 * 作用描述：菜单管理
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
public interface SysMenuRepository extends CoreRepository<SysMenuDO> {

    PageObject<SysMenuTreeDTO> pageTrees(PageQuery pageQuery, SysMenuQuery query);

    /**
     * 菜单树
     *
     * @return
     */
    List<DictDTO> qryDictMenu(SysMenuQuery query);

}
