package com.jyusun.origin.admin.upms.interfaces.web;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.jyusun.origin.base.logger.annotation.SysLogger;
import com.jyusun.origin.base.logger.common.enums.OperTypeEnum;
import com.jyusun.origin.base.mybatis.common.util.PageUtil;
import com.jyusun.origin.core.common.model.KeyParam;
import com.jyusun.origin.core.common.model.page.PageObject;
import com.jyusun.origin.core.common.model.page.PageQuery;
import com.jyusun.origin.core.common.model.result.AbstractResult;
import com.jyusun.origin.core.common.model.result.ResultFactory;
import com.jyusun.origin.core.common.util.StringUtil;
import com.jyusun.origin.core.common.util.UuidUtil;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysUserDO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.UserInfoQuery;
import com.jyusun.origin.admin.upms.repository.SysUserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户账户
 * <p>
 * 作用描述：用户账户
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "权限管理-系统用户")
@RequestMapping("users")
@RequiredArgsConstructor
public class SysUserController {

    private final SysUserRepository sysUserRepository;

    /**
     * 列表分页查询
     *
     * @param pageQuery {@link PageQuery} 分页参数查询对象
     * @param query     {@link UserInfoQuery} 查询对象
     * @return {@link AbstractResult} 响应结果
     */
    @Operation(summary = "分页查询：分页条件", method = "get")
    @GetMapping
    public AbstractResult<PageObject<SysUserDO>> pageQuery(PageQuery pageQuery, UserInfoQuery query) {
        LambdaQueryWrapper<SysUserDO> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(StringUtil.hasText(query.getUsername()), SysUserDO::getUsername,
                query.getUsername());
        wrapper.like(StringUtil.hasText(query.getNickname()), SysUserDO::getNickname,
                query.getNickname());
        return ResultFactory.data(PageUtil.dataInfo(this.sysUserRepository.page(pageQuery, wrapper)));
    }

    /**
     * 数据编辑
     *
     * @param sid {@link SysUserDO} 主键编号.
     * @return {@link AbstractResult} 响应结果
     */
    @Operation(summary = "数据查询：主键编号", method = "get")
    @GetMapping("{sid}")
    @SysLogger(operType = OperTypeEnum.DETAIL)
    public SysUserDO findById(@PathVariable("sid") Long sid) {
        return sysUserRepository.getById(sid);
    }

    /**
     * 数据新增
     *
     * @param userInfo {@link SysUserDO} 用户账户信息.
     * @return {@link AbstractResult} 响应结果
     */
    @Operation(summary = "数据编辑", method = "post")
    @PostMapping
    public Boolean save(@RequestBody SysUserDO userInfo) {
        userInfo.setPassword(UuidUtil.generateUuidStr32());
        return userInfo.insert();
    }

    /**
     * 数据编辑
     *
     * @param userInfo {@link SysUserDO} 用户账户信息.
     * @return {@link AbstractResult} 响应结果
     */
    @Operation(summary = "数据编辑", method = "put")
    @PutMapping("{sid}")
    public Boolean edit(@PathVariable Long sid, @RequestBody SysUserDO userInfo) {
        userInfo.setSid(sid);
        return userInfo.updateById();
    }

    /**
     * 数据删除
     *
     * @param keys {@link java.util.List<Long>} 主键编号集合
     * @return {@link AbstractResult} 响应结果
     */
    @Operation(summary = "数据删除：主键集合", method = "post")
    @PostMapping("rems")
    public Boolean removeById(@RequestBody KeyParam keys) {
        return sysUserRepository.removeByIds(keys.getIds());
    }

    /**
     * 数据编辑
     *
     * @param sid {@link Long} 主键编号
     * @return {@link AbstractResult} 响应结果
     */
    @Operation(summary = "数据删除：主键编号", method = "delete")
    @DeleteMapping("{sid}")
    public Boolean removeById(@PathVariable Long sid) {
        return sysUserRepository.removeById(sid);
    }

}
