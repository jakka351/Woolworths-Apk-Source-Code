package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzdx extends zzcy {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zza zzd;

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

        @Nullable
        private Integer zzb;

        @Nullable
        private Integer zzc;
        private zza zzd;

        public final zzb zza(int i) throws GeneralSecurityException {
            this.zzb = 12;
            return this;
        }

        public final zzb zzb(int i) throws GeneralSecurityException {
            if (i != 16 && i != 24 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.zza = Integer.valueOf(i);
            return this;
        }

        public final zzb zzc(int i) throws GeneralSecurityException {
            this.zzc = 16;
            return this;
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zza.zzc;
        }

        public final zzb zza(zza zzaVar) {
            this.zzd = zzaVar;
            return this;
        }

        public final zzdx zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzd != null) {
                    if (this.zzb != null) {
                        if (this.zzc != null) {
                            return new zzdx(num.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd);
                        }
                        throw new GeneralSecurityException("Tag size is not set");
                    }
                    throw new GeneralSecurityException("IV size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("Key size is not set");
        }
    }

    public static zzb zze() {
        return new zzb();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdx)) {
            return false;
        }
        zzdx zzdxVar = (zzdx) obj;
        return zzdxVar.zza == this.zza && zzdxVar.zzb == this.zzb && zzdxVar.zzc == this.zzc && zzdxVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzdx.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        return a.i(this.zzc, this.zza, "-byte tag, and ", "-byte key)", b.u("AesGcm Parameters (variant: ", this.zzb, strValueOf, ", ", "-byte IV, "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zzd != zza.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final zza zzf() {
        return this.zzd;
    }

    private zzdx(int i, int i2, int i3, zza zzaVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = zzaVar;
    }
}
