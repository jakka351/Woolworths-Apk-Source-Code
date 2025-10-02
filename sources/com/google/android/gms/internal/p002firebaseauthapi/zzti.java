package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: classes5.dex */
public final class zzti extends zzalf<zzti, zza> implements zzamo {
    private static final zzti zzc;
    private static volatile zzamv<zzti> zzd;
    private int zze;
    private zzto zzf;
    private zzwe zzg;

    public static final class zza extends zzalf.zzb<zzti, zza> implements zzamo {
        public final zza zza(zzto zztoVar) {
            zzg();
            zzti.zza((zzti) this.zza, zztoVar);
            return this;
        }

        private zza() {
            super(zzti.zzc);
        }

        public final zza zza(zzwe zzweVar) {
            zzg();
            zzti.zza((zzti) this.zza, zzweVar);
            return this;
        }
    }

    static {
        zzti zztiVar = new zzti();
        zzc = zztiVar;
        zzalf.zza((Class<zzti>) zzti.class, zztiVar);
    }

    private zzti() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzto zzc() {
        zzto zztoVar = this.zzf;
        return zztoVar == null ? zzto.zzd() : zztoVar;
    }

    public final zzwe zzd() {
        zzwe zzweVar = this.zzg;
        return zzweVar == null ? zzwe.zze() : zzweVar;
    }

    public static zzti zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzti) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zztk.zza[i - 1]) {
            case 1:
                return new zzti();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzti> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzti.class) {
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

    public static /* synthetic */ void zza(zzti zztiVar, zzto zztoVar) {
        zztoVar.getClass();
        zztiVar.zzf = zztoVar;
        zztiVar.zze |= 1;
    }

    public static /* synthetic */ void zza(zzti zztiVar, zzwe zzweVar) {
        zzweVar.getClass();
        zztiVar.zzg = zzweVar;
        zztiVar.zze |= 2;
    }
}
