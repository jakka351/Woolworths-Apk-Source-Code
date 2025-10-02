package androidx.camera.core.impl;

import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.RetryPolicy;
import androidx.core.util.Preconditions;

@ExperimentalRetryPolicy
/* loaded from: classes2.dex */
public final class TimeoutRetryPolicy implements RetryPolicy {
    public final long b;
    public final RetryPolicy c;

    public TimeoutRetryPolicy(long j, RetryPolicy retryPolicy) {
        Preconditions.a("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = retryPolicy;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final long a() {
        return this.b;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final RetryPolicy.RetryConfig c(CameraProviderExecutionState cameraProviderExecutionState) {
        RetryPolicy.RetryConfig retryConfigC = this.c.c(cameraProviderExecutionState);
        long j = this.b;
        return (j <= 0 || cameraProviderExecutionState.b < j - retryConfigC.f422a) ? retryConfigC : RetryPolicy.RetryConfig.d;
    }
}
