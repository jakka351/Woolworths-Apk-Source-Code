package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzbs {

    @NotNull
    private final GoogleApiAvailabilityLight zza;

    public zzbs(@NotNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zza = googleApiAvailabilityLight;
    }

    @NotNull
    public final int zza(@NotNull Context context) {
        int iIsGooglePlayServicesAvailable = this.zza.isGooglePlayServicesAvailable(context);
        return (iIsGooglePlayServicesAvailable == 1 || iIsGooglePlayServicesAvailable == 3 || iIsGooglePlayServicesAvailable == 9) ? 4 : 3;
    }

    public zzbs() {
        this.zza = GoogleApiAvailabilityLight.getInstance();
    }
}
