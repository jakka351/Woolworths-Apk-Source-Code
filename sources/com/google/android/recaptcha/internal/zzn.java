package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.MissingResourceException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzn implements zzy {

    @NotNull
    private final zzek zza;

    public zzn(@NotNull zzek zzekVar) {
        this.zza = zzekVar;
    }

    private static final zzth zzg(String str) {
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw(str);
        return (zzth) zztgVarZzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 11;
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
        zztf zztfVarZzf = zzti.zzf();
        zzth zzthVarZzg = zzg(Build.MANUFACTURER);
        zzth zzthVarZzg2 = zzg(Build.MODEL);
        zzth zzthVarZzg3 = zzg(Build.DEVICE);
        zzth zzthVarZzg4 = zzg(Build.HARDWARE);
        zzth zzthVarZzg5 = zzg(Build.FINGERPRINT);
        zzth zzthVarZzg6 = zzg(Build.PRODUCT);
        zzth zzthVarZzg7 = zzg(Build.BOARD);
        zzth zzthVarZzg8 = zzg(Build.BRAND);
        zzth zzthVarZzg9 = zzg(ArraysKt.U(Build.SUPPORTED_ABIS, ",", "[", "]", null, 56));
        long j = Build.TIME;
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzv(j);
        zztfVarZzf.zze(CollectionsKt.R(zzthVarZzg, zzthVarZzg2, zzthVarZzg3, zzthVarZzg4, zzthVarZzg5, zzthVarZzg6, zzthVarZzg7, zzthVarZzg8, zzthVarZzg9, (zzth) zztgVarZzf.zzk(), zzg(Build.ID), zzg(Build.BOOTLOADER), zzg(Build.DISPLAY), zzg(Build.TYPE), zzg(Build.TAGS)));
        zzenVarZzb.zza();
        return zzz.zza(this, (zzti) zztfVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @Nullable
    public final Object zzd(@NotNull zzse zzseVar, @NotNull Continuation continuation) throws MissingResourceException {
        zzz.zzc(this).zza();
        return Unit.f24250a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(@NotNull zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return true;
    }
}
