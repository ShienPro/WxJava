package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 小程序交易组件-自定义组件-商品类目
 * <br/>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/cat/get_children_cateogry.html#%E5%9B%9E%E5%8C%85%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-04
 */
@Data
public class WxMaShopCatInfo implements Serializable {
  private static final long serialVersionUID = 6306731354340117146L;

  @SerializedName("third_cat_id")
  private Integer thirdCatId;
  @SerializedName("third_cat_name")
  private String thirdCatName;
  @SerializedName("qualification")
  private String qualification;
  @SerializedName("qualification_type")
  private Integer qualificationType;
  @SerializedName("product_qualification")
  private String productQualification;
  @SerializedName("product_qualification_type")
  private Integer productQualificationType;
  @SerializedName("first_cat_id")
  private Integer firstCatId;
  @SerializedName("first_cat_name")
  private String firstCatName;
  @SerializedName("second_cat_id")
  private Integer secondCatId;
  @SerializedName("second_cat_name")
  private String secondCatName;
}
