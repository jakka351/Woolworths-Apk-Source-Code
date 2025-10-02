package com.google.android.gms.internal.p002firebaseauthapi;

import android.support.v4.media.session.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzjf extends zzjj {
    private final int zza;
    private final zza zzb;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static final class zzb {

        @Nullable
        private Integer zza;
        private zza zzb;

        public final zzb zza(int i) throws GeneralSecurityException {
            if (i != 32 && i != 48 && i != 64) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
            }
            this.zza = Integer.valueOf(i);
            return this;
        }

        private zzb() {
            this.zza = null;
            this.zzb = zza.zzc;
        }

        public final zzb zza(zza zzaVar) {
            this.zzb = zzaVar;
            return this;
        }

        public final zzjf zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzb != null) {
                    return new zzjf(num.intValue(), this.zzb);
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("Key size is not set");
        }
    }

    public static zzb zzc() {
        return new zzb();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjf)) {
            return false;
        }
        zzjf zzjfVar = (zzjf) obj;
        return zzjfVar.zza == this.zza && zzjfVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzjf.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return a.p("AesSiv Parameters (variant: ", this.zza, String.valueOf(this.zzb), ", ", "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zzb != zza.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zza zzd() {
        return this.zzb;
    }

    private zzjf(int i, zza zzaVar) {
        this.zza = i;
        this.zzb = zzaVar;
    }
}
