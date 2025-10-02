package coil3.request;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/request/BaseRequestDelegate;", "Lcoil3/request/RequestDelegate;", "job", "Lkotlinx/coroutines/Job;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class BaseRequestDelegate implements RequestDelegate {
    public final Job d;

    public /* synthetic */ BaseRequestDelegate(Job job) {
        this.d = job;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BaseRequestDelegate) {
            return Intrinsics.c(this.d, ((BaseRequestDelegate) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.d + ')';
    }
}
