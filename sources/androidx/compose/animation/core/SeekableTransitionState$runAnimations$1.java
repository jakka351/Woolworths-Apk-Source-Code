package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {353, 356}, m = "runAnimations")
/* loaded from: classes2.dex */
final class SeekableTransitionState$runAnimations$1 extends ContinuationImpl {
    public SeekableTransitionState p;
    public /* synthetic */ Object q;
    public final /* synthetic */ SeekableTransitionState r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$runAnimations$1(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = seekableTransitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return SeekableTransitionState.h(this.r, this);
    }
}
