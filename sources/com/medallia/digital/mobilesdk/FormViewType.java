package com.medallia.digital.mobilesdk;

/* loaded from: classes.dex */
public enum FormViewType {
    full,
    modal,
    none;

    public static FormViewType fromString(String str) {
        FormViewType formViewType = modal;
        if (formViewType.name().equals(str)) {
            return formViewType;
        }
        FormViewType formViewType2 = full;
        return formViewType2.name().equals(str) ? formViewType2 : none;
    }
}
