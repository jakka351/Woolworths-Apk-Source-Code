package com.google.android.gms.internal.p002firebaseauthapi;

import android.support.v4.media.session.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzeg extends zzcy {
    private final int zza;
    private final zzb zzb;

    public static final class zza {

        @Nullable
        private Integer zza;
        private zzb zzb;

        public final zza zza(int i) throws GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.zza = Integer.valueOf(i);
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = zzb.zzc;
        }

        public final zza zza(zzb zzbVar) {
            this.zzb = zzbVar;
            return this;
        }

        public final zzeg zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzb != null) {
                    return new zzeg(num.intValue(), this.zzb);
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("Key size is not set");
        }
    }

    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("NO_PREFIX");
        private final String zzd;

        private zzb(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static zza zzc() {
        return new zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzeg)) {
            return false;
        }
        zzeg zzegVar = (zzeg) obj;
        return zzegVar.zza == this.zza && zzegVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzeg.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return a.p("AesGcmSiv Parameters (variant: ", this.zza, String.valueOf(this.zzb), ", ", "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zzb != zzb.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzb zzd() {
        return this.zzb;
    }

    private zzeg(int i, zzb zzbVar) {
        this.zza = i;
        this.zzb = zzbVar;
    }
}
