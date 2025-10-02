package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* loaded from: classes5.dex */
abstract class zzgnv extends zzgnz {
    private static final zzgpb zza = new zzgpb(zzgnv.class);
    private zzgjv zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzgnv(zzgjv zzgjvVar, boolean z, boolean z2) {
        super(zzgjvVar.size());
        this.zzb = zzgjvVar;
        this.zzc = z;
        this.zzd = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, listenableFuture);
            }
            zzz(null);
        } catch (Throwable th) {
            zzz(null);
            throw th;
        }
    }

    private final void zzE(Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof Error) {
            zzF(th);
        }
    }

    private static void zzF(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void zzG(int i, Future future) {
        try {
            zzw(i, zzgpu.zza(future));
        } catch (ExecutionException e) {
            zzE(e.getCause());
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgjv zzgjvVar) {
        int iZzC = zzC();
        int i = 0;
        zzghc.zzi(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgjvVar != null) {
                zzgmd it = zzgjvVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public void zzA(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final void zzc() {
        zzgjv zzgjvVar = this.zzb;
        zzA(1);
        if ((zzgjvVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgmd it = zzgjvVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        zzgjv zzgjvVar = this.zzb;
        return zzgjvVar != null ? "futures=".concat(zzgjvVar.toString()) : super.zzd();
    }

    public final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgmd it = this.zzb.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    zzy(i, listenableFuture);
                } else {
                    listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnu
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i, listenableFuture);
                        }
                    }, zzgoi.INSTANCE);
                }
                i = i2;
            }
            return;
        }
        zzgjv zzgjvVar = this.zzb;
        final zzgjv zzgjvVar2 = true != this.zzd ? null : zzgjvVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgjvVar2);
            }
        };
        zzgmd it2 = zzgjvVar.iterator();
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            if (listenableFuture2.isDone()) {
                zzz(zzgjvVar2);
            } else {
                listenableFuture2.addListener(runnable, zzgoi.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzI(set, thZzl);
    }

    public abstract void zzw(int i, Object obj);

    public abstract void zzx();
}
