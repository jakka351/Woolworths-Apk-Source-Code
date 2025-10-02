package ovh.plrapps.mapcompose.ui.state;

import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ovh.plrapps.mapcompose.core.Viewport;
import ovh.plrapps.mapcompose.core.VisibleTiles;
import ovh.plrapps.mapcompose.core.VisibleTilesResolver;
import ovh.plrapps.mapcompose.utils.RotationUtilsKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lovh/plrapps/mapcompose/core/VisibleTiles;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState$setViewport$visibleTiles$1", f = "TileCanvasState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TileCanvasState$setViewport$visibleTiles$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VisibleTiles>, Object> {
    public final /* synthetic */ TileCanvasState p;
    public final /* synthetic */ Viewport q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCanvasState$setViewport$visibleTiles$1(TileCanvasState tileCanvasState, Viewport viewport, Continuation continuation) {
        super(2, continuation);
        this.p = tileCanvasState;
        this.q = viewport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TileCanvasState$setViewport$visibleTiles$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TileCanvasState$setViewport$visibleTiles$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        VisibleTilesResolver visibleTilesResolver = this.p.f26957a;
        int i = visibleTilesResolver.c;
        Viewport viewport = this.q;
        Intrinsics.h(viewport, "viewport");
        double dF = ((SnapshotMutableDoubleStateImpl) ((MapState) visibleTilesResolver.d.e).b.l).f();
        double d = 1;
        int iCeil = (int) Math.ceil(Math.max(Math.min((Math.log(dF) / Math.log(2.0d)) + 0, d - 1.0d), 0.0d));
        Double d2 = (Double) visibleTilesResolver.e.get(Integer.valueOf(iCeil));
        if (d2 == null) {
            throw new AssertionError();
        }
        double dDoubleValue = d2.doubleValue();
        double d3 = i;
        int iMax = (int) Math.max(0.0d, Math.ceil((visibleTilesResolver.f26940a * dDoubleValue) / d3) - d);
        int iMax2 = (int) Math.max(0.0d, Math.ceil((visibleTilesResolver.b * dDoubleValue) / d3) - d);
        double d4 = d3 * (dF / dDoubleValue);
        float f = viewport.e;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return VisibleTilesResolver.a(d4, iMax, iMax2, iCeil, visibleTilesResolver, dF, viewport.f26938a, viewport.b, viewport.c, viewport.d);
        }
        int i2 = viewport.f26938a;
        int i3 = viewport.b;
        int i4 = viewport.c;
        int i5 = viewport.d;
        double d5 = 2;
        double d6 = (i4 + i2) / d5;
        double d7 = (i5 + i3) / d5;
        double d8 = i2 - d6;
        double d9 = i3 - d7;
        double dC = RotationUtilsKt.c(d8, d9, f) + d6;
        double d10 = RotationUtilsKt.d(d8, d9, viewport.e) + d7;
        double d11 = i4 - d6;
        double dC2 = RotationUtilsKt.c(d11, d9, viewport.e) + d6;
        double d12 = RotationUtilsKt.d(d11, d9, viewport.e) + d7;
        double d13 = dC > dC2 ? dC2 : dC;
        double d14 = d10 > d12 ? d12 : d10;
        if (dC < dC2) {
            dC = dC2;
        }
        if (d10 < d12) {
            d10 = d12;
        }
        double d15 = i5 - d7;
        double dC3 = RotationUtilsKt.c(d8, d15, viewport.e) + d6;
        double d16 = RotationUtilsKt.d(d8, d15, viewport.e) + d7;
        if (d13 > dC3) {
            d13 = dC3;
        }
        if (d14 > d16) {
            d14 = d16;
        }
        if (dC < dC3) {
            dC = dC3;
        }
        if (d10 < d16) {
            d10 = d16;
        }
        double dC4 = RotationUtilsKt.c(d11, d15, viewport.e) + d6;
        double d17 = RotationUtilsKt.d(d11, d15, viewport.e) + d7;
        double d18 = d13 > dC4 ? dC4 : d13;
        double d19 = d14 > d17 ? d17 : d14;
        if (dC >= dC4) {
            dC4 = dC;
        }
        if (d10 >= d17) {
            d17 = d10;
        }
        return VisibleTilesResolver.a(d4, iMax, iMax2, iCeil, visibleTilesResolver, dF, (int) d18, (int) d19, (int) dC4, (int) d17);
    }
}
