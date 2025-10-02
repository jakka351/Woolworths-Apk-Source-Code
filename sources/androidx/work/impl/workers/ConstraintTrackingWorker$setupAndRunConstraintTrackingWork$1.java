package androidx.work.impl.workers;

import androidx.work.ListenableWorker;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", l = {97}, m = "setupAndRunConstraintTrackingWork")
/* loaded from: classes2.dex */
final class ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 extends ContinuationImpl {
    public ConstraintTrackingWorker p;
    public ListenableWorker q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ConstraintTrackingWorker s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1(ConstraintTrackingWorker constraintTrackingWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = constraintTrackingWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.c(this.s, this);
    }
}
