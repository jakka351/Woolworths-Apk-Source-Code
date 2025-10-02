package com.medallia.digital.mobilesdk;

import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a<T> extends e0 {
    private List<AppRatingContract> appRatings;
    private String formFileLocationQueryParam;
    private String formJsonFileLocalUrl;
    private List<T> forms;
    private String globalConfigurationFileLocalUrl;
    private List<ResourceContract> globalResources;
    private boolean isNewLiveFormEnable;
    private String preloadFormJsonFileLocalUrl;
    private HashMap<String, Boolean> provisions;

    public a() {
    }

    public List<AppRatingContract> getAppRatings() {
        return this.appRatings;
    }

    public String getFormFileLocationQueryParam() {
        return this.formFileLocationQueryParam;
    }

    public String getFormJsonFileLocalUrl() {
        return this.formJsonFileLocalUrl;
    }

    public List<T> getForms() {
        return this.forms;
    }

    public String getGlobalConfigurationFileLocalUrl() {
        return this.globalConfigurationFileLocalUrl;
    }

    public List<ResourceContract> getGlobalResources() {
        return this.globalResources;
    }

    public String getPreloadFormJsonFileLocalUrl() {
        return this.preloadFormJsonFileLocalUrl;
    }

    public HashMap<String, Boolean> getProvisions() {
        return this.provisions;
    }

    public boolean isNewLiveFormEnable() {
        return this.isNewLiveFormEnable;
    }

    public void setForms(List<T> list) {
        this.forms = list;
    }

    public a(String str, String str2, List<ResourceContract> list, List<T> list2, HashMap<String, Boolean> map, List<AppRatingContract> list3) {
        this.formJsonFileLocalUrl = str;
        this.globalConfigurationFileLocalUrl = str2;
        this.globalResources = list;
        this.forms = list2;
        this.provisions = map;
        this.appRatings = list3;
    }

    public a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("formJsonFileLocalUrl") && !jSONObject.isNull("formJsonFileLocalUrl")) {
                this.formJsonFileLocalUrl = jSONObject.getString("formJsonFileLocalUrl");
            }
            if (jSONObject.has("globalConfigurationFileLocalUrl") && !jSONObject.isNull("globalConfigurationFileLocalUrl")) {
                this.globalConfigurationFileLocalUrl = jSONObject.getString("globalConfigurationFileLocalUrl");
            }
            if (jSONObject.has("globalResources") && !jSONObject.isNull("globalResources")) {
                this.globalResources = ModelFactory.getInstance().getResourcesArray(jSONObject.getJSONArray("globalResources"));
            }
            if (jSONObject.has("provisions") && !jSONObject.isNull("provisions")) {
                this.provisions = ModelFactory.getInstance().getStringBooleanMap(jSONObject.getJSONObject("provisions"));
            }
            if (jSONObject.has("appRatings") && !jSONObject.isNull("appRatings")) {
                this.appRatings = ModelFactory.getInstance().getAppRatingContractsArray(jSONObject.getJSONArray("appRatings"));
            }
            if (jSONObject.has("preloadFormJsonFileLocalUrl") && !jSONObject.isNull("preloadFormJsonFileLocalUrl")) {
                this.preloadFormJsonFileLocalUrl = jSONObject.getString("preloadFormJsonFileLocalUrl");
            }
            if (jSONObject.has("formFileLocationQueryParam") && !jSONObject.isNull("formFileLocationQueryParam")) {
                this.formFileLocationQueryParam = jSONObject.getString("formFileLocationQueryParam");
            }
            if (!jSONObject.has("isNewLiveFormEnable") || jSONObject.isNull("isNewLiveFormEnable")) {
                return;
            }
            this.isNewLiveFormEnable = jSONObject.getBoolean("isNewLiveFormEnable");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
