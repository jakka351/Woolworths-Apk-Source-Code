package com.google.android.gms.internal.mlkit_vision_barcode;

import YU.a;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
final class zzew extends zzef implements RunnableFuture {

    @CheckForNull
    private volatile zzer zzc;

    public zzew(zzxh zzxhVar) {
        this.zzc = new zzev(this, zzxhVar);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzer zzerVar = this.zzc;
        if (zzerVar != null) {
            zzerVar.run();
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz
    @CheckForNull
    public final String zzf() {
        zzer zzerVar = this.zzc;
        return zzerVar != null ? a.h("task=[", zzerVar.toString(), "]") : super.zzf();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz
    public final void zzm() {
        zzer zzerVar;
        if (zzp() && (zzerVar = this.zzc) != null) {
            zzerVar.zze();
        }
        this.zzc = null;
    }
}
