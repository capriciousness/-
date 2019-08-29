package cn.smbms.service.provider;

import java.util.List;
import cn.smbms.pojo.Provider;

public interface ProviderService {
	
	//通过供应商名称、编码获取供应商列表-模糊查询-providerList
	public List<Provider> getProviderList(String proName, String proCode, Integer currentPageNo, Integer pageSize) throws Exception;
	
	//获取供应商列表
	public List<Provider> getProviderList() throws Exception;
	
	//通过条件查询-供应商表记录数
	public int getproviderCount(String proName, String proCode) throws Exception;
	
	//增加供应商
	public boolean add(Provider provider) throws Exception;
	
	//通过proId获取Provider
	public Provider getProviderById(Integer id) throws Exception;
	
	//修改供应商信息
	public boolean modify(Provider provider) throws Exception;
	
	//通过proId删除Provider
	public boolean smbmsdeleteProviderById(Integer delId) throws Exception;
}
