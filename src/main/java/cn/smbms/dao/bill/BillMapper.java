package cn.smbms.dao.bill;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Bill;

public interface BillMapper {
	
	//根据供应商ID查询订单数量
	public int getBillCountByProviderId(@Param("providerId") Integer providerId)throws Exception;

	//增加订单
	public int add(Bill bill)throws Exception;

	//通过查询条件获取供应商列表-getBillList
	public List<Bill> getBillList(@Param("productName") String productName, @Param("providerId") Integer providerId, @Param("isPayment") Integer isPayment,
                                  @Param("from") Integer currentPageNo, @Param("pageSize") Integer pageSize)throws Exception;
	
	//通过条件查询-订单表记录数
	public int getBillCount(@Param("productName") String productName, @Param("providerId") Integer providerId, @Param("isPayment") Integer isPayment)throws Exception;
	
	//通过delId删除Bill
	public int deleteBillById(@Param("id") Integer delId)throws Exception;

	//通过billId获取Bill
	public Bill getBillById(@Param("id") Integer id)throws Exception;
	
	//修改订单信息
	public int modify(Bill bill)throws Exception;
	
	//根据供应商ID删除订单信息
	public int deleteBillByProviderId(@Param("providerId") Integer providerId)throws Exception;

}
