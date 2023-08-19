package com.jyusun.origin.admin.upms.repository.impl;


import com.google.common.collect.Sets;
import com.jyusun.origin.core.common.util.CollectionUtil;
import com.jyusun.origin.core.common.util.ObjectUtil;
import com.jyusun.origin.admin.upms.repository.SysAuthRepository;
import com.jyusun.origin.admin.upms.repository.dal.mapper.SysAuthMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * 作用描述：鉴权
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
@Transactional
@RequiredArgsConstructor
public class SysAuthRepositoryImpl implements SysAuthRepository {

    private final SysAuthMapper sysAuthMapper;

    @Override
    public Set<String> findRoleByUserId(Long sid) {
        if (ObjectUtil.isEmpty(sid) || 0L == sid) {
            return Sets.newHashSet();
        }
        return sysAuthMapper.findRoleByUserId(sid);
    }

    @Override
    public Set<String> findRsrcPermissionByRoles(Set<String> roles) {
        if (CollectionUtil.isEmpty(roles)) {
            return Sets.newHashSet();
        }
        return sysAuthMapper.findRsrcPermissionByRoles(roles);
    }
}
