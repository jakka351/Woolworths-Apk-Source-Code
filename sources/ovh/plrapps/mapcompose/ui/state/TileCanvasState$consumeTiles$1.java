package ovh.plrapps.mapcompose.ui.state;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.ChannelIterator;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState", f = "TileCanvasState.kt", l = {222}, m = "consumeTiles")
/* loaded from: classes8.dex */
final class TileCanvasState$consumeTiles$1 extends ContinuationImpl {
    public TileCanvasState p;
    public ChannelIterator q;
    public /* synthetic */ Object r;
    public final /* synthetic */ TileCanvasState s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCanvasState$consumeTiles$1(TileCanvasState tileCanvasState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = tileCanvasState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return TileCanvasState.a(this.s, null, this);
    }
}
