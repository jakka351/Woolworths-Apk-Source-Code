package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.core.impl.SessionConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
interface CaptureSessionInterface {
    ListenableFuture a(SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener);

    void b(HashMap map);

    SessionConfig c();

    void close();

    void d(SessionConfig sessionConfig);

    void e(List list);

    boolean f();

    void g();

    List h();

    ListenableFuture release();
}
