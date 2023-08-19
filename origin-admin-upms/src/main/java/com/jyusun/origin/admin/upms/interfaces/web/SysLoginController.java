package com.jyusun.origin.admin.upms.interfaces.web;


import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysUserDO;
import com.jyusun.origin.admin.upms.repository.SysUserRepository;
import com.jyusun.origin.admin.upms.interfaces.facade.model.cmd.UserRegisterCmd;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录操作
 * <p>
 * 作用描述：登录操作
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "登录操作")
@RequestMapping("logins")
@RequiredArgsConstructor
public class SysLoginController {

    private final SysUserRepository sysUserRepository;

    @Operation(summary = "系统登录")
    @PostMapping("login")
    public void login() {
    }

    @Operation(summary = "登录注销")
    @PostMapping("logout")
    public void logout() {
    }

    @Operation(summary = "用户注册")
    @PostMapping
    public Boolean register(@RequestBody UserRegisterCmd userRegisterCmd) {
        SysUserDO sysUserDO = new SysUserDO();
        return sysUserRepository.save(sysUserDO);
    }

    @Operation(summary = "在线用户")
    @GetMapping("online")
    public void online() {

    }

    @Operation(summary = "强制登出")
    @PostMapping("forced/logout")
    public void forcedLogout() {

    }


}
