package com.google.android.recaptcha.internal;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzae implements zzy {

    @NotNull
    private final zzek zza;

    @NotNull
    private final Context zzb;

    @NotNull
    private final zzan zzc;
    private boolean zzd = true;

    @NotNull
    private String zze = "";

    @NotNull
    private final zzbs zzf;

    public zzae(@NotNull zzek zzekVar, @NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull zzan zzanVar, @NotNull zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzkhVarZzg = zzkh.zzg();
        byte[] bArrZzl = zzleVar.zzl();
        byte[] bArrZzd = zzjz.zza().zza(zzkhVarZzg.zzi(bArrZzl, 0, bArrZzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzleVarZzk = zzle.zzk(bArrZzd, 0, bArrZzd.length);
        zzkh zzkhVarZzh = zzkh.zzh();
        byte[] bArrZzl2 = zzleVarZzk.zzl();
        return zzkhVarZzh.zzi(bArrZzl2, 0, bArrZzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @NotNull
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @Nullable
    public final Object zzc(@NotNull String str, @NotNull Continuation continuation) {
        return CoroutineScopeKt.c(new zzac(this, str, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r13.zze(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zzy
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzd(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzse r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r13) throws java.util.MissingResourceException {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzad
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzad r0 = (com.google.android.recaptcha.internal.zzad) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzad r0 = new com.google.android.recaptcha.internal.zzad
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzd
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            java.lang.Object r12 = r0.zza
            com.google.android.recaptcha.internal.zzen r12 = (com.google.android.recaptcha.internal.zzen) r12
            kotlin.ResultKt.b(r13)
            goto L8d
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            com.google.android.recaptcha.internal.zzen r12 = r0.zze
            java.lang.Object r2 = r0.zza
            com.google.android.recaptcha.internal.zzae r2 = (com.google.android.recaptcha.internal.zzae) r2
            kotlin.ResultKt.b(r13)
            goto L7e
        L43:
            kotlin.ResultKt.b(r13)
            com.google.android.recaptcha.internal.zzen r13 = com.google.android.recaptcha.internal.zzz.zzc(r11)
            com.google.android.recaptcha.internal.zzbs r2 = r11.zzf
            android.content.Context r7 = r11.zzb
            int r2 = r2.zza(r7)
            r7 = 3
            if (r2 != r7) goto L92
            long r7 = r12.zzf()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L60
            goto L92
        L60:
            com.google.android.recaptcha.internal.zzle r2 = r12.zzg()
            java.lang.String r2 = zzi(r2)
            r11.zze = r2
            com.google.android.recaptcha.internal.zzan r2 = r11.zzc
            long r7 = r12.zzf()
            r0.zza = r11
            r0.zze = r13
            r0.zzd = r6
            java.lang.Object r12 = r2.zzd(r7, r0)
            if (r12 == r1) goto L91
            r2 = r11
            r12 = r13
        L7e:
            com.google.android.recaptcha.internal.zzan r13 = r2.zzc
            r0.zza = r12
            r0.zze = r4
            r0.zzd = r5
            java.lang.Object r13 = r13.zze(r0)
            if (r13 != r1) goto L8d
            goto L91
        L8d:
            r12.zza()
            return r3
        L91:
            return r1
        L92:
            r12 = 0
            r11.zzd = r12
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzab
            r12.<init>(r0, r1, r4)
            r13.zzb(r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzae.zzd(com.google.android.recaptcha.internal.zzse, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(@NotNull zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
