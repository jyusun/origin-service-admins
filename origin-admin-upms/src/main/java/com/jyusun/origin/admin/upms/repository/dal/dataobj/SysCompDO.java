package com.jyusun.origin.admin.upms.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jyusun.origin.base.mybatis.data.BaseData;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
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
@Accessors(chain = true)
@TableName("t002_sys_comp")
public class SysCompDO extends BaseData {

    private static final long serialVersionUID = 1L;

    @Schema(description = "社会信用编号")
    @TableField("comp_code")
    private String compCode;

    @Schema(description = "名称")
    @TableField("oname")
    private String oname;
    @Schema(description = "编码")
    @TableField("ocode")
    private String ocode;
    @Schema(description = "简称")
    @TableField("sname")
    private String sname;

    @Schema(description = "注册地址")
    @TableField("address")
    private String address;

    @Schema(description = "联络电话")
    @TableField("telephone")
    private String telephone;

    @Schema(description = "排序")
    @TableField("sort")
    private Integer sort;

    @Schema(description = "启用状态", example = "0-禁用，1-启用")
    @TableField("enabled")
    private Boolean enabled;

}
