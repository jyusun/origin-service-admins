package com.jyusun.origin.admin.upms.repository.dal.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.Set;

/**
 * 作用描述： - 权限映射器
 *
 * @author jyusun at 2020/1/29 13:13
 * @since 1.0.0
 */
public interface SysAuthMapper {

    /**
     * 获取角色集合
     * @param userId 用户编号
     * @return
     */
    Set<String> findRoleByUserId(@Param("userId") Long userId);

    /**
     * 资源权限集合
     * @param roles
     * @return
     */
    Set<String> findRsrcPermissionByRoles(@Param("roles") Set<String> roles);

}
