package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 小程序交易组件-自定义组件-售后单创建信息
 * <br/>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/aftersale/add.html#%E5%9B%9E%E5%8C%85%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-06
 */
@Data
public class WxMaAftersaleAddInfo implements Serializable {
  private static final long serialVersionUID = 1327561591814501758L;

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
   * 商家小程序该售后单的页面path，不存在则使用订单path
   * <br/>
   * 必填
   */
  @SerializedName("path")
  private String path;
  /**
   * 用户的openid
   * <br/>
   * 必填
   */
  @SerializedName("openid")
  private String openid;
  /**
   * 售后类型，1:退款,2:退款退货,3:换货
   * <br/>
   * 必填
   */
  @SerializedName("type")
  private Integer type;
  /**
   * 发起申请时间，yyyy-MM-dd HH:mm:ss
   * <br/>
   * 必填
   */
  @SerializedName("create_time")
  private String createTime;
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
   * 0:订单可继续售后
   * 1:订单无继续售后
   * <br/>
   * 必填
   */
  @SerializedName("finish_all_aftersale")
  private Integer finishAllAftersale;
  /**
   * 退货相关商品列表
   * <br/>
   * 必填
   */
  @SerializedName("product_infos")
  private List<Product> productInfos;

  @Data
  public static class Product implements Serializable {
    private static final long serialVersionUID = 1299613771982706936L;

    /**
     * 商家自定义商品ID
     * <br/>
     * 必填
     */
    @SerializedName("out_product_id")
    private String outProductId;
    /**
     * 	商家自定义sku ID, 如果没有则不填
     * <br/>
     * 必填
     */
    @SerializedName("out_sku_id")
    private String outSkuId;
    /**
     * 参与售后的商品数量
     * <br/>
     * 退货相关商品列表存在时必填
     */
    @SerializedName("product_cnt")
    private Integer productCnt;
  }
}
