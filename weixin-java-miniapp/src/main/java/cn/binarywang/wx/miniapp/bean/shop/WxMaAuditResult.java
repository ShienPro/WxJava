package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 小程序交易组件-自定义组件-审核结果
 * <br/>
 * <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/ministore/minishopopencomponent2/API/audit/audit_result.html#%E5%9B%9E%E5%8C%85%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E">
 * 文档地址
 * </a>
 *
 * @author ShienPro
 * @since 2021-08-05
 */
@Data
public class WxMaAuditResult implements Serializable {
  private static final long serialVersionUID = -900907932779021158L;

  @SerializedName("status")
  private Integer status;
  @SerializedName("brand_id")
  private Integer brandId;
  @SerializedName("reject_reason")
  private String rejectReason;
}
