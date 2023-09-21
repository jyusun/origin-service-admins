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
 * 用户分组
 *
 * @author jyusun at 2021年12月19日 13:47:52
 */
@Data
@Schema(name = "数据对象：用户组", description = "用户组管理")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@TableName("t002_sys_ugroup")
public class SysUserGroupDO extends BaseTenant {

    /**
     * 主键ID
     */
    @Schema(description = "主键编号")
    @TableId(value = "oid", type = IdType.ASSIGN_ID)
    private Long oid;

    @Schema(description = "名称")
    @TableField("oname")
    private String oname;

    @Schema(description = "编码")
    @TableField("ocode")
    private String ocode;

}
