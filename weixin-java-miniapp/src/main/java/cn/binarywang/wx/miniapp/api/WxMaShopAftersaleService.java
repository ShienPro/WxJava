package cn.binarywang.wx.miniapp.api;

import cn.binarywang.wx.miniapp.bean.shop.WxMaAftersaleAddInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaAftersaleInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaAftersaleUpdateInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopAftersaleGetInfo;
import me.chanjar.weixin.common.error.WxErrorException;

import java.util.List;

/**
 * 小程序交易组件-自定义组件-售后服务
 *
 * @author ShienPro
 * @since 2021-08-06
 */
public interface WxMaShopAftersaleService {
  /**
   * 创建售后
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/aftersale/add.html">文档地址</a>
   *
   * @param aftersaleInfo 售后信息
   * @throws WxErrorException 创建失败时抛出，具体错误码请看文档
   */
  void add(WxMaAftersaleAddInfo aftersaleInfo) throws WxErrorException;

  /**
   * 获取订单下售后单
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/aftersale/get.html">文档地址</a>
   *
   * @param queryInfo 售后查询信息
   * @return 订单下的售后单
   * @throws WxErrorException 获取失败时抛出，具体错误码请看文档
   */
  List<WxMaAftersaleInfo> get(WxMaShopAftersaleGetInfo queryInfo) throws WxErrorException;

  /**
   * 更新售后
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/aftersale/update.html">文档地址</a>
   *
   * @param updateInfo 售后更新信息
   * @throws WxErrorException 更新失败时抛出，具体错误码请看文档
   */
  void update(WxMaAftersaleUpdateInfo updateInfo) throws WxErrorException;
}
