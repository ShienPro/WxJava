package cn.binarywang.wx.miniapp.api;

import cn.binarywang.wx.miniapp.bean.shop.WxMaAccountBrandInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaAccountCategoryInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaAccountInfo;
import me.chanjar.weixin.common.error.WxErrorException;

import java.util.List;

/**
 * 小程序交易组件-自定义组件-商家入驻服务
 *
 * @author ShienPro
 * @since 2021-08-05
 */
public interface WxMaShopAccountService {
  /**
   * 获取商家类目列表
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/account/category_list.html">文档地址</a>
   *
   * @return 已申请成功的类类目列表
   * @throws WxErrorException 获取失败时抛出，具体错误码请看文档
   */
  List<WxMaAccountCategoryInfo> getCategoryList() throws WxErrorException;

  /**
   * 获取商家品牌列表
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/account/brand_list.html">文档地址</a>
   *
   * @return 已申请成功的品牌列表
   * @throws WxErrorException 获取失败时抛出，具体错误码请看文档
   */
  List<WxMaAccountBrandInfo> getBrandList() throws WxErrorException;

  /**
   * 更新商家信息
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/account/update_info.html">文档地址</a>
   *
   * @param info 商家信息
   * @throws WxErrorException 更新失败时抛出，具体错误码请看文档
   */
  void updateInfo(WxMaAccountInfo info) throws WxErrorException;

  /**
   * 获取商家信息
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/account/get_info.html">文档地址</a>
   *
   * @return 商家信息
   * @throws WxErrorException 获取资质信息失败时抛出，具体错误码请看文档
   */
  WxMaAccountInfo getInfo() throws WxErrorException;
}
