package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
/**
 * 小程序交易组件-自定义组件-售后信息
 * <br/>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/aftersale/get.html#%E5%9B%9E%E5%8C%85%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-06
 */
@Data
public class WxMaAftersaleInfo implements Serializable {
  private static final long serialVersionUID = 5014072725232010911L;

  @SerializedName("out_aftersale_id")
  private String outAftersaleId;
  @SerializedName("path")
  private String path;
  @SerializedName("openid")
  private String openid;
  @SerializedName("type")
  private Integer type;
  @SerializedName("status")
  private Integer status;
  @SerializedName("product_infos")
  private List<Product> productInfos;

  @Data
  public static class Product implements Serializable {
    private static final long serialVersionUID = 1299613771982706936L;

    @SerializedName("out_product_id")
    private String outProductId;
    @SerializedName("out_sku_id")
    private String outSkuId;
    @SerializedName("product_cnt")
    private Integer productCnt;
  }
}
