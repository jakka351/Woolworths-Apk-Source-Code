package ovh.plrapps.mapcompose.ui.state;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState", f = "TileCanvasState.kt", l = {148, 152}, m = "setViewport")
/* loaded from: classes8.dex */
final class TileCanvasState$setViewport$1 extends ContinuationImpl {
    public TileCanvasState p;
    public /* synthetic */ Object q;
    public final /* synthetic */ TileCanvasState r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCanvasState$setViewport$1(TileCanvasState tileCanvasState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = tileCanvasState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.f(null, this);
    }
}
