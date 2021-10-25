package com.example.pms.admin.service;

import com.example.pms.admin.model.SysLoginLog;
import com.example.pms.core.service.CurdService;


/**
 * 登录日志
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysLoginLogService extends CurdService<SysLoginLog> {

	/**
	 * 记录登录日志
	 * @param userName
	 * @param ip
	 * @return
	 */
	int writeLoginLog(String userName, String ip);
}
