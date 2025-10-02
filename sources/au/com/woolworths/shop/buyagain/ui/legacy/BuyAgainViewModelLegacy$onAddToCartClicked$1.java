package au.com.woolworths.shop.buyagain.ui.legacy;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy$onAddToCartClicked$1", f = "BuyAgainViewModelLegacy.kt", l = {209, 210}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BuyAgainViewModelLegacy$onAddToCartClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ BuyAgainViewModelLegacy q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyAgainViewModelLegacy$onAddToCartClicked$1(BuyAgainViewModelLegacy buyAgainViewModelLegacy, Continuation continuation) {
        super(2, continuation);
        this.q = buyAgainViewModelLegacy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BuyAgainViewModelLegacy$onAddToCartClicked$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BuyAgainViewModelLegacy$onAddToCartClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r1.q6((java.util.List) r4, r16) == r3) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy r1 = r0.q
            kotlinx.coroutines.channels.BufferedChannel r12 = r1.j
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r13 = r1.h
            kotlinx.coroutines.flow.MutableStateFlow r2 = r1.l
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r0.p
            r14 = 3
            r5 = 2
            r6 = 1
            r15 = 0
            if (r4 == 0) goto L2a
            if (r4 == r6) goto L24
            if (r4 != r5) goto L1c
            kotlin.ResultKt.b(r17)     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            goto L52
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L24:
            kotlin.ResultKt.b(r17)     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            r4 = r17
            goto L47
        L2a:
            kotlin.ResultKt.b(r17)
            au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics$BuyAgain$Action r4 = au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics.BuyAgain.Action.r     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            java.lang.Object r7 = r2.getValue()     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy$ViewState r7 = (au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy.ViewState) r7     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            java.util.Map r7 = r7.e     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            au.com.woolworths.analytics.model.TrackingMetadata r7 = au.com.woolworths.product.analytics.ProductAnalyticsExtKt.g(r7)     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            r13.i(r4, r7)     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            r0.p = r6     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            java.io.Serializable r4 = au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy.p6(r1, r0)     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            if (r4 != r3) goto L47
            goto L51
        L47:
            java.util.List r4 = (java.util.List) r4     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            r0.p = r5     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            java.lang.Object r4 = r1.q6(r4, r0)     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            if (r4 != r3) goto L52
        L51:
            return r3
        L52:
            java.util.Map r8 = kotlin.collections.MapsKt.d()     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            r10 = 0
            r11 = 223(0xdf, float:3.12E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy.r6(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: retrofit2.HttpException -> L63 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8b
            goto Lb2
        L63:
            au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy$Actions$ShowFailMessage r1 = new au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy$Actions$ShowFailMessage
            au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy$FailureMessage r3 = au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy.FailureMessage.f
            r1.<init>(r3)
            r12.k(r1)
            java.lang.Object r1 = r2.getValue()
            au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy$ViewState r1 = (au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy.ViewState) r1
            java.util.Map r1 = r1.e
            java.util.Set r1 = r1.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.G0(r1)
            au.com.woolworths.analytics.model.TrackingMetadata r1 = au.com.woolworths.product.analytics.ProductAnalyticsExtKt.b(r15, r14, r1)
            if (r1 == 0) goto Lb2
            au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics$BuyAgain$Action r2 = au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics.BuyAgain.Action.f
            r13.i(r2, r1)
            goto Lb2
        L8b:
            au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy$Actions$ShowFailMessage r1 = new au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy$Actions$ShowFailMessage
            au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy$FailureMessage r3 = au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy.FailureMessage.e
            r1.<init>(r3)
            r12.k(r1)
            java.lang.Object r1 = r2.getValue()
            au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy$ViewState r1 = (au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy.ViewState) r1
            java.util.Map r1 = r1.e
            java.util.Set r1 = r1.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.G0(r1)
            au.com.woolworths.analytics.model.TrackingMetadata r1 = au.com.woolworths.product.analytics.ProductAnalyticsExtKt.b(r15, r14, r1)
            if (r1 == 0) goto Lb2
            au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics$BuyAgain$Action r2 = au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics.BuyAgain.Action.e
            r13.i(r2, r1)
        Lb2:
            kotlin.Unit r1 = kotlin.Unit.f24250a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy$onAddToCartClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
