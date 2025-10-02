package androidx.paging;

import androidx.paging.SingleRunner;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {131, 102}, m = "tryEnqueue")
/* loaded from: classes2.dex */
final class SingleRunner$Holder$tryEnqueue$1 extends ContinuationImpl {
    public Object p;
    public Job q;
    public Mutex r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ SingleRunner.Holder u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$tryEnqueue$1(SingleRunner.Holder holder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = holder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(0, null, this);
    }
}
