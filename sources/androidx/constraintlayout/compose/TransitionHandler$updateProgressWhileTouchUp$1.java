package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.TransitionHandler", f = "TransitionHandler.kt", l = {74}, m = "updateProgressWhileTouchUp")
/* loaded from: classes2.dex */
final class TransitionHandler$updateProgressWhileTouchUp$1 extends ContinuationImpl {
    public TransitionHandler p;
    public /* synthetic */ Object q;
    public final /* synthetic */ TransitionHandler r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionHandler$updateProgressWhileTouchUp$1(TransitionHandler transitionHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = transitionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(this);
    }
}
