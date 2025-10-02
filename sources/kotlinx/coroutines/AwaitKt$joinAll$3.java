package kotlinx.coroutines;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {58}, m = "joinAll")
/* loaded from: classes7.dex */
final class AwaitKt$joinAll$3 extends ContinuationImpl {
    public Iterator p;
    public /* synthetic */ Object q;
    public int r;

    public AwaitKt$joinAll$3(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return AwaitKt.c(null, this);
    }
}
