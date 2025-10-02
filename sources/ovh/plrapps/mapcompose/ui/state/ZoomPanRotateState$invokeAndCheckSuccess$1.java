package ovh.plrapps.mapcompose.ui.state;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState", f = "ZoomPanRotateState.kt", l = {305}, m = "invokeAndCheckSuccess$mapcompose_release")
/* loaded from: classes8.dex */
final class ZoomPanRotateState$invokeAndCheckSuccess$1 extends ContinuationImpl {
    public Ref.BooleanRef p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ZoomPanRotateState r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomPanRotateState$invokeAndCheckSuccess$1(ZoomPanRotateState zoomPanRotateState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = zoomPanRotateState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.u(null, this);
    }
}
