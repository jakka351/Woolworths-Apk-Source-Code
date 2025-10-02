package androidx.compose.material;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", l = {327}, m = "emit")
/* loaded from: classes2.dex */
final class SwipeableState$animateTo$2$emit$1 extends ContinuationImpl {
    public Object p;
    public Map q;
    public /* synthetic */ Object r;
    public final /* synthetic */ SwipeableState$animateTo$2 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateTo$2$emit$1(SwipeableState$animateTo$2 swipeableState$animateTo$2, Continuation continuation) {
        super(continuation);
        this.s = swipeableState$animateTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.emit(null, this);
    }
}
