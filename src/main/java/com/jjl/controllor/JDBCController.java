package com.jjl.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    //查询所有信息并返回到网页上
    @RequestMapping("/select")
    public List<Map<String,Object>> jdbc(){
        String sql="select * from user";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }
    //删除
    @RequestMapping("/delete/{id}")
    public  String  delete(@PathVariable("id") int id){
        String sql="delete  from user where id=?";
        jdbcTemplate.update(sql,id);
        return "delete-ok";
    }
    //增加
    @RequestMapping("/add")
    public String add(){
        String sql="insert into user values (6,'xiaoming','123456')";
        jdbcTemplate.update(sql);
        return "add-ok";
    }
    @RequestMapping("/update/{id}")
    public String  update(@PathVariable("id") int id){
        String sql="update user set name=?,pwd=? where id="+id;
        Object[] objects = new Object[2];
        objects[0] = "秦疆";
        objects[1] = "24736743@sina.com";
        jdbcTemplate.update(sql,objects);
        return "update-ok";
    }
}
