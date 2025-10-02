package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* loaded from: classes5.dex */
public final class zzaeu {

    @Nullable
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
            zza = Boolean.valueOf(iIsGooglePlayServicesAvailable == 0 || iIsGooglePlayServicesAvailable == 2);
        }
        return zza.booleanValue();
    }
}
