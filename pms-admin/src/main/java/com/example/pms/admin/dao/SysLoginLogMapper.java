package com.example.pms.admin.dao;

import java.util.List;

import com.example.pms.admin.model.SysLoginLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    SysLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);
    
    List<SysLoginLog> findPage();
    
    List<SysLoginLog> findPageByUserName(@Param(value="userName") String userName);
    
    List<SysLoginLog> findPageByStatus(@Param(value="status") String status);
    
    List<SysLoginLog> findPageByUserNameAndStatus(@Param(value="userName") String userName, @Param(value="status") String status);
    
    List<SysLoginLog> findByUserNameAndStatus(@Param(value="userName") String userName, @Param(value="status") String status);
}