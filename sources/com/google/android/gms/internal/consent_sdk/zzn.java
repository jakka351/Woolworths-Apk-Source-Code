package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;

/* loaded from: classes5.dex */
final class zzn {
    private final Application zza;
    private final zzaq zzb;

    public zzn(Application application, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzaqVar;
    }

    public final zzcj zzc(Activity activity, ConsentRequestParameters consentRequestParameters) throws zzg {
        consentRequestParameters.getClass();
        ConsentDebugSettings.Builder builder = new ConsentDebugSettings.Builder(this.zza);
        boolean z = true;
        if (!zzcu.zza(true)) {
            if (!builder.f14779a.contains(zzcm.zza(builder.b))) {
                z = false;
            }
        }
        return zzp.zza(new zzp(this, activity, new ConsentDebugSettings(z, builder), consentRequestParameters, null));
    }
}
