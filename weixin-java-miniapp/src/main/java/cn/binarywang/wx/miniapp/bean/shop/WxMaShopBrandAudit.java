package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 小程序交易组件-自定义组件-品牌审核
 * <br/>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/audit/audit_category.html#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-05
 */
@Data
public class WxMaShopBrandAudit implements Serializable {
  private static final long serialVersionUID = -8794355555257131336L;

  /**
   * 营业执照或组织机构代码证，图片url
   * <br/>
   * 必填
   */
  @SerializedName("license")
  private List<String> license;

  @SerializedName("brand_info")
  private BrandInfo brandInfo;

  /**
   * 品牌信息
   * <br/>
   * 字段是否必填比较复杂，请直接查看文档
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/audit/audit_category.html#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
   * 文档地址
   * </a>
   */
  @Data
  public static class BrandInfo implements Serializable {
    private static final long serialVersionUID = 1593606371347925987L;

    /**
     * 认证审核类型
     */
    @SerializedName("brand_audit_type")
    private Integer brandAuditType;
    /**
     * 商标分类
     */
    @SerializedName("trademark_type")
    private String trademarkType;
    /**
     * 选择品牌经营类型
     */
    @SerializedName("brandManagement_type")
    private Integer brandManagementType;
    /**
     * 商品产地是否进口
     */
    @SerializedName("commodity_origin_type")
    private Integer commodityOriginType;
    /**
     * 商标/品牌词
     */
    @SerializedName("brand_wording")
    private String brandWording;
    /**
     * 销售授权书（如商持人为自然人，还需提供有其签名的身份证正反面扫描件)，图片url/media_id
     */
    @SerializedName("sale_authorization")
    private List<String> saleAuthorization;
    /**
     * 商标注册证书，图片url/media_id
     */
    @SerializedName("trademark_registration_certificate")
    private List<String> trademarkRegistration_certificate;
    /**
     * 商标变更证明，图片url/media_id
     */
    @SerializedName("trademark_change_certificate")
    private List<String> trademarkChange_certificate;
    /**
     * 商标注册人姓名
     */
    @SerializedName("trademark_registrant")
    private String trademarkRegistrant;
    /**
     * 商标注册号/申请号
     */
    @SerializedName("trademark_registrant_nu")
    private String trademarkRegistrantNu;
    /**
     * 商标有效期 yyyy-MM-dd HH:mm:ss
     */
    @SerializedName("trademark_authorization_period")
    private String trademarkAuthorizationPeriod;
    /**
     * 商标注册申请受理通知书，图片url/media_id
     */
    @SerializedName("trademark_registration_application")
    private List<String> trademarkRegistrationApplication;
    /**
     * 商标申请人姓名
     */
    @SerializedName("trademark_applicant")
    private String trademarkApplicant;
    /**
     * 商标申请时间 yyyy-MM-dd HH:mm:ss
     */
    @SerializedName("trademark_application_time")
    private String trademarkApplicationTime;
    /**
     * 中华人民共和国海关进口货物报关单，图片url/media_id
     */
    @SerializedName("imported_goods_form")
    private List<String> importedGoodsForm;
  }
}
