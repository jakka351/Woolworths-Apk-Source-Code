package au.com.woolworths.feature.rewards.offers.spinsurprise;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameViewModel$fetchGameUrl$1", f = "SpinSurpriseGameViewModel.kt", l = {48, 52}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SpinSurpriseGameViewModel$fetchGameUrl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SpinSurpriseGameViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinSurpriseGameViewModel$fetchGameUrl$1(SpinSurpriseGameViewModel spinSurpriseGameViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = spinSurpriseGameViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SpinSurpriseGameViewModel$fetchGameUrl$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SpinSurpriseGameViewModel$fetchGameUrl$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (r1.z(r3, r6) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.p
            r2 = 2
            r3 = 1
            au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameViewModel r4 = r6.q
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            goto L8e
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            goto L3e
        L1f:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameInteractor r7 = r4.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            r6.p = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameRepository r7 = r7.f6401a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r1 = r7.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            r1.getClass()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            kotlinx.coroutines.scheduling.DefaultScheduler r1 = kotlinx.coroutines.Dispatchers.f24691a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            kotlinx.coroutines.scheduling.DefaultIoScheduler r1 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameRepository$getSpinSurpriseLinks$2 r3 = new au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameRepository$getSpinSurpriseLinks$2     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            r5 = 0
            r3.<init>(r7, r5)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r1, r3, r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            if (r7 != r0) goto L3e
            goto L68
        L3e:
            au.com.woolworths.feature.rewards.offers.spinsurprise.data.SpinSurpriseLinks r7 = (au.com.woolworths.feature.rewards.offers.spinsurprise.data.SpinSurpriseLinks) r7     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            androidx.lifecycle.MutableLiveData r1 = r4.g     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameContract$ViewState r3 = new au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameContract$ViewState     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            r5 = 0
            r3.<init>(r5)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            r1.m(r3)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            kotlinx.coroutines.channels.BufferedChannel r1 = r4.h     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameContract$Action$LoadUrlInWebView r3 = new au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameContract$Action$LoadUrlInWebView     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            java.lang.String r5 = r7.getInitialUrl()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            java.util.List r7 = r7.getInternalUrls()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            java.util.Set r7 = kotlin.collections.CollectionsKt.L0(r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            r3.<init>(r5, r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            r6.p = r2     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            java.lang.Object r7 = r1.z(r3, r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L7c
            if (r7 != r0) goto L8e
        L68:
            return r0
        L69:
            au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics$SpinSurprise$Action$Companion r7 = au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics.SpinSurprise.Action.d
            java.lang.String r0 = r4.k
            r7.getClass()
            au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics$SpinSurprise$Action$Companion$serverError$1 r7 = new au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics$SpinSurprise$Action$Companion$serverError$1
            r7.<init>(r0)
            r0 = 2132019018(0x7f14074a, float:1.967636E38)
            r4.p6(r0, r7)
            goto L8e
        L7c:
            au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics$SpinSurprise$Action$Companion r7 = au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics.SpinSurprise.Action.d
            java.lang.String r0 = r4.k
            r7.getClass()
            au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics$SpinSurprise$Action$Companion$networkError$1 r7 = new au.com.woolworths.analytics.rewards.gamification.SpinSurpriseAnalytics$SpinSurprise$Action$Companion$networkError$1
            r7.<init>(r0)
            r0 = 2132019017(0x7f140749, float:1.9676357E38)
            r4.p6(r0, r7)
        L8e:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameViewModel$fetchGameUrl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
