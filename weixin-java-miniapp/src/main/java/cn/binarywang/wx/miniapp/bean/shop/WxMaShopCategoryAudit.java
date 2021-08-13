package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 小程序交易组件-自定义组件-类目审核
 * <br/>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/audit/audit_category.html#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-05
 */
@Data
@NoArgsConstructor
public class WxMaShopCategoryAudit implements Serializable {
  private static final long serialVersionUID = 3448053701754609593L;

  public WxMaShopCategoryAudit(String license, Integer level1, Integer level2, Integer level3, List<String> certificate) {
    this.license = license;
    this.categoryInfo = new CategoryInfo();
    this.categoryInfo.level1 = level1;
    this.categoryInfo.level2 = level2;
    this.categoryInfo.level3 = level3;
    this.categoryInfo.certificate = certificate;
  }

  /**
   * 营业执照或组织机构代码证，图片url
   * <br/>
   * 必填
   */
  @SerializedName("license")
  private String license;

  @SerializedName("category_info")
  private CategoryInfo categoryInfo;

  @Data
  public static class CategoryInfo implements Serializable {
    private static final long serialVersionUID = -5697859309819276612L;

    /**
     * 一级类目
     * <br/>
     * 必填
     */
    @SerializedName("level1")
    private Integer level1;
    /**
     * 二级类目
     * <br/>
     * 必填
     */
    @SerializedName("level2")
    private Integer level2;
    /**
     * 三级类目
     * <br/>
     * 必填
     */
    @SerializedName("level3")
    private Integer level3;
    /**
     * 资质材料，图片url
     * <br/>
     * 必填
     */
    @SerializedName("certificate")
    private List<String> certificate;
  }
}
