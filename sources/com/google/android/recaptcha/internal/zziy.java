package com.google.android.recaptcha.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
final class zziy extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziy(zzja zzjaVar, zzen zzenVar, Continuation continuation) {
        super(2, continuation);
        this.zzf = zzjaVar;
        this.zzg = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zziy(this.zzf, this.zzg, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziy) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        if (r9.zzc(r1, r8) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.util.MissingResourceException {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.zze
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L29
            if (r1 == r4) goto L15
            kotlin.ResultKt.b(r9)
            if (r1 == r3) goto L9d
            if (r1 == r2) goto Lb8
            goto Lca
        L15:
            java.lang.Object r1 = r8.zzd
            com.google.android.recaptcha.internal.zzcg r1 = (com.google.android.recaptcha.internal.zzcg) r1
            java.lang.Object r4 = r8.zzc
            com.google.android.recaptcha.internal.zzsc r4 = (com.google.android.recaptcha.internal.zzsc) r4
            java.lang.Object r6 = r8.zzb
            com.google.android.recaptcha.internal.zzja r6 = (com.google.android.recaptcha.internal.zzja) r6
            java.lang.Object r7 = r8.zza
            com.google.android.recaptcha.internal.zzja r7 = (com.google.android.recaptcha.internal.zzja) r7
            kotlin.ResultKt.b(r9)
            goto L5d
        L29:
            kotlin.ResultKt.b(r9)
            com.google.android.recaptcha.internal.zzja r6 = r8.zzf
            com.google.android.recaptcha.internal.zzsc r9 = com.google.android.recaptcha.internal.zzja.zzs(r6)
            if (r9 != 0) goto L35
            r9 = r5
        L35:
            com.google.android.recaptcha.internal.zzja r1 = r8.zzf
            com.google.android.recaptcha.internal.zzcg r7 = new com.google.android.recaptcha.internal.zzcg
            com.google.android.recaptcha.internal.zzsc r1 = com.google.android.recaptcha.internal.zzja.zzs(r1)
            if (r1 != 0) goto L40
            r1 = r5
        L40:
            com.google.android.recaptcha.internal.zzle r1 = r1.zzf()
            r7.<init>(r1)
            com.google.android.recaptcha.internal.zzja r1 = r8.zzf
            r8.zza = r6
            r8.zzb = r6
            r8.zzc = r9
            r8.zzd = r7
            r8.zze = r4
            java.lang.Object r1 = r1.zzw(r8)
            if (r1 == r0) goto Ld2
            r4 = r9
            r9 = r1
            r1 = r7
            r7 = r6
        L5d:
            android.webkit.WebView r9 = (android.webkit.WebView) r9
            com.google.android.recaptcha.internal.zzft r9 = r6.zzC(r4, r1, r9)
            r7.zzb = r9
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            kotlinx.coroutines.CompletableDeferred r9 = r9.zzA()
            int r9 = r9.hashCode()
            kotlin.coroutines.jvm.internal.Boxing.a(r9)
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzjh r9 = com.google.android.recaptcha.internal.zzja.zzr(r9)
            r9.zzd()
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzjh r9 = com.google.android.recaptcha.internal.zzja.zzr(r9)
            r9.zze()
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzsc r1 = com.google.android.recaptcha.internal.zzja.zzs(r9)
            if (r1 != 0) goto L8d
            r1 = r5
        L8d:
            r8.zza = r5
            r8.zzb = r5
            r8.zzc = r5
            r8.zzd = r5
            r8.zze = r3
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzja.zzt(r9, r1, r8)
            if (r9 == r0) goto Ld2
        L9d:
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            kotlinx.coroutines.CompletableDeferred r9 = r9.zzA()
            int r9 = r9.hashCode()
            kotlin.coroutines.jvm.internal.Boxing.a(r9)
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            kotlinx.coroutines.CompletableDeferred r9 = r9.zzA()
            r8.zze = r2
            java.lang.Object r9 = r9.await(r8)
            if (r9 == r0) goto Ld2
        Lb8:
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzcb r9 = r9.zzm()
            com.google.android.recaptcha.internal.zzje r1 = com.google.android.recaptcha.internal.zzje.zzc
            r2 = 4
            r8.zze = r2
            java.lang.Object r9 = r9.zzc(r1, r8)
            if (r9 != r0) goto Lca
            goto Ld2
        Lca:
            com.google.android.recaptcha.internal.zzen r9 = r8.zzg
            r9.zza()
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
