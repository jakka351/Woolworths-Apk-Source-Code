package au.com.woolworths.feature.shop.storelocator.legacy;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel$fetchStoresByLocation$1", f = "StoreLocatorViewModel.kt", l = {253, 254}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StoreLocatorViewModel$fetchStoresByLocation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ StoreLocatorViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreLocatorViewModel$fetchStoresByLocation$1(StoreLocatorViewModel storeLocatorViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = storeLocatorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreLocatorViewModel$fetchStoresByLocation$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreLocatorViewModel$fetchStoresByLocation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r0 == r9) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel r6 = r13.q
            au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager r7 = r6.g
            androidx.lifecycle.MutableLiveData r8 = r6.i
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r13.p
            java.lang.String r10 = "storeLocatorFail"
            java.lang.String r11 = "Store Selector screen"
            kotlin.collections.EmptyList r12 = kotlin.collections.EmptyList.d
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 == r2) goto L2c
            if (r0 != r1) goto L24
            kotlin.ResultKt.b(r14)     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            r0 = r14
            goto L60
        L1d:
            r0 = r6
            goto L78
        L1f:
            r0 = r6
        L20:
            r1 = r8
            r4 = r12
            goto L8a
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            kotlin.ResultKt.b(r14)     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            r0 = r14
            goto L43
        L31:
            kotlin.ResultKt.b(r14)
            au.com.woolworths.geolocation.location.LocationInteractor r0 = r6.f     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            io.reactivex.Maybe r0 = r0.b()     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            r13.p = r2     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            java.lang.Object r0 = kotlinx.coroutines.rx2.RxAwaitKt.e(r0, r13)     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            if (r0 != r9) goto L43
            goto L5f
        L43:
            android.location.Location r0 = (android.location.Location) r0     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl r2 = r6.e     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            kotlin.jvm.internal.Intrinsics.e(r0)     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            r13.p = r1     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository r1 = r2.f     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            r3 = r0
            r0 = r1
            double r1 = r3.getLatitude()     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            double r3 = r3.getLongitude()     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            r5 = r13
            java.io.Serializable r0 = r0.a(r1, r3, r5)     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            if (r0 != r9) goto L60
        L5f:
            return r9
        L60:
            r4 = r0
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            androidx.lifecycle.MutableLiveData r1 = r6.i     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L1f
            r5 = 0
            r0 = r6
            r6 = 2
            r2 = 0
            r3 = 0
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel.t6(r0, r1, r2, r3, r4, r5, r6)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L20 java.lang.RuntimeException -> L78
            androidx.lifecycle.MutableLiveData r1 = r0.j     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L20 java.lang.RuntimeException -> L78
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorContract$MapState r2 = new au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorContract$MapState     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L20 java.lang.RuntimeException -> L78
            r2.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L20 java.lang.RuntimeException -> L78
            r1.m(r2)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L20 java.lang.RuntimeException -> L78
            goto L99
        L78:
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorFullPageErrorState r5 = au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorFullPageErrorState.h
            r6 = 2
            r2 = 0
            r3 = 0
            r1 = r8
            r4 = r12
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel.t6(r0, r1, r2, r3, r4, r5, r6)
            au.com.woolworths.android.onesite.analytics.adobe.data.ErrorData r0 = au.com.woolworths.android.onesite.analytics.adobe.data.ErrorData.Companion.a(r11, r10)
            r7.d(r0)
            goto L99
        L8a:
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorFullPageErrorState r5 = au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorFullPageErrorState.e
            r6 = 2
            r2 = 0
            r3 = 0
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel.t6(r0, r1, r2, r3, r4, r5, r6)
            au.com.woolworths.android.onesite.analytics.adobe.data.ErrorData r0 = au.com.woolworths.android.onesite.analytics.adobe.data.ErrorData.Companion.a(r11, r10)
            r7.d(r0)
        L99:
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel$fetchStoresByLocation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
