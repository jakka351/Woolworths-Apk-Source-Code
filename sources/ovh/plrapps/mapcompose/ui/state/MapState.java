package ovh.plrapps.mapcompose.ui.state;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.scanlibrary.ui.tap.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import ovh.plrapps.mapcompose.core.GestureConfiguration;
import ovh.plrapps.mapcompose.core.ThrottleKt;
import ovh.plrapps.mapcompose.core.Viewport;
import ovh.plrapps.mapcompose.core.VisibleTilesResolver;
import ovh.plrapps.mapcompose.ui.state.markers.MarkerRenderState;
import ovh.plrapps.mapcompose.ui.state.markers.MarkerState;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/MapState;", "Lovh/plrapps/mapcompose/ui/state/ZoomPanRotateStateListener;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapState implements ZoomPanRotateStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final InitialValues f26955a;
    public final ZoomPanRotateState b;
    public final MarkerRenderState c;
    public final MarkerState d;
    public final PathState e;
    public final VisibleTilesResolver f;
    public final TileCanvasState g;
    public final BufferedChannel h;
    public final Viewport i;
    public final int j;
    public final MutableIntState k;
    public final MutableState l;
    public final MutableState m;
    public Lambda n;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lovh/plrapps/mapcompose/ui/state/InitialValues;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ovh.plrapps.mapcompose.ui.state.MapState$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<InitialValues, Unit> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.h((InitialValues) obj, "$this$null");
            return Unit.f24250a;
        }
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [kotlin.jvm.internal.Lambda, ovh.plrapps.mapcompose.ui.state.MapState$consumeLateInitialValues$1] */
    public MapState(int i, int i2, int i3) {
        int i4 = 10;
        int i5 = (i3 & 8) != 0 ? 256 : 10;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        InitialValues initialValues = new InitialValues();
        initialValues.f26954a = OffsetKt.a(-0.5f, -0.5f);
        initialValues.b = InitialValues$isFilteringBitmap$1.h;
        GestureConfiguration gestureConfiguration = new GestureConfiguration();
        AnonymousClass1.h.invoke(initialValues);
        this.f26955a = initialValues;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, MainDispatcherLoader.f24726a));
        this.b = new ZoomPanRotateState(i, i2, this, gestureConfiguration);
        MarkerRenderState markerRenderState = new MarkerRenderState();
        this.c = markerRenderState;
        this.d = new MarkerState(contextScopeA, markerRenderState);
        this.e = new PathState(i, i2);
        VisibleTilesResolver visibleTilesResolver = new VisibleTilesResolver(i, i2, i5, new a(this, i4));
        this.f = visibleTilesResolver;
        this.g = new TileCanvasState(contextScopeA, i5, visibleTilesResolver, iAvailableProcessors);
        this.h = ThrottleKt.a(contextScopeA, 18L, new MapState$throttledTask$1(this, null));
        Viewport viewport = new Viewport();
        viewport.f26938a = 0;
        viewport.b = 0;
        viewport.c = 0;
        viewport.d = 0;
        viewport.e = BitmapDescriptorFactory.HUE_RED;
        this.i = viewport;
        this.j = 0;
        this.k = SnapshotIntStateKt.a(i5);
        this.l = SnapshotStateKt.f(new Color(Color.j));
        this.m = SnapshotStateKt.f(new Function0<Boolean>() { // from class: ovh.plrapps.mapcompose.ui.state.MapState$isFilteringBitmap$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapState mapState = this.h;
                ((InitialValues$isFilteringBitmap$1) mapState.f26955a.b).invoke(mapState);
                return Boolean.TRUE;
            }
        });
        this.n = new Function0<Unit>() { // from class: ovh.plrapps.mapcompose.ui.state.MapState$consumeLateInitialValues$1

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: ovh.plrapps.mapcompose.ui.state.MapState$consumeLateInitialValues$1$1, reason: invalid class name */
            final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                public static final AnonymousClass1 h = new AnonymousClass1(0);

                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Object invoke() {
                    return Unit.f24250a;
                }
            }

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.h;
                MapState mapState = this.h;
                mapState.n = anonymousClass1;
                InitialValues initialValues2 = mapState.f26955a;
                ZoomPanRotateState zoomPanRotateState = mapState.b;
                float fE = Offset.e(initialValues2.f26954a) * ((int) (zoomPanRotateState.t() >> 32));
                float f = Offset.f(initialValues2.f26954a) * ((int) (zoomPanRotateState.t() & 4294967295L));
                SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = (SnapshotMutableDoubleStateImpl) zoomPanRotateState.l;
                zoomPanRotateState.C((snapshotMutableDoubleStateImpl.f() * zoomPanRotateState.f26960a * 0.5d) + fE, (snapshotMutableDoubleStateImpl.f() * 0.5d * zoomPanRotateState.b) + f);
                return Unit.f24250a;
            }
        };
    }
}
