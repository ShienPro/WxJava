package me.chanjar.weixin.common.bean.result;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.Data;
import me.chanjar.weixin.common.util.json.WxGsonBuilder;

import java.io.Serializable;

@Data
public class WxMinishopImageUploadCustomizeResult implements Serializable {
  private String errcode;
  private String errmsg;

  private WxMinishopPicFileCustomizeResult imgInfo;

  public static WxMinishopImageUploadCustomizeResult fromJson(String json) {
    JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
    WxMinishopImageUploadCustomizeResult result = new WxMinishopImageUploadCustomizeResult();
    result.setErrcode(jsonObject.get("errcode").getAsNumber().toString());
    if (result.getErrcode().equals("0")) {
      WxMinishopPicFileCustomizeResult picFileResult = new WxMinishopPicFileCustomizeResult();
      JsonObject picObject = jsonObject.get("img_info").getAsJsonObject();
      picFileResult.setMediaId(picObject.get("media_id").getAsString());
      if (picObject.has("temp_img_url")) {
        picFileResult.setTempImgUrl(picObject.get("temp_img_url").getAsString());
      }
      result.setImgInfo(picFileResult);

    }
    return result;
  }

  @Override
  public String toString() {
    return WxGsonBuilder.create().toJson(this);
  }
}
