package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes6.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzes zzesVar = this.zza;
        BuildersKt.c(zzesVar.zzd, null, null, new zzeq(zzesVar, null), 3);
    }
}
