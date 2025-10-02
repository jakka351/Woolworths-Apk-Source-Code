package me.oriient.ipssdk.api.utils;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public class IPSUnavailableFeature {
    private final int feature;

    @NonNull
    private final String unavailabilityCause;

    public IPSUnavailableFeature(int i, @NonNull String str) {
        this.feature = i;
        this.unavailabilityCause = str;
    }

    public int getFeature() {
        return this.feature;
    }

    @NonNull
    public String getUnavailabilityCause() {
        return this.unavailabilityCause;
    }
}
