package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
/* loaded from: classes.dex */
final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    public Ref.ObjectRef p;
    public /* synthetic */ Object q;
    public int r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return FlowKt.e(null, null, this);
    }
}
