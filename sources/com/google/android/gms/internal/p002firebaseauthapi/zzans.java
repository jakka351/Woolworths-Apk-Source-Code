package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: classes5.dex */
public final class zzans extends zzalf<zzans, zza> implements zzamo {
    private static final zzans zzc;
    private static volatile zzamv<zzans> zzd;
    private long zze;
    private int zzf;

    public static final class zza extends zzalf.zzb<zzans, zza> implements zzamo {
        public final zza zza(int i) {
            if (!this.zza.zzw()) {
                zzh();
            }
            ((zzans) this.zza).zzf = i;
            return this;
        }

        private zza() {
            super(zzans.zzc);
        }

        public final zza zza(long j) {
            if (!this.zza.zzw()) {
                zzh();
            }
            ((zzans) this.zza).zze = j;
            return this;
        }
    }

    static {
        zzans zzansVar = new zzans();
        zzc = zzansVar;
        zzalf.zza((Class<zzans>) zzans.class, zzansVar);
    }

    private zzans() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zzanr.zza[i - 1]) {
            case 1:
                return new zzans();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzans> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzans.class) {
                    try {
                        zzaVar = zzd;
                        if (zzaVar == null) {
                            zzaVar = new zzalf.zza(zzc);
                            zzd = zzaVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zzaVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
