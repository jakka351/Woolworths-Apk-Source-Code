package coil3.compose;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.compose.ConstraintsSizeResolver", f = "ConstraintsSizeResolver.kt", l = {38}, m = "size")
/* loaded from: classes.dex */
final class ConstraintsSizeResolver$size$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ConstraintsSizeResolver q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintsSizeResolver$size$1(ConstraintsSizeResolver constraintsSizeResolver, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = constraintsSizeResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
