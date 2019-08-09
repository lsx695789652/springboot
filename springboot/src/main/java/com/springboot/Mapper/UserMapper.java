package com.springboot.Mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

	
	  @Select("select * from user where id= #{id}") 
	  User getUserById(@Param("id") Integer Id);
	  
	  @Insert("insert into user values (NULL,#{name},#{sex})") void
	  InsertUser(@Param("name") String name,@Param("sex") String sex) ;
	  
	  @Update("update user set name=#{name} where id= #{id}") int
	  update(@Param("name") String name,@Param("id") Integer id);
	  
	  @Delete("delete from user where id=#{id}") void delete(@Param("id") Integer
	  id);
	 
}
