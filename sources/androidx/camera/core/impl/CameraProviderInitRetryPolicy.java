package androidx.camera.core.impl;

import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.Logger;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraValidator;

@ExperimentalRetryPolicy
/* loaded from: classes2.dex */
public final class CameraProviderInitRetryPolicy implements RetryPolicyInternal {
    public final TimeoutRetryPolicy b;

    public static final class Legacy implements RetryPolicyInternal {
        public final CameraProviderInitRetryPolicy b;

        public Legacy(long j) {
            this.b = new CameraProviderInitRetryPolicy(j);
        }

        @Override // androidx.camera.core.RetryPolicy
        public final long a() {
            return this.b.b.b;
        }

        @Override // androidx.camera.core.impl.RetryPolicyInternal
        public final RetryPolicy b(long j) {
            return new Legacy(j);
        }

        @Override // androidx.camera.core.RetryPolicy
        public final RetryPolicy.RetryConfig c(CameraProviderExecutionState cameraProviderExecutionState) {
            if (this.b.b.c(cameraProviderExecutionState).b) {
                return RetryPolicy.RetryConfig.e;
            }
            Throwable th = cameraProviderExecutionState.c;
            if (th instanceof CameraValidator.CameraIdListIncorrectException) {
                Logger.b("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((CameraValidator.CameraIdListIncorrectException) th).d > 0) {
                    return RetryPolicy.RetryConfig.f;
                }
            }
            return RetryPolicy.RetryConfig.d;
        }
    }

    public CameraProviderInitRetryPolicy(final long j) {
        this.b = new TimeoutRetryPolicy(j, new RetryPolicy() { // from class: androidx.camera.core.impl.CameraProviderInitRetryPolicy.1
            @Override // androidx.camera.core.RetryPolicy
            public final long a() {
                return j;
            }

            @Override // androidx.camera.core.RetryPolicy
            public final RetryPolicy.RetryConfig c(CameraProviderExecutionState cameraProviderExecutionState) {
                return cameraProviderExecutionState.f477a == 1 ? RetryPolicy.RetryConfig.d : RetryPolicy.RetryConfig.e;
            }
        });
    }

    @Override // androidx.camera.core.RetryPolicy
    public final long a() {
        return this.b.b;
    }

    @Override // androidx.camera.core.impl.RetryPolicyInternal
    public final RetryPolicy b(long j) {
        return new CameraProviderInitRetryPolicy(j);
    }

    @Override // androidx.camera.core.RetryPolicy
    public final RetryPolicy.RetryConfig c(CameraProviderExecutionState cameraProviderExecutionState) {
        return this.b.c(cameraProviderExecutionState);
    }
}
