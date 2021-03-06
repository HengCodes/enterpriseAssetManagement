package com.jtj.web.dao;

import com.jtj.web.common.AssetException;
import com.jtj.web.common.PageDto;
import com.jtj.web.common.ResultDto;
import com.jtj.web.dto.PermissionDto;
import com.jtj.web.entity.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2017/4/17 22:32 End.
 */
public interface BaseDao<Entity,Dto> {

    int add(Entity t);

    int delete(@Param("ids") Long[] ids);

    int update(Entity t);

    List<Entity> getList(Dto dto);

    int getNum(Dto dto);
}
