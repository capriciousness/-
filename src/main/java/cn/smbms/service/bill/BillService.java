package cn.smbms.service.bill;

import java.util.List;
import cn.smbms.pojo.Bill;

public interface BillService {
	
	//通过条件获取供应商列表-providerList
	public List<Bill> getBillList(String productName, Integer providerId,
                                  Integer isPayment, Integer currentPageNo, Integer pageSize) throws Exception;

	
	//通过条件查询-订单表记录数
	public int getBillCount(String productName, Integer providerId, Integer isPayment) throws Exception;
	
	//增加订单
	public boolean add(Bill bill) throws Exception;
	
	//通过id获取Bill
	public Bill getBillById(Integer id) throws Exception;
	
	//修改订单信息
	public boolean modify(Bill bill) throws Exception;
	
	//通过id删除订单信息
	public boolean deleteBillById(Integer delId) throws Exception;
}
