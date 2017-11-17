package cn.yycoin;

import cn.yycoin.entity.THgListlog;
import cn.yycoin.service.ListLogService;
import com.alibaba.druid.filter.config.ConfigTools;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static cn.yycoin.until.MD5.md5;


public class Test {


    /**
     * 数据库密码加密
     */
    @org.junit.Test
    public void encrypyDB() {
        try {
            System.out.println(ConfigTools.encrypt("123456"));
//            System.out.println(ConfigTools.encrypt("root"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @org.junit.Test
    public void test1() {
        final String maxQuoteNo = "QT201707140999";

        String quoteNo = null;

        final String maxQuoteNoDate = maxQuoteNo.substring(2, 10);
        final DateFormat format = new SimpleDateFormat("yyyyMMdd");
        final String currentQuoteNoDate = format.format(new Date());

        final Integer maxQuoteNoCode = Integer.valueOf(maxQuoteNo.substring(10, 14));
        Integer currentQuoteNoCode = 1;

        if (currentQuoteNoDate.compareTo(maxQuoteNoDate) == 0) {
            currentQuoteNoCode = maxQuoteNoCode + 1;
        }

        quoteNo = "QT" + currentQuoteNoDate + String.format("%04d", currentQuoteNoCode);

        System.out.println(quoteNo);

    }

    @org.junit.Test
    public void test2() {
        final GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(new Date());
        gc.add(Calendar.DATE, gc.getActualMaximum(Calendar.DAY_OF_MONTH));

        System.out.println(gc.getActualMaximum(Calendar.DAY_OF_MONTH));

//        final DateFormat format = new SimpleDateFormat("yyyyMMdd");
        final DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(format.format(gc.getTime()));
    }

    @org.junit.Test
    public void test3(){
        Date date = new Date();
        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);//将时间格式转换成符合Timestamp要求的格式.
        Timestamp ctime =Timestamp.valueOf(nowTime);//把时间转换
        System.out.println(ctime);
    }

    @org.junit.Test
    public void test4(){


        String token = "4353831cc9a575fd90e4d5e590fc28ad";
        String a = "产品1";
        String password = md5(a);

        String f = md5("产品1");

        System.out.println(f);
        System.out.println(password);
        System.out.println(md5("产品1"));

        System.out.println(token.equals(password));
    }


    @org.junit.Test
    public void test5(){


    }
}







