package com.jtj.web.controller;

import com.jtj.web.common.AssetException;
import com.jtj.web.common.PageDto;
import com.jtj.web.common.ResultDto;
import com.jtj.web.dto.PermissionDto;
import com.jtj.web.dto.RoleDto;
import com.jtj.web.dto.UserDto;
import com.jtj.web.entity.KeyValue;
import com.jtj.web.entity.Permission;
import com.jtj.web.entity.Role;
import com.jtj.web.entity.User;
import com.jtj.web.service.PermissionService;
import com.jtj.web.service.RoleService;
import com.jtj.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 2017/2/22.
 */
@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @PostMapping("/add")
    public ResultDto<Object> add(Permission permission){
        return permissionService.add(permission);
    }

    @PostMapping("/addQuick")
    public ResultDto<Object> addQuick(Permission permission){
        return permissionService.addQuick(permission);
    }

    @PostMapping("/delete")
    public ResultDto<Object> delete(@RequestParam("ids") Long[] ids) throws AssetException {
        return permissionService.delete(ids);
    }

    @PostMapping("/update")
    public ResultDto<Object> update(Permission permission) {
        return permissionService.update(permission);
    }

    @PostMapping("/getList")
    public ResultDto<PageDto<Permission>> getList(PermissionDto dto){
        return permissionService.getList(dto);
    }

    @GetMapping("/getMap")
    public ResultDto<List<KeyValue>> getMap(){
        return permissionService.getMap();
    }

}
