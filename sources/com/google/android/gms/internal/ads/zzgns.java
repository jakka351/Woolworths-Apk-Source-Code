package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
abstract class zzgns extends zzgok implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    ListenableFuture zza;
    Object zzb;

    public zzgns(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isCancelled()) {
            zzk(listenableFuture);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzgot.zzr(listenableFuture));
                this.zzb = null;
                zze(objZzf);
            } catch (Throwable th) {
                try {
                    zzgpl.zza(th);
                    zzb(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzb(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            zzb(e2.getCause());
        } catch (Exception e3) {
            zzb(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        String strP;
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        String strZzd = super.zzd();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strP = YU.a.p(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strP = "";
        }
        if (obj == null) {
            if (strZzd != null) {
                return strP.concat(strZzd);
            }
            return null;
        }
        int length = strP.length();
        String string2 = obj.toString();
        return androidx.constraintlayout.core.state.a.l(new StringBuilder(string2.length() + length + 10 + 1), strP, "function=[", string2, "]");
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Object obj2) throws Exception;
}
