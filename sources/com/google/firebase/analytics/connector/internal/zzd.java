package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.common.collect.ImmutableSet;

/* loaded from: classes6.dex */
final class zzd implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zze f15184a;

    public zzd(zze zzeVar) {
        this.f15184a = zzeVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        zze zzeVar = this.f15184a;
        if (zzeVar.f15185a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            ImmutableSet immutableSet = zzc.f15183a;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            zzeVar.b.a(2, bundle2);
        }
    }
}
