package com.jyusun.origin.admin.upms.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.TableField;
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
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t002_sys_post")
public class SysPostDO extends BaseTenant {

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
