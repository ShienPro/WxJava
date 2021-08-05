package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 小程序交易组件-自定义组件-商家类目
 *
 * @author ShienPro
 * @since 2021-08-05
 */
@Data
public class WxMaAccountCategoryInfo implements Serializable {
  private static final long serialVersionUID = -941455893260715311L;

  @SerializedName("first_cat_id")
  private String firstCatId;
  @SerializedName("second_cat_id")
  private String secondCatId;
  @SerializedName("third_cat_id")
  private String thirdCatId;
  @SerializedName("first_cat_name")
  private String firstCatName;
  @SerializedName("second_cat_name")
  private String secondCatName;
  @SerializedName("third_cat_name")
  private String thirdCatName;
}
