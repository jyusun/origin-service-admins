package com.jyusun.origin.admin.upms.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jyusun.origin.base.mybatis.data.BaseCreate;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 公司管理
 * <p>
 * 作用描述： 公司管理
 *
 * @author jyusun at 2020/1/29 13:08
 * @since 1.0.0
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t001_his_password")
public class SysUserPwdHisDO extends BaseCreate {

    private static final long serialVersionUID = 1L;

    @Schema(description = "用户编号")
    @TableField("uid")
    private Long uid;

    @Schema(description = "用户密码")
    @TableField("password")
    private String password;


}
