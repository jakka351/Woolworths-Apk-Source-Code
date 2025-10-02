package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzkn implements zzpo {
    final /* synthetic */ zzlj zza;

    public zzkn(zzlj zzljVar) {
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzpo
    public final void zza(String str, String str2, Bundle bundle) throws IllegalStateException {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzB(CameraSettings.FOCUS_STRATEGY_AUTO, "_err", bundle);
        } else {
            this.zza.zzI(CameraSettings.FOCUS_STRATEGY_AUTO, "_err", bundle, str);
        }
    }
}
