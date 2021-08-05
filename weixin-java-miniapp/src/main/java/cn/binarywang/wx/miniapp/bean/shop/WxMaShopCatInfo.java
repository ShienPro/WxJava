package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 小程序交易组件-自定义组件-商品类目
 * <p></p>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/cat/get_children_cateogry.html#%E5%9B%9E%E5%8C%85%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-04
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WxMaShopCatInfo implements Serializable {
  private static final long serialVersionUID = 6306731354340117146L;

  @SerializedName("third_cat_id")
  Integer thirdCatId;
  @SerializedName("third_cat_name")
  String thirdCatName;
  @SerializedName("qualification")
  String qualification;
  @SerializedName("qualification_type")
  Integer qualificationType;
  @SerializedName("product_qualification")
  String productQualification;
  @SerializedName("product_qualification_type")
  Integer productQualificationType;
  @SerializedName("first_cat_id")
  Integer firstCatId;
  @SerializedName("first_cat_name")
  String firstCatName;
  @SerializedName("second_cat_id")
  Integer secondCatId;
  @SerializedName("second_cat_name")
  String secondCatName;
}
