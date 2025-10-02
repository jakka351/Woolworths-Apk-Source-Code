package com.google.android.recaptcha.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzfj {

    @NotNull
    private final Lazy zza;

    public zzfj() {
        int i = zzav.zza;
        this.zza = LazyKt.b(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getD();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object zzc(com.google.android.recaptcha.internal.zzfj r4, com.google.android.recaptcha.internal.zzbr r5, com.google.android.recaptcha.internal.zzsp r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzfg
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzfg r0 = (com.google.android.recaptcha.internal.zzfg) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzfg r0 = new com.google.android.recaptcha.internal.zzfg
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            return r7
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r7)
            com.google.android.recaptcha.internal.zzfh r7 = new com.google.android.recaptcha.internal.zzfh
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.zzc = r3
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.c(r7, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfj.zzc(com.google.android.recaptcha.internal.zzfj, com.google.android.recaptcha.internal.zzbr, com.google.android.recaptcha.internal.zzsp, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object zzb(@NotNull zzbr zzbrVar, @NotNull zzsp zzspVar, @NotNull Continuation continuation) {
        return zzc(this, zzbrVar, zzspVar, continuation);
    }
}
