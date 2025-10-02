package au.com.woolworths.pay.sdk.models;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes4.dex */
public enum SaveOptions {
    DO_NOT_SAVE,
    SAVE_MAKE_PRIMARY,
    SAVE_NOT_PRIMARY;

    public boolean makePrimary() {
        return this == SAVE_MAKE_PRIMARY;
    }

    public boolean shouldSave() {
        return this != DO_NOT_SAVE;
    }
}
