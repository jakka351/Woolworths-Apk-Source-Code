package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.internal.zzav;

/* loaded from: classes6.dex */
final class zzr implements zzav {
    @Override // com.google.firebase.auth.internal.zzav
    public final void zza() {
        throw null;
    }

    @Override // com.google.firebase.auth.internal.zzau
    public final void zza(Status status) {
        if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005) {
            throw null;
        }
    }
}
