package com.adobe.marketing.mobile;

/* loaded from: classes.dex */
public enum MobilePrivacyStatus {
    OPT_IN("optedin"),
    OPT_OUT("optedout"),
    UNKNOWN("optunknown");

    public final String d;

    MobilePrivacyStatus(String str) {
        this.d = str;
    }

    public static MobilePrivacyStatus a(String str) {
        for (MobilePrivacyStatus mobilePrivacyStatus : values()) {
            if (mobilePrivacyStatus.d.equalsIgnoreCase(str)) {
                return mobilePrivacyStatus;
            }
        }
        return UNKNOWN;
    }
}
