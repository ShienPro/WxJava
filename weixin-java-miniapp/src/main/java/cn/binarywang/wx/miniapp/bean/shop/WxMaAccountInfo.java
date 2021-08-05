package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 小程序交易组件-自定义组件-商家信息
 *
 * @author ShienPro
 * @since 2021-08-05
 */
@Data
public class WxMaAccountInfo implements Serializable {
  private static final long serialVersionUID = -4530697187455887765L;

  /**
   * 客服地址
   * <br/>
   * 与客服联系方式二选一
   */
  @SerializedName("service_agent_path")
  private String serviceAgentPath;
  /**
   * 客服联系方式
   * <br/>
   * 与客服地址二选一
   */
  @SerializedName("service_agent_phone")
  private String serviceAgentPhone;
}
