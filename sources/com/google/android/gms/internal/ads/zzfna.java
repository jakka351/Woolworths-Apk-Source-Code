package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzfna implements Runnable {
    final /* synthetic */ zzfnb zza;
    private final WebView zzb;

    public zzfna(zzfnb zzfnbVar) {
        Objects.requireNonNull(zzfnbVar);
        this.zza = zzfnbVar;
        this.zzb = zzfnbVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
