package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableDoubleState;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.MapsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.data.FloorTransitionType;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientFloorTransition;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMapRoute;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition;
import au.com.woolworths.feature.shop.instore.navigation.map.data.WowCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityEventTriggerSpec;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityLocationDefinition;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.MapFocusInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientAppEvent;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientTrackingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.ProximityInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.MapAnalyticsEvent;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.FloorTransitionMarkerKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.ProductMarkerKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.UserPositionMarkerKt;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.CoordinateUtilsKt;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.MapEventTracker;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.PositionAnimator;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.RelativePosition;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationsKt;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.interactor.ProductsInteractor;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InStoreLocationDataKt;
import au.com.woolworths.product.models.InstoreLocationDetailsData;
import au.com.woolworths.product.models.ProductCard;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import ovh.plrapps.mapcompose.api.LayoutApiKt;
import ovh.plrapps.mapcompose.api.MarkerApiKt;
import ovh.plrapps.mapcompose.ui.paths.PathData;
import ovh.plrapps.mapcompose.ui.paths.PathDataBuilder;
import ovh.plrapps.mapcompose.ui.paths.model.Cap;
import ovh.plrapps.mapcompose.ui.state.DrawablePathState;
import ovh.plrapps.mapcompose.ui.state.MapState;
import ovh.plrapps.mapcompose.ui.state.PathState;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;
import ovh.plrapps.mapcompose.ui.state.markers.MarkerState;
import ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData;
import ovh.plrapps.mapcompose.utils.Point;
import timber.log.Timber;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstoreMapViewModel extends ViewModel {
    public Floor A;
    public final LocationInteractor e;
    public final CollectionModeInteractor f;
    public final InstoreNavigationInteractor g;
    public final BuildingInteractor h;
    public final MapFocusInteractor i;
    public final PositioningInteractor j;
    public final PositionAnimator k;
    public final RoutingInteractor l;
    public final MapEventTracker m;
    public final OriientTrackingInteractor n;
    public final ProximityInteractor o;
    public final ProductsInteractor p;
    public final MutableStateFlow q;
    public Job r;
    public final MutableStateFlow s;
    public List t;
    public ProductCard u;
    public boolean v;
    public final SharedFlowImpl w;
    public final SharedFlowImpl x;
    public final LinkedHashSet y;
    public boolean z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$10", f = "InstoreMapViewModel.kt", l = {366}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$10, reason: invalid class name */
    final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass10(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InstoreMapViewModel.this.new AnonymousClass10(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass10) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                RoutingInteractor routingInteractor = InstoreMapViewModel.this.l;
                this.p = 1;
                if (routingInteractor.b(this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$11", f = "InstoreMapViewModel.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$11, reason: invalid class name */
    final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "route", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientMapRoute;", "currentFloor", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/Floor;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$11$1", f = "InstoreMapViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$11$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function3<OriientMapRoute, Floor, Continuation<? super Unit>, Object> {
            public /* synthetic */ OriientMapRoute p;
            public /* synthetic */ Floor q;
            public final /* synthetic */ InstoreMapViewModel r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
                super(3, continuation);
                this.r = instoreMapViewModel;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, (Continuation) obj3);
                anonymousClass1.p = (OriientMapRoute) obj;
                anonymousClass1.q = (Floor) obj2;
                return anonymousClass1.invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InstoreMapContract.ViewState.MapData mapData;
                InstoreMapViewModel instoreMapViewModel;
                InstoreMapContract.ViewState.MapData mapData2;
                Object obj2;
                PathData pathData;
                Object next;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                OriientMapRoute oriientMapRoute = this.p;
                Floor floor = this.q;
                Timber.f27013a.b("routingInteractor.route " + oriientMapRoute + " " + floor, new Object[0]);
                InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) this.r.s.getValue()).b();
                if (contentB != null && (mapData = contentB.b) != null) {
                    InstoreMapViewModel instoreMapViewModel2 = this.r;
                    MapState mapState = mapData.f7384a;
                    if (oriientMapRoute != null) {
                        if (!mapState.e.c.f.contains("primary-path-id")) {
                            instoreMapViewModel2.n.a(OriientAppEvent.j);
                        }
                        PathState pathState = mapState.e;
                        pathState.getClass();
                        pathState.c.remove("primary-path-id");
                        Dp dp = new Dp(10);
                        Color color = new Color(ColorKt.d(instoreMapViewModel2.r != null ? 4278223304L : 1711309256L));
                        androidx.navigation.internal.c cVar = new androidx.navigation.internal.c(oriientMapRoute, instoreMapViewModel2, mapData, mapState, 3);
                        Cap cap = Cap.d;
                        ZoomPanRotateState zoomPanRotateState = mapState.b;
                        PathDataBuilder pathDataBuilder = new PathDataBuilder(zoomPanRotateState.f26960a, zoomPanRotateState.b);
                        cVar.invoke(pathDataBuilder);
                        synchronized (pathDataBuilder) {
                            if (pathDataBuilder.c.size() < 2) {
                                instoreMapViewModel = instoreMapViewModel2;
                                mapData2 = mapData;
                                obj2 = null;
                                pathData = null;
                            } else {
                                Double d = pathDataBuilder.d;
                                Double d2 = pathDataBuilder.e;
                                Double d3 = pathDataBuilder.f;
                                Double d4 = pathDataBuilder.g;
                                if (d == null || d2 == null || d3 == null || d4 == null) {
                                    instoreMapViewModel = instoreMapViewModel2;
                                    mapData2 = mapData;
                                    obj2 = null;
                                    pathData = null;
                                } else {
                                    obj2 = null;
                                    Point point = new Point(d.doubleValue(), d3.doubleValue());
                                    double dDoubleValue = d2.doubleValue();
                                    instoreMapViewModel = instoreMapViewModel2;
                                    mapData2 = mapData;
                                    pathData = new PathData(CollectionsKt.G0(pathDataBuilder.c), new Pair(point, new Point(dDoubleValue, d4.doubleValue())));
                                }
                            }
                        }
                        if (pathData != null) {
                            PathState pathState2 = mapState.e;
                            pathState2.getClass();
                            if (!pathState2.c.f.contains("primary-path-id")) {
                                pathState2.c.put("primary-path-id", new DrawablePathState(pathData, dp, color, cap));
                            }
                        }
                        if (MarkerApiKt.b(mapState, "TRANSITION_PIN_ID") != null) {
                            MarkerApiKt.c(mapState, "TRANSITION_PIN_ID");
                        }
                        Iterator it = oriientMapRoute.b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = obj2;
                                break;
                            }
                            next = it.next();
                            OriientFloorTransition oriientFloorTransition = (OriientFloorTransition) next;
                            InstoreMapViewModel instoreMapViewModel3 = instoreMapViewModel;
                            Floor floor2 = instoreMapViewModel3.A;
                            if (floor2 != null && oriientFloorTransition.d == floor2.d) {
                                break;
                            }
                            instoreMapViewModel = instoreMapViewModel3;
                        }
                        OriientFloorTransition oriientFloorTransition2 = (OriientFloorTransition) next;
                        if (oriientFloorTransition2 == null) {
                            return obj2;
                        }
                        final FloorTransitionType floorTransitionType = oriientFloorTransition2.c;
                        RelativePosition relativePositionB = CoordinateUtilsKt.b(oriientFloorTransition2.b, mapData2.b, LayoutApiKt.b(mapState));
                        MarkerApiKt.a(mapState, "TRANSITION_PIN_ID", relativePositionB.f7412a, relativePositionB.b, 0L, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$updateFloorTransitionMarker$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer.c()) {
                                    composer.j();
                                } else {
                                    FloorTransitionMarkerKt.a(floorTransitionType, null, BitmapDescriptorFactory.HUE_RED, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -2113400293), 2040);
                        return Unit.f24250a;
                    }
                }
                return null;
            }
        }

        public AnonymousClass11(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InstoreMapViewModel.this.new AnonymousClass11(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass11) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                InstoreMapViewModel instoreMapViewModel = InstoreMapViewModel.this;
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1L = FlowKt.l(instoreMapViewModel.l.a(), instoreMapViewModel.h.getCurrentFloor(), new AnonymousClass1(instoreMapViewModel, null));
                this.p = 1;
                if (FlowKt.g(flowKt__ZipKt$combine$$inlined$unsafeFlow$1L, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$12", f = "InstoreMapViewModel.kt", l = {418}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$12, reason: invalid class name */
    final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass12(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InstoreMapViewModel.this.new AnonymousClass12(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass12) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw android.support.v4.media.session.a.v(obj);
            }
            ResultKt.b(obj);
            final InstoreMapViewModel instoreMapViewModel = InstoreMapViewModel.this;
            MutableStateFlow mutableStateFlow = instoreMapViewModel.q;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.12.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    InstoreMapContract.ViewState.NavigationState navigationState = (InstoreMapContract.ViewState.NavigationState) obj2;
                    MutableStateFlow mutableStateFlow2 = instoreMapViewModel.s;
                    InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow2.getValue()).b();
                    if (contentB != null) {
                        while (true) {
                            Object value = mutableStateFlow2.getValue();
                            MutableStateFlow mutableStateFlow3 = mutableStateFlow2;
                            InstoreMapContract.ViewState.Content content = contentB;
                            if (mutableStateFlow3.d(value, InstoreMapContract.ViewState.Content.c(content, null, null, null, null, null, false, null, null, navigationState, null, false, false, false, null, false, false, null, null, null, 1048319))) {
                                break;
                            }
                            contentB = content;
                            mutableStateFlow2 = mutableStateFlow3;
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            mutableStateFlow.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$2", f = "InstoreMapViewModel.kt", l = {210}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InstoreMapViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
            final InstoreMapViewModel instoreMapViewModel = InstoreMapViewModel.this;
            SharedFlowImpl h = instoreMapViewModel.j.getH();
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    boolean z;
                    InstoreMapViewModel instoreMapViewModel2;
                    OriientError oriientError = (OriientError) obj2;
                    InstoreMapViewModel instoreMapViewModel3 = instoreMapViewModel;
                    MutableStateFlow mutableStateFlow = instoreMapViewModel3.s;
                    InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
                    if (contentB != null) {
                        while (true) {
                            Object value = mutableStateFlow.getValue();
                            z = oriientError instanceof OriientError.NotInStore;
                            MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                            instoreMapViewModel2 = instoreMapViewModel3;
                            InstoreMapContract.ViewState.Content content = contentB;
                            if (mutableStateFlow2.d(value, InstoreMapContract.ViewState.Content.c(content, null, null, null, null, null, z ? false : contentB.f, null, oriientError, null, null, false, false, false, null, false, false, null, null, null, 1048415))) {
                                break;
                            }
                            mutableStateFlow = mutableStateFlow2;
                            contentB = content;
                            instoreMapViewModel3 = instoreMapViewModel2;
                        }
                        if (z && instoreMapViewModel2.x6()) {
                            instoreMapViewModel2.F6();
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            h.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$3", f = "InstoreMapViewModel.kt", l = {230}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InstoreMapViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw android.support.v4.media.session.a.v(obj);
            }
            ResultKt.b(obj);
            final InstoreMapViewModel instoreMapViewModel = InstoreMapViewModel.this;
            StateFlow currentFloor = instoreMapViewModel.h.getCurrentFloor();
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.3.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    InstoreMapViewModel instoreMapViewModel2 = instoreMapViewModel;
                    BuildersKt.c(ViewModelKt.a(instoreMapViewModel2), null, null, new InstoreMapViewModel$onNewFloor$1((Floor) obj2, instoreMapViewModel2, null), 3);
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            currentFloor.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$4", f = "InstoreMapViewModel.kt", l = {247}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "isCalibrationNeeded", "calibrationProgress", "positioningState", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/PositioningInteractor$PositioningState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$4$1", f = "InstoreMapViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$4$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function4<Boolean, Double, PositioningInteractor.PositioningState, Continuation<? super Pair<? extends Boolean, ? extends Double>>, Object> {
            public /* synthetic */ boolean p;
            public /* synthetic */ Double q;
            public /* synthetic */ PositioningInteractor.PositioningState r;

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(4, (Continuation) obj4);
                anonymousClass1.p = zBooleanValue;
                anonymousClass1.q = (Double) obj2;
                anonymousClass1.r = (PositioningInteractor.PositioningState) obj3;
                return anonymousClass1.invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                boolean z = this.p;
                Double d = this.q;
                PositioningInteractor.PositioningState positioningState = this.r;
                boolean z2 = false;
                Timber.f27013a.b("calibration isCalibrationNeeded=" + z + " calibrationProgress=" + d + " positioningState=" + positioningState, new Object[0]);
                if (z && positioningState == PositioningInteractor.PositioningState.f) {
                    z2 = true;
                }
                return new Pair(Boolean.valueOf(z2), d);
            }
        }

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InstoreMapViewModel.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final InstoreMapViewModel instoreMapViewModel = InstoreMapViewModel.this;
            PositioningInteractor positioningInteractor = instoreMapViewModel.j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1I = FlowKt.i(positioningInteractor.h(), positioningInteractor.f(), positioningInteractor.c(), new AnonymousClass1(4, null));
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.4.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object value;
                        Pair pair = (Pair) obj2;
                        InstoreMapViewModel instoreMapViewModel2 = instoreMapViewModel;
                        MutableStateFlow mutableStateFlow = instoreMapViewModel2.s;
                        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
                        if (contentB != null) {
                            MapEventTracker mapEventTracker = instoreMapViewModel2.m;
                            Object obj3 = pair.d;
                            Object obj4 = pair.e;
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Double d = (Double) obj4;
                            AnalyticsManager analyticsManager = mapEventTracker.f7409a;
                            if (!mapEventTracker.c && zBooleanValue) {
                                mapEventTracker.b = false;
                                mapEventTracker.d = true;
                                analyticsManager.g(MapsAnalytics.Calibration.Action.d);
                            } else if (mapEventTracker.d && !zBooleanValue) {
                                if (!mapEventTracker.b) {
                                    analyticsManager.g(MapsAnalytics.Calibration.Action.e);
                                }
                                mapEventTracker.d = false;
                            }
                            mapEventTracker.c = zBooleanValue;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.d(value, InstoreMapContract.ViewState.Content.c(contentB, null, null, null, null, null, ((Boolean) pair.d).booleanValue(), d, null, null, null, false, false, false, null, false, false, null, null, null, 1048479)));
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1I.collect(flowCollector, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$5", f = "InstoreMapViewModel.kt", l = {272}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "positionState", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/PositioningInteractor$PositioningState;", "position", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientPosition;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$5$1", f = "InstoreMapViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$5$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function3<PositioningInteractor.PositioningState, OriientPosition, Continuation<? super Double>, Object> {
            public /* synthetic */ PositioningInteractor.PositioningState p;
            public /* synthetic */ OriientPosition q;
            public final /* synthetic */ InstoreMapViewModel r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
                super(3, continuation);
                this.r = instoreMapViewModel;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, (Continuation) obj3);
                anonymousClass1.p = (PositioningInteractor.PositioningState) obj;
                anonymousClass1.q = (OriientPosition) obj2;
                return anonymousClass1.invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                return InstoreMapViewModel.p6(this.r, this.p, this.q);
            }
        }

        public AnonymousClass5(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InstoreMapViewModel.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final InstoreMapViewModel instoreMapViewModel = InstoreMapViewModel.this;
            PositioningInteractor positioningInteractor = instoreMapViewModel.j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                Flow flowR = FlowKt.r(FlowKt.l(positioningInteractor.c(), positioningInteractor.getCurrentPosition(), new AnonymousClass1(instoreMapViewModel, null)));
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.5.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        InstoreMapViewModel instoreMapViewModel2;
                        Double d = (Double) obj2;
                        Timber.f27013a.h("lockProgress-> " + d, new Object[0]);
                        InstoreMapViewModel instoreMapViewModel3 = instoreMapViewModel;
                        MutableStateFlow mutableStateFlow = instoreMapViewModel3.s;
                        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
                        if (contentB != null) {
                            while (true) {
                                Object value = mutableStateFlow.getValue();
                                MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                                instoreMapViewModel2 = instoreMapViewModel3;
                                InstoreMapContract.ViewState.Content content = contentB;
                                if (mutableStateFlow2.d(value, InstoreMapContract.ViewState.Content.c(content, null, null, null, null, d, false, null, null, null, null, false, false, false, null, false, false, null, null, null, 1048559))) {
                                    break;
                                }
                                mutableStateFlow = mutableStateFlow2;
                                contentB = content;
                                instoreMapViewModel3 = instoreMapViewModel2;
                            }
                            MapEventTracker mapEventTracker = instoreMapViewModel2.m;
                            ProductCard productCard = instoreMapViewModel2.u;
                            if (d == null) {
                                mapEventTracker.getClass();
                            } else if (!mapEventTracker.e) {
                                mapEventTracker.e = true;
                                mapEventTracker.a(MapsAnalytics.ProductFinderMap.Action.h, productCard != null ? ProductAnalyticsExtKt.h(productCard, null, null, 7) : null);
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowR.collect(flowCollector, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6", f = "InstoreMapViewModel.kt", l = {330}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6, reason: invalid class name */
    final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "positionState", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/PositioningInteractor$PositioningState;", "position", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientPosition;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$2", f = "InstoreMapViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements Function3<PositioningInteractor.PositioningState, OriientPosition, Continuation<? super Double>, Object> {
            public /* synthetic */ PositioningInteractor.PositioningState p;
            public /* synthetic */ OriientPosition q;
            public final /* synthetic */ InstoreMapViewModel r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
                super(3, continuation);
                this.r = instoreMapViewModel;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.r, (Continuation) obj3);
                anonymousClass2.p = (PositioningInteractor.PositioningState) obj;
                anonymousClass2.q = (OriientPosition) obj2;
                return anonymousClass2.invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                return InstoreMapViewModel.p6(this.r, this.p, this.q);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "previous", "current", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$3", f = "InstoreMapViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$3, reason: invalid class name */
        final class AnonymousClass3 extends SuspendLambda implements Function3<Pair<? extends Boolean, ? extends Boolean>, Double, Continuation<? super Pair<? extends Boolean, ? extends Boolean>>, Object> {
            public /* synthetic */ Pair p;
            public /* synthetic */ Double q;

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(3, (Continuation) obj3);
                anonymousClass3.p = (Pair) obj;
                anonymousClass3.q = (Double) obj2;
                return anonymousClass3.invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                return new Pair(this.p.e, Boolean.valueOf(this.q == null));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$5", f = "InstoreMapViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$5, reason: invalid class name */
        final class AnonymousClass5 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            public final /* synthetic */ CoroutineScope p;
            public final /* synthetic */ InstoreMapViewModel q;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$5$1", f = "InstoreMapViewModel.kt", l = {319}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$5$1, reason: invalid class name */
            final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int p;
                public final /* synthetic */ InstoreMapViewModel q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
                    super(2, continuation);
                    this.q = instoreMapViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.q, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object value;
                    Object value2;
                    InstoreMapViewModel instoreMapViewModel = this.q;
                    MutableStateFlow mutableStateFlow = instoreMapViewModel.s;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    int i = this.p;
                    if (i == 0) {
                        ResultKt.b(obj);
                        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
                        if (contentB != null) {
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.d(value, InstoreMapContract.ViewState.Content.c(contentB, null, null, null, null, null, false, null, null, null, null, false, true, false, null, false, false, null, null, null, 1044479)));
                            MapEventTracker mapEventTracker = instoreMapViewModel.m;
                            ProductCard productCard = instoreMapViewModel.u;
                            mapEventTracker.e = false;
                            mapEventTracker.a(MapsAnalytics.ProductFinderMap.Action.i, productCard != null ? ProductAnalyticsExtKt.h(productCard, null, null, 7) : null);
                        }
                        this.p = 1;
                        if (DelayKt.b(3000L, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    }
                    InstoreMapContract.ViewState.Content contentB2 = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
                    if (contentB2 != null) {
                        do {
                            value2 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.d(value2, InstoreMapContract.ViewState.Content.c(contentB2, null, null, null, null, null, false, null, null, null, null, false, false, false, null, false, false, null, null, null, 1044479)));
                    }
                    return Unit.f24250a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(CoroutineScope coroutineScope, InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
                super(2, continuation);
                this.p = coroutineScope;
                this.q = instoreMapViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass5(this.p, this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) create(bool, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass5.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                BuildersKt.c(this.p, null, null, new AnonymousClass1(this.q, null), 3);
                return Unit.f24250a;
            }
        }

        public AnonymousClass6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass6 anonymousClass6 = InstoreMapViewModel.this.new AnonymousClass6(continuation);
            anonymousClass6.q = obj;
            return anonymousClass6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InstoreMapViewModel instoreMapViewModel = InstoreMapViewModel.this;
            PositioningInteractor positioningInteractor = instoreMapViewModel.j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.q;
                final StateFlow stateFlowC = positioningInteractor.c();
                Flow flowR = FlowKt.r(FlowKt.l(new Flow<PositioningInteractor.PositioningState>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$invokeSuspend$$inlined$filter$1$2", f = "InstoreMapViewModel.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object p;
                            public int q;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.p = obj;
                                this.q |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.d = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r6)
                                goto L44
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                kotlin.ResultKt.b(r6)
                                r6 = r5
                                au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor$PositioningState r6 = (au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor.PositioningState) r6
                                au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor$PositioningState r2 = au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor.PositioningState.f
                                if (r6 != r2) goto L44
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L44
                                return r1
                            L44:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$6$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = stateFlowC.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                }, positioningInteractor.getCurrentPosition(), new AnonymousClass2(instoreMapViewModel, null)));
                Boolean bool = Boolean.TRUE;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass5(coroutineScope, instoreMapViewModel, null), FlowKt.B(new InstoreMapViewModel$6$invokeSuspend$$inlined$transform$1(new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(new Pair(bool, bool), flowR, new AnonymousClass3(3, null)), null)));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$7", f = "InstoreMapViewModel.kt", l = {340}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$7, reason: invalid class name */
    final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "positioningState", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/PositioningInteractor$PositioningState;", "position", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientPosition;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$7$1", f = "InstoreMapViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$7$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function3<PositioningInteractor.PositioningState, OriientPosition, Continuation<? super Unit>, Object> {
            public /* synthetic */ PositioningInteractor.PositioningState p;
            public /* synthetic */ OriientPosition q;
            public final /* synthetic */ InstoreMapViewModel r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
                super(3, continuation);
                this.r = instoreMapViewModel;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, (Continuation) obj3);
                anonymousClass1.p = (PositioningInteractor.PositioningState) obj;
                anonymousClass1.q = (OriientPosition) obj2;
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                PositioningInteractor.PositioningState positioningState = this.p;
                OriientPosition oriientPosition = this.q;
                InstoreMapViewModel instoreMapViewModel = this.r;
                PositionAnimator positionAnimator = instoreMapViewModel.k;
                if (instoreMapViewModel.E6(oriientPosition, positioningState)) {
                    positionAnimator.a(ViewModelKt.a(instoreMapViewModel), oriientPosition);
                } else {
                    positionAnimator.a(ViewModelKt.a(instoreMapViewModel), null);
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass7(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InstoreMapViewModel.this.new AnonymousClass7(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InstoreMapViewModel instoreMapViewModel = InstoreMapViewModel.this;
            PositioningInteractor positioningInteractor = instoreMapViewModel.j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1L = FlowKt.l(positioningInteractor.c(), positioningInteractor.getCurrentPosition(), new AnonymousClass1(instoreMapViewModel, null));
                this.p = 1;
                if (FlowKt.g(flowKt__ZipKt$combine$$inlined$unsafeFlow$1L, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$8", f = "InstoreMapViewModel.kt", l = {354}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$8, reason: invalid class name */
    final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "position", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientPosition;", "route", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientMapRoute;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$8$1", f = "InstoreMapViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$8$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function3<OriientPosition, OriientMapRoute, Continuation<? super Unit>, Object> {
            public /* synthetic */ OriientPosition p;
            public /* synthetic */ OriientMapRoute q;
            public final /* synthetic */ InstoreMapViewModel r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
                super(3, continuation);
                this.r = instoreMapViewModel;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, (Continuation) obj3);
                anonymousClass1.p = (OriientPosition) obj;
                anonymousClass1.q = (OriientMapRoute) obj2;
                return anonymousClass1.invokeSuspend(Unit.f24250a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r28) {
                /*
                    r27 = this;
                    r0 = r27
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    kotlin.ResultKt.b(r28)
                    au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition r1 = r0.p
                    au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMapRoute r2 = r0.q
                    au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel r3 = r0.r
                    kotlinx.coroutines.flow.MutableStateFlow r3 = r3.s
                    java.lang.Object r4 = r3.getValue()
                    au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState r4 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState) r4
                    au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Content r5 = r4.b()
                    if (r5 == 0) goto La2
                L1b:
                    java.lang.Object r6 = r3.getValue()
                    r7 = r6
                    au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState r7 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState) r7
                    if (r2 == 0) goto L57
                    java.util.ArrayList r7 = r2.e
                    boolean r8 = r7.isEmpty()
                    if (r8 != 0) goto L2e
                    r8 = r7
                    goto L2f
                L2e:
                    r8 = 0
                L2f:
                    if (r8 == 0) goto L57
                    double r8 = r2.f
                    float r8 = (float) r8
                    java.lang.Object r7 = kotlin.collections.CollectionsKt.P(r7)
                    au.com.woolworths.feature.shop.instore.navigation.map.data.OriientWaypoint r7 = (au.com.woolworths.feature.shop.instore.navigation.map.data.OriientWaypoint) r7
                    if (r7 == 0) goto L48
                    if (r1 == 0) goto L48
                    double r9 = me.oriient.ipssdk.ips.IPSNavigation.getAngleFromUserHeading(r7)
                    float r7 = (float) r9
                    java.lang.Float r7 = java.lang.Float.valueOf(r7)
                    goto L49
                L48:
                    r7 = 0
                L49:
                    if (r7 == 0) goto L57
                    au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.DirectionAndDistanceIndicatorData r9 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.DirectionAndDistanceIndicatorData
                    float r7 = r7.floatValue()
                    r9.<init>(r7, r8)
                    r24 = r9
                    goto L59
                L57:
                    r24 = 0
                L59:
                    r25 = 524287(0x7ffff, float:7.34683E-40)
                    r7 = r6
                    r6 = 0
                    r8 = r7
                    r7 = 0
                    r9 = r8
                    r8 = 0
                    r10 = r9
                    r9 = 0
                    r11 = r10
                    r10 = 0
                    r12 = r11
                    r11 = 0
                    r13 = r12
                    r12 = 0
                    r14 = r13
                    r13 = 0
                    r15 = r14
                    r14 = 0
                    r16 = r15
                    r15 = 0
                    r17 = r16
                    r16 = 0
                    r18 = r17
                    r17 = 0
                    r19 = r18
                    r18 = 0
                    r20 = r19
                    r19 = 0
                    r21 = r20
                    r20 = 0
                    r22 = r21
                    r21 = 0
                    r23 = r22
                    r22 = 0
                    r26 = r23
                    r23 = 0
                    r4 = r26
                    r28 = 0
                    au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Content r6 = au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState.Content.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                    boolean r4 = r3.d(r4, r6)
                    if (r4 == 0) goto L1b
                    kotlin.Unit r1 = kotlin.Unit.f24250a
                    return r1
                La2:
                    r28 = 0
                    return r28
                */
                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.AnonymousClass8.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass8(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InstoreMapViewModel.this.new AnonymousClass8(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass8) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                InstoreMapViewModel instoreMapViewModel = InstoreMapViewModel.this;
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1L = FlowKt.l(instoreMapViewModel.j.getCurrentPosition(), instoreMapViewModel.l.a(), new AnonymousClass1(instoreMapViewModel, null));
                this.p = 1;
                if (FlowKt.g(flowKt__ZipKt$combine$$inlined$unsafeFlow$1L, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$9", f = "InstoreMapViewModel.kt", l = {359}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$9, reason: invalid class name */
    final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass9(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InstoreMapViewModel.this.new AnonymousClass9(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass9) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw android.support.v4.media.session.a.v(obj);
            }
            ResultKt.b(obj);
            final InstoreMapViewModel instoreMapViewModel = InstoreMapViewModel.this;
            StateFlow position = instoreMapViewModel.k.getPosition();
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.9.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    InstoreMapContract.ViewState.MapData mapData;
                    OriientPosition oriientPosition = (OriientPosition) obj2;
                    if (oriientPosition != null) {
                        final InstoreMapViewModel instoreMapViewModel2 = instoreMapViewModel;
                        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) instoreMapViewModel2.s.getValue()).b();
                        if (contentB != null && (mapData = contentB.b) != null) {
                            MapState mapState = mapData.f7384a;
                            RelativePosition relativePositionB = CoordinateUtilsKt.b(oriientPosition.f7345a, mapData.b, LayoutApiKt.b(mapState));
                            final InstoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1 instoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1 = new InstoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1(instoreMapViewModel2.k.getPosition(), mapState);
                            if (MarkerApiKt.b(mapState, "user-position-marker-id") == null) {
                                MarkerApiKt.a(mapState, "user-position-marker-id", relativePositionB.f7412a, relativePositionB.b, (Float.floatToRawIntBits(-0.5f) << 32) | (Float.floatToRawIntBits(-0.5f) & 4294967295L), new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$showUserPositionOnMap$1$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer = (Composer) obj3;
                                        if ((((Number) obj4).intValue() & 3) == 2 && composer.c()) {
                                            composer.j();
                                        } else {
                                            composer.o(5004770);
                                            InstoreMapViewModel instoreMapViewModel3 = instoreMapViewModel2;
                                            boolean zI = composer.I(instoreMapViewModel3);
                                            Object objG = composer.G();
                                            if (zI || objG == Composer.Companion.f1624a) {
                                                objG = new InstoreMapViewModel$showUserPositionOnMap$1$1$1$1$1(1, instoreMapViewModel3, InstoreMapViewModel.class, "trackOriientAppEvent", "trackOriientAppEvent(Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientAppEvent;)V", 0);
                                                composer.A(objG);
                                            }
                                            composer.l();
                                            UserPositionMarkerKt.b(instoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1, (Function1) ((KFunction) objG), null, composer, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 734583071), 1968);
                            } else {
                                double dA = relativePositionB.f7412a;
                                double dA2 = relativePositionB.b;
                                MarkerState markerState = mapState.d;
                                markerState.getClass();
                                MarkerData markerDataB = markerState.b("user-position-marker-id");
                                if (markerDataB != null) {
                                    MutableDoubleState mutableDoubleState = markerDataB.e;
                                    MutableDoubleState mutableDoubleState2 = markerDataB.d;
                                    if (markerDataB.c()) {
                                        dA = RangesKt.a(dA, 0.0d, 1.0d);
                                    }
                                    SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = (SnapshotMutableDoubleStateImpl) mutableDoubleState2;
                                    snapshotMutableDoubleStateImpl.s(dA);
                                    if (markerDataB.c()) {
                                        dA2 = RangesKt.a(dA2, 0.0d, 1.0d);
                                    }
                                    SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl2 = (SnapshotMutableDoubleStateImpl) mutableDoubleState;
                                    snapshotMutableDoubleStateImpl2.s(dA2);
                                    snapshotMutableDoubleStateImpl.f();
                                    snapshotMutableDoubleStateImpl2.f();
                                }
                            }
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            position.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapViewModel$Companion;", "", "", "USER_POSITION_MARKER_ID", "Ljava/lang/String;", "", "MINIMUM_LOCK_PERCENTAGE", "D", "", "ROTATION_TWEEN_DURATION_MS", "I", "PRIMARY_PATH_ID", "", "ROUTE_SAMPLING_PERIOD_MILLIS", "J", "PATH_COLOR_ACTIVE", "PATH_COLOR_PAUSED", "POSITION_LOCK_SUCCESS_MSG_DURATION", "ROUTE_PIN_ID", "TRANSITION_PIN_ID", "ZOOM_PEEK_DURATION_MS", "ZOOM_PEEK_DEST_SCALE", "ZOOM_OUT_DELAY_MS", "ZOOM_OUT_DURATION_MS", "INITIAL_PRODUCT_ZOOM_SCALE", "FEEDBACK_FORM_PARAM_STORE_ID", "FEEDBACK_FORM_PARAM_PRODUCT_LOCATION", "FEEDBACK_FORM_PARAM_PRODUCT_ID", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7387a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[InstoreMapErrorState.values().length];
            try {
                InstoreMapErrorState instoreMapErrorState = InstoreMapErrorState.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7387a = iArr;
            int[] iArr2 = new int[InstoreMapContract.ViewState.LocationServicesUnavailableState.values().length];
            try {
                InstoreMapContract.ViewState.LocationServicesUnavailableState locationServicesUnavailableState = InstoreMapContract.ViewState.LocationServicesUnavailableState.d;
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InstoreMapContract.ViewState.LocationServicesUnavailableState locationServicesUnavailableState2 = InstoreMapContract.ViewState.LocationServicesUnavailableState.d;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                InstoreMapContract.ViewState.LocationServicesUnavailableState locationServicesUnavailableState3 = InstoreMapContract.ViewState.LocationServicesUnavailableState.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public InstoreMapViewModel(LocationInteractor locationInteractor, CollectionModeInteractor collectionModeInteractor, InstoreNavigationInteractor instoreNavigationInteractor, BuildingInteractor buildingInteractor, MapFocusInteractor mapFocusInteractor, PositioningInteractor positioningInteractor, PositionAnimator positionAnimator, RoutingInteractor routingInteractor, MapEventTracker mapEventTracker, OriientTrackingInteractor trackingInteractor, ProximityInteractor proximityInteractor, ProductsInteractor productsInteractor) {
        Object value;
        Intrinsics.h(locationInteractor, "locationInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        Intrinsics.h(buildingInteractor, "buildingInteractor");
        Intrinsics.h(mapFocusInteractor, "mapFocusInteractor");
        Intrinsics.h(positioningInteractor, "positioningInteractor");
        Intrinsics.h(positionAnimator, "positionAnimator");
        Intrinsics.h(routingInteractor, "routingInteractor");
        Intrinsics.h(trackingInteractor, "trackingInteractor");
        Intrinsics.h(proximityInteractor, "proximityInteractor");
        this.e = locationInteractor;
        this.f = collectionModeInteractor;
        this.g = instoreNavigationInteractor;
        this.h = buildingInteractor;
        this.i = mapFocusInteractor;
        this.j = positioningInteractor;
        this.k = positionAnimator;
        this.l = routingInteractor;
        this.m = mapEventTracker;
        this.n = trackingInteractor;
        this.o = proximityInteractor;
        this.p = productsInteractor;
        this.q = StateFlowKt.a(InstoreMapContract.ViewState.NavigationState.d);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new InstoreMapContract.ViewState.Content(instoreNavigationInteractor.f(), null, null, null, null, false, null, null, null, 1048574));
        this.s = mutableStateFlowA;
        this.v = true;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.w = sharedFlowImplB;
        this.x = sharedFlowImplB;
        this.y = new LinkedHashSet();
        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlowA.getValue()).b();
        if (contentB != null) {
            do {
                value = mutableStateFlowA.getValue();
            } while (!mutableStateFlowA.d(value, InstoreMapContract.ViewState.Content.c(contentB, null, null, null, null, null, false, null, null, null, y6(), false, false, false, null, false, false, null, null, null, 1048063)));
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass2(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass3(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass4(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass5(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass6(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass7(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass8(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass9(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass10(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass11(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass12(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new InstoreMapViewModel$listenToProximityEvent$1(this, null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new InstoreMapViewModel$enableInitialProductProximity$1(this, null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new InstoreMapViewModel$listenToFloors$1(this, null), 3);
    }

    public static final Double p6(InstoreMapViewModel instoreMapViewModel, PositioningInteractor.PositioningState positioningState, OriientPosition oriientPosition) {
        if (positioningState != PositioningInteractor.PositioningState.f) {
            return null;
        }
        if (oriientPosition != null && oriientPosition.e) {
            return null;
        }
        double d = oriientPosition != null ? oriientPosition.f : 0.0d;
        if (d < 10.0d) {
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q6(au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.q6(au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0202, code lost:
    
        if (r53.v6(r9, r2, r12) != r13) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f6 A[PHI: r1 r2 r3 r9
  0x01f6: PHI (r1v2 au.com.woolworths.feature.shop.instore.navigation.map.data.Floor) = 
  (r1v0 au.com.woolworths.feature.shop.instore.navigation.map.data.Floor)
  (r1v1 au.com.woolworths.feature.shop.instore.navigation.map.data.Floor)
  (r1v11 au.com.woolworths.feature.shop.instore.navigation.map.data.Floor)
 binds: [B:36:0x01d0, B:42:0x01f3, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x01f6: PHI (r2v11 boolean) = (r2v4 boolean), (r2v10 boolean), (r2v17 boolean) binds: [B:36:0x01d0, B:42:0x01f3, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x01f6: PHI (r3v19 kotlinx.coroutines.flow.MutableStateFlow) = 
  (r3v12 kotlinx.coroutines.flow.MutableStateFlow)
  (r3v18 kotlinx.coroutines.flow.MutableStateFlow)
  (r3v24 kotlinx.coroutines.flow.MutableStateFlow)
 binds: [B:36:0x01d0, B:42:0x01f3, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x01f6: PHI (r9v2 au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap) = 
  (r9v0 au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap)
  (r9v1 au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap)
  (r9v4 au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap)
 binds: [B:36:0x01d0, B:42:0x01f3, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r6(au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel r53, au.com.woolworths.feature.shop.instore.navigation.map.data.Floor r54, au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap r55, kotlin.coroutines.jvm.internal.ContinuationImpl r56) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.r6(au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel, au.com.woolworths.feature.shop.instore.navigation.map.data.Floor, au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s6(InstoreMapViewModel instoreMapViewModel, String str) {
        List list = instoreMapViewModel.t;
        ProductCard productCard = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.c(((ProductCard) next).getProductId(), str)) {
                    productCard = next;
                    break;
                }
            }
            productCard = productCard;
        }
        instoreMapViewModel.D6(productCard);
    }

    public static final void t6(InstoreMapViewModel instoreMapViewModel, ProductCard productCard) {
        InstoreLocationDetailsData details;
        InStoreLocationData inStoreLocation = productCard.getInStoreLocation();
        if (inStoreLocation == null || (details = inStoreLocation.getDetails()) == null) {
            return;
        }
        instoreMapViewModel.o.d(productCard.getProductId(), new LocalProximityLocationDefinition.CloseWalkingDistance(new WowCoordinate(details.getX(), details.getY())), details.getFloorNumber(), LocalProximityEventTriggerSpec.Enter.f7351a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r0.d(r6, r1) == r8) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object u6(au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel r5, au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate r6, int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractor r0 = r5.l
            boolean r1 = r8 instanceof au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$showRouteToOriientCoordinate$1
            if (r1 == 0) goto L15
            r1 = r8
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$showRouteToOriientCoordinate$1 r1 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$showRouteToOriientCoordinate$1) r1
            int r2 = r1.s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s = r2
            goto L1a
        L15:
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$showRouteToOriientCoordinate$1 r1 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$showRouteToOriientCoordinate$1
            r1.<init>(r5, r8)
        L1a:
            java.lang.Object r5 = r1.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r1.s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r5)
            goto L5a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            au.com.woolworths.feature.shop.instore.navigation.map.content.PinContent r6 = r1.p
            kotlin.ResultKt.b(r5)
            goto L4e
        L3a:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.feature.shop.instore.navigation.map.content.PinContent r5 = new au.com.woolworths.feature.shop.instore.navigation.map.content.PinContent
            r5.<init>(r7, r6)
            r1.p = r5
            r1.s = r4
            java.lang.Object r6 = r0.c(r1)
            if (r6 != r8) goto L4d
            goto L59
        L4d:
            r6 = r5
        L4e:
            r5 = 0
            r1.p = r5
            r1.s = r3
            java.lang.Object r5 = r0.d(r6, r1)
            if (r5 != r8) goto L5a
        L59:
            return r8
        L5a:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.u6(au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel, au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void A6() {
        InstoreMapContract.ViewState.Content contentB;
        InstoreMapContract.ViewState.MapData mapData;
        PositioningInteractor positioningInteractor = this.j;
        PositioningInteractor.PositioningState positioningState = (PositioningInteractor.PositioningState) positioningInteractor.c().getValue();
        OriientPosition oriientPosition = (OriientPosition) positioningInteractor.getCurrentPosition().getValue();
        boolean zE6 = E6(oriientPosition, positioningState);
        PositionAnimator positionAnimator = this.k;
        if (zE6) {
            positionAnimator.a(ViewModelKt.a(this), oriientPosition);
        } else {
            positionAnimator.a(ViewModelKt.a(this), null);
        }
        if (E6(oriientPosition, positioningState) || (contentB = ((InstoreMapContract.ViewState) this.s.getValue()).b()) == null || (mapData = contentB.b) == null) {
            return;
        }
        MapState mapState = mapData.f7384a;
        if (MarkerApiKt.b(mapState, "user-position-marker-id") != null) {
            MarkerApiKt.c(mapState, "user-position-marker-id");
        }
    }

    public final void B6(List list) {
        List list2 = list;
        this.t = list2;
        MutableStateFlow mutableStateFlow = this.s;
        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
        if (contentB != null) {
            while (true) {
                Object value = mutableStateFlow.getValue();
                MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                InstoreMapContract.ViewState.Content content = contentB;
                if (mutableStateFlow2.d(value, InstoreMapContract.ViewState.Content.c(content, null, null, list2, null, null, false, null, null, null, null, false, false, false, null, false, false, null, null, null, 1048571))) {
                    break;
                }
                list2 = list;
                contentB = content;
                mutableStateFlow = mutableStateFlow2;
            }
        }
        D6(list != null ? (ProductCard) CollectionsKt.F(list) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C6(au.com.woolworths.product.models.ProductCard r34, boolean r35) {
        /*
            r33 = this;
            r0 = r33
            au.com.woolworths.product.models.InStoreLocationData r1 = r34.getInStoreLocation()
            kotlinx.coroutines.flow.MutableStateFlow r2 = r0.s
            if (r1 == 0) goto L10
            au.com.woolworths.product.models.InstoreLocationDetailsData r1 = r1.getDetails()
            if (r1 != 0) goto L13
        L10:
            r4 = r35
            goto L7f
        L13:
            au.com.woolworths.product.models.InStoreLocationData r3 = r34.getInStoreLocation()
            r4 = 0
            if (r3 == 0) goto L1f
            java.lang.String r3 = au.com.woolworths.product.models.InStoreLocationDataKt.aisleNumberDisplayable(r3)
            goto L20
        L1f:
            r3 = r4
        L20:
            java.lang.Object r5 = r2.getValue()
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState r5 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState) r5
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Content r5 = r5.b()
            if (r5 == 0) goto L10
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData r5 = r5.b
            if (r5 == 0) goto L10
            ovh.plrapps.mapcompose.ui.state.MapState r6 = r5.f7384a
            au.com.woolworths.feature.shop.instore.navigation.map.data.WowCoordinate r7 = new au.com.woolworths.feature.shop.instore.navigation.map.data.WowCoordinate
            double r8 = r1.getX()
            double r10 = r1.getY()
            r7.<init>(r8, r10)
            au.com.woolworths.feature.shop.instore.navigation.map.data.Floor r1 = r0.A
            if (r1 == 0) goto L45
            java.lang.String r4 = r1.f7335a
        L45:
            au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor r1 = r0.h
            au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate r1 = r1.e(r7, r4)
            if (r1 == 0) goto L10
            au.com.woolworths.feature.shop.instore.navigation.map.data.ImageMapData r4 = r5.b
            long r7 = ovh.plrapps.mapcompose.api.LayoutApiKt.b(r6)
            au.com.woolworths.feature.shop.instore.navigation.map.utils.RelativePosition r1 = au.com.woolworths.feature.shop.instore.navigation.map.utils.CoordinateUtilsKt.b(r1, r4, r7)
            java.lang.String r7 = r34.getProductId()
            ovh.plrapps.mapcompose.api.MarkerInfo r4 = ovh.plrapps.mapcompose.api.MarkerApiKt.b(r6, r7)
            if (r4 == 0) goto L64
            ovh.plrapps.mapcompose.api.MarkerApiKt.c(r6, r7)
        L64:
            double r8 = r1.f7412a
            double r10 = r1.b
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$updateProductMarkerState$2 r1 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$updateProductMarkerState$2
            r4 = r35
            r1.<init>()
            androidx.compose.runtime.internal.ComposableLambdaImpl r14 = new androidx.compose.runtime.internal.ComposableLambdaImpl
            r3 = 1
            r5 = 217798964(0xcfb5934, float:3.872636E-31)
            r14.<init>(r1, r3, r5)
            r15 = 2040(0x7f8, float:2.859E-42)
            r12 = 0
            ovh.plrapps.mapcompose.api.MarkerApiKt.a(r6, r7, r8, r10, r12, r14, r15)
        L7f:
            java.lang.Object r1 = r2.getValue()
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState r1 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState) r1
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Content r12 = r1.b()
            if (r12 == 0) goto Lc6
        L8b:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState r3 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState) r3
            r31 = 0
            r32 = 1015807(0xf7fff, float:1.423449E-39)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r27 = r4
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Content r3 = au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState.Content.c(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r1 = r2.d(r1, r3)
            if (r1 == 0) goto Lc3
            goto Lc6
        Lc3:
            r4 = r35
            goto L8b
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.C6(au.com.woolworths.product.models.ProductCard, boolean):void");
    }

    public final void D6(ProductCard productCard) {
        ProductCard productCard2 = productCard;
        this.u = productCard2;
        MutableStateFlow mutableStateFlow = this.s;
        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
        if (contentB != null) {
            while (true) {
                Object value = mutableStateFlow.getValue();
                MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                InstoreMapContract.ViewState.Content content = contentB;
                if (mutableStateFlow2.d(value, InstoreMapContract.ViewState.Content.c(content, null, null, null, productCard2, null, false, null, null, null, null, false, false, false, null, false, false, null, null, null, 1048567))) {
                    break;
                }
                productCard2 = productCard;
                contentB = content;
                mutableStateFlow = mutableStateFlow2;
            }
        }
        I6();
    }

    public final boolean E6(OriientPosition oriientPosition, PositioningInteractor.PositioningState positioningState) {
        Floor floor = this.A;
        return Intrinsics.c(floor != null ? floor.f7335a : null, oriientPosition != null ? oriientPosition.g : null) && oriientPosition != null && oriientPosition.e && positioningState == PositioningInteractor.PositioningState.f;
    }

    public final void F6() {
        Job job = this.r;
        if (job != null) {
            this.r = null;
            this.q.f(InstoreMapContract.ViewState.NavigationState.d);
            job.cancel((CancellationException) null);
        }
    }

    public final void G6(MapAnalyticsEvent event) {
        Intrinsics.h(event, "event");
        boolean z = event instanceof MapAnalyticsEvent.MapLoadServerError;
        MapEventTracker mapEventTracker = this.m;
        if (z) {
            MapAnalyticsEvent.MapLoadServerError mapLoadServerError = (MapAnalyticsEvent.MapLoadServerError) event;
            final String str = mapLoadServerError.f7394a;
            final String errorDescription = mapLoadServerError.b;
            mapEventTracker.getClass();
            Intrinsics.h(errorDescription, "errorDescription");
            AnalyticsManager analyticsManager = mapEventTracker.f7409a;
            MapsAnalytics.ProductFinderMap.Action.d.getClass();
            analyticsManager.g(new Event(errorDescription, str) { // from class: au.com.woolworths.analytics.supers.products.MapsAnalytics$ProductFinderMap$Action$Companion$mapLoadingError$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(MapsAnalytics.ProductFinderMap.e);
                    androidx.constraintlayout.core.state.a.z("event.Action", "error_impression", spreadBuilder, "event.Category", "error");
                    androidx.constraintlayout.core.state.a.z("event.Description", String.valueOf(errorDescription), spreadBuilder, "event.Label", str);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "storemap_error_screen";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "storemap_error_screen".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            return;
        }
        if (event instanceof MapAnalyticsEvent.CloseMapClick) {
            ProductCard productCard = this.u;
            mapEventTracker.getClass();
            mapEventTracker.a(MapsAnalytics.ProductFinderMap.Action.g, productCard != null ? ProductAnalyticsExtKt.h(productCard, null, null, 7) : null);
            return;
        }
        if (event instanceof MapAnalyticsEvent.OnLocationRationaleShown) {
            mapEventTracker.f7409a.g(MapsAnalytics.ProductFinderMap.Action.k);
            return;
        }
        if (event instanceof MapAnalyticsEvent.GoToSettingsClickFromLocationRationale) {
            AnalyticsManager analyticsManager2 = mapEventTracker.f7409a;
            MapsAnalytics.ProductFinderMap.Action.d.getClass();
            final String str2 = "go to settings";
            analyticsManager2.g(new Event(str2) { // from class: au.com.woolworths.analytics.supers.products.MapsAnalytics$ProductFinderMap$Action$Companion$onAlertButtonClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(MapsAnalytics.ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", str2, spreadBuilder, "event.Description", "share your location to access more features");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_button_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "productfinder_button_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            return;
        }
        if (event instanceof MapAnalyticsEvent.NoThanksClickFromLocationRationale) {
            AnalyticsManager analyticsManager3 = mapEventTracker.f7409a;
            MapsAnalytics.ProductFinderMap.Action.d.getClass();
            final String str3 = "no thanks";
            analyticsManager3.g(new Event(str3) { // from class: au.com.woolworths.analytics.supers.products.MapsAnalytics$ProductFinderMap$Action$Companion$onAlertButtonClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(MapsAnalytics.ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", str3, spreadBuilder, "event.Description", "share your location to access more features");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_button_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "productfinder_button_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            return;
        }
        if (event instanceof MapAnalyticsEvent.DeviceNotSupportedDialogImpression) {
            AnalyticsManager analyticsManager4 = mapEventTracker.f7409a;
            MapsAnalytics.ProductFinderMap.Action.d.getClass();
            final String str4 = "device not supported";
            analyticsManager4.g(new Event(str4) { // from class: au.com.woolworths.analytics.supers.products.MapsAnalytics$ProductFinderMap$Action$Companion$errorDialogImpression$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(MapsAnalytics.ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Action", "dialog_impression"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.z("event.Label", str4, spreadBuilder, "event.Description", str4);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_storemap_dialogimpression";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "productfinder_storemap_dialogimpression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            return;
        }
        if (event instanceof MapAnalyticsEvent.InStoreNavigationErrorDialogImpression) {
            ProductCard productCard2 = this.u;
            mapEventTracker.e = false;
            MapsAnalytics.ProductFinderMap.Action.d.getClass();
            final String str5 = "in-store navigation error";
            mapEventTracker.a(new Event(str5) { // from class: au.com.woolworths.analytics.supers.products.MapsAnalytics$ProductFinderMap$Action$Companion$errorDialogImpression$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(MapsAnalytics.ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Action", "dialog_impression"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.z("event.Label", str5, spreadBuilder, "event.Description", str5);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_storemap_dialogimpression";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "productfinder_storemap_dialogimpression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            }, productCard2 != null ? ProductAnalyticsExtKt.h(productCard2, null, null, 7) : null);
            return;
        }
        if (!(event instanceof MapAnalyticsEvent.NotInStoreBuildingErrorDialogImpression)) {
            if (!(event instanceof MapAnalyticsEvent.ShowFeedback)) {
                throw new NoWhenBranchMatchedException();
            }
            mapEventTracker.f7409a.g(MapsAnalytics.ProductFinderMap.Action.l);
        } else {
            ProductCard productCard3 = this.u;
            mapEventTracker.e = false;
            MapsAnalytics.ProductFinderMap.Action.d.getClass();
            final String str6 = "we can't find you in-store right now.";
            mapEventTracker.a(new Event(str6) { // from class: au.com.woolworths.analytics.supers.products.MapsAnalytics$ProductFinderMap$Action$Companion$errorDialogImpression$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(MapsAnalytics.ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Action", "dialog_impression"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.z("event.Label", str6, spreadBuilder, "event.Description", str6);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_storemap_dialogimpression";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "productfinder_storemap_dialogimpression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            }, productCard3 != null ? ProductAnalyticsExtKt.h(productCard3, null, null, 7) : null);
        }
    }

    public final InstoreMapContract.ViewState.LocationServicesUnavailableState H6() {
        InstoreMapContract.ViewState.LocationServicesUnavailableState locationServicesUnavailableStateY6 = y6();
        MutableStateFlow mutableStateFlow = this.s;
        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
        if (contentB != null) {
            while (true) {
                Object value = mutableStateFlow.getValue();
                MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                InstoreMapContract.ViewState.Content content = contentB;
                if (mutableStateFlow2.d(value, InstoreMapContract.ViewState.Content.c(content, null, null, null, null, null, false, null, null, null, locationServicesUnavailableStateY6, false, false, false, null, false, false, null, null, null, 1048063))) {
                    break;
                }
                contentB = content;
                mutableStateFlow = mutableStateFlow2;
            }
        }
        return locationServicesUnavailableStateY6;
    }

    public final void I6() {
        InstoreLocationDetailsData details;
        Floor floor;
        InstoreMapContract.ViewState.MapData mapData;
        InstoreMapContract.ViewState.MapData mapData2;
        List<ProductCard> list = this.t;
        if (list != null) {
            for (ProductCard productCard : list) {
                InStoreLocationData inStoreLocation = productCard.getInStoreLocation();
                if (inStoreLocation != null && (details = inStoreLocation.getDetails()) != null && (floor = this.A) != null && floor.d == details.getFloorNumber() - 1) {
                    WowCoordinate wowCoordinate = new WowCoordinate(details.getX(), details.getY());
                    Floor floor2 = this.A;
                    OriientMetersCoordinate oriientMetersCoordinateE = this.h.e(wowCoordinate, floor2 != null ? floor2.f7335a : null);
                    if (oriientMetersCoordinateE != null) {
                        final String productId = productCard.getProductId();
                        final boolean zC = Intrinsics.c(this.u, productCard);
                        final String strAisleNumberDisplayable = InStoreLocationDataKt.aisleNumberDisplayable(inStoreLocation);
                        MutableStateFlow mutableStateFlow = this.s;
                        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
                        if (contentB != null && (mapData = contentB.b) != null) {
                            while (true) {
                                Object value = mutableStateFlow.getValue();
                                InstoreMapContract.ViewState.Content content = contentB;
                                mapData2 = mapData;
                                if (mutableStateFlow.d(value, InstoreMapContract.ViewState.Content.c(content, null, null, null, null, null, false, null, null, null, null, false, false, false, InstoreMapContract.ViewState.DebugInfo.a(content.o, null, null, null, oriientMetersCoordinateE, null, null, null, 119), false, false, null, null, null, 1032191))) {
                                    break;
                                }
                                mapData = mapData2;
                                contentB = content;
                            }
                            RelativePosition relativePositionA = CoordinateUtilsKt.a(oriientMetersCoordinateE, mapData2);
                            MapState mapState = mapData2.f7384a;
                            if (MarkerApiKt.b(mapState, productId) != null) {
                                MarkerApiKt.c(mapState, productId);
                            }
                            MarkerApiKt.a(mapState, productId, relativePositionA.f7412a, relativePositionA.b, 0L, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$updateProductMarker$1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer = (Composer) obj;
                                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                                        composer.j();
                                    } else {
                                        composer.o(-1633490746);
                                        InstoreMapViewModel instoreMapViewModel = this;
                                        boolean zI = composer.I(instoreMapViewModel);
                                        String str = productId;
                                        boolean zN = zI | composer.n(str);
                                        Object objG = composer.G();
                                        if (zN || objG == Composer.Companion.f1624a) {
                                            objG = new f(instoreMapViewModel, str, 0);
                                            composer.A(objG);
                                        }
                                        composer.l();
                                        ProductMarkerKt.b(zC, strAisleNumberDisplayable, (Function0) objG, null, BitmapDescriptorFactory.HUE_RED, composer, 0, 24);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -71619633), 2040);
                        }
                        if (Intrinsics.c(this.u, productCard)) {
                            BuildersKt.c(ViewModelKt.a(this), null, null, new InstoreMapViewModel$updateProductMarkers$1$1$1$1$1(this, oriientMetersCoordinateE, productCard, null), 3);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J6(au.com.woolworths.product.models.ProductCard r10, au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState.MapData r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomInProduct$1
            if (r0 == 0) goto L14
            r0 = r12
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomInProduct$1 r0 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomInProduct$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.r = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomInProduct$1 r0 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomInProduct$1
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r8.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.r
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.b(r12)
            goto L8e
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.ResultKt.b(r12)
            au.com.woolworths.product.models.InStoreLocationData r10 = r10.getInStoreLocation()
            if (r10 == 0) goto L8e
            au.com.woolworths.product.models.InstoreLocationDetailsData r10 = r10.getDetails()
            if (r10 == 0) goto L8e
            au.com.woolworths.feature.shop.instore.navigation.map.data.Floor r12 = r9.A
            r1 = 0
            if (r12 == 0) goto L4f
            int r12 = r12.d
            int r3 = r10.getFloorNumber()
            int r3 = r3 - r2
            if (r12 != r3) goto L4f
            goto L50
        L4f:
            r10 = r1
        L50:
            if (r10 == 0) goto L8e
            au.com.woolworths.feature.shop.instore.navigation.map.data.WowCoordinate r12 = new au.com.woolworths.feature.shop.instore.navigation.map.data.WowCoordinate
            double r3 = r10.getX()
            double r5 = r10.getY()
            r12.<init>(r3, r5)
            au.com.woolworths.feature.shop.instore.navigation.map.data.Floor r10 = r9.A
            if (r10 == 0) goto L65
            java.lang.String r1 = r10.f7335a
        L65:
            au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor r10 = r9.h
            au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate r10 = r10.e(r12, r1)
            if (r10 == 0) goto L8e
            au.com.woolworths.feature.shop.instore.navigation.map.utils.RelativePosition r10 = au.com.woolworths.feature.shop.instore.navigation.map.utils.CoordinateUtilsKt.a(r10, r11)
            ovh.plrapps.mapcompose.ui.state.MapState r1 = r11.f7384a
            r11 = 4616189618054758400(0x4010000000000000, double:4.0)
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r3 = r1.b
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState.B(r3, r11)
            r11 = r2
            double r2 = r10.f7412a
            double r4 = r10.b
            r8.r = r11
            r10 = -1090519040(0xffffffffbf000000, float:-0.5)
            long r6 = androidx.compose.ui.geometry.OffsetKt.a(r10, r10)
            java.lang.Object r10 = ovh.plrapps.mapcompose.api.LayoutApiKt.h(r1, r2, r4, r6, r8)
            if (r10 != r0) goto L8e
            return r0
        L8e:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.J6(au.com.woolworths.product.models.ProductCard, au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K6(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomInSelectedProduct$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomInSelectedProduct$1 r0 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomInSelectedProduct$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomInSelectedProduct$1 r0 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomInSelectedProduct$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            kotlinx.coroutines.flow.MutableStateFlow r5 = r4.s
            java.lang.Object r5 = r5.getValue()
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState r5 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState) r5
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Content r5 = r5.b()
            if (r5 == 0) goto L51
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData r5 = r5.b
            if (r5 == 0) goto L51
            au.com.woolworths.product.models.ProductCard r2 = r4.u
            if (r2 == 0) goto L51
            r0.r = r3
            java.lang.Object r5 = r4.J6(r2, r5, r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.K6(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.l.e();
        this.o.b();
        BuildersKt.c(ViewModelKt.a(this), null, null, new InstoreMapViewModel$onCleared$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v6(au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap r12, boolean r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$centerMapOnScreen$1
            if (r0 == 0) goto L14
            r0 = r14
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$centerMapOnScreen$1 r0 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$centerMapOnScreen$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.s = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$centerMapOnScreen$1 r0 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$centerMapOnScreen$1
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r9.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r9.s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            ovh.plrapps.mapcompose.ui.state.MapState r12 = r9.p
            kotlin.ResultKt.b(r14)
            goto L98
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.ResultKt.b(r14)
            kotlinx.coroutines.flow.MutableStateFlow r14 = r11.s
            java.lang.Object r14 = r14.getValue()
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState r14 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState) r14
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Content r14 = r14.b()
            if (r14 == 0) goto L9c
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData r14 = r14.b
            if (r14 == 0) goto L9c
            if (r13 == 0) goto L4d
            r13 = 2500(0x9c4, float:3.503E-42)
            goto L4e
        L4d:
            r13 = 0
        L4e:
            ovh.plrapps.mapcompose.ui.state.MapState r1 = r14.f7384a
            r14 = 1056964608(0x3f000000, float:0.5)
            ovh.plrapps.mapcompose.api.LayoutApiKt.g(r1, r14, r14)
            androidx.compose.animation.core.TweenSpec r8 = new androidx.compose.animation.core.TweenSpec
            androidx.compose.animation.core.CubicBezierEasing r14 = androidx.compose.animation.core.EasingFunctionsKt.c
            r3 = 2
            r8.<init>(r13, r14, r3)
            android.graphics.Bitmap r12 = r12.b
            android.content.res.Resources r13 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            java.lang.String r14 = "getDisplayMetrics(...)"
            kotlin.jvm.internal.Intrinsics.g(r13, r14)
            int r13 = r13.widthPixels
            double r13 = (double) r13
            int r3 = r12.getWidth()
            int r4 = r12.getHeight()
            if (r3 <= r4) goto L7f
            int r12 = r12.getHeight()
        L7d:
            double r3 = (double) r12
            goto L84
        L7f:
            int r12 = r12.getWidth()
            goto L7d
        L84:
            double r6 = r13 / r3
            r9.p = r1
            r9.s = r2
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r10 = 16
            java.lang.Object r12 = ovh.plrapps.mapcompose.api.LayoutApiKt.f(r1, r2, r4, r6, r8, r9, r10)
            if (r12 != r0) goto L97
            return r0
        L97:
            r12 = r1
        L98:
            r13 = 0
            ovh.plrapps.mapcompose.api.LayoutApiKt.g(r12, r13, r13)
        L9c:
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.v6(au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void w6() {
        Object value;
        MutableStateFlow mutableStateFlow = this.s;
        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
        if (contentB != null) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, InstoreMapContract.ViewState.Content.c(contentB, null, null, null, null, null, false, null, null, null, null, false, false, false, null, false, false, null, null, null, 1047551)));
        }
    }

    public final boolean x6() {
        return this.r != null;
    }

    public final InstoreMapContract.ViewState.LocationServicesUnavailableState y6() {
        LocationInteractor locationInteractor = this.e;
        if (!LocationsKt.b(locationInteractor.f8946a)) {
            return locationInteractor.e() ? InstoreMapContract.ViewState.LocationServicesUnavailableState.e : InstoreMapContract.ViewState.LocationServicesUnavailableState.d;
        }
        if (locationInteractor.d()) {
            return null;
        }
        return InstoreMapContract.ViewState.LocationServicesUnavailableState.f;
    }

    public final void z6(Floor floor) {
        MutableStateFlow mutableStateFlow = this.s;
        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
        if (contentB != null) {
            this.h.d(floor);
            while (true) {
                Object value = mutableStateFlow.getValue();
                MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                InstoreMapContract.ViewState.Content content = contentB;
                contentB = content;
                if (mutableStateFlow2.d(value, InstoreMapContract.ViewState.Content.c(content, null, null, null, null, null, false, null, null, null, null, false, false, false, null, false, false, null, floor, null, 786431))) {
                    break;
                } else {
                    mutableStateFlow = mutableStateFlow2;
                }
            }
            if (!Intrinsics.c(this.A, floor)) {
                BuildersKt.c(ViewModelKt.a(this), null, null, new InstoreMapViewModel$fetchMapForFloor$1(floor, this, null), 3);
            }
            this.A = floor;
        }
    }
}
