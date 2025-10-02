package ovh.plrapps.mapcompose.api;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.api.LayoutApiKt", f = "LayoutApi.kt", l = {303, 313}, m = "scrollTo-jzz79k0")
/* loaded from: classes8.dex */
final class LayoutApiKt$scrollTo$1 extends ContinuationImpl {
    public double p;
    public double q;
    public double r;
    public AnimationSpec s;
    public ZoomPanRotateState t;
    public long u;
    public /* synthetic */ Object v;
    public int w;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.w |= Integer.MIN_VALUE;
        return LayoutApiKt.e(null, 0.0d, 0.0d, 0.0d, null, 0L, this);
    }
}
