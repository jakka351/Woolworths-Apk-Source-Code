package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;

/* loaded from: classes5.dex */
public final class zzap {

    public static final class zza extends zzcg<zza, C0298zza> implements zzdq {
        private static volatile zzdz<zza> zzbg;
        private static final zza zzes;
        private int zzbb;
        private int zzel;
        private int zzem;
        private int zzen;
        private int zzeo;
        private int zzep;
        private int zzeq;
        private int zzer;

        /* renamed from: com.google.android.gms.internal.clearcut.zzap$zza$zza, reason: collision with other inner class name */
        public static final class C0298zza extends zzcg.zza<zza, C0298zza> implements zzdq {
            private C0298zza() {
                super(zza.zzes);
            }

            public /* synthetic */ C0298zza(zzaq zzaqVar) {
                this();
            }
        }

        public enum zzb implements zzcj {
            UNKNOWN(0),
            ON(1),
            OFF(2);

            private static final zzck<zzb> zzbq = new zzar();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzck<zzb> zzd() {
                return zzbq;
            }

            public static zzb zze(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ON;
                }
                if (i != 2) {
                    return null;
                }
                return OFF;
            }

            @Override // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }
        }

        static {
            zza zzaVar = new zza();
            zzes = zzaVar;
            zzcg.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzap$zza>] */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        public final Object zza(int i, Object obj, Object obj2) {
            zzdz<zza> zzdzVar;
            zzaq zzaqVar = null;
            switch (zzaq.zzba[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0298zza(zzaqVar);
                case 3:
                    return zzcg.zza(zzes, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005\u0007\f\u0006", new Object[]{"zzbb", "zzel", zzb.zzd(), "zzem", zzb.zzd(), "zzen", zzb.zzd(), "zzeo", zzb.zzd(), "zzep", zzb.zzd(), "zzeq", zzb.zzd(), "zzer", zzb.zzd()});
                case 4:
                    return zzes;
                case 5:
                    zzdz<zza> zzdzVar2 = zzbg;
                    if (zzdzVar2 != null) {
                        return zzdzVar2;
                    }
                    synchronized (zza.class) {
                        try {
                            zzdz<zza> zzdzVar3 = zzbg;
                            zzdzVar = zzdzVar3;
                            if (zzdzVar3 == null) {
                                ?? zzbVar = new zzcg.zzb(zzes);
                                zzbg = zzbVar;
                                zzdzVar = zzbVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return zzdzVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
