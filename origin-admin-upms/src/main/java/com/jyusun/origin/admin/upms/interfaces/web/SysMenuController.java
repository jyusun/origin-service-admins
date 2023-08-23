package com.jyusun.origin.admin.upms.interfaces.web;


import com.jyusun.origin.core.common.model.DictDTO;
import com.jyusun.origin.core.common.model.page.PageObject;
import com.jyusun.origin.core.common.model.page.PageQuery;
import com.jyusun.origin.core.common.model.result.AbstractResult;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysMenuDO;
import com.jyusun.origin.admin.upms.repository.SysMenuRepository;
import com.jyusun.origin.admin.upms.interfaces.facade.assembler.MenuToDtoAssembler;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysMenuDetailDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysMenuTreeDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.SysMenuQuery;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * 资源菜单
 * <p>
 * 作用描述：资源菜单
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "权限管理-菜单管理")
@RequestMapping("menus")
@RequiredArgsConstructor
public class SysMenuController {

    private final SysMenuRepository sysMenuRepository;
    private final MenuToDtoAssembler sysMenuToDtoAssembler;

    @Operation(summary = "分页树结构：资源菜单")
    @GetMapping
    public PageObject<SysMenuTreeDTO> pageQuery(PageQuery pageQuery, SysMenuQuery query) {
        return this.sysMenuRepository.pageTrees(pageQuery, query);
    }

    @Operation(summary = "树结构：资源菜单")
    @GetMapping("extdict")
    public List<DictDTO> qryDictMenu(SysMenuQuery query) {
        List<DictDTO> menus = this.sysMenuRepository.qryDictMenu(query);
        menus.add(new DictDTO().setDictCode("menu").setDictValue("-1").setDictDesc("顶级目录").setSort(0).setDefMark(false));
        return menus;
    }

    /**
     * 根据ID查询
     *
     * @param sid {@code Serializable } 主键编号
     * @return {@link AbstractResult} 响应结果
     */
    @Operation(summary = "数据查询：主键编号")
    @GetMapping("{sid}")
    @ResponseStatus(code = HttpStatus.OK)
    public SysMenuDetailDTO findById(@PathVariable("sid") Long sid) {
        return sysMenuToDtoAssembler.convert(Optional.ofNullable(this.sysMenuRepository.getById(sid)).orElse(new SysMenuDO()));
    }

    /**
     * 删除数据
     *
     * @param sid {@code Serializable} 主键编号
     * @return {@link Boolean>} 响应结果
     */
    @Operation(summary = "数据删除：主键编号")
    @DeleteMapping("{sid}")
    @ResponseStatus(code = HttpStatus.OK)
    public Boolean removeById(@PathVariable Long sid) {
        return this.sysMenuRepository.removeById(sid);
    }

    /**
     * 新增数据
     *
     * @param sysMenuDO 数据对象
     * @return {@link Boolean>} 响应结果
     */
    @Operation(summary = "数据新增")
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Boolean save(@Validated @RequestBody SysMenuDO sysMenuDO) {
        return this.sysMenuRepository.save(sysMenuDO);
    }

    /**
     * 更新数据
     * <p>
     * 全量更新数据
     * </p>
     *
     * @param sysMenuDO 数据对象
     * @return {@link Boolean>} 响应结果
     */
    @Operation(summary = "数据更新：主键编号")
    @PutMapping("{sid}")
    public Boolean updateById(@PathVariable("sid") Long sid, @Validated @RequestBody SysMenuDO sysMenuDO) {
        sysMenuDO.setSid(sid);
        return this.sysMenuRepository.updateById(sysMenuDO);
    }
}
