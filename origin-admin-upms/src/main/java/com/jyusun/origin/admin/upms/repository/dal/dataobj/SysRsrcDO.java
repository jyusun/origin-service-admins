package com.jyusun.origin.admin.upms.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jyusun.origin.base.mybatis.data.BaseData;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 数据对象
 * <p>
 * 作用描述： 资源管理
 *
 * @author jyusun at 2020/1/29 13:08
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t002_sys_resources")
public class SysRsrcDO extends BaseData {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Schema(description = "主键编号")
    @TableId(value = "sid", type = IdType.ASSIGN_ID)
    private Long sid;

    @Schema(description = "名称")
    @TableField("oname")
    private String oname;
    @Schema(description = "编码")
    @TableField("ocode")
    private String ocode;
    @Schema(description = "鉴权标识")
    @TableField("permission")
    private String permission;
    @Schema(description = "请求方式")
    @TableField("mode")
    private String mode;
    @Schema(description = "资源路径")
    @TableField("uri")
    private String uri;
    @Schema(description = "服务名称")
    @TableField("service_name")
    private String serviceName;


}
