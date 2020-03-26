package com.liuyujiie.AblitUtil;

import com.alibaba.fastjson.JSONObject;
import com.ohaotian.plugin.tapclient.annotation.TapClient;
import com.ohaotian.plugin.tapclient.annotation.TapMethod;


/**
* @Description:
* @Param:
* @return:
* @Author: liuyishou
* @Date: 2020/1/6
 **/
@TapClient("CallAbilityService")
public interface CallAbilityService {

    /**
     * @描述 GAJ_ZT_0001  二代居民身份证
     */
    @TapMethod(path = "/dataCenter/enterpriseInfo/secondIdCardQuery/v1", isTrans = false, serviceCode = "SECOND_ID_CARD_QUERY")
    JSONObject getPersonId(JSONObject json);
    /**
     * @描述 SBB_ZT_360   统一社会信用代码证
     */
    @TapMethod(path = "/dataCenter/enterpriseInfo/unifiedSocialCreditCodeCertificate/v1", isTrans = false, serviceCode = "UNIFIED_SOCIAL_CREDIT_CODE_CERTIFICATE")
    JSONObject getSociologyCode(JSONObject json);
    /**
     * @描述 GSJ_ZT_0002  营业执照查询
     */
    @TapMethod(path = "/dataCenter/enterpriseInfo/getBusinessLicense/v1", isTrans = false, serviceCode = "GET_BUSINESS_LICENSE")
    JSONObject getBusinessLicense(JSONObject json);
    /**
     * @描述 MZJ_ZT_359   民政厅婚姻登记证
     */
    @TapMethod(path = "/dataCenter/enterpriseInfo/marriageRegistrationCertificate/v1", isTrans = false, serviceCode = "MARRIAGE_REGISTRATION_CERTIFICATE")
    JSONObject getMarriageRegistration(JSONObject json);
    /**
     * @描述 MZJ_ZT_0018  社会团体法人登记证
     */
    @TapMethod(path = "/dataCenter/enterpriseInfo/socialLegalPerson/v1", isTrans = false, serviceCode = "SOCIAL_LEGAL_PERSON")
    JSONObject getCompanyRegistration(JSONObject json);
    /**
     * @描述 GXW_ZT_D_86  出生医学证明查询
     */
    @TapMethod(path = "dataCenter/enterpriseInfo/birthMedicalCertificate/v1", isTrans = false, serviceCode = "BIRTH_MEDICAL_CERTIFICATE")
    JSONObject getBirthProve(JSONObject json);
    /**
     * @描述 SJW_ZT_339   市建委建筑工程施工许可证
     */
    @TapMethod(path = "/dataCenter/enterpriseInfo/municipalConstructionCommissionPermit", isTrans = false, serviceCode = "MUNICIPAL_CONSTRUCTION_COMMISSION_PERMIT")
    JSONObject getConstructionPermit(JSONObject json);
    /**
     * @描述 数据共享统计（大屏）
     */
    @TapMethod(path = "/dataCenter/app/dataSharingStatistics/v1", isTrans = false, serviceCode = "DATA_SHARING_STATISTICS")
    JSONObject getShareDate(JSONObject json);


}