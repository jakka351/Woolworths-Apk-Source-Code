package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FormConfigurations {
    private ArrayList<String> feedbackPayloadExcludedTypes;
    private ArrayList<String> feedbackPayloadTypes;
    private boolean formsIterativeLoadingEnabled;
    private boolean inheritOrientation;
    private boolean isCloseFormQuarantine;
    private boolean isPinchGestureEnabled;
    private Long loadFormIndicatorDelay;
    private long loadingIndicatorTimeout;
    private int maxFontSize;
    private int minFontSize;
    private ArrayList<String> redirectLinks;
    private boolean showUnavailableForms;
    private boolean vulnEnabled;

    public FormConfigurations(Long l, ArrayList<String> arrayList) {
        this.loadFormIndicatorDelay = l;
        this.feedbackPayloadTypes = arrayList;
    }

    public ArrayList<String> getFeedbackPayloadExcludedTypes() {
        return this.feedbackPayloadExcludedTypes;
    }

    public ArrayList<String> getFeedbackPayloadTypes() {
        return this.feedbackPayloadTypes;
    }

    public Long getLoadFormIndicatorDelay() {
        return this.loadFormIndicatorDelay;
    }

    public long getLoadingIndicatorTimeout() {
        return this.loadingIndicatorTimeout;
    }

    public int getMaxFontSize() {
        return this.maxFontSize;
    }

    public int getMinFontSize() {
        return this.minFontSize;
    }

    public ArrayList<String> getRedirectLinks() {
        return this.redirectLinks;
    }

    public boolean isCloseFormQuarantine() {
        return this.isCloseFormQuarantine;
    }

    public boolean isFormsIterativeLoadingEnabled() {
        return this.formsIterativeLoadingEnabled;
    }

    public boolean isInheritOrientation() {
        return this.inheritOrientation;
    }

    public boolean isPinchGestureEnabled() {
        return this.isPinchGestureEnabled;
    }

    public boolean isShowUnavailableForms() {
        return this.showUnavailableForms;
    }

    public boolean isVulnEnabled() {
        return this.vulnEnabled;
    }

    public String toJsonString() {
        StringBuilder sb = new StringBuilder("{\"loadFormIndicatorDelay\":");
        sb.append(this.loadFormIndicatorDelay);
        sb.append(",\"feedbackPayloadTypes\":");
        sb.append(ModelFactory.getInstance().getStringArrayAsJsonString(this.feedbackPayloadTypes));
        sb.append(",\"feedbackPayloadExcludedTypes\":");
        sb.append(ModelFactory.getInstance().getStringArrayAsJsonString(this.feedbackPayloadExcludedTypes));
        sb.append(",\"vulnEnabled\":");
        sb.append(this.vulnEnabled);
        sb.append(",\"inheritOrientation\":");
        sb.append(this.inheritOrientation);
        sb.append(",\"redirectLinks\":");
        sb.append(ModelFactory.getInstance().getStringArrayAsJsonString(this.redirectLinks));
        sb.append(",\"isPinchGestureEnabled\":");
        sb.append(this.isPinchGestureEnabled);
        sb.append(",\"minFontSize\":");
        sb.append(this.minFontSize);
        sb.append(",\"maxFontSize\":");
        sb.append(this.maxFontSize);
        sb.append(",\"showUnavailableForms\":");
        sb.append(this.showUnavailableForms);
        sb.append(",\"loadingIndicatorTimeout\":");
        sb.append(this.loadingIndicatorTimeout);
        sb.append(",\"isCloseFormQuarantine\":");
        sb.append(this.isCloseFormQuarantine);
        sb.append(",\"formsIterativeLoadingEnabled\":");
        return YU.a.k("}", sb, this.formsIterativeLoadingEnabled);
    }

    public FormConfigurations(Long l, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.loadFormIndicatorDelay = l;
        this.feedbackPayloadTypes = arrayList;
        this.feedbackPayloadExcludedTypes = arrayList2;
    }

    public FormConfigurations(JSONObject jSONObject) {
        try {
            if (jSONObject.has("loadFormIndicatorDelay") && !jSONObject.isNull("loadFormIndicatorDelay")) {
                this.loadFormIndicatorDelay = Long.valueOf(jSONObject.getLong("loadFormIndicatorDelay"));
            }
            if (jSONObject.has("feedbackPayloadTypes") && !jSONObject.isNull("feedbackPayloadTypes")) {
                this.feedbackPayloadTypes = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("feedbackPayloadTypes"));
            }
            if (jSONObject.has("feedbackPayloadExcludedTypes") && !jSONObject.isNull("feedbackPayloadExcludedTypes")) {
                this.feedbackPayloadExcludedTypes = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("feedbackPayloadExcludedTypes"));
            }
            if (jSONObject.has("vulnEnabled") && !jSONObject.isNull("vulnEnabled")) {
                this.vulnEnabled = jSONObject.getBoolean("vulnEnabled");
            }
            if (jSONObject.has("inheritOrientation") && !jSONObject.isNull("inheritOrientation")) {
                this.inheritOrientation = jSONObject.getBoolean("inheritOrientation");
            }
            if (jSONObject.has("redirectLinks") && !jSONObject.isNull("redirectLinks")) {
                this.redirectLinks = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("redirectLinks"));
            }
            if (jSONObject.has("isPinchGestureEnabled") && !jSONObject.isNull("isPinchGestureEnabled")) {
                this.isPinchGestureEnabled = jSONObject.getBoolean("isPinchGestureEnabled");
            }
            if (jSONObject.has("minFontSize") && !jSONObject.isNull("minFontSize")) {
                this.minFontSize = jSONObject.getInt("minFontSize");
            }
            if (jSONObject.has("maxFontSize") && !jSONObject.isNull("maxFontSize")) {
                this.maxFontSize = jSONObject.getInt("maxFontSize");
            }
            if (jSONObject.has("showUnavailableForms") && !jSONObject.isNull("showUnavailableForms")) {
                this.showUnavailableForms = jSONObject.getBoolean("showUnavailableForms");
            }
            if (jSONObject.has("loadingIndicatorTimeout") && !jSONObject.isNull("loadingIndicatorTimeout")) {
                this.loadingIndicatorTimeout = jSONObject.getLong("loadingIndicatorTimeout");
            }
            if (jSONObject.has("isCloseFormQuarantine") && !jSONObject.isNull("isCloseFormQuarantine")) {
                this.isCloseFormQuarantine = jSONObject.getBoolean("isCloseFormQuarantine");
            }
            if (!jSONObject.has("formsIterativeLoadingEnabled") || jSONObject.isNull("formsIterativeLoadingEnabled")) {
                return;
            }
            this.formsIterativeLoadingEnabled = jSONObject.getBoolean("formsIterativeLoadingEnabled");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
