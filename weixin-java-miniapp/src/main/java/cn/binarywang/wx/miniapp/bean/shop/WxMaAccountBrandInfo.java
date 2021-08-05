package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 小程序交易组件-自定义组件-商家品牌
 *
 * @author ShienPro
 * @since 2021-08-05
 */
@Data
public class WxMaAccountBrandInfo implements Serializable {
  private static final long serialVersionUID = 1044725456960346728L;

  @SerializedName("brand_id")
  private String brandId;
  @SerializedName("brand_wording")
  private String brandWording;
}
