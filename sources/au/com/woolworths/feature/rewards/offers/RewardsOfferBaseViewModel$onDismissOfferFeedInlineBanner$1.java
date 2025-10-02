package au.com.woolworths.feature.rewards.offers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOfferBaseViewModel$onDismissOfferFeedInlineBanner$1", f = "RewardsOfferBaseViewModel.kt", l = {66, 80}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsOfferBaseViewModel$onDismissOfferFeedInlineBanner$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public int q;
    public int r;
    public final /* synthetic */ RewardsOfferBaseViewModel s;
    public final /* synthetic */ OfferFeedInlineBannerViewItem t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOfferBaseViewModel$onDismissOfferFeedInlineBanner$1(RewardsOfferBaseViewModel rewardsOfferBaseViewModel, OfferFeedInlineBannerViewItem offerFeedInlineBannerViewItem, Continuation continuation) {
        super(2, continuation);
        this.s = rewardsOfferBaseViewModel;
        this.t = offerFeedInlineBannerViewItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOfferBaseViewModel$onDismissOfferFeedInlineBanner$1(this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsOfferBaseViewModel$onDismissOfferFeedInlineBanner$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r9.a(r5, r8) == r0) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006b -> B:15:0x002c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            int r1 = r8.q
            int r4 = r8.p
            kotlin.ResultKt.b(r9)
            goto L2c
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            int r1 = r8.q
            int r4 = r8.p
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L24 java.lang.Throwable -> L6e
            goto L6e
        L24:
            r9 = move-exception
            goto L43
        L26:
            kotlin.ResultKt.b(r9)
            r9 = 0
            r1 = 3
            r4 = r9
        L2c:
            if (r4 >= r1) goto L6e
            au.com.woolworths.feature.rewards.offers.RewardsOfferBaseViewModel r9 = r8.s     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L24
            au.com.woolworths.feature.rewards.offers.OfferFeedInlineBannerViewItem r5 = r8.t     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L24
            au.com.woolworths.feature.rewards.offers.banner.RewardsBannerInteractor r9 = r9.f     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L24 java.lang.Throwable -> L6e java.lang.Throwable -> L6e
            java.lang.String r5 = r5.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L24 java.lang.Throwable -> L6e java.lang.Throwable -> L6e
            r8.p = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L24 java.lang.Throwable -> L6e java.lang.Throwable -> L6e
            r8.q = r1     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L24 java.lang.Throwable -> L6e java.lang.Throwable -> L6e
            r8.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L24 java.lang.Throwable -> L6e java.lang.Throwable -> L6e
            java.lang.Object r9 = r9.a(r5, r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L24 java.lang.Throwable -> L6e java.lang.Throwable -> L6e
            if (r9 != r0) goto L6e
            goto L6d
        L43:
            int r5 = r1 + (-1)
            if (r4 != r5) goto L5d
            au.com.woolworths.foundation.bark.Bark$Companion r5 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r5 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.d
            au.com.woolworths.foundation.bark.common.ReportOwner r6 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r6.<init>(r5)
            java.lang.String r5 = "Error notifying banner dismissal after "
            java.lang.String r7 = " attempts."
            java.lang.String r5 = YU.a.e(r1, r5, r7)
            r7 = 24
            au.com.woolworths.foundation.bark.Bark.Barker.h(r6, r9, r5, r7)
        L5d:
            int r4 = r4 + 1
            r8.p = r4
            r8.q = r1
            r8.r = r2
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r5, r8)
            if (r9 != r0) goto L2c
        L6d:
            return r0
        L6e:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.RewardsOfferBaseViewModel$onDismissOfferFeedInlineBanner$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
