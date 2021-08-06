package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 小程序交易组件-自定义组件-售后更新信息
 * <br/>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/aftersale/update.html#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-06
 */
@Data
public class WxMaAftersaleUpdateInfo implements Serializable {
  private static final long serialVersionUID = -7707337226145013859L;

  /**
   * 商家自定义订单ID
   * <br/>
   * 必填
   */
  @SerializedName("out_order_id")
  private String outOrderId;
  /**
   * 商家自定义售后ID
   * <br/>
   * 必填
   */
  @SerializedName("out_aftersale_id")
  private String outAftersaleId;
  /**
   * 用户的openid
   * <br/>
   * 必填
   */
  @SerializedName("openid")
  private String openid;
  /**
   * 0:未受理
   * 1:用户取消
   * 2:商家受理中
   * 3:商家逾期未处理
   * 4:商家拒绝退款
   * 5:商家拒绝退货退款
   * 6:待买家退货
   * 7:退货退款关闭
   * 8:待商家收货
   * 11:商家退款中
   * 12:商家逾期未退款
   * 13:退款完成
   * 14:退货退款完成
   * 15:换货完成
   * 16:待商家发货
   * 17:待用户确认收货
   * 18:商家拒绝换货
   * 19:商家已收到货
   * <br/>
   * 必填
   */
  @SerializedName("status")
  private Integer status;
  /**
   * 0:售后未结束
   * 1:售后结束且订单状态流转
   * <br/>
   * 必填
   */
  @SerializedName("finish_all_aftersale")
  private Integer finishAllAftersale;
}
