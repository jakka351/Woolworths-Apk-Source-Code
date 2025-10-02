package androidx.compose.material;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", l = {154, 179, 182}, m = "processNewAnchors$material_release")
/* loaded from: classes2.dex */
final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {
    public SwipeableState p;
    public Map q;
    public float r;
    public /* synthetic */ Object s;
    public final /* synthetic */ SwipeableState t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$processNewAnchors$1(SwipeableState swipeableState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.c(null, null, this);
    }
}
