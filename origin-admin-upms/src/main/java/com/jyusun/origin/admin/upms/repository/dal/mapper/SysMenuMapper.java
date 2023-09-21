package com.jyusun.origin.admin.upms.repository.dal.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysMenuTreeDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.SysMenuQuery;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysMenuDO;
import com.jyusun.origin.base.mybatis.CoreMapper;
import com.jyusun.origin.core.common.model.DictDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 作用描述： - 菜单管理映射器
 *
 * @author jyusun at 2020/1/29 13:13
 * @since 1.0.0
 */
public interface SysMenuMapper extends CoreMapper<SysMenuDO> {

    /**
     * 树查询
     * @param query 查询参数
     * @return {@link List <SysMenuDTO>}
     */
    Page<SysMenuTreeDTO> pageTrees(@Param("page") Page<SysMenuTreeDTO> page, @Param("query") SysMenuQuery query);

    /**
     * 菜单树
     * @return
     */
    List<DictDTO> listDictMenu(@Param("query") SysMenuQuery query);

}
