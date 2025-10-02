package au.com.woolworths.feature.shop.storelocator;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel$fetchStoresByLocation$1", f = "StoreLocatorViewModel.kt", l = {255, 256}, m = "invokeSuspend")
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r0 == r9) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            r14 = this;
            au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel r6 = r14.q
            au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager r7 = r6.g
            androidx.lifecycle.MutableLiveData r8 = r6.i
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r14.p
            java.lang.String r10 = "storeLocatorFail"
            java.lang.String r11 = "Store Selector screen"
            kotlin.collections.EmptyList r12 = kotlin.collections.EmptyList.d
            r1 = 2
            r13 = 1
            if (r0 == 0) goto L32
            if (r0 == r13) goto L2d
            if (r0 != r1) goto L25
            kotlin.ResultKt.b(r15)     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            r0 = r15
            goto L61
        L1d:
            r0 = r6
            goto L91
        L20:
            r0 = r6
        L21:
            r1 = r8
            r4 = r12
            goto La3
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            kotlin.ResultKt.b(r15)     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            r0 = r15
            goto L44
        L32:
            kotlin.ResultKt.b(r15)
            au.com.woolworths.geolocation.location.LocationInteractor r0 = r6.f     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            io.reactivex.Maybe r0 = r0.b()     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            r14.p = r13     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            java.lang.Object r0 = kotlinx.coroutines.rx2.RxAwaitKt.e(r0, r14)     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            if (r0 != r9) goto L44
            goto L60
        L44:
            android.location.Location r0 = (android.location.Location) r0     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            au.com.woolworths.feature.shop.storelocator.StoreLocatorInteractorImpl r2 = r6.e     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            kotlin.jvm.internal.Intrinsics.e(r0)     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            r14.p = r1     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            au.com.woolworths.feature.shop.storelocator.StoreLocatorRepositoryImpl r1 = r2.e     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            r3 = r0
            r0 = r1
            double r1 = r3.getLatitude()     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            double r3 = r3.getLongitude()     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            r5 = r14
            java.lang.Object r0 = r0.a(r1, r3, r5)     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            if (r0 != r9) goto L61
        L60:
            return r9
        L61:
            au.com.woolworths.foundation.shop.storelocator.models.StoresSuburbs r0 = (au.com.woolworths.foundation.shop.storelocator.models.StoresSuburbs) r0     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            java.util.List r9 = r0.f8886a     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            if (r0 == 0) goto L72
            boolean r0 = r0.isEmpty()     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            if (r0 == 0) goto L71
            goto L72
        L71:
            r13 = 0
        L72:
            if (r13 != 0) goto Lb2
            androidx.lifecycle.MutableLiveData r1 = r6.i     // Catch: java.lang.RuntimeException -> L1d au.com.woolworths.android.onesite.network.NoConnectivityException -> L20
            if (r9 != 0) goto L7a
            r4 = r12
            goto L7b
        L7a:
            r4 = r9
        L7b:
            r5 = 0
            r0 = r6
            r6 = 2
            r2 = 0
            r3 = 0
            au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel.t6(r0, r1, r2, r3, r4, r5, r6)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21 java.lang.RuntimeException -> L91
            androidx.lifecycle.MutableLiveData r1 = r0.j     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21 java.lang.RuntimeException -> L91
            if (r9 != 0) goto L88
            r9 = r12
        L88:
            au.com.woolworths.feature.shop.storelocator.StoreLocatorContract$MapState r2 = new au.com.woolworths.feature.shop.storelocator.StoreLocatorContract$MapState     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21 java.lang.RuntimeException -> L91
            r2.<init>(r9)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21 java.lang.RuntimeException -> L91
            r1.m(r2)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21 java.lang.RuntimeException -> L91
            goto Lb2
        L91:
            au.com.woolworths.feature.shop.storelocator.StoreLocatorFullPageErrorState r5 = au.com.woolworths.feature.shop.storelocator.StoreLocatorFullPageErrorState.h
            r6 = 2
            r2 = 0
            r3 = 0
            r1 = r8
            r4 = r12
            au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel.t6(r0, r1, r2, r3, r4, r5, r6)
            au.com.woolworths.android.onesite.analytics.adobe.data.ErrorData r0 = au.com.woolworths.android.onesite.analytics.adobe.data.ErrorData.Companion.a(r11, r10)
            r7.d(r0)
            goto Lb2
        La3:
            au.com.woolworths.feature.shop.storelocator.StoreLocatorFullPageErrorState r5 = au.com.woolworths.feature.shop.storelocator.StoreLocatorFullPageErrorState.e
            r6 = 2
            r2 = 0
            r3 = 0
            au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel.t6(r0, r1, r2, r3, r4, r5, r6)
            au.com.woolworths.android.onesite.analytics.adobe.data.ErrorData r0 = au.com.woolworths.android.onesite.analytics.adobe.data.ErrorData.Companion.a(r11, r10)
            r7.d(r0)
        Lb2:
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel$fetchStoresByLocation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
