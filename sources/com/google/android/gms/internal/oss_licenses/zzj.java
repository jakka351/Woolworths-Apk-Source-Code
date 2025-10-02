package com.google.android.gms.internal.oss_licenses;

import androidx.constraintlayout.core.state.a;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class zzj<V> extends zzk<V> {

    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzk.zzd) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        public zza(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    final class zzb<V> implements Runnable {
        final zzj<V> zza;
        final zzo<? extends V> zzb;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.oss_licenses.zzj.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb = null;
        final Executor zzc = null;
    }

    interface zze<V> extends zzo<V> {
    }

    public static Object zze(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzk.zzb) {
            return null;
        }
        return obj;
    }

    public static boolean zzf(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object zzn(zzo zzoVar) {
        Throwable thZzg;
        if (zzoVar instanceof zze) {
            Object zzaVar = ((zzj) zzoVar).valueField;
            if (zzaVar instanceof zza) {
                zza zzaVar2 = (zza) zzaVar;
                if (zzaVar2.zzc) {
                    Throwable th = zzaVar2.zzd;
                    zzaVar = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            Objects.requireNonNull(zzaVar);
            return zzaVar;
        }
        if ((zzoVar instanceof zzr) && (thZzg = ((zzr) zzoVar).zzg()) != null) {
            return new zzc(thZzg);
        }
        boolean zIsCancelled = zzoVar.isCancelled();
        if ((!zzk.zzd) && zIsCancelled) {
            zza zzaVar3 = zza.zzb;
            Objects.requireNonNull(zzaVar3);
            return zzaVar3;
        }
        try {
            Object objZzo = zzo(zzoVar);
            if (!zIsCancelled) {
                return objZzo == null ? zzk.zzb : objZzo;
            }
            String strValueOf = String.valueOf(zzoVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new zza(false, new IllegalArgumentException(sb.toString()));
        } catch (Error | Exception e) {
            return new zzc(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzoVar)), e2)) : new zza(false, e2);
        } catch (ExecutionException e3) {
            return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzoVar)), e3)) : new zzc(e3.getCause());
        }
    }

    private static Object zzo(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private static void zzp(zzj zzjVar, boolean z) {
        zzd zzdVar;
        zzd zzdVar2 = null;
        while (true) {
            zzjVar.zzj();
            zzjVar.zzc();
            zzd zzdVar3 = zzdVar2;
            zzd zzdVarZzh = zzjVar.zzh(zzd.zza);
            zzd zzdVar4 = zzdVar3;
            while (zzdVarZzh != null) {
                zzd zzdVar5 = zzdVarZzh.next;
                zzdVarZzh.next = zzdVar4;
                zzdVar4 = zzdVarZzh;
                zzdVarZzh = zzdVar5;
            }
            while (zzdVar4 != null) {
                Runnable runnable = zzdVar4.zzb;
                zzdVar = zzdVar4.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzjVar = zzbVar.zza;
                    if (zzjVar.valueField != zzbVar || !zzk.zzi(zzjVar, zzbVar, zzn(zzbVar.zzb))) {
                    }
                } else {
                    Executor executor = zzdVar4.zzc;
                    Objects.requireNonNull(executor);
                    Executor executor2 = executor;
                    try {
                        executor2.execute(runnable2);
                    } catch (Exception e) {
                        Logger loggerZza = zzk.zzc.zza();
                        Level level = Level.SEVERE;
                        String strValueOf = String.valueOf(runnable2);
                        String strValueOf2 = String.valueOf(executor2);
                        loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", a.l(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
                    }
                }
                zzdVar4 = zzdVar;
            }
            return;
            zzdVar2 = zzdVar;
        }
    }

    private final void zzq(StringBuilder sb) {
        try {
            Object objZzo = zzo(this);
            sb.append("SUCCESS, result=[");
            if (objZzo == null) {
                sb.append("null");
            } else if (objZzo == this) {
                sb.append("this future");
            } else {
                sb.append(objZzo.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objZzo)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.valueField
            boolean r1 = r0 instanceof com.google.android.gms.internal.oss_licenses.zzj.zzb
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.oss_licenses.zzk.zzd
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.oss_licenses.zzj$zza r1 = new com.google.android.gms.internal.oss_licenses.zzj$zza
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.oss_licenses.zzj$zza r1 = com.google.android.gms.internal.oss_licenses.zzj.zza.zza
            goto L26
        L24:
            com.google.android.gms.internal.oss_licenses.zzj$zza r1 = com.google.android.gms.internal.oss_licenses.zzj.zza.zzb
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            boolean r6 = com.google.android.gms.internal.oss_licenses.zzk.zzi(r4, r0, r1)
            if (r6 == 0) goto L56
            zzp(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.oss_licenses.zzj.zzb
            if (r4 == 0) goto L55
            com.google.android.gms.internal.oss_licenses.zzj$zzb r0 = (com.google.android.gms.internal.oss_licenses.zzj.zzb) r0
            com.google.android.gms.internal.oss_licenses.zzo<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.oss_licenses.zzj.zze
            if (r4 == 0) goto L52
            r4 = r0
            com.google.android.gms.internal.oss_licenses.zzj r4 = (com.google.android.gms.internal.oss_licenses.zzj) r4
            java.lang.Object r0 = r4.valueField
            if (r0 != 0) goto L49
            r5 = r3
            goto L4a
        L49:
            r5 = r2
        L4a:
            boolean r6 = r0 instanceof com.google.android.gms.internal.oss_licenses.zzj.zzb
            r5 = r5 | r6
            if (r5 == 0) goto L51
            r5 = r3
            goto L2b
        L51:
            return r3
        L52:
            r0.cancel(r8)
        L55:
            return r3
        L56:
            java.lang.Object r0 = r4.valueField
            boolean r6 = zzf(r0)
            if (r6 == 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oss_licenses.zzj.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return zzl();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzf(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r6.valueField
            boolean r1 = r1 instanceof com.google.android.gms.internal.oss_licenses.zzj.zza
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Lca
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.zzq(r0)
            goto Lca
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.valueField
            boolean r4 = r3 instanceof com.google.android.gms.internal.oss_licenses.zzj.zzb
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L94
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.android.gms.internal.oss_licenses.zzj$zzb r3 = (com.google.android.gms.internal.oss_licenses.zzj.zzb) r3
            com.google.android.gms.internal.oss_licenses.zzo<? extends V> r3 = r3.zzb
            if (r3 != r6) goto L7f
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L90
        L7d:
            r3 = move-exception
            goto L83
        L7f:
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L90
        L83:
            com.google.android.gms.internal.oss_licenses.zzq.zza(r3)
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L90:
            r0.append(r2)
            goto Lba
        L94:
            java.lang.String r3 = r6.zzd()     // Catch: java.lang.Throwable -> La3
            r4 = 0
            if (r3 == 0) goto La1
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> La3
            if (r5 == 0) goto Lb3
        La1:
            r3 = r4
            goto Lb3
        La3:
            r3 = move-exception
            com.google.android.gms.internal.oss_licenses.zzq.zza(r3)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
        Lb3:
            if (r3 == 0) goto Lba
            java.lang.String r4 = ", info=["
            androidx.compose.ui.input.pointer.a.w(r0, r4, r3, r2)
        Lba:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lca
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.zzq(r0)
        Lca:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oss_licenses.zzj.toString():java.lang.String");
    }

    public boolean zza(Object obj) {
        if (obj == null) {
            obj = zzk.zzb;
        }
        if (!zzk.zzi(this, null, obj)) {
            return false;
        }
        zzp(this, false);
        return true;
    }

    public boolean zzb(Throwable th) {
        if (!zzk.zzi(this, null, new zzc(th))) {
            return false;
        }
        zzp(this, false);
        return true;
    }

    public void zzc() {
    }

    public String zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.oss_licenses.zzr
    public final Throwable zzg() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return zzk(j, timeUnit);
    }
}
