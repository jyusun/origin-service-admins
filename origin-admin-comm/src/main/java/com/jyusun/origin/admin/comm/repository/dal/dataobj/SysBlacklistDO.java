package com.jyusun.origin.admin.comm.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.jyusun.origin.base.mybatis.data.BaseData;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 黑名单配置
 *
 * @author jyusun at 2022-01-05 13:45:32
 * @since 1.0.0
 */
@Schema(description = "网关黑名单")
@Data
// @TableName("t000_sys_blacklist")
public class SysBlacklistDO extends BaseData {

    /**
     * 主键ID
     */
    @Schema(description = "主键编号")
    @TableId(value = "oid", type = IdType.ASSIGN_ID)
    private Long oid;

}
