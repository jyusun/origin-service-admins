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
 * 资源分组 功能资源组
 *
 * @author jyusun at 2022-1-3 23:28:48
 */
@Data
@Schema(name = "数据对象：资源组", description = "资源组管理")
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t002_sys_rgroup")
public class SysRsrcGroupDO extends BaseData {

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

}
