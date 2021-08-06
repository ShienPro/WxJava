package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 小程序交易组件-自定义组件-确认收货信息
 * <br/>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/delivery/recieve.html#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-06
 */
@Data
public class WxMaShopDeliveryReceiveInfo implements Serializable {
  private static final long serialVersionUID = 1099180670380133452L;

  /**
   * 订单ID
   * <br/>
   * 与商家自定义订单ID二选一
   */
  @SerializedName("order_id")
  private Integer orderId;
  /**
   * 商家自定义订单ID
   * <br/>
   * 与订单ID二选一
   */
  @SerializedName("out_order_id")
  private String outOrderId;
  /**
   * 用户的openid
   * <br/>
   * 必填
   */
  @SerializedName("openid")
  private String openid;
}
