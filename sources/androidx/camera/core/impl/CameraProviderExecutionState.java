package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.InitializationException;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraValidator;

@ExperimentalRetryPolicy
/* loaded from: classes2.dex */
public final class CameraProviderExecutionState implements RetryPolicy.ExecutionState {

    /* renamed from: a, reason: collision with root package name */
    public final int f477a;
    public final long b;
    public final Throwable c;

    public CameraProviderExecutionState(long j, Exception exc) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof CameraValidator.CameraIdListIncorrectException) {
            this.f477a = 2;
            this.c = exc;
            return;
        }
        if (!(exc instanceof InitializationException)) {
            this.f477a = 0;
            this.c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.c = exc;
        if (exc instanceof CameraUnavailableException) {
            this.f477a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.f477a = 1;
        } else {
            this.f477a = 0;
        }
    }
}
