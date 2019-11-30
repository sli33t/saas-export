package cn.itcast.web.controller.company;

import cn.itcast.domain.company.Company;
import cn.itcast.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/list", name = "企业列表查询")
    public String list(HttpServletRequest request){

        int i = 1/0;

        List<Company> list = companyService.findAll();
        request.setAttribute("list", list);

        ///WEB-INF/pages/
        //.jsp
        ///WEB-INF/pages/company/company-list.jsp
        return "company/company-list";
    }

    @RequestMapping(value = "/save")
    public String save(Date date){
        System.out.println("==============="+date);
        return "success";
    }

}
