package ovh.plrapps.mapcompose.ui.state.markers;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.markers.MarkerState", f = "MarkerState.kt", l = {217}, m = "renderRegularMarkers")
/* loaded from: classes8.dex */
final class MarkerState$renderRegularMarkers$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ MarkerState q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkerState$renderRegularMarkers$1(MarkerState markerState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = markerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        MarkerState.a(this.q, this);
        return CoroutineSingletons.d;
    }
}
