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
 * 岗位信息
 *
 * @author jyusun at 15:59:51
 */
@Data
@Schema(name = "数据对象：岗位管理", description = "岗位管理")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t002_sys_post")
public class SysPostDO extends BaseTenant {

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

    @Schema(description = "简称")
    @TableField("sname")
    private String sname;

    @Schema(description = "排序")
    @TableField("sort")
    private Integer sort;

    @Schema(description = "启用状态", example = "0-禁用|1-启用")
    @TableField("enabled")
    private Boolean enabled;

}
