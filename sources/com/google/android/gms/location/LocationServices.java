package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.identity.zzbb;
import com.google.android.gms.internal.identity.zzbi;
import com.google.android.gms.internal.identity.zzci;
import com.google.android.gms.internal.identity.zzcr;
import com.google.android.gms.internal.identity.zzct;
import com.google.android.gms.internal.identity.zzcz;
import com.google.android.gms.internal.identity.zzda;

/* loaded from: classes.dex */
public class LocationServices {

    @NonNull
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API = zzbi.zzb;

    @NonNull
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi = new zzbb();

    @NonNull
    @Deprecated
    public static final GeofencingApi GeofencingApi = new zzcr();

    @NonNull
    @Deprecated
    public static final SettingsApi SettingsApi = new zzcz();

    private LocationServices() {
    }

    @NonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Activity activity) {
        return new zzbi(activity);
    }

    @NonNull
    public static FusedOrientationProviderClient getFusedOrientationProviderClient(@NonNull Activity activity) {
        return new zzci(activity);
    }

    @NonNull
    public static GeofencingClient getGeofencingClient(@NonNull Activity activity) {
        return new zzct(activity);
    }

    @NonNull
    public static SettingsClient getSettingsClient(@NonNull Activity activity) {
        return new zzda(activity);
    }

    @NonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Context context) {
        return new zzbi(context);
    }

    @NonNull
    public static FusedOrientationProviderClient getFusedOrientationProviderClient(@NonNull Context context) {
        return new zzci(context);
    }

    @NonNull
    public static GeofencingClient getGeofencingClient(@NonNull Context context) {
        return new zzct(context);
    }

    @NonNull
    public static SettingsClient getSettingsClient(@NonNull Context context) {
        return new zzda(context);
    }
}
