package com.google.mlkit.common.model;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;

/* loaded from: classes6.dex */
public abstract class RemoteModelSource {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        return Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(null);
    }

    public final String toString() {
        zzq zzqVarZzb = zzr.zzb("RemoteModelSource");
        zzqVarZzb.zza("firebaseModelName", null);
        return zzqVarZzb.toString();
    }
}
