package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzabr implements zzafv<zzajl> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzabs zzb;

    public zzabr(zzabs zzabsVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzabsVar);
        this.zzb = zzabsVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zza.zza(zzao.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzajl zzajlVar) {
        zzajl zzajlVar2 = zzajlVar;
        if (!TextUtils.isEmpty(zzajlVar2.zza()) && !TextUtils.isEmpty(zzajlVar2.zzb())) {
            this.zzb.zza.zza(new zzahv(zzajlVar2.zzb(), zzajlVar2.zza(), Long.valueOf(zzahx.zza(zzajlVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
            return;
        }
        this.zza.zza(zzao.a("INTERNAL_SUCCESS_SIGN_OUT"));
    }
}
