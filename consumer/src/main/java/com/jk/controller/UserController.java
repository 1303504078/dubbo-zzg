package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.Accctype;
import com.jk.pojo.Account;
import com.jk.pojo.TreeBean;
import com.jk.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("zzg")
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("querytree")
    public List<TreeBean> querytree(){
        return userService.querytree();
    }
    @RequestMapping("query")
    public List<Account> query(Account user){
        return userService.query(user);
    }
    /* *
     * @Author: zzg
     * @Description:
    * @Date: 2021/4/29 20:09
    
     * @Return: 
     **/
    
    @RequestMapping("add")
    public void add(Account user){
     userService.add(user);
    }
    @RequestMapping("queryUserById")
    public Account queryUserById(Integer id){
     return    userService.queryUserById(id);
    }
    /* *
     * @Author: zzg
     * @Description:
    * @Date: 2021/4/29 20:49

     * @Return:
     **/

    @RequestMapping("del")
    public void del(Integer id){
        userService.del(id);
    }
    /* *
     * @Author: zzg
     * @Description:
    * @Date: 2021/4/30 10:45

     * @Return:
     **/
    public List<Accctype> query2(Accctype user){
      return   userService.query2(user);
    }
    @RequestMapping("del2")
    public void del2(Integer id){
        userService.del2(id);
    }
}
