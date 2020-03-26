package com.liuyujiie.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @program: authority
 * @description:
 * @author: liuyishou
 * @create: 2019-09-17 15:34
 **/
public class IndexRspBo  implements Serializable {
    private static final long serialVersionUID = -98843619169312357L;
    /**
     * 注册总量
     */
    private String statisticsTotalCount;
    /**
     * 企业注册总量
     */
    private String companyStatisticsTotalCount;
    /**
     * 自然人注册总量
     */
    private String personalStatisticsTotalCount;
    /**
     * 累计提交办件
     */
    private String numberStatusYearAll;
    /**
     * 今日提交提交办件
     */
    private String numberStatusAll;
    /**
     * 累计办结
     */
    private String endStatusYearAll;
    /**
     * 累计驳回量
     */
    private String rejectStatusYearAll;
    /**
     * 各区划累计提交办件量
     */
    private Map<String, String> map;

    /**
     * 高频事项
     */
    private Map<String, Integer> listGpsxNumberMap;

    /**
     * 目录系统统计部门数量
     */
    private String deptName;
    /**
     * 目录系统统计  已上线目录量
     */
    private String informatCount;

    /**
     * 交换_归集库规模查询接口 累计归集数据量
     */
    private String rowNum;

    /**
     * 数据共享统计（大屏）资源调用累计量
     */
    private String interCount;
    /**
     * 数据共享统计（大屏）共享接口
     */
    private String inter;
    /**
     * 数据共享统计（大屏）之每月接口调用量
     */
    private List<Map<String, String>> sharedList;
    /**
     * 数据共享统计（大屏）之各主题库接口数量
     */
    private Map<String, String> classifyInterMap;
    /**
     * 数据共享统计（大屏）之各主题库 接口调用总数量
     */
    private Map<String, String> ClassifyInterCountMap;
    /**
     * 根据指定事项类型统计发布事项数量及其百分比
     */
    private List<AmcItemTypeBO> amcItemTypeList;

    public String getInterCount() {
        return interCount;
    }

    public void setInterCount(String interCount) {
        this.interCount = interCount;
    }

    public String getInter() {
        return inter;
    }

    public void setInter(String inter) {
        this.inter = inter;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getInformatCount() {
        return informatCount;
    }

    public void setInformatCount(String informatCount) {
        this.informatCount = informatCount;
    }

    public String getRowNum() {
        return rowNum;
    }

    public void setRowNum(String rowNum) {
        this.rowNum = rowNum;
    }

    public List<Map<String, String>> getSharedList() {
        return sharedList;
    }

    public void setSharedList(List<Map<String, String>> sharedList) {
        this.sharedList = sharedList;
    }

    public Map<String, String> getClassifyInterMap() {
        return classifyInterMap;
    }

    public void setClassifyInterMap(Map<String, String> classifyInterMap) {
        this.classifyInterMap = classifyInterMap;
    }

    public Map<String, String> getClassifyInterCountMap() {
        return ClassifyInterCountMap;
    }

    public void setClassifyInterCountMap(Map<String, String> classifyInterCountMap) {
        ClassifyInterCountMap = classifyInterCountMap;
    }

    public List<AmcItemTypeBO> getAmcItemTypeList() {
        return amcItemTypeList;
    }

    public void setAmcItemTypeList(List<AmcItemTypeBO> amcItemTypeList) {
        this.amcItemTypeList = amcItemTypeList;
    }

    public Map<String, Integer> getListGpsxNumberMap() {
        return listGpsxNumberMap;
    }

    public void setListGpsxNumberMap(Map<String, Integer> listGpsxNumberMap) {
        this.listGpsxNumberMap = listGpsxNumberMap;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String getNumberStatusYearAll() {
        return numberStatusYearAll;
    }

    public void setNumberStatusYearAll(String numberStatusYearAll) {
        this.numberStatusYearAll = numberStatusYearAll;
    }

    public String getNumberStatusAll() {
        return numberStatusAll;
    }

    public void setNumberStatusAll(String numberStatusAll) {
        this.numberStatusAll = numberStatusAll;
    }

    public String getEndStatusYearAll() {
        return endStatusYearAll;
    }

    public void setEndStatusYearAll(String endStatusYearAll) {
        this.endStatusYearAll = endStatusYearAll;
    }

    public String getRejectStatusYearAll() {
        return rejectStatusYearAll;
    }

    public void setRejectStatusYearAll(String rejectStatusYearAll) {
        this.rejectStatusYearAll = rejectStatusYearAll;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStatisticsTotalCount() {
        return statisticsTotalCount;
    }

    public void setStatisticsTotalCount(String statisticsTotalCount) {
        this.statisticsTotalCount = statisticsTotalCount;
    }

    public String getCompanyStatisticsTotalCount() {
        return companyStatisticsTotalCount;
    }

    public void setCompanyStatisticsTotalCount(String companyStatisticsTotalCount) {
        this.companyStatisticsTotalCount = companyStatisticsTotalCount;
    }

    public String getPersonalStatisticsTotalCount() {
        return personalStatisticsTotalCount;
    }

    public void setPersonalStatisticsTotalCount(String personalStatisticsTotalCount) {
        this.personalStatisticsTotalCount = personalStatisticsTotalCount;
    }
}
