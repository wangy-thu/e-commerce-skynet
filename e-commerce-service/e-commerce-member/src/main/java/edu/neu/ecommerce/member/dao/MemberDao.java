package edu.neu.ecommerce.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.neu.ecommerce.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author WangY
 * @email 1178663139@qq.com
 * @date 2022-05-29 13:01:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
