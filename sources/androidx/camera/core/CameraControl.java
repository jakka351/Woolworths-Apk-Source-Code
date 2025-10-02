package androidx.camera.core;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
    }

    ListenableFuture b(float f);

    ListenableFuture c(float f);

    ListenableFuture d(boolean z);

    ListenableFuture f(FocusMeteringAction focusMeteringAction);
}
