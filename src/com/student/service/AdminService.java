package com.student.service;

import com.student.bean.Admin;
import com.student.bean.Student;

/*** 
 * @author Renfu Gou
 * @E_mail 1779356953@qq.com
 * @create_time 2018年5月21日 下午7:48:12
 * @description 
 * @version 1.0
*/
public interface AdminService {

	/**
	 * 根据id和密码查找管理员
	 * @param admin
	 * @return
	 * @throws Exception
	 */
	public Admin findAdminByIDAndPassword(Admin admin) throws Exception;
}
