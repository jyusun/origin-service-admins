package com.jyusun.origin.admin.upms.repository;

import java.util.Set;

/**
 * 作用描述：权限
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
public interface SysAuthRepository {

    Set<String> findRoleByUserId(Long oid);

    Set<String> findRsrcPermissionByRoles(Set<String> roles);

}
