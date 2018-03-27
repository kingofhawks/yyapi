package cn.yycoin.controller;

import cn.yycoin.entity.THgList;
import cn.yycoin.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static cn.yycoin.until.MD5.md5;


/**
 * @author SunQi
 * @Description: 回购发货信息
 * @date Create in 2017/10/19 13:49
 */
@Controller
@RequestMapping("list")
public class ListController {

    @Autowired
    private ListService listService;

    //添加回购发货信息
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public @ResponseBody String addList(@RequestParam("transportno") String nId,
                                         @RequestParam("province") String province,
                                         @RequestParam("city") String city,
                                         @RequestParam("county") String county,
                                         @RequestParam("address") String address,
                                         @RequestParam("fromer") String fromer,
                                         @RequestParam("mobile") String mobile,
                                         @RequestParam("discription") String discription,
                                         @RequestParam("estimateid") String estimateid,
                                         @RequestParam("productdis") String productdis,
                                         @RequestParam("token") String token) throws Exception{

//        if(!token.equals(md5(nId))){
//            return "205";
//        }


        if(nId == null || nId.trim().length() == 0 || nId.trim().isEmpty() ||
                province == null || province.trim().length() == 0 || province.trim().isEmpty() ||
                city == null || city.trim().length() == 0 || city.trim().isEmpty() ||
                county == null || county.trim().length() == 0 || county.trim().isEmpty() ||
                address == null || address.trim().length() == 0 || address.trim().isEmpty() ||
                fromer == null || fromer.trim().length() == 0 || fromer.trim().isEmpty() ||
                mobile == null || mobile.trim().length() == 0 || mobile.trim().isEmpty() ||
                discription == null || discription.trim().length() == 0 || discription.trim().isEmpty() ||
                productdis == null || productdis.trim().length() == 0 || productdis.trim().isEmpty()){
            return "0";
        }

        THgList  tHgList = new THgList();
        tHgList.setTransportno(nId);
        tHgList.setProvince(province);
        tHgList.setCity(city);
        tHgList.setCounty(county);
        tHgList.setAddress(address);
        tHgList.setFromer(fromer);
        tHgList.setMobile(mobile);
        tHgList.setDiscription(discription);
        tHgList.setEstimateid(estimateid);
        tHgList.setProductdis(productdis);

        //调用Service
        listService.addList(tHgList);

        return "1";
    }


}
