package androidx.paging;

import androidx.paging.SingleRunner;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {131}, m = "onFinish")
/* loaded from: classes2.dex */
final class SingleRunner$Holder$onFinish$1 extends ContinuationImpl {
    public Object p;
    public Job q;
    public MutexImpl r;
    public /* synthetic */ Object s;
    public final /* synthetic */ SingleRunner.Holder t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$onFinish$1(SingleRunner.Holder holder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = holder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, this);
    }
}
