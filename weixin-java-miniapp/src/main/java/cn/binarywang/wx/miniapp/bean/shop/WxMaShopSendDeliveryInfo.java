package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 小程序交易组件-自定义组件-发货信息
 * <br/>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/delivery/send.html#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-06
 */
@Data
public class WxMaShopSendDeliveryInfo implements Serializable {
  private static final long serialVersionUID = -4624262337564076323L;
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
  /**
   * 发货完成标志位, 0: 未发完, 1:已发完
   * <br/>
   * 必填
   */
  @SerializedName("finish_all_delivery")
  private Integer finishAllDelivery;
  /**
   * 快递信息
   * <br/>
   * delivery_type=1时必填
   */
  @SerializedName("delivery_list")
  private List<Delivery> deliveryList;

  @Data
  public static class Delivery implements Serializable {
    private static final long serialVersionUID = -5358864848071441850L;
    /**
     * 快递公司ID，通过获取快递公司列表获取
     * <br/>
     * 快递信息填的时候必填
     */
    @SerializedName("delivery_id")
    private String deliveryId;
    /**
     * 快递单号
     * <br/>
     * 快递信息填的时候必填
     */
    @SerializedName("waybill_id")
    private String waybillId;
  }
}
