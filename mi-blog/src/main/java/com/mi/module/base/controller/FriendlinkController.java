package com.mi.module.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.base.service.IFriendlinkService;
import com.mi.module.base.entity.Friendlink;



/**
 *
 * 友情链接; InnoDB free: 3072 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@RestController
@RequestMapping("/base/friendlink")
public class FriendlinkController {

    @Autowired
    IFriendlinkService iFriendlinkService;

    /** selectById **/
    @RequestMapping(value = "selectById")
    public Friendlink selectById(@RequestParam String id){
        Friendlink entity = iFriendlinkService.selectById(id);
        return entity;
    }

    /** insert **/
    @RequestMapping(value = "insert")
    public void insert(){

    }

    /** delete **/
    @RequestMapping(value = "delete")
    public void delete(){

    }

    /** update **/
    @RequestMapping(value = "update")
    public void update(){

    }

}
