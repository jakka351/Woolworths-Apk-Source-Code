package au.com.woolworths.foundation.rewards.banner.dismiss;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/banner/dismiss/BannerRemoteDismissInteractorImpl;", "Lau/com/woolworths/foundation/rewards/banner/dismiss/BannerRemoteDismissInteractor;", "Companion", "banner-dismiss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BannerRemoteDismissInteractorImpl implements BannerRemoteDismissInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final BannerRemoteDismissRepository f8540a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/rewards/banner/dismiss/BannerRemoteDismissInteractorImpl$Companion;", "", "", "RetryDelayMs", "J", "banner-dismiss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BannerRemoteDismissInteractorImpl(BannerRemoteDismissRepository bannerRemoteDismissRepository) {
        this.f8540a = bannerRemoteDismissRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl$tryNotifyBannerDismissed$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl$tryNotifyBannerDismissed$1 r0 = (au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl$tryNotifyBannerDismissed$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl$tryNotifyBannerDismissed$1 r0 = new au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl$tryNotifyBannerDismissed$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L53
            goto L52
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissRepository r9 = r7.f8540a     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L53
            r0.r = r4     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L53
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r2 = r9.b     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L53
            r2.getClass()     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L53
            kotlinx.coroutines.scheduling.DefaultScheduler r2 = kotlinx.coroutines.Dispatchers.f24691a     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L53
            kotlinx.coroutines.scheduling.DefaultIoScheduler r2 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L53
            au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissRepository$notifyBannerDismissed$2 r5 = new au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissRepository$notifyBannerDismissed$2     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L53
            r6 = 0
            r5.<init>(r9, r8, r6)     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L53
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.f(r2, r5, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L53
            if (r8 != r1) goto L4d
            goto L4f
        L4d:
            kotlin.Unit r8 = kotlin.Unit.f24250a     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L53
        L4f:
            if (r8 != r1) goto L52
            return r1
        L52:
            r3 = r4
        L53:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
