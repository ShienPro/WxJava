package cn.binarywang.wx.miniapp.api.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaShopAccountService;
import cn.binarywang.wx.miniapp.bean.shop.WxMaAccountBrandInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaAccountCategoryInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaAccountInfo;
import cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants;
import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.json.GsonParser;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author ShienPro
 * @since 2021-08-05
 */
@RequiredArgsConstructor
@Slf4j
public class WxMaShopAccountServiceImpl implements WxMaShopAccountService {
  private final WxMaService service;

  private final Type CATEGORY_LIST_TYPE = new TypeToken<List<WxMaAccountCategoryInfo>>() {
  }.getType();
  private final Type BRAND_LIT_TYPE = new TypeToken<List<WxMaAccountBrandInfo>>() {
  }.getType();

  @Override
  public List<WxMaAccountCategoryInfo> getCategoryList() throws WxErrorException {
    String responseContent = this.service.post(WxMaApiUrlConstants.Shop.Account.GET_CATEGORY_LIST, "{}");
    JsonObject jsonObject = GsonParser.parse(responseContent);
    return WxMaGsonBuilder.create().fromJson(jsonObject.get("data"), CATEGORY_LIST_TYPE);
  }

  @Override
  public List<WxMaAccountBrandInfo> getBrandList() throws WxErrorException {
    String responseContent = this.service.post(WxMaApiUrlConstants.Shop.Account.GET_BRAND_LIST, "{}");
    JsonObject jsonObject = GsonParser.parse(responseContent);
    return WxMaGsonBuilder.create().fromJson(jsonObject.get("data"), BRAND_LIT_TYPE);
  }

  @Override
  public void updateInfo(WxMaAccountInfo info) throws WxErrorException {
    this.service.post(WxMaApiUrlConstants.Shop.Account.UPDATE_INFO, info);
  }

  @Override
  public WxMaAccountInfo getInfo() throws WxErrorException {
    String responseContent = this.service.post(WxMaApiUrlConstants.Shop.Account.GET_INFO, "{}");
    JsonObject jsonObject = GsonParser.parse(responseContent);
    return WxMaGsonBuilder.create().fromJson(jsonObject.get("data"), WxMaAccountInfo.class);
  }
}
