package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {

    @NotNull
    private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{0,100}$");

    @NotNull
    private final zzcn zzb;

    @NotNull
    private final String zzc;

    @NotNull
    private final zzek zzd;

    @NotNull
    private final zzbi zze;

    public zzdc(@NotNull zzcn zzcnVar, @NotNull String str, @NotNull zzbi zzbiVar, @NotNull zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j, RecaptchaAction recaptchaAction) throws zzbd {
        zzbd zzbdVar = !zza.f(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(com.google.android.recaptcha.RecaptchaAction r12, long r13, kotlin.coroutines.Continuation r15) throws java.util.MissingResourceException {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.google.android.recaptcha.internal.zzcy
            if (r0 == 0) goto L13
            r0 = r15
            com.google.android.recaptcha.internal.zzcy r0 = (com.google.android.recaptcha.internal.zzcy) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcy r0 = new com.google.android.recaptcha.internal.zzcy
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r15)     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            r5 = r11
            goto L51
        L28:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L5c
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            kotlin.ResultKt.b(r15)
            java.util.UUID r15 = java.util.UUID.randomUUID()     // Catch: com.google.android.recaptcha.internal.zzbd -> L59
            java.lang.String r9 = r15.toString()     // Catch: com.google.android.recaptcha.internal.zzbd -> L59
            com.google.android.recaptcha.internal.zzcz r4 = new com.google.android.recaptcha.internal.zzcz     // Catch: com.google.android.recaptcha.internal.zzbd -> L59
            r10 = 0
            r5 = r11
            r8 = r12
            r6 = r13
            r4.<init>(r5, r6, r8, r9, r10)     // Catch: com.google.android.recaptcha.internal.zzbd -> L56
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L56
            java.lang.Object r15 = r11.zzg(r9, r4, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L56
            if (r15 != r1) goto L51
            return r1
        L51:
            kotlin.Result r15 = (kotlin.Result) r15     // Catch: com.google.android.recaptcha.internal.zzbd -> L56
            java.lang.Object r12 = r15.d     // Catch: com.google.android.recaptcha.internal.zzbd -> L56
            return r12
        L56:
            r0 = move-exception
        L57:
            r12 = r0
            goto L5c
        L59:
            r0 = move-exception
            r5 = r11
            goto L57
        L5c:
            com.google.android.recaptcha.RecaptchaException r12 = r12.zzc()
            kotlin.Result$Failure r12 = kotlin.ResultKt.a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.zzf(com.google.android.recaptcha.RecaptchaAction, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzg(java.lang.String r5, kotlin.jvm.functions.Function2 r6, kotlin.coroutines.Continuation r7) throws java.util.MissingResourceException, com.google.android.recaptcha.internal.zzbd {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzdb
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzdb r0 = (com.google.android.recaptcha.internal.zzdb) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdb r0 = new com.google.android.recaptcha.internal.zzdb
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.google.android.recaptcha.internal.zzen r5 = r0.zzd
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            goto L51
        L29:
            r6 = move-exception
            goto L56
        L2b:
            r6 = move-exception
            goto L67
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r7)
            com.google.android.recaptcha.internal.zzek r7 = r4.zzd
            com.google.android.recaptcha.internal.zzek r7 = r7.zza()
            r7.zzc(r5)
            r5 = 9
            com.google.android.recaptcha.internal.zzen r5 = r7.zzf(r5)
            r0.zzd = r5     // Catch: java.lang.Exception -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            r0.zzc = r3     // Catch: java.lang.Exception -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            java.lang.Object r7 = r6.invoke(r7, r0)     // Catch: java.lang.Exception -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            if (r7 == r1) goto L55
        L51:
            r5.zza()     // Catch: java.lang.Exception -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            return r7
        L55:
            return r1
        L56:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzX
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r0, r1, r6)
            r5.zzb(r7)
            throw r7
        L67:
            r5.zzb(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.zzg(java.lang.String, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    @org.jetbrains.annotations.Nullable
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo52execute0E7RQCE(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.RecaptchaAction r5, long r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> r8) throws java.util.MissingResourceException {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzcw
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzcw r0 = (com.google.android.recaptcha.internal.zzcw) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcw r0 = new com.google.android.recaptcha.internal.zzcw
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r5 = r8.d
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r8)
            r0.zzc = r3
            java.lang.Object r5 = r4.zzf(r5, r6, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.mo52execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    @org.jetbrains.annotations.Nullable
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo53executegIAlus(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.RecaptchaAction r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> r6) throws java.util.MissingResourceException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzcx
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcx r0 = new com.google.android.recaptcha.internal.zzcx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.d
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            r0.zzc = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r5 = r4.mo52execute0E7RQCE(r5, r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.mo53executegIAlus(com.google.android.recaptcha.RecaptchaAction, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    @NotNull
    public final Task<String> executeTask(@NotNull RecaptchaAction recaptchaAction) {
        return zzas.zza(BuildersKt.a(this.zze.zzb(), null, new zzda(this, recaptchaAction, 10000L, null), 3));
    }

    @NotNull
    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    @NotNull
    public final Task<String> executeTask(@NotNull RecaptchaAction recaptchaAction, long j) {
        return zzas.zza(BuildersKt.a(this.zze.zzb(), null, new zzda(this, recaptchaAction, j, null), 3));
    }
}
