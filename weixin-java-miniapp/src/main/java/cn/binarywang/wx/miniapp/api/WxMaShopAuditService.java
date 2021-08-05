package cn.binarywang.wx.miniapp.api;

import cn.binarywang.wx.miniapp.bean.shop.WxMaAuditResult;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopBrandAudit;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopCategoryAudit;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopCertificateResult;
import me.chanjar.weixin.common.error.WxErrorException;

/**
 * 小程序交易组件-自定义组件-审核服务
 *
 * @author ShienPro
 * @since 2021-08-05
 */
public interface WxMaShopAuditService {
  /**
   * 上传类目资质/类目审核
   * <p></p>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/audit/audit_category.html">文档地址</a>
   *
   * @param audit 请求参数
   * @return 审核单id
   * @throws WxErrorException 上传失败时抛出，具体错误码请看文档
   */
  String auditCategory(WxMaShopCategoryAudit audit) throws WxErrorException;

  /**
   * 上传类品牌信息/品牌审核
   * <p></p>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/audit/audit_brand.html">文档地址</a>
   *
   * @param audit 请求参数
   * @return 审核单id
   * @throws WxErrorException 上传失败时抛出，具体错误码请看文档
   */
  String auditBrand(WxMaShopBrandAudit audit) throws WxErrorException;

  /**
   * 获取审核结果
   * <p></p>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/audit/audit_result.html">文档地址</a>
   *
   * @param auditId 提交审核时返回的id
   * @return 审核结果
   * @throws WxErrorException 获取审核结果失败时抛出，具体错误码请看文档
   */
  WxMaAuditResult getAuditResult(String auditId) throws WxErrorException;

  /**
   * 获取小程序提交过的入驻资质信息
   * <p></p>
   * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/audit/get_miniapp_certificate.html">文档地址</a>
   *
   * @param reqType 请求类型 1:类目 2:品牌
   * @return 小程序审核资质
   * @throws WxErrorException 获取资质信息失败时抛出，具体错误码请看文档
   */
  WxMaShopCertificateResult getCertificate(Integer reqType) throws WxErrorException;
}
