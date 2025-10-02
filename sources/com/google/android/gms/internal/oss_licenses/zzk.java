package com.google.android.gms.internal.oss_licenses;

import androidx.constraintlayout.core.state.a;
import com.google.android.gms.internal.ads.b;
import com.google.android.gms.internal.oss_licenses.zzj;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
abstract class zzk<V> extends zzr implements zzo<V> {
    private static final zza zza;
    static final Object zzb = new Object();
    static final zzn zzc = new zzn(zzj.class);
    static final boolean zzd;
    volatile zzj.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    abstract class zza {
        public /* synthetic */ zza(byte[] bArr) {
        }

        public abstract void zza(zze zzeVar, Thread thread);

        public abstract void zzb(zze zzeVar, zze zzeVar2);

        public abstract boolean zzc(zzk zzkVar, zze zzeVar, zze zzeVar2);

        public abstract zze zzd(zzk zzkVar, zze zzeVar);

        public abstract zzj.zzd zze(zzk zzkVar, zzj.zzd zzdVar);

        public abstract boolean zzf(zzk zzkVar, Object obj, Object obj2);
    }

    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzk<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzk.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzk<?>, zzj.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzj.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzk<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzk.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final boolean zzc(zzk zzkVar, zze zzeVar, zze zzeVar2) {
            AtomicReferenceFieldUpdater<? super zzk<?>, zze> atomicReferenceFieldUpdater = zzc;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzkVar, zzeVar, zzeVar2)) {
                if (atomicReferenceFieldUpdater.get(zzkVar) != zzeVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final zze zzd(zzk zzkVar, zze zzeVar) {
            return zzc.getAndSet(zzkVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final zzj.zzd zze(zzk zzkVar, zzj.zzd zzdVar) {
            return zzd.getAndSet(zzkVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final boolean zzf(zzk zzkVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super zzk<?>, Object> atomicReferenceFieldUpdater = zze;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzkVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(zzkVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }
    }

    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final boolean zzc(zzk zzkVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzkVar) {
                try {
                    if (zzkVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzkVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final zze zzd(zzk zzkVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzkVar) {
                try {
                    zzeVar2 = zzkVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzkVar.waitersField = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final zzj.zzd zze(zzk zzkVar, zzj.zzd zzdVar) {
            zzj.zzd zzdVar2;
            synchronized (zzkVar) {
                try {
                    zzdVar2 = zzkVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzkVar.listenersField = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final boolean zzf(zzk zzkVar, Object obj, Object obj2) {
            synchronized (zzkVar) {
                try {
                    if (zzkVar.valueField != obj) {
                        return false;
                    }
                    zzkVar.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }
    }

    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(zzl.zza);
            }
            try {
                zzc = unsafe.objectFieldOffset(zzk.class.getDeclaredField("waitersField"));
                zzb = unsafe.objectFieldOffset(zzk.class.getDeclaredField("listenersField"));
                zzd = unsafe.objectFieldOffset(zzk.class.getDeclaredField("valueField"));
                zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final boolean zzc(zzk zzkVar, zze zzeVar, zze zzeVar2) {
            return b.a(zza, zzkVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final zze zzd(zzk zzkVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzkVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzkVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final zzj.zzd zze(zzk zzkVar, zzj.zzd zzdVar) {
            zzj.zzd zzdVar2;
            while (true) {
                zzdVar2 = zzkVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
                zzk zzkVar2 = zzkVar;
                zzj.zzd zzdVar3 = zzdVar;
                if (b.a(zza, zzkVar2, zzb, zzdVar2, zzdVar3)) {
                    break;
                }
                zzkVar = zzkVar2;
                zzdVar = zzdVar3;
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.oss_licenses.zzk.zza
        public final boolean zzf(zzk zzkVar, Object obj, Object obj2) {
            return b.a(zza, zzkVar, zzd, obj, obj2);
        }

        public /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }
    }

    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        public zze(boolean z) {
        }

        public zze() {
            zzk.zzm(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e) {
                try {
                    zzcVar = new zzb(bArr);
                    th = null;
                    th2 = e;
                } catch (Error | Exception e2) {
                    th = e2;
                    th2 = e;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th = null;
        th2 = null;
        zza = zzcVar;
        if (th != null) {
            zzn zznVar = zzc;
            Logger loggerZza = zznVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zznVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zza.zzc(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public static boolean zzi(zzk zzkVar, Object obj, Object obj2) {
        return zza.zzf(zzkVar, obj, obj2);
    }

    public static /* synthetic */ void zzm(zze zzeVar, Thread thread) {
        zza.zza(zzeVar, thread);
    }

    public final zzj.zzd zzh(zzj.zzd zzdVar) {
        return zza.zze(this, zzdVar);
    }

    public final void zzj() {
        for (zze zzeVarZzd = zza.zzd(this, zze.zza); zzeVarZzd != null; zzeVarZzd = zzeVarZzd.next) {
            Thread thread = zzeVarZzd.thread;
            if (thread != null) {
                zzeVarZzd.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final Object zzk(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzj.zzf(obj)) {
            return zzj.zze(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zza;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzj.zzf(obj2)) {
                                return zzj.zze(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzj.zze(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzj.zzf(obj4)) {
                return zzj.zze(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        a.A(sb, "Waited ", j, " ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                a.A(sb2, strConcat, jConvert, " ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                sb3.append(strConcat);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(YU.a.p(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
    }

    public final Object zzl() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzj.zzf(obj2)) {
            return zzj.zze(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zza;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzj.zzf(obj)));
                    return zzj.zze(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzj.zze(obj3);
    }
}
