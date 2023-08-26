package com.jyusun.origin.admin.comm.interfaces.web;

import com.jyusun.origin.admin.comm.repository.SysParamRepository;
import com.jyusun.origin.admin.comm.repository.dal.dataobj.SysParamDO;
import com.jyusun.origin.base.mybatis.BaseController;
import com.jyusun.origin.core.common.model.result.AbstractResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统参数
 * <p>
 * 作用描述：系统参数
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "基础信息-系统参数")
@RequestMapping("params")
public class SysParamController extends BaseController<SysParamRepository, SysParamDO> {

    public SysParamController(SysParamRepository originRepository) {
        super(originRepository);
    }

    /**
     * 数据删除
     * @param keys {@link java.util.List<Long>} 主键编号集合
     * @return {@link AbstractResult} 响应结果
     */
    // @Schema(description ="数据删除：主键集合")
    // @PostMapping("rems")
    // public AbstractResult<Boolean> removeById(@RequestBody Keys keys) {
    // return ResultFactory.status(this.originRepository.removeByIds(keys.getIds()));
    // }

}
