package cn.binarywang.wx.miniapp.api.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaShopAuditService;
import cn.binarywang.wx.miniapp.bean.shop.WxMaAuditResult;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopBrandAudit;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopCategoryAudit;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopCertificateResult;
import cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants;
import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.json.GsonHelper;
import me.chanjar.weixin.common.util.json.GsonParser;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author ShienPro
 * @since 2021-08-05
 */
@RequiredArgsConstructor
@Slf4j
public class WxMaShopAuditServiceImpl implements WxMaShopAuditService {
  private final WxMaService service;

  @Override
  public String auditCategory(WxMaShopCategoryAudit audit) throws WxErrorException {
    AuditReq req = new AuditReq(audit);
    String responseContent = service.post(WxMaApiUrlConstants.Shop.Audit.AUDIT_CATEGORY, req);
    JsonObject jsonObject = GsonParser.parse(responseContent);
    return jsonObject.get("audit_id").getAsString();
  }

  @Override
  public String auditBrand(WxMaShopBrandAudit audit) throws WxErrorException {
    AuditReq req = new AuditReq(audit);
    String responseContent = service.post(WxMaApiUrlConstants.Shop.Audit.AUDIT_BRAND, req);
    JsonObject jsonObject = GsonParser.parse(responseContent);
    return jsonObject.get("audit_id").getAsString();
  }

  @Override
  public WxMaAuditResult getAuditResult(String auditId) throws WxErrorException {
    String responseContent = service.post(
      WxMaApiUrlConstants.Shop.Audit.RESULT,
      GsonHelper.buildJsonObject("audit_id", auditId)
    );
    JsonObject jsonObject = GsonParser.parse(responseContent);
    return WxMaGsonBuilder.create().fromJson(jsonObject.get("data"), WxMaAuditResult.class);
  }

  private final Type CATEGORY_LIST_TYPE = new TypeToken<List<WxMaShopCertificateResult.CategoryInfo>>() {
  }.getType();

  @Override
  public WxMaShopCertificateResult getCertificate(Integer reqType) throws WxErrorException {
    String responseContent = service.post(
      WxMaApiUrlConstants.Shop.Audit.GET_MINIAPP_CERTIFICATE,
      GsonHelper.buildJsonObject("req_type", reqType)
    );
    JsonObject jsonObject = GsonParser.parse(responseContent);
    WxMaShopCertificateResult result = new WxMaShopCertificateResult();

    if (reqType == 1) {
      result.setCategoryInfoList(
        WxMaGsonBuilder.create().fromJson(jsonObject.get("category_info_list"), CATEGORY_LIST_TYPE)
      );
      return result;
    }
    if (reqType == 2) {
      result.setBrandInfo(
        WxMaGsonBuilder.create().fromJson(jsonObject.get("brand_info"), WxMaShopCertificateResult.BrandInfo.class)
      );
      return result;
    }

    throw new WxErrorException("reqType枚举值错误");
  }

  @AllArgsConstructor
  @Getter
  public static class AuditReq {
    @SerializedName("audit_req")
    private final Object auditReq;
  }
}
