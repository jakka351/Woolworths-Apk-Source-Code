package androidx.compose.foundation.gestures;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {102, 153}, m = "animateToZero")
/* loaded from: classes2.dex */
final class UpdatableAnimationState$animateToZero$1 extends ContinuationImpl {
    public UpdatableAnimationState p;
    public Function q;
    public Function0 r;
    public float s;
    public /* synthetic */ Object t;
    public final /* synthetic */ UpdatableAnimationState u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$1(UpdatableAnimationState updatableAnimationState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = updatableAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, null, this);
    }
}
