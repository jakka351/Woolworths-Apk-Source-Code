package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzabm implements zzafv<zzajj> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzafv zzb;
    private final /* synthetic */ zzabj zzc;

    public zzabm(zzabj zzabjVar, zzael zzaelVar, zzafv zzafvVar) {
        this.zza = zzaelVar;
        this.zzb = zzafvVar;
        Objects.requireNonNull(zzabjVar);
        this.zzc = zzabjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zzb.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final void zza(zzajj zzajjVar) {
        zzajj zzajjVar2 = zzajjVar;
        if (TextUtils.isEmpty(zzajjVar2.zze())) {
            this.zzc.zza.zza(new zzahv(zzajjVar2.zzd(), zzajjVar2.zzb(), Long.valueOf(zzajjVar2.zza()), "Bearer"), null, "phone", Boolean.valueOf(zzajjVar2.zzf()), null, this.zza, this.zzb);
        } else {
            this.zza.zza(new Status(17025), new PhoneAuthCredential(null, null, zzajjVar2.zzc(), zzajjVar2.zze(), true));
        }
    }
}
