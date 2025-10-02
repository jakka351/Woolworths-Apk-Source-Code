package androidx.camera.core.impl;

import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.RetryPolicy;

@ExperimentalRetryPolicy
/* loaded from: classes2.dex */
public interface RetryPolicyInternal extends RetryPolicy {
    RetryPolicy b(long j);
}
