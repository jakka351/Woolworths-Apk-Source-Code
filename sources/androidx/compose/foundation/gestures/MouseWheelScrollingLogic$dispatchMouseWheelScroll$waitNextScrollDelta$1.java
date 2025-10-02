package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {227}, m = "dispatchMouseWheelScroll$waitNextScrollDelta")
/* loaded from: classes2.dex */
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 extends ContinuationImpl {
    public MouseWheelScrollingLogic p;
    public Ref.ObjectRef q;
    public Ref.FloatRef r;
    public ScrollingLogic s;
    public Ref.ObjectRef t;
    public /* synthetic */ Object u;
    public int v;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return MouseWheelScrollingLogic.c(null, null, null, null, null, 0L, this);
    }
}
