package com.example.pms.admin.service;

import java.util.List;

import com.example.pms.admin.model.SysDict;
import com.example.pms.core.service.CurdService;

/**
 * 字典管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
