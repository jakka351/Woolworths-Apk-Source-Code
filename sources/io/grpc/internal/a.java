package io.grpc.internal;

import io.grpc.SynchronizationContext;
import io.grpc.internal.RetryingNameResolver;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                BackoffPolicyRetryScheduler backoffPolicyRetryScheduler = (BackoffPolicyRetryScheduler) this.e;
                SynchronizationContext.ScheduledHandle scheduledHandle = backoffPolicyRetryScheduler.e;
                if (scheduledHandle != null && scheduledHandle.b()) {
                    backoffPolicyRetryScheduler.e.a();
                }
                backoffPolicyRetryScheduler.d = null;
                break;
            case 1:
                ((PickFirstLeafLoadBalancer) this.e).e();
                break;
            default:
                RetryingNameResolver retryingNameResolver = ((RetryingNameResolver.RetryingListener) this.e).b;
                ((BackoffPolicyRetryScheduler) retryingNameResolver.b).a(new RetryingNameResolver.DelayedNameResolverRefresh(retryingNameResolver));
                break;
        }
    }
}
