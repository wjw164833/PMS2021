package com.example.pms.admin.service;

import com.example.pms.admin.model.SysConfig;
import com.example.pms.core.service.CurdService;

import java.util.List;



/**
 * 系统配置管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
