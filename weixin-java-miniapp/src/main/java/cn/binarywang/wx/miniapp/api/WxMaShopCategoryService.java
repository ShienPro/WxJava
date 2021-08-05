package cn.binarywang.wx.miniapp.api;

import cn.binarywang.wx.miniapp.bean.shop.WxMaShopCatInfo;
import me.chanjar.weixin.common.error.WxErrorException;

import java.util.List;

/**
 * 小程序交易组件-自定义组件-商品类目服务
 *
 * @author ShienPro
 * @since 2021-08-04
 */
public interface WxMaShopCategoryService {
  /**
   * 获取商品类目
   * <br/>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/cat/get_children_cateogry.html">文档地址</a>
   *
   * @return 所有三级商品类目
   * @throws WxErrorException 获取失败时抛出，具体错误码请看文档
   */
  List<WxMaShopCatInfo> getCategory() throws WxErrorException;
}
