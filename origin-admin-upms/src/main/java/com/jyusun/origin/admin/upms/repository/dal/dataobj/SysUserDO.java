package com.jyusun.origin.admin.upms.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jyusun.origin.base.mybatis.data.BaseTenant;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 数据对象
 * <p>
 * 作用描述： 用户账户
 *
 * @author jyusun at 2020/1/29 13:08
 * @since 1.0.0
 */
@Data
@Schema(name = "数据对象：系统用户", description = "系统用户")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@TableName("t002_sys_user")
public class SysUserDO extends BaseTenant {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Schema(description = "主键编号")
    @TableId(value = "uid", type = IdType.ASSIGN_ID)
    private Long uid;

    @Schema(description = "账户编号")
    @TableField("user_code")
    private String userCode;

    @Schema(description = "登录名")
    @TableField("username")
    private String username;

    @Schema(description = "用户密码")
    @TableField("password")
    private String password;

    @Schema(description = "用户手机")
    @TableField("mobile")
    private String mobile;

    @Schema(description = "用户邮箱")
    @TableField("email")
    private String email;

    @Schema(description = "用户昵称")
    @TableField("nickname")
    private String nickname;

    @Schema(description = "用户头像")
    @TableField("avatar_img")
    private String avatarImg;

    /**
     * 账号状态：0-未激活|1-正常|2-锁定|3-冻结|9-注销
     */
    @Schema(description = "账户状态", example = "0-未激活|1-正常|2-锁定|3-冻结|9-注销")
    @TableField("state")
    private String state;

    /**
     * 启用状态：0-禁用|1-启用 默认为1
     */
    @Schema(description = "启用状态", example = "0-禁用|1-启用")
    @TableField("enabled")
    private Boolean enabled;

}
