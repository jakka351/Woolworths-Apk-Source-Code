package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/ResumeAwaitOnCompletion;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class ResumeAwaitOnCompletion<T> extends JobNode {
    public final CancellableContinuationImpl h;

    public ResumeAwaitOnCompletion(CancellableContinuationImpl cancellableContinuationImpl) {
        this.h = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean k() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void l(Throwable th) {
        Object obj = JobSupport.d.get(j());
        boolean z = obj instanceof CompletedExceptionally;
        CancellableContinuationImpl cancellableContinuationImpl = this.h;
        if (z) {
            cancellableContinuationImpl.resumeWith(ResultKt.a(((CompletedExceptionally) obj).f24689a));
        } else {
            cancellableContinuationImpl.resumeWith(JobSupportKt.a(obj));
        }
    }
}
