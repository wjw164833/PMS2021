package com.example.pms.admin.service;

import java.util.List;

import com.example.pms.admin.model.SysDept;
import com.example.pms.core.service.CurdService;


/**
 * 机构管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @return
	 */
	List<SysDept> findTree();
}
