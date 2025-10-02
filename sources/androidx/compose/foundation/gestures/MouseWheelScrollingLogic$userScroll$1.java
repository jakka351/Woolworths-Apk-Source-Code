package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {122}, m = "userScroll")
/* loaded from: classes2.dex */
final class MouseWheelScrollingLogic$userScroll$1 extends ContinuationImpl {
    public MouseWheelScrollingLogic p;
    public /* synthetic */ Object q;
    public final /* synthetic */ MouseWheelScrollingLogic r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$userScroll$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.i(null, null, this);
    }
}
