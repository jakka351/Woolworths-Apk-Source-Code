package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SDKConfigurationFormContract extends EngagementContract {
    private String customParams;
    private String formId;
    private JSONObject formJson;
    private String formLanguage;
    private FormTriggerType formType;
    private FormViewType formViewType;
    private boolean isDarkModeEnabled;
    private boolean isPoweredByVisible;
    private String isPreloaded;
    private boolean isRtl;
    private List<ResourceContract> resources;
    private String selectedFormHeaderTheme;
    private String templateDebugRemoteUrl;
    private String templateLocalUrl;
    private String templateRemoteUrl;
    private String title;
    private String titleBackgroundColor;
    private String titleTextColor;
    private String transitionType;
    private String urlVersion;

    public SDKConfigurationFormContract() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.formId;
            String str2 = ((SDKConfigurationFormContract) obj).formId;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public String getCustomParams() {
        return this.customParams;
    }

    public String getFormId() {
        return this.formId;
    }

    public JSONObject getFormJson() {
        if (this.formJson == null) {
            this.formJson = new JSONObject();
        }
        return this.formJson;
    }

    public String getFormLanguage() {
        return this.formLanguage;
    }

    public FormTriggerType getFormType() {
        return this.formType;
    }

    public FormViewType getFormViewType() {
        return this.formViewType;
    }

    public String getHeaderThemeName() {
        return this.selectedFormHeaderTheme;
    }

    @Override // com.medallia.digital.mobilesdk.EngagementContract
    public /* bridge */ /* synthetic */ InviteData getInviteData() {
        return super.getInviteData();
    }

    @Override // com.medallia.digital.mobilesdk.EngagementContract
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    public List<ResourceContract> getResources() {
        return this.resources;
    }

    public String getTemplateDebugRemoteUrl() {
        return this.templateDebugRemoteUrl;
    }

    public String getTemplateLocalUrl() {
        return this.templateLocalUrl;
    }

    public String getTemplateRemoteUrl() {
        return this.templateRemoteUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleBackgroundColor() {
        return this.titleBackgroundColor;
    }

    public String getTitleTextColor() {
        return this.titleTextColor;
    }

    public String getUrlVersion() {
        return this.urlVersion;
    }

    public int hashCode() {
        String str = this.formId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isDarkModeEnabled() {
        return this.isDarkModeEnabled;
    }

    public boolean isPoweredByVisible() {
        return this.isPoweredByVisible;
    }

    public boolean isPreloaded() {
        if (TextUtils.isEmpty(this.isPreloaded)) {
            return false;
        }
        return Boolean.parseBoolean(this.isPreloaded);
    }

    public boolean isRtl() {
        return this.isRtl;
    }

    public String setFormLanguage(String str) {
        this.formLanguage = str;
        return str;
    }

    public void setTemplateLocalUrl(String str) {
        this.templateLocalUrl = str;
    }

    public String toJsonString() {
        String str;
        try {
            String str2 = "null";
            if (this.formType == null) {
                str = "null";
            } else {
                str = "\"" + this.formType + "\"";
            }
            if (this.formViewType != null) {
                str2 = "\"" + this.formViewType + "\"";
            }
            StringBuilder sb = new StringBuilder("{\"formId\":");
            sb.append(l3.c(this.formId));
            sb.append(",\"templateRemoteUrl\":");
            sb.append(l3.c(this.templateRemoteUrl));
            sb.append(",\"templateLocalUrl\":");
            sb.append(l3.c(this.templateLocalUrl));
            sb.append(",\"formJson\":");
            JSONObject jSONObject = this.formJson;
            sb.append(jSONObject == null ? null : jSONObject.toString());
            sb.append(",\"resources\":");
            sb.append(ModelFactory.getInstance().getResourcesAsJsonString(this.resources));
            sb.append(",\"customParams\":");
            sb.append(l3.c(this.customParams));
            sb.append(",\"formType\":");
            sb.append(str);
            sb.append(",\"title\":");
            sb.append(l3.c(this.title));
            sb.append(",\"titleTextColor\":");
            sb.append(l3.c(this.titleTextColor));
            sb.append(",\"titleBackgroundColor\":");
            sb.append(l3.c(this.titleBackgroundColor));
            sb.append(",\"transitionType\":");
            sb.append(l3.c(this.transitionType));
            sb.append(",\"formViewType\":");
            sb.append(str2);
            sb.append(",\"name\":");
            sb.append(l3.c(getName()));
            sb.append(",\"inviteData\":");
            sb.append(getInviteData() != null ? getInviteData().toJsonString() : null);
            sb.append(",\"triggerData\":");
            sb.append(getTriggerData() != null ? getTriggerData().toString() : null);
            sb.append(",\"isPreloaded\":");
            sb.append(l3.c(this.isPreloaded));
            sb.append(",\"formLanguage\":");
            sb.append(l3.c(this.formLanguage));
            sb.append(",\"isRtl\":");
            sb.append(this.isRtl);
            sb.append(",\"urlVersion\":");
            sb.append(l3.c(this.urlVersion));
            sb.append(",\"templateDebugRemoteUrl\":");
            sb.append(l3.c(this.templateDebugRemoteUrl));
            sb.append(",\"isPoweredByVisible\":");
            sb.append(this.isPoweredByVisible);
            sb.append(",\"isDarkModeEnabled\":");
            sb.append(this.isDarkModeEnabled);
            sb.append(",\"selectedFormHeaderTheme\":");
            sb.append(l3.c(this.selectedFormHeaderTheme));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public SDKConfigurationFormContract(String str, String str2, String str3, String str4, JSONObject jSONObject, List<ResourceContract> list, InviteData inviteData, JSONObject jSONObject2, String str5, FormTriggerType formTriggerType, String str6, String str7, String str8, FormViewType formViewType, String str9, boolean z, boolean z2, String str10) {
        super(str2, inviteData, jSONObject2);
        this.formId = str;
        this.templateRemoteUrl = str3;
        this.templateLocalUrl = str4;
        this.formJson = jSONObject;
        this.resources = list;
        this.customParams = str5;
        this.formType = formTriggerType;
        this.title = str6;
        this.titleTextColor = str7;
        this.titleBackgroundColor = str8;
        this.formViewType = formViewType == null ? FormViewType.none : formViewType;
        this.isPreloaded = str9;
        this.isPoweredByVisible = z;
        this.isDarkModeEnabled = z2;
        this.selectedFormHeaderTheme = str10;
    }

    public SDKConfigurationFormContract(JSONObject jSONObject) throws JSONException {
        String strB;
        super(jSONObject);
        try {
            if (jSONObject.has("formId") && !jSONObject.isNull("formId")) {
                this.formId = jSONObject.getString("formId");
            }
            if (jSONObject.has("templateRemoteUrl") && !jSONObject.isNull("templateRemoteUrl")) {
                this.templateRemoteUrl = jSONObject.getString("templateRemoteUrl");
            }
            if (jSONObject.has("templateLocalUrl") && !jSONObject.isNull("templateLocalUrl")) {
                this.templateLocalUrl = jSONObject.getString("templateLocalUrl");
            }
            if (jSONObject.has("formJson") && !jSONObject.isNull("formJson")) {
                this.formJson = jSONObject.getJSONObject("formJson");
            }
            if (jSONObject.has("customParams")) {
                if (jSONObject.get("customParams") instanceof JSONArray) {
                    strB = jSONObject.getJSONArray("customParams").toString();
                } else if (jSONObject.get("customParams") instanceof JSONObject) {
                    strB = jSONObject.getJSONObject("customParams").toString();
                } else if (jSONObject.get("customParams") instanceof String) {
                    strB = l3.b(jSONObject.getString("customParams"));
                }
                this.customParams = strB;
            }
            if (jSONObject.has("title") && !jSONObject.isNull("title")) {
                this.title = jSONObject.getString("title");
            }
            if (jSONObject.has("titleTextColor") && !jSONObject.isNull("titleTextColor")) {
                this.titleTextColor = jSONObject.getString("titleTextColor");
            }
            if (jSONObject.has("titleBackgroundColor") && !jSONObject.isNull("titleBackgroundColor")) {
                this.titleBackgroundColor = jSONObject.getString("titleBackgroundColor");
            }
            if (jSONObject.has("transitionType") && !jSONObject.isNull("transitionType")) {
                this.transitionType = jSONObject.getString("transitionType");
            }
            if (jSONObject.has("formType") && !jSONObject.isNull("formType")) {
                this.formType = FormTriggerType.fromString(jSONObject.getString("formType"));
            }
            if (jSONObject.has("formViewType") && !jSONObject.isNull("formViewType")) {
                this.formViewType = FormViewType.fromString(jSONObject.getString("formViewType"));
            }
            if (jSONObject.has("resources") && !jSONObject.isNull("resources")) {
                this.resources = ModelFactory.getInstance().getResourcesArray(jSONObject.getJSONArray("resources"));
            }
            if (jSONObject.has("isPreloaded") && !jSONObject.isNull("isPreloaded")) {
                this.isPreloaded = jSONObject.getString("isPreloaded");
            }
            if (jSONObject.has("formLanguage") && !jSONObject.isNull("formLanguage")) {
                this.formLanguage = jSONObject.getString("formLanguage");
            }
            if (jSONObject.has("isRtl") && !jSONObject.isNull("isRtl")) {
                this.isRtl = jSONObject.getBoolean("isRtl");
            }
            if (jSONObject.has("urlVersion") && !jSONObject.isNull("urlVersion")) {
                this.urlVersion = jSONObject.getString("urlVersion");
            }
            if (jSONObject.has("templateDebugRemoteUrl") && !jSONObject.isNull("templateDebugRemoteUrl")) {
                this.templateDebugRemoteUrl = jSONObject.getString("templateDebugRemoteUrl");
            }
            if (this.formJson != null) {
                JSONObject jSONObject2 = new JSONObject(this.formJson.toString()).getJSONObject("settings").getJSONObject("formMobileSettingsContract");
                if (jSONObject2.has("showPoweredBy") && !jSONObject2.isNull("showPoweredBy")) {
                    this.isPoweredByVisible = jSONObject2.getBoolean("showPoweredBy");
                }
            }
            if (jSONObject.has("isDarkModeEnabled") && !jSONObject.isNull("isDarkModeEnabled")) {
                this.isDarkModeEnabled = jSONObject.getBoolean("isDarkModeEnabled");
            }
            if (!jSONObject.has("selectedFormHeaderTheme") || jSONObject.isNull("selectedFormHeaderTheme")) {
                return;
            }
            this.selectedFormHeaderTheme = jSONObject.getString("selectedFormHeaderTheme");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
