package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzl;

@VisibleForTesting
/* loaded from: classes5.dex */
final class zzadx extends zzaff<Void, zzl> {
    private final boolean zzaa;

    @Nullable
    private final String zzab;

    @Nullable
    private final String zzac;

    @Nullable
    private final String zzad;
    private final boolean zzae;
    private final String zzv;
    private final String zzw;

    @Nullable
    private final String zzx;
    private final long zzy;
    private final boolean zzz;

    public zzadx(zzam zzamVar, String str, @Nullable String str2, long j, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z3) {
        super(8);
        Preconditions.checkNotNull(zzamVar);
        Preconditions.checkNotEmpty(str);
        this.zzv = Preconditions.checkNotEmpty(zzamVar.d);
        this.zzw = str;
        this.zzx = str2;
        this.zzy = j;
        this.zzz = z;
        this.zzaa = z2;
        this.zzab = str3;
        this.zzac = str4;
        this.zzad = str5;
        this.zzae = z3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzae, this.zzb);
    }
}
