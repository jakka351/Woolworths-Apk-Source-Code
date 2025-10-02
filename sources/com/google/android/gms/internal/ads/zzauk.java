package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzauk implements zzfpx {
    final /* synthetic */ zzfoc zza;

    public zzauk(zzaum zzaumVar, zzfoc zzfocVar) {
        this.zza = zzfocVar;
        Objects.requireNonNull(zzaumVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfpx
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
