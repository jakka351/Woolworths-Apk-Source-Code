package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzabt implements zzafv<zzair> {
    private final /* synthetic */ zzaio zza;
    private final /* synthetic */ zzael zzb;

    public zzabt(zzaar zzaarVar, zzaio zzaioVar, zzael zzaelVar) {
        this.zza = zzaioVar;
        this.zzb = zzaelVar;
        Objects.requireNonNull(zzaarVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zzb.zza(zzao.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzair zzairVar) {
        zzair zzairVar2 = zzairVar;
        zzaio zzaioVar = this.zza;
        if (zzaioVar instanceof zzais) {
            this.zzb.zzb(zzairVar2.zza());
        } else {
            if (zzaioVar instanceof zzaiu) {
                this.zzb.zza(zzairVar2);
                return;
            }
            throw new IllegalArgumentException(a.h("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was ", this.zza.getClass().getName(), "."));
        }
    }
}
