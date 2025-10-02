package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
abstract class zzgnl extends zzgok implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    ListenableFuture zza;
    Class zzb;
    Object zzc;

    public zzgnl(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = listenableFuture instanceof zzgpv ? ((zzgpv) listenableFuture).zzl() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(listenableFuture.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                androidx.constraintlayout.core.state.a.B(sb, "Future type ", strValueOf, " threw ", strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objZzr = th == null ? zzgot.zzr(listenableFuture) : null;
        if (th == null) {
            zza(objZzr);
            return;
        }
        if (!cls.isInstance(th)) {
            zzk(listenableFuture);
            return;
        }
        try {
            Object objZzf = zzf(obj, th);
            this.zzb = null;
            this.zzc = null;
            zze(objZzf);
        } catch (Throwable th2) {
            try {
                zzgpl.zza(th2);
                zzb(th2);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        String strP;
        ListenableFuture listenableFuture = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZzd = super.zzd();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strP = YU.a.p(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strP = "";
        }
        if (cls == null || obj == null) {
            if (strZzd != null) {
                return strP.concat(strZzd);
            }
            return null;
        }
        int length = strP.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        androidx.constraintlayout.core.state.a.B(sb, strP, "exceptionType=[", string2, "], fallback=[");
        return YU.a.o(sb, string3, "]");
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Throwable th) throws Exception;
}
