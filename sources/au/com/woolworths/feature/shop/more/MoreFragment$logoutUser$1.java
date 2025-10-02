package au.com.woolworths.feature.shop.more;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.more.MoreFragment$logoutUser$1", f = "MoreFragment.kt", l = {390, 395}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MoreFragment$logoutUser$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MoreFragment q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreFragment$logoutUser$1(MoreFragment moreFragment, Continuation continuation) {
        super(2, continuation);
        this.q = moreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoreFragment$logoutUser$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreFragment$logoutUser$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r8.c(r1, r7) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[Catch: AuthException -> 0x0015, TryCatch #1 {AuthException -> 0x0015, blocks: (B:6:0x0011, B:29:0x0056, B:31:0x0077, B:34:0x008b, B:35:0x0090, B:33:0x0080, B:12:0x0020, B:20:0x0034, B:22:0x003c, B:24:0x0040, B:27:0x0052, B:28:0x0055, B:15:0x0027, B:17:0x002b, B:36:0x0091, B:37:0x0094), top: B:43:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.p
            java.lang.String r2 = "authManager"
            r3 = 0
            r4 = 2
            r5 = 1
            au.com.woolworths.feature.shop.more.MoreFragment r6 = r7.q
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            goto L56
        L15:
            r8 = move-exception
            goto L95
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            goto L34
        L24:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.shop.auth.ShopAuthManager r8 = r6.l     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            if (r8 == 0) goto L91
            r7.p = r5     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            java.lang.Object r8 = r8.a(r7)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            if (r8 != r0) goto L34
            goto L51
        L34:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            boolean r8 = r8.booleanValue()     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            if (r8 == 0) goto L56
            au.com.woolworths.shop.auth.ShopAuthManager r8 = r6.l     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            if (r8 == 0) goto L52
            android.content.Context r1 = r6.requireContext()     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            java.lang.String r2 = "requireContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            r7.p = r4     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            java.lang.Object r8 = r8.c(r1, r7)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            if (r8 != r0) goto L56
        L51:
            return r0
        L52:
            kotlin.jvm.internal.Intrinsics.p(r2)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            throw r3     // Catch: au.com.woolworths.auth.api.AuthException -> L15
        L56:
            au.com.woolworths.feature.shop.more.MoreViewModel r8 = r6.Q1()     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r0 = r8.f     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            au.com.woolworths.analytics.supers.more.MoreAnalytics$MoreScreen$Action r1 = au.com.woolworths.analytics.supers.more.MoreAnalytics.MoreScreen.Action.d     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            r0.g(r1)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            r8.r6(r0)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope r0 = androidx.lifecycle.ViewModelKt.a(r8)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            au.com.woolworths.feature.shop.more.MoreViewModel$onLogoutConfirmed$1 r1 = new au.com.woolworths.feature.shop.more.MoreViewModel$onLogoutConfirmed$1     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            r1.<init>(r8, r3)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            r8 = 3
            kotlinx.coroutines.BuildersKt.c(r0, r3, r3, r1, r8)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            okhttp3.OkHttpClient r8 = r6.k     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            if (r8 == 0) goto L8b
            okhttp3.Cache r8 = r8.k     // Catch: au.com.woolworths.auth.api.AuthException -> L15 java.io.IOException -> L80
            kotlin.jvm.internal.Intrinsics.e(r8)     // Catch: au.com.woolworths.auth.api.AuthException -> L15 java.io.IOException -> L80
            r8.a()     // Catch: au.com.woolworths.auth.api.AuthException -> L15 java.io.IOException -> L80
            goto La5
        L80:
            timber.log.Timber$Forest r8 = timber.log.Timber.f27013a     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            java.lang.String r0 = "failed to evict all caches"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            r8.e(r0, r1)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            goto La5
        L8b:
            java.lang.String r8 = "okHttpClient"
            kotlin.jvm.internal.Intrinsics.p(r8)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            throw r3     // Catch: au.com.woolworths.auth.api.AuthException -> L15
        L91:
            kotlin.jvm.internal.Intrinsics.p(r2)     // Catch: au.com.woolworths.auth.api.AuthException -> L15
            throw r3     // Catch: au.com.woolworths.auth.api.AuthException -> L15
        L95:
            au.com.woolworths.foundation.bark.Bark$Companion r0 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r0 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.m
            au.com.woolworths.foundation.bark.common.ReportOwner r1 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r1.<init>(r0)
            java.lang.String r0 = "Failed to logout"
            r2 = 8
            au.com.woolworths.foundation.bark.Bark.Barker.c(r1, r8, r0, r2)
        La5:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.more.MoreFragment$logoutUser$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
