package com.medallia.digital.mobilesdk;

/* loaded from: classes.dex */
public class MDFormListenerData {
    private String engagementId;
    private MDAppearanceMode formHeaderAppearanceDisplay;
    private MDAppearanceMode formHeaderAppearanceSet;
    private String formLocaleDisplay;
    private String formLocaleSet;
    private FormTriggerType formTriggerType;
    private boolean isBlocked;
    private long timestamp;
    private String url;

    public MDFormListenerData(long j, String str, FormTriggerType formTriggerType) {
        updateParams(j, str, formTriggerType, null, false, null, null, null, null);
    }

    private void updateParams(long j, String str, FormTriggerType formTriggerType, String str2, boolean z, String str3, String str4, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
        this.timestamp = j;
        this.engagementId = str;
        this.formTriggerType = formTriggerType;
        this.url = str2;
        this.isBlocked = z;
        this.formLocaleSet = str3;
        this.formLocaleDisplay = str4;
        this.formHeaderAppearanceSet = mDAppearanceMode;
        this.formHeaderAppearanceDisplay = mDAppearanceMode2;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public MDAppearanceMode getFormHeaderAppearanceDisplay() {
        return this.formHeaderAppearanceDisplay;
    }

    public MDAppearanceMode getFormHeaderAppearanceSet() {
        return this.formHeaderAppearanceSet;
    }

    public String getFormLocaleDisplay() {
        return this.formLocaleDisplay;
    }

    public String getFormLocaleSet() {
        return this.formLocaleSet;
    }

    public FormTriggerType getFormTriggerType() {
        return this.formTriggerType;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public MDFormListenerData(long j, String str, FormTriggerType formTriggerType, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
        updateParams(j, str, formTriggerType, null, false, this.formLocaleSet, this.formLocaleDisplay, mDAppearanceMode2, mDAppearanceMode2);
    }

    public MDFormListenerData(long j, String str, FormTriggerType formTriggerType, String str2, String str3, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
        updateParams(j, str, formTriggerType, null, false, str2, str3, mDAppearanceMode, mDAppearanceMode2);
    }

    public MDFormListenerData(long j, String str, FormTriggerType formTriggerType, String str2, boolean z) {
        updateParams(j, str, formTriggerType, str2, z, null, null, null, null);
    }
}
