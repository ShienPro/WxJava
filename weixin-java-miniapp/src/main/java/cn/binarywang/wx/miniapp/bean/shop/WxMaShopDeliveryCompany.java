package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 小程序交易组件-自定义组件-快递公司
 * <br/>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/delivery/get_company_list.html#%E5%9B%9E%E5%8C%85%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-06
 */
@Data
public class WxMaShopDeliveryCompany implements Serializable {
  private static final long serialVersionUID = 6667872436634241668L;

  @SerializedName("delivery_id")
  private String deliveryId;
  @SerializedName("delivery_name")
  private String deliveryName;
}
