package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.data.MapFocus;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientHeading;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/MapFocusManagerImpl;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/MapFocusInteractor;", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapFocusManagerImpl implements MapFocusInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final PositioningInteractor f7366a;
    public final BuildingInteractor b;
    public final MutableStateFlow c;
    public final MutableStateFlow d;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.domain.MapFocusManagerImpl$1", f = "MapFocusInteractor.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.domain.MapFocusManagerImpl$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MapFocusManagerImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final MapFocusManagerImpl mapFocusManagerImpl = MapFocusManagerImpl.this;
                FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1L = FlowKt.L(mapFocusManagerImpl.f7366a.getCurrentPosition(), 150L);
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.domain.MapFocusManagerImpl.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        OriientPosition oriientPosition = (OriientPosition) obj2;
                        if (oriientPosition != null) {
                            MapFocusManagerImpl mapFocusManagerImpl2 = mapFocusManagerImpl;
                            BuildingInteractor buildingInteractor = mapFocusManagerImpl2.b;
                            MutableStateFlow mutableStateFlow = mapFocusManagerImpl2.d;
                            boolean z = oriientPosition.e;
                            String str = oriientPosition.g;
                            if (z) {
                                if (!((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                                    mutableStateFlow.setValue(Boolean.TRUE);
                                }
                                Floor floor = (Floor) buildingInteractor.getCurrentFloor().getValue();
                                if (Intrinsics.c(floor != null ? floor.f7335a : null, str)) {
                                    MutableStateFlow mutableStateFlow2 = mapFocusManagerImpl2.c;
                                    OriientMetersCoordinate oriientMetersCoordinate = oriientPosition.f7345a;
                                    OriientHeading oriientHeading = oriientPosition.c;
                                    mutableStateFlow2.setValue(new MapFocus(oriientMetersCoordinate, Math.toDegrees(Math.atan2(oriientHeading.b, oriientHeading.f7340a)) - 90));
                                } else {
                                    buildingInteractor.b(str);
                                }
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1L.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/MapFocusManagerImpl$Companion;", "", "", "AUTO_FOCUS_RECOVERY_TIME_SECONDS", "J", "", "MIN_MOVEMENT_TO_RECOVER_AUTO_FOCUS_METERS", "F", "", "AUTO_FOCUS_ZOOM_LEVEL", "D", "MAP_FOCUS_SAMPLING_PERIOD_MILLIS", "", "FOCUS_ROTATION_OFFSET", "I", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public MapFocusManagerImpl(PositioningInteractor positioningManager, BuildingInteractor buildingManager) {
        Intrinsics.h(positioningManager, "positioningManager");
        Intrinsics.h(buildingManager, "buildingManager");
        this.f7366a = positioningManager;
        this.b = buildingManager;
        this.c = StateFlowKt.a(null);
        this.d = StateFlowKt.a(Boolean.TRUE);
        BuildersKt.c(CoroutineScopeKt.a(Dispatchers.f24691a), null, null, new AnonymousClass1(null), 3);
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.MapFocusInteractor
    public final StateFlow a() {
        return this.c;
    }
}
