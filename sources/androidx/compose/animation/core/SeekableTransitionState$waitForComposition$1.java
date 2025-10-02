package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {543, 2142}, m = "waitForComposition")
/* loaded from: classes2.dex */
final class SeekableTransitionState$waitForComposition$1 extends ContinuationImpl {
    public SeekableTransitionState p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ SeekableTransitionState s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$waitForComposition$1(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = seekableTransitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return SeekableTransitionState.i(this.s, this);
    }
}
