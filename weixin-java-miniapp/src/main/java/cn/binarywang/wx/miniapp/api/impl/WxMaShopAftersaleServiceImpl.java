package cn.binarywang.wx.miniapp.api.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaShopAftersaleService;
import cn.binarywang.wx.miniapp.bean.shop.WxMaAftersaleAddInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaAftersaleInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaAftersaleUpdateInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopAftersaleGetInfo;
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
 * @since 2021-08-06
 */
@RequiredArgsConstructor
public class WxMaShopAftersaleServiceImpl implements WxMaShopAftersaleService {
  private final WxMaService service;

  @Override
  public void add(WxMaAftersaleAddInfo aftersaleInfo) throws WxErrorException {
    this.service.post(WxMaApiUrlConstants.Shop.Aftersale.ADD, aftersaleInfo);
  }

  private final Type AFTERSALE_LIST_TYPE = new TypeToken<List<WxMaAftersaleInfo>>() {
  }.getType();

  @Override
  public List<WxMaAftersaleInfo> get(WxMaShopAftersaleGetInfo queryInfo) throws WxErrorException {
    String responseContent = this.service.post(WxMaApiUrlConstants.Shop.Aftersale.GET, queryInfo);
    JsonObject jsonObject = GsonParser.parse(responseContent);
    return WxMaGsonBuilder.create().fromJson(jsonObject.get("aftersale_infos"), AFTERSALE_LIST_TYPE);
  }

  @Override
  public void update(WxMaAftersaleUpdateInfo updateInfo) throws WxErrorException {
    this.service.post(WxMaApiUrlConstants.Shop.Aftersale.UPDATE, updateInfo);
  }
}
