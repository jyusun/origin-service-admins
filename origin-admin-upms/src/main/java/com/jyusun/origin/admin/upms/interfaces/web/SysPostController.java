package com.jyusun.origin.admin.upms.interfaces.web;


import com.jyusun.origin.base.mybatis.BaseController;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysPostDO;
import com.jyusun.origin.admin.upms.repository.SysPostRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 岗位管理
 * <p>
 * 作用描述：岗位管理
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "权限管理-岗位管理")
@RequestMapping("posts")
public class SysPostController extends BaseController<SysPostRepository, SysPostDO> {
    public SysPostController(SysPostRepository originRepository) {
        super(originRepository);
    }
}
