package com.google.android.recaptcha.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzec implements zzcn {

    @NotNull
    private final zzdt zza;

    @NotNull
    private final zzek zzb;

    @Nullable
    private zzbd zzd;
    private zzsc zze;

    @NotNull
    private final zzbi zzg;

    @NotNull
    private CompletableDeferred zzc = CompletableDeferredKt.a();

    @NotNull
    private zzcm zzf = zzcm.zza;

    public zzec(@NotNull zzdt zzdtVar, @NotNull zzbi zzbiVar, @NotNull zzek zzekVar, @NotNull zzbo zzboVar) {
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzl(kotlin.jvm.functions.Function1 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzdv
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzdv r0 = (com.google.android.recaptcha.internal.zzdv) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdv r0 = new com.google.android.recaptcha.internal.zzdv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.android.recaptcha.internal.zzbn r5 = r0.zzd
            kotlin.ResultKt.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            com.google.android.recaptcha.internal.zzbn r6 = new com.google.android.recaptcha.internal.zzbn
            r6.<init>()
            r0.zzd = r6
            r0.zzc = r3
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 == r1) goto L53
            r5 = r6
        L44:
            r5.zzc()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r5.zza(r6)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            return r0
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zzl(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #1 {Exception -> 0x002f, blocks: (B:13:0x002b, B:26:0x0063, B:31:0x0076, B:32:0x007f), top: B:53:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzm(long r7, kotlin.coroutines.Continuation r9) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdw
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdw r0 = (com.google.android.recaptcha.internal.zzdw) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdw r0 = new com.google.android.recaptcha.internal.zzdw
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.zzb
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            long r7 = r0.zza
            com.google.android.recaptcha.internal.zzec r0 = r0.zze
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L2f
            goto L63
        L2f:
            r7 = move-exception
            goto L82
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            long r7 = r0.zza
            com.google.android.recaptcha.internal.zzec r2 = r0.zze
            kotlin.ResultKt.b(r9)
            goto L51
        L41:
            kotlin.ResultKt.b(r9)
            r0.zze = r6
            r0.zza = r7
            r0.zzd = r4
            java.lang.Object r9 = r6.zzn(r7, r0)
            if (r9 == r1) goto Lb8
            r2 = r6
        L51:
            com.google.android.recaptcha.internal.zzdy r9 = new com.google.android.recaptcha.internal.zzdy     // Catch: java.lang.Exception -> L80
            r9.<init>(r7, r2, r5)     // Catch: java.lang.Exception -> L80
            r0.zze = r2     // Catch: java.lang.Exception -> L80
            r0.zza = r7     // Catch: java.lang.Exception -> L80
            r0.zzd = r3     // Catch: java.lang.Exception -> L80
            java.lang.Object r9 = r2.zzl(r9, r0)     // Catch: java.lang.Exception -> L80
            if (r9 == r1) goto Lb8
            r0 = r2
        L63:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Exception -> L2f
            long r1 = r9.longValue()     // Catch: java.lang.Exception -> L2f
            long r7 = r7 - r1
            r1 = 500(0x1f4, double:2.47E-321)
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 < 0) goto L76
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            return r9
        L76:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd     // Catch: java.lang.Exception -> L2f
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzc     // Catch: java.lang.Exception -> L2f
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zzar     // Catch: java.lang.Exception -> L2f
            r7.<init>(r8, r9, r5)     // Catch: java.lang.Exception -> L2f
            throw r7     // Catch: java.lang.Exception -> L2f
        L80:
            r7 = move-exception
            r0 = r2
        L82:
            boolean r8 = r7 instanceof com.google.android.recaptcha.internal.zzbd
            if (r8 == 0) goto L89
            r5 = r7
            com.google.android.recaptcha.internal.zzbd r5 = (com.google.android.recaptcha.internal.zzbd) r5
        L89:
            if (r5 != 0) goto L98
            com.google.android.recaptcha.internal.zzbd r5 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zzar
            java.lang.String r7 = r7.getMessage()
            r5.<init>(r8, r9, r7)
        L98:
            com.google.android.recaptcha.internal.zzcm r7 = r0.zzf
            com.google.android.recaptcha.internal.zzci r8 = com.google.android.recaptcha.internal.zzcm.zza()
            boolean r7 = kotlin.jvm.internal.Intrinsics.c(r7, r8)
            if (r7 != 0) goto Lb2
            com.google.android.recaptcha.internal.zzcm r7 = r0.zzf
            com.google.android.recaptcha.internal.zzck r8 = com.google.android.recaptcha.internal.zzcm.zzc()
            boolean r7 = kotlin.jvm.internal.Intrinsics.c(r7, r8)
            if (r7 == 0) goto Lb1
            goto Lb2
        Lb1:
            throw r5
        Lb2:
            com.google.android.recaptcha.internal.zzbd r7 = r0.zzd
            if (r7 == 0) goto Lb7
            r5 = r7
        Lb7:
            throw r5
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zzm(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object zzn(long j, Continuation continuation) {
        boolean zC = Intrinsics.c(this.zzf, zzcm.zzb);
        Unit unit = Unit.f24250a;
        if (!zC && !Intrinsics.c(this.zzf, zzcm.zzc) && (!Intrinsics.c(this.zzf, zzcm.zzd) || zzo(this.zzd))) {
            this.zzf = zzcm.zzc;
            CompletableDeferred completableDeferredA = CompletableDeferredKt.a();
            this.zzc = completableDeferredA;
            BuildersKt.c(this.zzg.zza(), null, null, new zzeb(this, completableDeferredA, j, null), 3);
        }
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (Intrinsics.c(zzbdVar.zzb(), zzbb.zzd) || Intrinsics.c(zzbdVar.zzb(), zzbb.zze) || Intrinsics.c(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.google.android.recaptcha.internal.zzcn
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(@org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.RecaptchaAction r19, long r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r22) throws com.google.android.recaptcha.internal.zzbd {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zza(java.lang.String, com.google.android.recaptcha.RecaptchaAction, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    @Nullable
    public final Object zzb(long j, @NotNull Continuation continuation) {
        Object objZzn = zzn(j, continuation);
        return objZzn == CoroutineSingletons.d ? objZzn : Unit.f24250a;
    }
}
