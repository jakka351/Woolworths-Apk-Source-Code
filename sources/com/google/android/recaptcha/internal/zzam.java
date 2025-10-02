package com.google.android.recaptcha.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
final class zzam extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzam(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.util.MissingResourceException {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.zzb
            if (r1 == 0) goto L10
            java.lang.Object r0 = r6.zza
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> Le
            goto L5a
        Le:
            r7 = move-exception
            goto L31
        L10:
            kotlin.jvm.internal.Ref$ObjectRef r7 = androidx.camera.core.impl.b.x(r7)
            com.google.android.recaptcha.internal.zzal r1 = new com.google.android.recaptcha.internal.zzal     // Catch: java.lang.Exception -> L2d
            com.google.android.recaptcha.internal.zzan r2 = r6.zzc     // Catch: java.lang.Exception -> L2d
            com.google.android.recaptcha.internal.zzen r3 = r6.zzd     // Catch: java.lang.Exception -> L2d
            r4 = 0
            r1.<init>(r2, r3, r7, r4)     // Catch: java.lang.Exception -> L2d
            r6.zza = r7     // Catch: java.lang.Exception -> L2d
            r2 = 1
            r6.zzb = r2     // Catch: java.lang.Exception -> L2d
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.b(r2, r1, r6)     // Catch: java.lang.Exception -> L2d
            if (r7 != r0) goto L5a
            return r0
        L2d:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L31:
            com.google.android.recaptcha.internal.zzan r1 = r6.zzc
            kotlinx.coroutines.CompletableDeferred r1 = r1.zzf()
            java.lang.Object r0 = r0.d
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L3e
            r0 = r7
        L3e:
            r1.g(r0)
            com.google.android.recaptcha.internal.zzan r0 = r6.zzc
            com.google.android.recaptcha.internal.zzao r1 = com.google.android.recaptcha.internal.zzao.zza
            com.google.android.recaptcha.internal.zzan.zzh(r0, r1)
            com.google.android.recaptcha.internal.zzen r0 = r6.zzd
            com.google.android.recaptcha.internal.zzbd r1 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r2 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r3 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r7 = r7.getMessage()
            r1.<init>(r2, r3, r7)
            r0.zzb(r1)
        L5a:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
