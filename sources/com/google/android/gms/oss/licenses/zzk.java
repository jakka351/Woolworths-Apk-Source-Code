package com.google.android.gms.oss.licenses;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* loaded from: classes5.dex */
public final class zzk extends GoogleApi {
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzg zzgVar = new zzg();
        zzb = zzgVar;
        zzc = new Api("OssLicensesService.API", zzgVar, clientKey);
    }

    public zzk(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions>) zzc, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
