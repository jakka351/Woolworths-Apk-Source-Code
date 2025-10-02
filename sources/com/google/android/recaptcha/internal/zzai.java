package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes6.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzan zzanVar = this.zza;
        BuildersKt.c(zzanVar.zzb, null, null, new zzaj(zzanVar, null), 3);
    }
}
