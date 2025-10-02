package com.google.android.recaptcha.internal;

import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzcb {
    private Object zza;

    @NotNull
    private final Mutex zzb = MutexKt.a();

    public zzcb(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzby
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzby r0 = (com.google.android.recaptcha.internal.zzby) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzby r0 = new com.google.android.recaptcha.internal.zzby
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zzb
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzd
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.zza
            kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
            com.google.android.recaptcha.internal.zzje r1 = r0.zzf
            com.google.android.recaptcha.internal.zzcb r0 = r0.zze
            kotlin.ResultKt.b(r6)
            r6 = r5
            r5 = r1
            goto L50
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r4.zzb
            r0.zze = r4
            r2 = r5
            com.google.android.recaptcha.internal.zzje r2 = (com.google.android.recaptcha.internal.zzje) r2
            r0.zzf = r2
            r0.zza = r6
            r0.zzd = r3
            java.lang.Object r0 = r6.a(r0)
            if (r0 == r1) goto L64
            r0 = r4
        L50:
            r1 = 0
            java.lang.Object r0 = r0.zza     // Catch: java.lang.Throwable -> L5f
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r0, r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L5f
            r6.c(r1)
            return r5
        L5f:
            r5 = move-exception
            r6.c(r1)
            throw r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcb.zza(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb(@org.jetbrains.annotations.NotNull java.lang.Object[] r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzbz
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzbz r0 = (com.google.android.recaptcha.internal.zzbz) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzbz r0 = new com.google.android.recaptcha.internal.zzbz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zzb
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzd
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.zza
            kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
            com.google.android.recaptcha.internal.zzje[] r1 = r0.zzf
            com.google.android.recaptcha.internal.zzcb r0 = r0.zze
            kotlin.ResultKt.b(r6)
            r6 = r5
            r5 = r1
            goto L50
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r4.zzb
            r0.zze = r4
            r2 = r5
            com.google.android.recaptcha.internal.zzje[] r2 = (com.google.android.recaptcha.internal.zzje[]) r2
            r0.zzf = r2
            r0.zza = r6
            r0.zzd = r3
            java.lang.Object r0 = r6.a(r0)
            if (r0 == r1) goto L64
            r0 = r4
        L50:
            r1 = 0
            java.lang.Object r0 = r0.zza     // Catch: java.lang.Throwable -> L5f
            boolean r5 = kotlin.collections.ArraysKt.l(r5, r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L5f
            r6.c(r1)
            return r5
        L5f:
            r5 = move-exception
            r6.c(r1)
            throw r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcb.zzb(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzca
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzca r0 = (com.google.android.recaptcha.internal.zzca) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzca r0 = new com.google.android.recaptcha.internal.zzca
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zzb
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzd
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.zza
            kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
            com.google.android.recaptcha.internal.zzje r1 = r0.zzf
            com.google.android.recaptcha.internal.zzcb r0 = r0.zze
            kotlin.ResultKt.b(r6)
            r6 = r5
            r5 = r1
            goto L50
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r4.zzb
            r0.zze = r4
            r2 = r5
            com.google.android.recaptcha.internal.zzje r2 = (com.google.android.recaptcha.internal.zzje) r2
            r0.zzf = r2
            r0.zza = r6
            r0.zzd = r3
            java.lang.Object r0 = r6.a(r0)
            if (r0 == r1) goto L5e
            r0 = r4
        L50:
            r1 = 0
            r0.zza = r5     // Catch: java.lang.Throwable -> L59
            r6.c(r1)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L59:
            r5 = move-exception
            r6.c(r1)
            throw r5
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcb.zzc(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
