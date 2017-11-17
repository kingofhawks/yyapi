package cn.yycoin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class THgListlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public THgListlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBackidIsNull() {
            addCriterion("backid is null");
            return (Criteria) this;
        }

        public Criteria andBackidIsNotNull() {
            addCriterion("backid is not null");
            return (Criteria) this;
        }

        public Criteria andBackidEqualTo(String value) {
            addCriterion("backid =", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidNotEqualTo(String value) {
            addCriterion("backid <>", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidGreaterThan(String value) {
            addCriterion("backid >", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidGreaterThanOrEqualTo(String value) {
            addCriterion("backid >=", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidLessThan(String value) {
            addCriterion("backid <", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidLessThanOrEqualTo(String value) {
            addCriterion("backid <=", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidLike(String value) {
            addCriterion("backid like", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidNotLike(String value) {
            addCriterion("backid not like", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidIn(List<String> values) {
            addCriterion("backid in", values, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidNotIn(List<String> values) {
            addCriterion("backid not in", values, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidBetween(String value1, String value2) {
            addCriterion("backid between", value1, value2, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidNotBetween(String value1, String value2) {
            addCriterion("backid not between", value1, value2, "backid");
            return (Criteria) this;
        }

        public Criteria andEstimateidIsNull() {
            addCriterion("estimateid is null");
            return (Criteria) this;
        }

        public Criteria andEstimateidIsNotNull() {
            addCriterion("estimateid is not null");
            return (Criteria) this;
        }

        public Criteria andEstimateidEqualTo(String value) {
            addCriterion("estimateid =", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidNotEqualTo(String value) {
            addCriterion("estimateid <>", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidGreaterThan(String value) {
            addCriterion("estimateid >", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidGreaterThanOrEqualTo(String value) {
            addCriterion("estimateid >=", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidLessThan(String value) {
            addCriterion("estimateid <", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidLessThanOrEqualTo(String value) {
            addCriterion("estimateid <=", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidLike(String value) {
            addCriterion("estimateid like", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidNotLike(String value) {
            addCriterion("estimateid not like", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidIn(List<String> values) {
            addCriterion("estimateid in", values, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidNotIn(List<String> values) {
            addCriterion("estimateid not in", values, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidBetween(String value1, String value2) {
            addCriterion("estimateid between", value1, value2, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidNotBetween(String value1, String value2) {
            addCriterion("estimateid not between", value1, value2, "estimateid");
            return (Criteria) this;
        }

        public Criteria andTransportnoIsNull() {
            addCriterion("transportno is null");
            return (Criteria) this;
        }

        public Criteria andTransportnoIsNotNull() {
            addCriterion("transportno is not null");
            return (Criteria) this;
        }

        public Criteria andTransportnoEqualTo(String value) {
            addCriterion("transportno =", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotEqualTo(String value) {
            addCriterion("transportno <>", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoGreaterThan(String value) {
            addCriterion("transportno >", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoGreaterThanOrEqualTo(String value) {
            addCriterion("transportno >=", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoLessThan(String value) {
            addCriterion("transportno <", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoLessThanOrEqualTo(String value) {
            addCriterion("transportno <=", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoLike(String value) {
            addCriterion("transportno like", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotLike(String value) {
            addCriterion("transportno not like", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoIn(List<String> values) {
            addCriterion("transportno in", values, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotIn(List<String> values) {
            addCriterion("transportno not in", values, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoBetween(String value1, String value2) {
            addCriterion("transportno between", value1, value2, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotBetween(String value1, String value2) {
            addCriterion("transportno not between", value1, value2, "transportno");
            return (Criteria) this;
        }

        public Criteria andFromerIsNull() {
            addCriterion("fromer is null");
            return (Criteria) this;
        }

        public Criteria andFromerIsNotNull() {
            addCriterion("fromer is not null");
            return (Criteria) this;
        }

        public Criteria andFromerEqualTo(String value) {
            addCriterion("fromer =", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerNotEqualTo(String value) {
            addCriterion("fromer <>", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerGreaterThan(String value) {
            addCriterion("fromer >", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerGreaterThanOrEqualTo(String value) {
            addCriterion("fromer >=", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerLessThan(String value) {
            addCriterion("fromer <", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerLessThanOrEqualTo(String value) {
            addCriterion("fromer <=", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerLike(String value) {
            addCriterion("fromer like", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerNotLike(String value) {
            addCriterion("fromer not like", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerIn(List<String> values) {
            addCriterion("fromer in", values, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerNotIn(List<String> values) {
            addCriterion("fromer not in", values, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerBetween(String value1, String value2) {
            addCriterion("fromer between", value1, value2, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerNotBetween(String value1, String value2) {
            addCriterion("fromer not between", value1, value2, "fromer");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(Integer value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(Integer value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(Integer value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(Integer value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(Integer value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(Integer value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<Integer> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<Integer> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(Integer value1, Integer value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(Integer value1, Integer value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andProductdisIsNull() {
            addCriterion("productdis is null");
            return (Criteria) this;
        }

        public Criteria andProductdisIsNotNull() {
            addCriterion("productdis is not null");
            return (Criteria) this;
        }

        public Criteria andProductdisEqualTo(String value) {
            addCriterion("productdis =", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisNotEqualTo(String value) {
            addCriterion("productdis <>", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisGreaterThan(String value) {
            addCriterion("productdis >", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisGreaterThanOrEqualTo(String value) {
            addCriterion("productdis >=", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisLessThan(String value) {
            addCriterion("productdis <", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisLessThanOrEqualTo(String value) {
            addCriterion("productdis <=", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisLike(String value) {
            addCriterion("productdis like", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisNotLike(String value) {
            addCriterion("productdis not like", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisIn(List<String> values) {
            addCriterion("productdis in", values, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisNotIn(List<String> values) {
            addCriterion("productdis not in", values, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisBetween(String value1, String value2) {
            addCriterion("productdis between", value1, value2, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisNotBetween(String value1, String value2) {
            addCriterion("productdis not between", value1, value2, "productdis");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIsNull() {
            addCriterion("discription is null");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIsNotNull() {
            addCriterion("discription is not null");
            return (Criteria) this;
        }

        public Criteria andDiscriptionEqualTo(String value) {
            addCriterion("discription =", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotEqualTo(String value) {
            addCriterion("discription <>", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionGreaterThan(String value) {
            addCriterion("discription >", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionGreaterThanOrEqualTo(String value) {
            addCriterion("discription >=", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLessThan(String value) {
            addCriterion("discription <", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLessThanOrEqualTo(String value) {
            addCriterion("discription <=", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLike(String value) {
            addCriterion("discription like", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotLike(String value) {
            addCriterion("discription not like", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIn(List<String> values) {
            addCriterion("discription in", values, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotIn(List<String> values) {
            addCriterion("discription not in", values, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionBetween(String value1, String value2) {
            addCriterion("discription between", value1, value2, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotBetween(String value1, String value2) {
            addCriterion("discription not between", value1, value2, "discription");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNull() {
            addCriterion("receivetime is null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNotNull() {
            addCriterion("receivetime is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeEqualTo(Date value) {
            addCriterion("receivetime =", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotEqualTo(Date value) {
            addCriterion("receivetime <>", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThan(Date value) {
            addCriterion("receivetime >", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receivetime >=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThan(Date value) {
            addCriterion("receivetime <", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThanOrEqualTo(Date value) {
            addCriterion("receivetime <=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIn(List<Date> values) {
            addCriterion("receivetime in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotIn(List<Date> values) {
            addCriterion("receivetime not in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeBetween(Date value1, Date value2) {
            addCriterion("receivetime between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotBetween(Date value1, Date value2) {
            addCriterion("receivetime not between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andPackagerIsNull() {
            addCriterion("packager is null");
            return (Criteria) this;
        }

        public Criteria andPackagerIsNotNull() {
            addCriterion("packager is not null");
            return (Criteria) this;
        }

        public Criteria andPackagerEqualTo(String value) {
            addCriterion("packager =", value, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagerNotEqualTo(String value) {
            addCriterion("packager <>", value, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagerGreaterThan(String value) {
            addCriterion("packager >", value, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagerGreaterThanOrEqualTo(String value) {
            addCriterion("packager >=", value, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagerLessThan(String value) {
            addCriterion("packager <", value, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagerLessThanOrEqualTo(String value) {
            addCriterion("packager <=", value, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagerLike(String value) {
            addCriterion("packager like", value, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagerNotLike(String value) {
            addCriterion("packager not like", value, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagerIn(List<String> values) {
            addCriterion("packager in", values, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagerNotIn(List<String> values) {
            addCriterion("packager not in", values, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagerBetween(String value1, String value2) {
            addCriterion("packager between", value1, value2, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagerNotBetween(String value1, String value2) {
            addCriterion("packager not between", value1, value2, "packager");
            return (Criteria) this;
        }

        public Criteria andPackagetimeIsNull() {
            addCriterion("packagetime is null");
            return (Criteria) this;
        }

        public Criteria andPackagetimeIsNotNull() {
            addCriterion("packagetime is not null");
            return (Criteria) this;
        }

        public Criteria andPackagetimeEqualTo(Date value) {
            addCriterion("packagetime =", value, "packagetime");
            return (Criteria) this;
        }

        public Criteria andPackagetimeNotEqualTo(Date value) {
            addCriterion("packagetime <>", value, "packagetime");
            return (Criteria) this;
        }

        public Criteria andPackagetimeGreaterThan(Date value) {
            addCriterion("packagetime >", value, "packagetime");
            return (Criteria) this;
        }

        public Criteria andPackagetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("packagetime >=", value, "packagetime");
            return (Criteria) this;
        }

        public Criteria andPackagetimeLessThan(Date value) {
            addCriterion("packagetime <", value, "packagetime");
            return (Criteria) this;
        }

        public Criteria andPackagetimeLessThanOrEqualTo(Date value) {
            addCriterion("packagetime <=", value, "packagetime");
            return (Criteria) this;
        }

        public Criteria andPackagetimeIn(List<Date> values) {
            addCriterion("packagetime in", values, "packagetime");
            return (Criteria) this;
        }

        public Criteria andPackagetimeNotIn(List<Date> values) {
            addCriterion("packagetime not in", values, "packagetime");
            return (Criteria) this;
        }

        public Criteria andPackagetimeBetween(Date value1, Date value2) {
            addCriterion("packagetime between", value1, value2, "packagetime");
            return (Criteria) this;
        }

        public Criteria andPackagetimeNotBetween(Date value1, Date value2) {
            addCriterion("packagetime not between", value1, value2, "packagetime");
            return (Criteria) this;
        }

        public Criteria andDeterminerIsNull() {
            addCriterion("determiner is null");
            return (Criteria) this;
        }

        public Criteria andDeterminerIsNotNull() {
            addCriterion("determiner is not null");
            return (Criteria) this;
        }

        public Criteria andDeterminerEqualTo(String value) {
            addCriterion("determiner =", value, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminerNotEqualTo(String value) {
            addCriterion("determiner <>", value, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminerGreaterThan(String value) {
            addCriterion("determiner >", value, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminerGreaterThanOrEqualTo(String value) {
            addCriterion("determiner >=", value, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminerLessThan(String value) {
            addCriterion("determiner <", value, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminerLessThanOrEqualTo(String value) {
            addCriterion("determiner <=", value, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminerLike(String value) {
            addCriterion("determiner like", value, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminerNotLike(String value) {
            addCriterion("determiner not like", value, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminerIn(List<String> values) {
            addCriterion("determiner in", values, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminerNotIn(List<String> values) {
            addCriterion("determiner not in", values, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminerBetween(String value1, String value2) {
            addCriterion("determiner between", value1, value2, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminerNotBetween(String value1, String value2) {
            addCriterion("determiner not between", value1, value2, "determiner");
            return (Criteria) this;
        }

        public Criteria andDeterminedesIsNull() {
            addCriterion("determinedes is null");
            return (Criteria) this;
        }

        public Criteria andDeterminedesIsNotNull() {
            addCriterion("determinedes is not null");
            return (Criteria) this;
        }

        public Criteria andDeterminedesEqualTo(String value) {
            addCriterion("determinedes =", value, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminedesNotEqualTo(String value) {
            addCriterion("determinedes <>", value, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminedesGreaterThan(String value) {
            addCriterion("determinedes >", value, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminedesGreaterThanOrEqualTo(String value) {
            addCriterion("determinedes >=", value, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminedesLessThan(String value) {
            addCriterion("determinedes <", value, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminedesLessThanOrEqualTo(String value) {
            addCriterion("determinedes <=", value, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminedesLike(String value) {
            addCriterion("determinedes like", value, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminedesNotLike(String value) {
            addCriterion("determinedes not like", value, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminedesIn(List<String> values) {
            addCriterion("determinedes in", values, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminedesNotIn(List<String> values) {
            addCriterion("determinedes not in", values, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminedesBetween(String value1, String value2) {
            addCriterion("determinedes between", value1, value2, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminedesNotBetween(String value1, String value2) {
            addCriterion("determinedes not between", value1, value2, "determinedes");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeIsNull() {
            addCriterion("determinetime is null");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeIsNotNull() {
            addCriterion("determinetime is not null");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeEqualTo(Date value) {
            addCriterion("determinetime =", value, "determinetime");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeNotEqualTo(Date value) {
            addCriterion("determinetime <>", value, "determinetime");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeGreaterThan(Date value) {
            addCriterion("determinetime >", value, "determinetime");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("determinetime >=", value, "determinetime");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeLessThan(Date value) {
            addCriterion("determinetime <", value, "determinetime");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeLessThanOrEqualTo(Date value) {
            addCriterion("determinetime <=", value, "determinetime");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeIn(List<Date> values) {
            addCriterion("determinetime in", values, "determinetime");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeNotIn(List<Date> values) {
            addCriterion("determinetime not in", values, "determinetime");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeBetween(Date value1, Date value2) {
            addCriterion("determinetime between", value1, value2, "determinetime");
            return (Criteria) this;
        }

        public Criteria andDeterminetimeNotBetween(Date value1, Date value2) {
            addCriterion("determinetime not between", value1, value2, "determinetime");
            return (Criteria) this;
        }

        public Criteria andPricerIsNull() {
            addCriterion("pricer is null");
            return (Criteria) this;
        }

        public Criteria andPricerIsNotNull() {
            addCriterion("pricer is not null");
            return (Criteria) this;
        }

        public Criteria andPricerEqualTo(String value) {
            addCriterion("pricer =", value, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricerNotEqualTo(String value) {
            addCriterion("pricer <>", value, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricerGreaterThan(String value) {
            addCriterion("pricer >", value, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricerGreaterThanOrEqualTo(String value) {
            addCriterion("pricer >=", value, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricerLessThan(String value) {
            addCriterion("pricer <", value, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricerLessThanOrEqualTo(String value) {
            addCriterion("pricer <=", value, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricerLike(String value) {
            addCriterion("pricer like", value, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricerNotLike(String value) {
            addCriterion("pricer not like", value, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricerIn(List<String> values) {
            addCriterion("pricer in", values, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricerNotIn(List<String> values) {
            addCriterion("pricer not in", values, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricerBetween(String value1, String value2) {
            addCriterion("pricer between", value1, value2, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricerNotBetween(String value1, String value2) {
            addCriterion("pricer not between", value1, value2, "pricer");
            return (Criteria) this;
        }

        public Criteria andPricetimeIsNull() {
            addCriterion("pricetime is null");
            return (Criteria) this;
        }

        public Criteria andPricetimeIsNotNull() {
            addCriterion("pricetime is not null");
            return (Criteria) this;
        }

        public Criteria andPricetimeEqualTo(String value) {
            addCriterion("pricetime =", value, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPricetimeNotEqualTo(String value) {
            addCriterion("pricetime <>", value, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPricetimeGreaterThan(String value) {
            addCriterion("pricetime >", value, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPricetimeGreaterThanOrEqualTo(String value) {
            addCriterion("pricetime >=", value, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPricetimeLessThan(String value) {
            addCriterion("pricetime <", value, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPricetimeLessThanOrEqualTo(String value) {
            addCriterion("pricetime <=", value, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPricetimeLike(String value) {
            addCriterion("pricetime like", value, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPricetimeNotLike(String value) {
            addCriterion("pricetime not like", value, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPricetimeIn(List<String> values) {
            addCriterion("pricetime in", values, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPricetimeNotIn(List<String> values) {
            addCriterion("pricetime not in", values, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPricetimeBetween(String value1, String value2) {
            addCriterion("pricetime between", value1, value2, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPricetimeNotBetween(String value1, String value2) {
            addCriterion("pricetime not between", value1, value2, "pricetime");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("payer is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("payer is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("payer =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("payer <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("payer >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("payer >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("payer <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("payer <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("payer like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("payer not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("payer in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("payer not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("payer between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("payer not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("paytime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("paytime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(String value) {
            addCriterion("paytime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(String value) {
            addCriterion("paytime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(String value) {
            addCriterion("paytime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("paytime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(String value) {
            addCriterion("paytime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(String value) {
            addCriterion("paytime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLike(String value) {
            addCriterion("paytime like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotLike(String value) {
            addCriterion("paytime not like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<String> values) {
            addCriterion("paytime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<String> values) {
            addCriterion("paytime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(String value1, String value2) {
            addCriterion("paytime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(String value1, String value2) {
            addCriterion("paytime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoIsNull() {
            addCriterion("sendtransportno is null");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoIsNotNull() {
            addCriterion("sendtransportno is not null");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoEqualTo(String value) {
            addCriterion("sendtransportno =", value, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoNotEqualTo(String value) {
            addCriterion("sendtransportno <>", value, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoGreaterThan(String value) {
            addCriterion("sendtransportno >", value, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoGreaterThanOrEqualTo(String value) {
            addCriterion("sendtransportno >=", value, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoLessThan(String value) {
            addCriterion("sendtransportno <", value, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoLessThanOrEqualTo(String value) {
            addCriterion("sendtransportno <=", value, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoLike(String value) {
            addCriterion("sendtransportno like", value, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoNotLike(String value) {
            addCriterion("sendtransportno not like", value, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoIn(List<String> values) {
            addCriterion("sendtransportno in", values, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoNotIn(List<String> values) {
            addCriterion("sendtransportno not in", values, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoBetween(String value1, String value2) {
            addCriterion("sendtransportno between", value1, value2, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtransportnoNotBetween(String value1, String value2) {
            addCriterion("sendtransportno not between", value1, value2, "sendtransportno");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendtime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendtime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendtime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendtime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendtime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendtime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendtime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendtime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendtime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendtime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andUsertimeIsNull() {
            addCriterion("usertime is null");
            return (Criteria) this;
        }

        public Criteria andUsertimeIsNotNull() {
            addCriterion("usertime is not null");
            return (Criteria) this;
        }

        public Criteria andUsertimeEqualTo(Date value) {
            addCriterion("usertime =", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeNotEqualTo(Date value) {
            addCriterion("usertime <>", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeGreaterThan(Date value) {
            addCriterion("usertime >", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("usertime >=", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeLessThan(Date value) {
            addCriterion("usertime <", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeLessThanOrEqualTo(Date value) {
            addCriterion("usertime <=", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeIn(List<Date> values) {
            addCriterion("usertime in", values, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeNotIn(List<Date> values) {
            addCriterion("usertime not in", values, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeBetween(Date value1, Date value2) {
            addCriterion("usertime between", value1, value2, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeNotBetween(Date value1, Date value2) {
            addCriterion("usertime not between", value1, value2, "usertime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andFjIsNull() {
            addCriterion("fj is null");
            return (Criteria) this;
        }

        public Criteria andFjIsNotNull() {
            addCriterion("fj is not null");
            return (Criteria) this;
        }

        public Criteria andFjEqualTo(String value) {
            addCriterion("fj =", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotEqualTo(String value) {
            addCriterion("fj <>", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThan(String value) {
            addCriterion("fj >", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThanOrEqualTo(String value) {
            addCriterion("fj >=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThan(String value) {
            addCriterion("fj <", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThanOrEqualTo(String value) {
            addCriterion("fj <=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLike(String value) {
            addCriterion("fj like", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotLike(String value) {
            addCriterion("fj not like", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjIn(List<String> values) {
            addCriterion("fj in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotIn(List<String> values) {
            addCriterion("fj not in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjBetween(String value1, String value2) {
            addCriterion("fj between", value1, value2, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotBetween(String value1, String value2) {
            addCriterion("fj not between", value1, value2, "fj");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}