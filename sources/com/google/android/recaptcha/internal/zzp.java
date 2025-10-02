package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzp implements zzy {

    @NotNull
    private final zzek zza;

    @NotNull
    private final Lazy zzb;
    private boolean zzc;

    public zzp(@NotNull zzek zzekVar) {
        this.zza = zzekVar;
        int i = zzav.zza;
        this.zzb = LazyKt.b(zzo.zza);
        this.zzc = true;
    }

    private final zzbf zzg() {
        return (zzbf) this.zzb.getD();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @NotNull
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @Nullable
    public final Object zzc(@NotNull String str, @NotNull Continuation continuation) throws MissingResourceException {
        zzen zzenVarZzb = zzz.zzb(this, str);
        String strZza = zzg().zza();
        zzenVarZzb.zza();
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw(strZza);
        zztfVarZzf.zze(CollectionsKt.Q(zztgVarZzf.zzk()));
        return zzz.zza(this, (zzti) zztfVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @Nullable
    public final Object zzd(@NotNull zzse zzseVar, @NotNull Continuation continuation) throws MissingResourceException {
        zzen zzenVarZzc = zzz.zzc(this);
        int length = zzseVar.zzl().length();
        Unit unit = Unit.f24250a;
        if (length == 0) {
            this.zzc = false;
            zzenVarZzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return unit;
        }
        zzg().zzb(MapsKt.i(new Pair("_GRECAPTCHA_KC", zzseVar.zzl())));
        zzenVarZzc.zza();
        return unit;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(@NotNull zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzc;
    }
}
