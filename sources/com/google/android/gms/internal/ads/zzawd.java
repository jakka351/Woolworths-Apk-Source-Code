package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzawd extends BroadcastReceiver {
    final /* synthetic */ zzawe zza;

    public zzawd(zzawe zzaweVar) {
        Objects.requireNonNull(zzaweVar);
        this.zza = zzaweVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzd();
    }
}
