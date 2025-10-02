package com.google.mlkit.common.model;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;

/* loaded from: classes6.dex */
public class LocalModel {

    public static class Builder {
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalModel)) {
            return false;
        }
        return Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(null, null, null, Boolean.FALSE);
    }

    public final String toString() {
        zzq zzqVarZza = zzr.zza(this);
        zzqVarZza.zza("absoluteFilePath", null);
        zzqVarZza.zza("assetFilePath", null);
        zzqVarZza.zza("uri", null);
        zzqVarZza.zzb("isManifestFile", false);
        return zzqVarZza.toString();
    }
}
