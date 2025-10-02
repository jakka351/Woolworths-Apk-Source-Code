package com.google.android.recaptcha.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public abstract class zze {
    private boolean zza;

    @Nullable
    public zzen zza(@NotNull String str) {
        throw null;
    }

    @Nullable
    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5 A[PHI: r0
  0x00d5: PHI (r0v15 java.lang.Object) = (r0v14 java.lang.Object), (r0v1 java.lang.Object) binds: [B:45:0x00d2, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(@org.jetbrains.annotations.NotNull java.lang.String r19, long r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r22) throws com.google.android.recaptcha.internal.zzbd {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public abstract Object zzd(@NotNull String str, @NotNull Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[PHI: r9 r10 r12
  0x0099: PHI (r9v8 com.google.android.recaptcha.internal.zzen) = (r9v5 com.google.android.recaptcha.internal.zzen), (r9v14 com.google.android.recaptcha.internal.zzen) binds: [B:36:0x0097, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0099: PHI (r10v6 com.google.android.recaptcha.internal.zze) = (r10v3 com.google.android.recaptcha.internal.zze), (r10v10 com.google.android.recaptcha.internal.zze) binds: [B:36:0x0097, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0099: PHI (r12v8 java.lang.Object) = (r12v9 java.lang.Object), (r12v10 java.lang.Object) binds: [B:36:0x0097, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(long r9, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzsc r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r12) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.zzb
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzd
            r3 = 0
            kotlin.Unit r4 = kotlin.Unit.f24250a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L53
            if (r2 == r7) goto L47
            if (r2 == r6) goto L3d
            if (r2 != r5) goto L35
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zzbd r9 = (com.google.android.recaptcha.internal.zzbd) r9
            kotlin.ResultKt.b(r12)
            goto Lae
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            kotlin.ResultKt.b(r12)
            goto L99
        L47:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            kotlin.ResultKt.b(r12)     // Catch: java.lang.Exception -> L51
            goto L77
        L51:
            r11 = move-exception
            goto L8a
        L53:
            kotlin.ResultKt.b(r12)
            com.google.android.recaptcha.internal.zzen r12 = r8.zzb()
            boolean r2 = r8.zza
            if (r2 == 0) goto L62
            r12.zza()
            return r4
        L62:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L86
            r2.<init>(r8, r11, r3)     // Catch: java.lang.Exception -> L86
            r0.zza = r8     // Catch: java.lang.Exception -> L86
            r0.zze = r12     // Catch: java.lang.Exception -> L86
            r0.zzd = r7     // Catch: java.lang.Exception -> L86
            java.lang.Object r9 = kotlinx.coroutines.TimeoutKt.b(r9, r2, r0)     // Catch: java.lang.Exception -> L86
            if (r9 == r1) goto Lb3
            r10 = r12
            r12 = r9
            r9 = r10
            r10 = r8
        L77:
            kotlin.Result r12 = (kotlin.Result) r12     // Catch: java.lang.Exception -> L51
            java.lang.Object r11 = r12.d     // Catch: java.lang.Exception -> L51
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Exception -> L51
            r10.zza = r7     // Catch: java.lang.Exception -> L51
            if (r9 == 0) goto L85
            r9.zza()     // Catch: java.lang.Exception -> L51
        L85:
            return r4
        L86:
            r9 = move-exception
            r11 = r9
            r10 = r8
            r9 = r12
        L8a:
            r12 = 0
            r10.zza = r12
            r0.zza = r10
            r0.zze = r9
            r0.zzd = r6
            java.lang.Object r12 = r10.zzj(r11, r0)
            if (r12 == r1) goto Lb3
        L99:
            r11 = r12
            com.google.android.recaptcha.internal.zzbd r11 = (com.google.android.recaptcha.internal.zzbd) r11
            if (r9 == 0) goto La1
            r9.zzb(r11)
        La1:
            r0.zza = r11
            r0.zze = r3
            r0.zzd = r5
            java.lang.Object r9 = r10.zzg(r11, r0)
            if (r9 == r1) goto Lb3
            r9 = r11
        Lae:
            kotlin.Result$Failure r9 = kotlin.ResultKt.a(r9)
            return r9
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public abstract Object zzf(@NotNull String str, @NotNull Continuation continuation) throws zzbd;

    @Nullable
    public Object zzg(@NotNull zzbd zzbdVar, @NotNull Continuation continuation) {
        return Unit.f24250a;
    }

    @Nullable
    public abstract Object zzh(@NotNull zzsc zzscVar, @NotNull Continuation continuation) throws zzbd;

    @Nullable
    public Object zzi(@NotNull String str, long j, @NotNull Exception exc, @NotNull Continuation continuation) {
        return Unit.f24250a;
    }

    @Nullable
    public Object zzj(@NotNull Exception exc, @NotNull Continuation continuation) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(@NotNull zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
