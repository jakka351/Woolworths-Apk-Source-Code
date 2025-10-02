package ovh.plrapps.mapcompose.api;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.api.LayoutApiKt", f = "LayoutApi.kt", l = {271}, m = "snapScrollTo-Fgt4K4Q")
/* loaded from: classes8.dex */
final class LayoutApiKt$snapScrollTo$1 extends ContinuationImpl {
    public double p;
    public double q;
    public long r;
    public ZoomPanRotateState s;
    public /* synthetic */ Object t;
    public int u;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return LayoutApiKt.h(null, 0.0d, 0.0d, 0L, this);
    }
}
