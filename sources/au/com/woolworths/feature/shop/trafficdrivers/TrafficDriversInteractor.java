package au.com.woolworths.feature.shop.trafficdrivers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/trafficdrivers/TrafficDriversInteractor;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrafficDriversInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final TrafficDriversRepository f8210a;
    public final MutableStateFlow b;
    public final StateFlow c;

    public TrafficDriversInteractor(TrafficDriversRepository trafficDriversRepository) {
        this.f8210a = trafficDriversRepository;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.b = mutableStateFlowA;
        this.c = mutableStateFlowA;
    }

    public final void a() {
        this.b.setValue(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor$fetchAndCacheTrafficDrivers$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor$fetchAndCacheTrafficDrivers$1 r0 = (au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor$fetchAndCacheTrafficDrivers$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor$fetchAndCacheTrafficDrivers$1 r0 = new au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor$fetchAndCacheTrafficDrivers$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.p
            kotlinx.coroutines.flow.MutableStateFlow r0 = (kotlinx.coroutines.flow.MutableStateFlow) r0
            kotlin.ResultKt.b(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.flow.MutableStateFlow r6 = r5.b
            r0.p = r6
            r0.s = r3
            au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversRepository r2 = r5.f8210a
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L45
            return r1
        L45:
            r4 = r0
            r0 = r6
            r6 = r4
        L48:
            r0.setValue(r6)
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
