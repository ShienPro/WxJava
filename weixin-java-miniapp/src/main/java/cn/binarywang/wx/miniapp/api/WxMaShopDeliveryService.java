package cn.binarywang.wx.miniapp.api;

import cn.binarywang.wx.miniapp.bean.shop.WxMaShopDeliveryCompany;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopDeliveryReceiveInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopSendDeliveryInfo;
import me.chanjar.weixin.common.error.WxErrorException;

import java.util.List;

/**
 * 小程序交易组件-自定义组件-物流服务
 *
 * @author ShienPro
 * @since 2021-08-06
 */
public interface WxMaShopDeliveryService {
  /**
   * 获取快递公司列表
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/delivery/get_company_list.html">文档地址</a>
   *
   * @return 快递公司列表
   * @throws WxErrorException 获取失败时抛出，具体错误码请看文档
   */
  List<WxMaShopDeliveryCompany> getCompanyList() throws WxErrorException;

  /**
   * 订单发货
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/delivery/send.html">文档地址</a>
   *
   * @throws WxErrorException 发货失败时抛出，具体错误码请看文档
   */
  void send(WxMaShopSendDeliveryInfo sendInfo) throws WxErrorException;

  /**
   * 订单确认收货
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/delivery/recieve.html">文档地址</a>
   *
   * @param receiveInfo 收货信息
   * @throws WxErrorException 确认失败时抛出，具体错误码请看文档
   */
  void receive(WxMaShopDeliveryReceiveInfo receiveInfo) throws WxErrorException;
}
