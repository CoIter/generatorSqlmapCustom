package com.user.mapper;

import com.user.pojo.Websites;
import com.user.pojo.WebsitesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsitesMapper {
    int countByExample(WebsitesExample example);

    int deleteByExample(WebsitesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Websites record);

    int insertSelective(Websites record);

    List<Websites> selectByExample(WebsitesExample example);

    Websites selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Websites record, @Param("example") WebsitesExample example);

    int updateByExample(@Param("record") Websites record, @Param("example") WebsitesExample example);

    int updateByPrimaryKeySelective(Websites record);

    int updateByPrimaryKey(Websites record);
}