package cn.yycoin.controller;

import cn.yycoin.entity.THgEstimate;
import cn.yycoin.entity.THgPay;
import cn.yycoin.service.EstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import static cn.yycoin.until.MD5.md5;


/**
 * @author SunQi
 * @Description: 商品信息添加
 * @date Create in 2017/10/18 13:59
 */
@Controller
@RequestMapping("est")
public class EstController {

    @Autowired
    private EstService estService;

    //添加
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public @ResponseBody String addEst(@RequestParam("cate") String cate,
                                       @RequestParam("year") Integer year,
                                       @RequestParam("standard") String standard,
                                       @RequestParam("condition") String condition,
                                       @RequestParam("packaged") String packaged,
                                       @RequestParam("certificate") String certificate,
                                       @RequestParam("amount") String amount,
                                       @RequestParam("price") String price,
                                       @RequestParam("estimateid") String estimateid,
                                        @RequestParam("token") String token)throws Exception{

//        if(!token.equals(md5(cate))){
//            return "205";
//        }

        if(cate == null || cate.trim().length() == 0 || cate.trim().isEmpty() ||
                year == null ||
                standard == null || standard.trim().length() == 0 || standard.trim().isEmpty() ||
                condition == null || condition.trim().length() == 0 || condition.trim().isEmpty() ||
                packaged == null || packaged.trim().length() == 0 || packaged.trim().isEmpty() ||
                certificate == null || certificate.trim().length() == 0 || certificate.trim().isEmpty() ||
                amount == null || amount.trim().length() == 0 || amount.trim().isEmpty() ||
                price == null || price.trim().length() == 0 || price.trim().isEmpty() ||
                estimateid == null || estimateid.trim().length() == 0 || estimateid.trim().isEmpty()){
            return "0";
        }

        THgEstimate est = new THgEstimate();
        //将系统日期设置成数据库日期类型
        Date date = new Date();
        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);//将时间格式转换成符合Timestamp要求的格式.
        Timestamp ctime =Timestamp.valueOf(nowTime);//把时间转换
        est.setCreatetime(ctime);

        est.setCategory(cate);
        est.setYear(year);
        est.setStandard(standard);
        est.setCondition(condition);
        est.setPackaged(packaged);
        est.setCertificate(certificate);
        est.setAmount(amount);
        est.setPrice(Double.valueOf(price));
        est.setEstimateid(estimateid);

        //调用Service添加
        estService.addEst(est);
        return "1";
    }


    @RequestMapping(value = "addPay",method = RequestMethod.POST)
    public @ResponseBody String addPay(@RequestParam("bank") String bank,
                                       @RequestParam("bankNo") String bankNo,
                                       @RequestParam("khname") String khname,
                                       @RequestParam("money") String money,
                                       @RequestParam("status") String status)throws Exception{
        if(bank == null || bank.trim().length() == 0 || bank.trim().isEmpty() ||
                bankNo == null || bankNo.trim().length() == 0 || bankNo.trim().isEmpty() ||
                khname == null || khname.trim().length() == 0 || khname.trim().isEmpty() ||
                money == null || money.trim().length() == 0 || money.trim().isEmpty() ||
                status == null || status.trim().length() == 0 || status.trim().isEmpty() ){
            return "0";
        }

        THgPay pay = new THgPay();
        //将系统日期设置成数据库日期类型
        Date date = new Date();
        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);//将时间格式转换成符合Timestamp要求的格式.
        Timestamp ctime =Timestamp.valueOf(nowTime);//把时间转换
        pay.setCreatetime(ctime);

        pay.setBank(bank);
        pay.setBankNo(bankNo);
        pay.setKhname(khname);
        pay.setMoney(money);
        pay.setStatus(status);
        pay.setCreater("黄金回购");
        pay.setCreatetime(ctime);

        //调用Service添加
        estService.addPay(pay);
        return "1";
    }

}
