package cn.itcast.service.company;

import cn.itcast.domain.company.Company;

import java.util.List;

//企业的service接口
public interface CompanyService {

    //企业列表查询
    List<Company> findAll();
}
