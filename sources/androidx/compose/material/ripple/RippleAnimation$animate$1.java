package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {77, 79, 80}, m = "animate")
/* loaded from: classes2.dex */
final class RippleAnimation$animate$1 extends ContinuationImpl {
    public RippleAnimation p;
    public /* synthetic */ Object q;
    public final /* synthetic */ RippleAnimation r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$animate$1(RippleAnimation rippleAnimation, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(this);
    }
}
