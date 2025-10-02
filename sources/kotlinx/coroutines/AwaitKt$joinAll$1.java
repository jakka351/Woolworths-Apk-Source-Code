package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {47}, m = "joinAll")
/* loaded from: classes7.dex */
final class AwaitKt$joinAll$1 extends ContinuationImpl {
    public Object[] p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public int t;

    public AwaitKt$joinAll$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return AwaitKt.d(null, this);
    }
}
