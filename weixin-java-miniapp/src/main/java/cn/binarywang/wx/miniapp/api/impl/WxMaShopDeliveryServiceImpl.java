package cn.binarywang.wx.miniapp.api.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaShopDeliveryService;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopDeliveryCompany;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopDeliveryReceiveInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopSendDeliveryInfo;
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
public class WxMaShopDeliveryServiceImpl implements WxMaShopDeliveryService {
  private final WxMaService service;

  private final Type COMPANY_LIST_TYPE = new TypeToken<List<WxMaShopDeliveryCompany>>() {
  }.getType();

  @Override
  public List<WxMaShopDeliveryCompany> getCompanyList() throws WxErrorException {
    String responseContent = this.service.post(WxMaApiUrlConstants.Shop.Delivery.GET_COMPANY_LIST, "{}");
    JsonObject jsonObject = GsonParser.parse(responseContent);
    return WxMaGsonBuilder.create().fromJson(jsonObject.get("company_list"), COMPANY_LIST_TYPE);
  }

  @Override
  public void send(WxMaShopSendDeliveryInfo sendInfo) throws WxErrorException {
    this.service.post(WxMaApiUrlConstants.Shop.Delivery.SEND, sendInfo);
  }

  @Override
  public void receive(WxMaShopDeliveryReceiveInfo receiveInfo) throws WxErrorException {
    this.service.post(WxMaApiUrlConstants.Shop.Delivery.RECIEVE, receiveInfo);
  }
}
