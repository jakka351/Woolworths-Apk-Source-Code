package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzfno implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (zzfnr.zzc != null) {
            zzfnr.zzc.post(zzfnr.zzk);
            zzfnr.zzc.postDelayed(zzfnr.zzl, 200L);
        }
    }
}
