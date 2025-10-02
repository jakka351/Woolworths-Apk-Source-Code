package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.analytics.supers.products.MapsAnalytics;
import au.com.woolworths.feature.shop.instore.navigation.map.data.WowCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityEventTriggerSpec;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityLocationDefinition;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.ProximityEvent;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.MapEventTracker;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InstoreLocationDetailsData;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$listenToProximityEvent$1", f = "InstoreMapViewModel.kt", l = {1150}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreMapViewModel$listenToProximityEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InstoreMapViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$listenToProximityEvent$1(InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = instoreMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreMapViewModel$listenToProximityEvent$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((InstoreMapViewModel$listenToProximityEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw android.support.v4.media.session.a.v(obj);
        }
        ResultKt.b(obj);
        final InstoreMapViewModel instoreMapViewModel = this.q;
        SharedFlowImpl d = instoreMapViewModel.o.getD();
        FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$listenToProximityEvent$1.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                ProductCard productCard;
                InstoreLocationDetailsData details;
                ProximityEvent proximityEvent = (ProximityEvent) obj2;
                boolean z = proximityEvent instanceof ProximityEvent.EnterRegion;
                InstoreMapViewModel instoreMapViewModel2 = instoreMapViewModel;
                if (z) {
                    String str = ((ProximityEvent.EnterRegion) proximityEvent).f7357a;
                    ProductCard productCard2 = instoreMapViewModel2.u;
                    if (Intrinsics.c(str, productCard2 != null ? productCard2.getProductId() : null) && (productCard = instoreMapViewModel2.u) != null) {
                        instoreMapViewModel2.C6(productCard, true);
                        instoreMapViewModel2.w.f(InstoreMapContract.Action.PerformHaptic.f7379a);
                        MapEventTracker mapEventTracker = instoreMapViewModel2.m;
                        mapEventTracker.getClass();
                        mapEventTracker.a(MapsAnalytics.ProductFinderMap.Action.m, ProductAnalyticsExtKt.h(productCard, null, null, 7));
                        InStoreLocationData inStoreLocation = productCard.getInStoreLocation();
                        if (inStoreLocation != null && (details = inStoreLocation.getDetails()) != null) {
                            instoreMapViewModel2.o.d(productCard.getProductId(), new LocalProximityLocationDefinition.CloseWalkingDistance(new WowCoordinate(details.getX(), details.getY())), details.getFloorNumber(), LocalProximityEventTriggerSpec.Exit.f7352a);
                        }
                    }
                } else if (proximityEvent instanceof ProximityEvent.ExitRegion) {
                    ProductCard productCard3 = instoreMapViewModel2.u;
                    if (Intrinsics.c(((ProximityEvent.ExitRegion) proximityEvent).f7358a, productCard3 != null ? productCard3.getProductId() : null) && productCard3 != null) {
                        instoreMapViewModel2.C6(productCard3, false);
                        InstoreMapViewModel.t6(instoreMapViewModel2, productCard3);
                    }
                } else if (!(proximityEvent instanceof ProximityEvent.DwellRegion)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f24250a;
            }
        };
        this.p = 1;
        d.collect(flowCollector, this);
        return coroutineSingletons;
    }
}
