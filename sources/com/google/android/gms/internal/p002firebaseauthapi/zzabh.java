package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzabh implements zzafv<zzahv> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzael zze;
    private final /* synthetic */ zzaar zzf;

    public zzabh(zzaar zzaarVar, String str, String str2, String str3, String str4, zzael zzaelVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzf = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zze.zza(zzao.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzaar.zza(this.zzf, this.zze, new zzaim(this.zza, this.zzb, null, this.zzc, this.zzd, zzahvVar.zzc()), this);
    }
}
