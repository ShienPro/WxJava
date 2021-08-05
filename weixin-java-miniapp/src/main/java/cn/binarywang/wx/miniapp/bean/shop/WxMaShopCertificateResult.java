package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 小程序交易组件-自定义组件-小程序资质
 * <br/>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/audit/get_miniapp_certificate.html#%E5%9B%9E%E5%8C%85%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-05
 */
@Data
public class WxMaShopCertificateResult implements Serializable {
  private static final long serialVersionUID = -7209044247361102750L;

  private BrandInfo brandInfo;
  private List<CategoryInfo> categoryInfoList;

  @Data
  public static class BrandInfo implements Serializable {
    private static final long serialVersionUID = -4997644025790568585L;

    @SerializedName("brand_wording")
    private String brandWording;
    @SerializedName("sale_authorization")
    private List<String> saleAuthorization;
    @SerializedName("trademark_registration_certificate")
    private List<String> trademarkRegistrationCertificate;
  }

  @Data
  public static class CategoryInfo implements Serializable {
    private static final long serialVersionUID = -8451110764653946748L;

    @SerializedName("first_category_id")
    private String firstCategoryId;
    @SerializedName("first_category_name")
    private String firstCategoryName;
    @SerializedName("second_category_id")
    private String secondCategoryId;
    @SerializedName("second_category_name")
    private String secondCategoryName;
    @SerializedName("certificate_url")
    private String certificateUrl;
  }
}
