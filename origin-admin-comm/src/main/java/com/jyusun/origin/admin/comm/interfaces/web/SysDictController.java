package com.jyusun.origin.admin.comm.interfaces.web;

import com.jyusun.origin.admin.comm.repository.SysDictRepository;
import com.jyusun.origin.base.mybatis.BaseController;
import com.jyusun.origin.admin.dict.repository.dal.dataobj.SysDictDO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据字典
 * <p>
 * 作用描述：字典类型
 * </p>
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "数据字典-字典类型")
@RequestMapping("dict/types")
public class SysDictController extends BaseController<SysDictRepository, SysDictDO> {

	public SysDictController(SysDictRepository originRepository) {
		super(originRepository);
	}

}
