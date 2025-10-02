package au.com.woolworths.android.onesite.network;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/RefreshTokenFlowRetry;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RefreshTokenFlowRetry {

    /* renamed from: a, reason: collision with root package name */
    public static final RefreshTokenFlowRetry f4574a = new RefreshTokenFlowRetry();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Throwable r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof au.com.woolworths.android.onesite.network.RefreshTokenFlowRetry$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.android.onesite.network.RefreshTokenFlowRetry$invoke$1 r0 = (au.com.woolworths.android.onesite.network.RefreshTokenFlowRetry$invoke$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.android.onesite.network.RefreshTokenFlowRetry$invoke$1 r0 = new au.com.woolworths.android.onesite.network.RefreshTokenFlowRetry$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r8)
            goto L64
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            kotlin.ResultKt.b(r8)
            boolean r8 = r7 instanceof retrofit2.HttpException
            if (r8 == 0) goto L3a
            r8 = r7
            retrofit2.HttpException r8 = (retrofit2.HttpException) r8
            goto L3b
        L3a:
            r8 = 0
        L3b:
            if (r8 == 0) goto L46
            int r8 = r8.d
            r2 = 401(0x191, float:5.62E-43)
            if (r8 != r2) goto L46
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L46:
            timber.log.Timber$Forest r8 = timber.log.Timber.f27013a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "Refresh token call failed retrying"
            r8.o(r4, r2)
            r8.p(r7)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r4 = 2
            long r7 = r7.toMillis(r4)
            r0.r = r3
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r7, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.network.RefreshTokenFlowRetry.a(java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
