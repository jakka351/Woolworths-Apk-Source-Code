package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableJob;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@PublishedApi
/* loaded from: classes.dex */
public class JobImpl extends JobSupport implements CompletableJob {
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobImpl(Job job) {
        super(true);
        boolean z = true;
        W(job);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.e;
        ChildHandle childHandle = (ChildHandle) atomicReferenceFieldUpdater.get(this);
        ChildHandleNode childHandleNode = childHandle instanceof ChildHandleNode ? (ChildHandleNode) childHandle : null;
        if (childHandleNode == null) {
            z = false;
            break;
        }
        JobSupport jobSupportJ = childHandleNode.j();
        while (!jobSupportJ.getF()) {
            ChildHandle childHandle2 = (ChildHandle) atomicReferenceFieldUpdater.get(jobSupportJ);
            ChildHandleNode childHandleNode2 = childHandle2 instanceof ChildHandleNode ? (ChildHandleNode) childHandle2 : null;
            if (childHandleNode2 == null) {
                z = false;
                break;
            }
            jobSupportJ = childHandleNode2.j();
        }
        this.f = z;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: Q, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean S() {
        return true;
    }
}
