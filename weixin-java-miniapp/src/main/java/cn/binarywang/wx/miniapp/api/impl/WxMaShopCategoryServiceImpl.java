package cn.binarywang.wx.miniapp.api.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaShopCategoryService;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopCatInfo;
import cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants;
import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.json.GsonParser;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author ShienPro
 * @since 2021-08-04
 */
@RequiredArgsConstructor
public class WxMaShopCategoryServiceImpl implements WxMaShopCategoryService {
  private final WxMaService service;

  private final Type CATEGORY_TYPE = new TypeToken<List<WxMaShopCatInfo>>() {
  }.getType();

  @Override
  public List<WxMaShopCatInfo> getCategory() throws WxErrorException {
    String responseContent = this.service.post(WxMaApiUrlConstants.Shop.Category.GET, "{}");
    JsonObject jsonObject = GsonParser.parse(responseContent);
    return WxMaGsonBuilder.create().fromJson(jsonObject.get("third_cat_list"), CATEGORY_TYPE);
  }
}
