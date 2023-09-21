package com.jyusun.origin.admin.comm.interfaces.web;

import com.jyusun.origin.admin.comm.interfaces.model.dto.DistrictTreeDTO;
import com.jyusun.origin.admin.comm.interfaces.model.qry.SysDistrictQuery;
import com.jyusun.origin.admin.comm.repository.SysDistrictRepository;
import com.jyusun.origin.admin.comm.repository.dal.dataobj.SysDistrictDO;
import com.jyusun.origin.core.common.model.page.PageObject;
import com.jyusun.origin.core.common.model.page.PageQuery;
import com.jyusun.origin.core.common.model.result.AbstractResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
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
 * 行政区域
 * <p>
 * 作用描述：民政部行政区管理
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "基础信息-行政区域")
@RequestMapping("districts")
@RequiredArgsConstructor
public class SysDistrictController {

    private final SysDistrictRepository sysDistrictRepository;

    @Operation(summary = "树结构：", method = "get")
    @GetMapping
    public PageObject<DistrictTreeDTO> queryTabTrees(PageQuery pageQuery, SysDistrictQuery query) {
        return this.sysDistrictRepository.pageTrees(pageQuery, query);
    }

    /**
     * 根据ID查询
     * @param oid {@code Serializable } 主键编号
     * @return {@link AbstractResult} 响应结果
     */
    @Operation(summary = " 数据查询：主键编号", method = "get")
    @Parameter(name = "oid", description = "主键编号", in = ParameterIn.PATH)
    @GetMapping("{oid}")
    @ResponseStatus(code = HttpStatus.OK)
    public SysDistrictDO findById(@PathVariable("oid") Serializable oid) {
        return this.sysDistrictRepository.getById(oid);
    }

    /**
     * 删除数据
     * @param oid {@code Serializable} 主键编号
     * @return {@link AbstractResult<Boolean>} 响应结果
     */
    @Operation(summary = "数据删除：主键编号", method = "get")
    @Parameter(name = "oid", description = "主键编号", in = ParameterIn.PATH)
    @DeleteMapping("{oid}")
    @ResponseStatus(code = HttpStatus.OK)
    public Boolean removeById(@PathVariable Serializable oid) {
        return this.sysDistrictRepository.removeById(oid);
    }

    /**
     * 新增数据
     * @param sysDistrictDO 数据对象
     * @return {@link AbstractResult<Boolean>} 响应结果
     */
    @Operation(summary = "数据新增", method = "post")
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Boolean save(@Validated @RequestBody SysDistrictDO sysDistrictDO) {
        return this.sysDistrictRepository.save(sysDistrictDO);
    }

    /**
     * 更新数据
     * <p>
     * 全量更新数据
     * </p>
     * @param sysDistrictDO 数据对象
     * @return {@link AbstractResult<Boolean>} 响应结果
     */
    @Operation(summary = "数据更新：主键编号", method = "put")
    @Parameter(name = "oid", description = "主键编号", in = ParameterIn.PATH)
    @PutMapping("{oid}")
    public Boolean updateById(@PathVariable("oid") Long oid, @Validated @RequestBody SysDistrictDO sysDistrictDO) {
        sysDistrictDO.setOid(oid);
        return this.sysDistrictRepository.updateById(sysDistrictDO);
    }

}
