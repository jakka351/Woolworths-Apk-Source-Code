package com.google.android.recaptcha.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
final class zzil extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzil(zzja zzjaVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzil(this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[PHI: r7
  0x0055: PHI (r7v15 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0053, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.zzb
            java.lang.String r2 = "RN"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 == r4) goto L15
            kotlin.ResultKt.b(r7)
            if (r1 == r3) goto L55
            goto L6c
        L15:
            java.lang.Object r1 = r6.zza
            com.google.android.recaptcha.internal.zzja r1 = (com.google.android.recaptcha.internal.zzja) r1
            kotlin.ResultKt.b(r7)
            goto L3f
        L1d:
            kotlin.ResultKt.b(r7)
            goto L2e
        L21:
            kotlin.ResultKt.b(r7)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r6.zzb = r5
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L7b
        L2e:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            r7.removeJavascriptInterface(r2)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r6.zza = r7
            r6.zzb = r4
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L7b
        L3f:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            android.webkit.WebSettings r7 = r7.getSettings()
            r7.setJavaScriptEnabled(r5)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r1 = 0
            r6.zza = r1
            r6.zzb = r3
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L7b
        L55:
            com.google.android.recaptcha.internal.zzja r1 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzij r1 = r1.zzq()
            r7.addJavascriptInterface(r1, r2)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r1 = 4
            r6.zzb = r1
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 != r0) goto L6c
            goto L7b
        L6c:
            com.google.android.recaptcha.internal.zzja r0 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzik r1 = new com.google.android.recaptcha.internal.zzik
            r1.<init>(r0)
            r7.setWebViewClient(r1)
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzil.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
