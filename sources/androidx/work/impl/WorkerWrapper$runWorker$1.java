package androidx.work.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", l = {299}, m = "runWorker")
/* loaded from: classes.dex */
final class WorkerWrapper$runWorker$1 extends ContinuationImpl {
    public WorkerWrapper p;
    public /* synthetic */ Object q;
    public final /* synthetic */ WorkerWrapper r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$runWorker$1(WorkerWrapper workerWrapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = workerWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return WorkerWrapper.a(this.r, this);
    }
}
