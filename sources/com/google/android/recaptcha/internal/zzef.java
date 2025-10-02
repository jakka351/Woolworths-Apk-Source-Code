package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzef implements zzcn {

    @NotNull
    private final zzdt zza;

    @NotNull
    private zzcm zzb = zzcm.zza;
    private zzsc zzc;

    public zzef(@NotNull zzdt zzdtVar) {
        this.zza = zzdtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // com.google.android.recaptcha.internal.zzcn
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.RecaptchaAction r18, long r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r21) throws com.google.android.recaptcha.internal.zzbd {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zza(java.lang.String, com.google.android.recaptcha.RecaptchaAction, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.google.android.recaptcha.internal.zzef] */
    @Override // com.google.android.recaptcha.internal.zzcn
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb(long r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzee
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzee r0 = (com.google.android.recaptcha.internal.zzee) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzee r0 = new com.google.android.recaptcha.internal.zzee
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzd
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            com.google.android.recaptcha.internal.zzef r12 = r0.zze
            kotlin.ResultKt.b(r14)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            goto L9b
        L2f:
            r13 = move-exception
            goto La6
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            double r12 = r0.zza
            com.google.android.recaptcha.internal.zzef r2 = r0.zze
            kotlin.ResultKt.b(r14)     // Catch: com.google.android.recaptcha.internal.zzbd -> L46
            r10 = r2
            r2 = r14
            r13 = r12
            r12 = r10
            goto L8a
        L46:
            r13 = move-exception
            r12 = r2
            goto La6
        L49:
            kotlin.ResultKt.b(r14)
            com.google.android.recaptcha.internal.zzcm r14 = r11.zzb
            com.google.android.recaptcha.internal.zzcj r2 = com.google.android.recaptcha.internal.zzcm.zzb()
            boolean r14 = kotlin.jvm.internal.Intrinsics.c(r14, r2)
            if (r14 != 0) goto Lad
            com.google.android.recaptcha.internal.zzcm r14 = r11.zzb
            com.google.android.recaptcha.internal.zzci r2 = com.google.android.recaptcha.internal.zzcm.zza()
            boolean r14 = kotlin.jvm.internal.Intrinsics.c(r14, r2)
            if (r14 == 0) goto L65
            goto Lad
        L65:
            com.google.android.recaptcha.internal.zzck r14 = com.google.android.recaptcha.internal.zzcm.zzc()
            r11.zzb = r14
            double r12 = (double) r12
            com.google.android.recaptcha.internal.zzdt r14 = r11.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            r6 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r6 = r6 * r12
            r0.zze = r11     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            r8 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r12 = r12 * r8
            r0.zza = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            r0.zzd = r5     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            long r5 = (long) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            java.lang.Object r14 = r14.zzo(r5, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            if (r14 == r1) goto La2
            r2 = r14
            r13 = r12
            r12 = r11
        L8a:
            com.google.android.recaptcha.internal.zzsc r2 = (com.google.android.recaptcha.internal.zzsc) r2     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r12.zzc = r2     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            com.google.android.recaptcha.internal.zzdt r5 = r12.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            long r13 = (long) r13     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r0.zze = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            java.lang.Object r13 = r5.zzn(r2, r13, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            if (r13 == r1) goto La2
        L9b:
            com.google.android.recaptcha.internal.zzcj r13 = com.google.android.recaptcha.internal.zzcm.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r12.zzb = r13     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            return r3
        La2:
            return r1
        La3:
            r12 = move-exception
            r13 = r12
            r12 = r11
        La6:
            com.google.android.recaptcha.internal.zzci r14 = com.google.android.recaptcha.internal.zzcm.zza()
            r12.zzb = r14
            throw r13
        Lad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zzb(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
