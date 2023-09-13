package com.jyusun.origin.admin.upms.interfaces.facade.assembler;

import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysMenuDO;
import com.jyusun.origin.core.common.util.BeanUtil;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysMenuDetailDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 数据转换
 *
 * @author jyusun at 2022-04-16 13:39:19
 */
@Component
public class MenuToDtoAssembler implements Converter<SysMenuDO, SysMenuDetailDTO> {

    @Override
    public SysMenuDetailDTO convert(SysMenuDO source) {
        SysMenuDetailDTO sysMenuDetailDTO = BeanUtil.copyProperties(source, SysMenuDetailDTO.class);
        BeanUtil.copyProperties(source.getMeta(), sysMenuDetailDTO);
        return sysMenuDetailDTO;
    }

}
