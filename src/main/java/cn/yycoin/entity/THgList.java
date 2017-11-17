package cn.yycoin.entity;

public class THgList {
    private Integer id;

    private String transportno;         //顺丰快递单号

    private String province;            //省

    private String city;                //市

    private String county;              //区县

    private String address;             //地址

    private String fromer;              //寄件人

    private String mobile;              //手机号

    private String discription;         //备注

    private Integer estimateid;         //预估流程单号

    private String productdis;          //回购商品信息

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransportno() {
        return transportno;
    }

    public void setTransportno(String transportno) {
        this.transportno = transportno == null ? null : transportno.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFromer() {
        return fromer;
    }

    public void setFromer(String fromer) {
        this.fromer = fromer == null ? null : fromer.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }

    public Integer getEstimateid() {
        return estimateid;
    }

    public void setEstimateid(Integer estimateid) {
        this.estimateid = estimateid;
    }

    public String getProductdis() {
        return productdis;
    }

    public void setProductdis(String productdis) {
        this.productdis = productdis == null ? null : productdis.trim();
    }
}