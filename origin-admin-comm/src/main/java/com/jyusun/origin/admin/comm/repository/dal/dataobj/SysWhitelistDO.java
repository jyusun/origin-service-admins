package com.jyusun.origin.admin.comm.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.jyusun.origin.base.mybatis.data.BaseData;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 作用描述：白名单配置
 *
 * @author jyusun at 2023/2/10 13:54
 * @since 1.0.0
 */
@Schema(description = "网关白名单")
@Data
// @TableName("t000_sys_whitelist")
public class SysWhitelistDO extends BaseData {

    /**
     * 主键ID
     */
    @Schema(description = "主键编号")
    @TableId(value = "oid", type = IdType.ASSIGN_ID)
    private Long oid;

}
