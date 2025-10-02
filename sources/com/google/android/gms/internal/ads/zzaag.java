package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes5.dex */
public final class zzaag extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaaf zzd;
    private boolean zze;

    public /* synthetic */ zzaag(zzaaf zzaafVar, SurfaceTexture surfaceTexture, boolean z, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzaafVar;
        this.zza = z;
    }

    public static synchronized boolean zza(Context context) {
        if (!zzc) {
            try {
            } catch (zzdi e) {
                zzds.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e.getMessage())));
            }
            int i = zzdj.zza(context) ? zzdj.zzb() ? 1 : 2 : 0;
            zzb = i;
            zzc = true;
        }
        return zzb != 0;
    }

    public static zzaag zzb(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zza(context)) {
            z2 = false;
        }
        zzghc.zzh(z2);
        return new zzaaf().zza(z ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzaaf zzaafVar = this.zzd;
        synchronized (zzaafVar) {
            try {
                if (!this.zze) {
                    zzaafVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
