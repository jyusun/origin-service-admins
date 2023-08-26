package com.jyusun.origin.admin.comm.interfaces.remote.provider;

import com.jyusun.origin.admin.client.info.api.SysParamApi;
import com.jyusun.origin.admin.client.info.model.SysParamDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供者
 * <p>
 * 作用描述：系统参数
 *
 * @author jyusun at 2021/3/3 20:49
 * @since 1.0.0
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(SysParamApi.API_PREFIX)
public class SysParamProvider implements SysParamApi {

    /**
     * 查询系统参数
     * @param paramKey {@code String} 参数Key
     * @return 系统参数
     */
    @Override
    @GetMapping("{paramKey}")
    public SysParamDTO findParam(@PathVariable("paramKey") String paramKey) {
        return null;
    }

}
