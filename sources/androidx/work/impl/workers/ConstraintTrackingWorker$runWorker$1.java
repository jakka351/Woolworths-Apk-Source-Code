package androidx.work.impl.workers;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", l = {125}, m = "runWorker")
/* loaded from: classes2.dex */
final class ConstraintTrackingWorker$runWorker$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ConstraintTrackingWorker q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$runWorker$1(ConstraintTrackingWorker constraintTrackingWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = constraintTrackingWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.b(this.q, null, null, null, this);
    }
}
