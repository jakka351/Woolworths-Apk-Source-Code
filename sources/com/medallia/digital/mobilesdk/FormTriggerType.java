package com.medallia.digital.mobilesdk;

/* loaded from: classes.dex */
public enum FormTriggerType {
    code,
    mobileInvitation;

    public static FormTriggerType fromString(String str) {
        FormTriggerType formTriggerType = code;
        if (formTriggerType.name().equals(str)) {
            return formTriggerType;
        }
        FormTriggerType formTriggerType2 = mobileInvitation;
        if (formTriggerType2.name().equals(str)) {
            return formTriggerType2;
        }
        return null;
    }
}
