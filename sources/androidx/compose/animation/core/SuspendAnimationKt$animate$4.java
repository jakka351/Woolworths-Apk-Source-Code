package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {231, 280}, m = "animate")
/* loaded from: classes2.dex */
final class SuspendAnimationKt$animate$4<T, V extends AnimationVector> extends ContinuationImpl {
    public AnimationState p;
    public Animation q;
    public Function1 r;
    public Ref.ObjectRef s;
    public /* synthetic */ Object t;
    public int u;

    public SuspendAnimationKt$animate$4(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return SuspendAnimationKt.b(null, null, 0L, null, this);
    }
}
