package com.jyusun.origin.admin.upms.interfaces.web;

import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysCompDebtDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.SysTreeQuery;
import com.jyusun.origin.admin.upms.repository.SysDebtRepository;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysDebtDO;
import com.jyusun.origin.core.common.model.page.PageObject;
import com.jyusun.origin.core.common.model.page.PageQuery;
import com.jyusun.origin.core.common.model.result.AbstractResult;
import com.jyusun.origin.core.common.model.result.ResultFactory;
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

import java.io.Serializable;

/**
 * 部门管理
 * <p>
 * 作用描述：部门管理
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "权限管理-部门管理")
@RequestMapping("debts")
@RequiredArgsConstructor
public class SysDebtController {

    private final SysDebtRepository sysDebtRepository;

    @Operation(summary = "树结构：公司部门")
    @GetMapping
    public AbstractResult<PageObject<SysCompDebtDTO>> page(PageQuery pageQuery, SysTreeQuery query) {
        return ResultFactory.data(sysDebtRepository.listCompDebtTree(pageQuery, query));
    }

    /**
     * 根据ID查询
     * @param oid {@code Serializable } 主键编号
     * @return {@link AbstractResult} 响应结果
     */
    @Operation(summary = "数据查询：主键编号")
    @GetMapping("{oid}")
    @ResponseStatus(code = HttpStatus.OK)
    public SysDebtDO findById(@PathVariable("oid") Serializable oid) {
        return this.sysDebtRepository.getById(oid);
    }

    /**
     * 删除数据
     * @param oid {@code Serializable} 主键编号
     * @return {@link AbstractResult<Boolean>} 响应结果
     */
    @Operation(summary = "数据删除：主键编号")
    @DeleteMapping("{oid}")
    @ResponseStatus(code = HttpStatus.OK)
    public Boolean removeById(@PathVariable("oid") Serializable oid) {
        return this.sysDebtRepository.removeById(oid);
    }

    /**
     * 新增数据
     * @param sysDebtDO 数据对象
     * @return {@link AbstractResult<Boolean>} 响应结果
     */
    @Operation(summary = "数据新增")
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Boolean save(@Validated @RequestBody SysDebtDO sysDebtDO) {
        return this.sysDebtRepository.save(sysDebtDO);
    }

    /**
     * 更新数据
     * <p>
     * 全量更新数据
     * </p>
     * @param sysDebtDO 数据对象
     * @return {@link AbstractResult<Boolean>} 响应结果
     */
    @Operation(summary = "数据更新：主键编号")
    @PutMapping("{oid}")
    public Boolean updateById(@PathVariable("oid") Long oid, @Validated @RequestBody SysDebtDO sysDebtDO) {
        sysDebtDO.setOid(oid);
        return this.sysDebtRepository.updateById(sysDebtDO);
    }

}
