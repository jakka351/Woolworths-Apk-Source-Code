package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraProviderExecutionState;
import androidx.camera.core.impl.CameraProviderInitRetryPolicy;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ExperimentalRetryPolicy
/* loaded from: classes2.dex */
public interface RetryPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final CameraProviderInitRetryPolicy.Legacy f420a = new CameraProviderInitRetryPolicy.Legacy(6000);

    @ExperimentalRetryPolicy
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final RetryPolicy f421a;
        public final long b;

        public Builder(RetryPolicy retryPolicy) {
            this.f421a = retryPolicy;
            this.b = retryPolicy.a();
        }
    }

    @ExperimentalRetryPolicy
    public interface ExecutionState {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface Status {
        }
    }

    @ExperimentalRetryPolicy
    public static final class RetryConfig {
        public static final RetryConfig d = new RetryConfig(0, false, false);
        public static final RetryConfig e = new RetryConfig(500, true, false);
        public static final RetryConfig f;

        /* renamed from: a, reason: collision with root package name */
        public final long f422a;
        public final boolean b;
        public final boolean c;

        @ExperimentalRetryPolicy
        public static final class Builder {
        }

        static {
            new RetryConfig(100L, true, false);
            f = new RetryConfig(0L, false, true);
        }

        public RetryConfig(long j, boolean z, boolean z2) {
            this.b = z;
            this.f422a = j;
            if (z2) {
                Preconditions.a("shouldRetry must be false when completeWithoutFailure is set to true", !z);
            }
            this.c = z2;
        }
    }

    static {
        new CameraProviderInitRetryPolicy(6000L);
    }

    default long a() {
        return 0L;
    }

    RetryConfig c(CameraProviderExecutionState cameraProviderExecutionState);
}
