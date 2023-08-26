package com.jyusun.origin.admin.upms.interfaces.remote.provider;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.jyusun.origin.admin.upms.repository.SysAuthRepository;
import com.jyusun.origin.admin.upms.repository.SysUserRepository;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysUserDO;
import com.jyusun.origin.admin.client.upms.api.SysUserApi;
import com.jyusun.origin.admin.client.upms.model.SysUserDTO;
import com.jyusun.origin.admin.client.upms.model.SysUserRegisterDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

/**
 * 提供者
 * <p>
 * 作用描述：日志请求处理
 *
 * @author jyusun at 2021/3/3 20:49
 * @since 1.0.0
 */
@Slf4j
@RequestMapping(SysUserApi.API_PREFIX)
@RestController
@RequiredArgsConstructor
public class SysUserProvider implements SysUserApi {

    private final SysUserRepository sysUserRepository;

    private final SysAuthRepository sysAuthRepository;

    /**
     * 查询用户信息
     * @param username {@code String} 用户名
     * @return 用户信息
     */
    @Override
    @GetMapping("{username}")
    public SysUserDTO findUserInfo(@PathVariable("username") String username) {
        LambdaQueryWrapper<SysUserDO> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(SysUserDO::getUsername, username);
        SysUserDO sysUserDO = Optional.ofNullable(sysUserRepository.getOne(wrapper)).orElse(new SysUserDO());
        Set<String> roles = sysAuthRepository.findRoleByUserId(sysUserDO.getSid());
        Set<String> permissions = sysAuthRepository.findRsrcPermissionByRoles(roles);

        return new SysUserDTO().setUserId(sysUserDO.getSid())
            .setUsername(sysUserDO.getUsername())
            .setPassword(sysUserDO.getPassword())
            .setEnabled(sysUserDO.getEnabled())
            // TODO 后续处理
            .setAccountNonLocked(true)
            .setAccountNonExpired(true)
            .setCredentialsNonExpired(true)
            .setRoles(roles)
            .setPermissions(permissions);
    }

    /**
     * 用户注册
     * @param register {@link SysUserRegisterDTO} 用户注册
     * @return 用户信息
     */
    @Override
    @PostMapping("register")
    public Boolean userRegister(SysUserRegisterDTO register) {
        return null;
    }

}
