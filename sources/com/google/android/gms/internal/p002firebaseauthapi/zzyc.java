package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

@Deprecated
/* loaded from: classes5.dex */
public final class zzyc extends zzalf<zzyc, zza> implements zzamo {
    private static final zzyc zzc;
    private static volatile zzamv<zzyc> zzd;
    private String zze = "";
    private zzalm<zzxe> zzf = zzalf.zzp();

    public static final class zza extends zzalf.zzb<zzyc, zza> implements zzamo {
        private zza() {
            super(zzyc.zzc);
        }
    }

    static {
        zzyc zzycVar = new zzyc();
        zzc = zzycVar;
        zzalf.zza((Class<zzyc>) zzyc.class, zzycVar);
    }

    private zzyc() {
    }

    public static zzyc zzb() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        zzamv zzaVar;
        switch (zzyb.zza[i - 1]) {
            case 1:
                return new zzyc();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzxe.class});
            case 4:
                return zzc;
            case 5:
                zzamv<zzyc> zzamvVar = zzd;
                if (zzamvVar != null) {
                    return zzamvVar;
                }
                synchronized (zzyc.class) {
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
